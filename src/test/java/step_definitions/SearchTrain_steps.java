package step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.FlightsPage;
import page_objects.NavigationBar;
import page_objects.TrainsPage;

import java.util.List;
import java.util.Map;

public class SearchTrain_steps {
    private static final Logger LOGGER = LogManager.getLogger(SearchTrain_steps.class);

    WebDriver driver = Hooks.driver;
    @When("^user navigates to the train page and upon entering data clicks on the search button$")
    public void clickOnSearchButtonUponEnteringData(DataTable table) {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        for (Map<String, String> cells : data) {
            new NavigationBar(driver)
                    .navigateToTrains();
            new TrainsPage(driver)
                    .typeFrom(cells.get("From"))
                    .typeTo(cells.get("To"))
                    .selectTravelDate(cells.get("TravelDate"))
                    .selectReturnDate(cells.get("ReturnDate"))
                    .clickSearchButton();
        }
    }

    @Then("^the user should see the searched trains$")
    public void validateSearchedFlight() {
        new TrainsPage(driver)
                .validateSearchTrain();
    }
}
