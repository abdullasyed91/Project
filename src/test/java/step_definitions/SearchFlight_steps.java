package step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.FlightsPage;
import page_objects.NavigationBar;

import java.util.List;
import java.util.Map;

public class SearchFlight_steps {
    private static final Logger LOGGER = LogManager.getLogger(SearchFlight_steps.class);

    WebDriver driver = Hooks.driver;

    @When("^user navigates to flight page and upon entering data clicks on search button$")
    public void clickOnSearchButtonUponEnteringData(DataTable table) {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        for (Map<String, String> cells : data) {
            new NavigationBar(driver)
                    .navigateToFlights();
            new FlightsPage(driver)
                    .typeFrom(cells.get("from"))
                    .typeTo(cells.get("to"))
                    .selectDate(cells.get("date"))
                    .clickSearch();
        }
    }

    @Then("^user should see the search results$")
    public void validateSearchedFlight() {
        new FlightsPage(driver)
                .validatingSearcherFlight();
    }

}
