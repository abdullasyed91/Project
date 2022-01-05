package page_objects;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;
import step_definitions.SearchTrain_steps;

import java.util.List;
import java.util.Map;

public class TrackFlight_steps {
    private static final Logger LOGGER = LogManager.getLogger(TrackFlight_steps.class);

    WebDriver driver = Hooks.driver;
    @When("^user navigates to flight tracker page and upon entering data clicks on the search button$")
    public void clickOnSearchButtonUponEnteringData(DataTable table) {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        for (Map<String, String> cells : data) {
            new NavigationBar(driver)
                    .navigateToFlightTracker();
            new FlightTrackerPage(driver)
                    .typeAirlineName(cells.get("Airline"))
                    .typeFlightNumber(cells.get("FlightNumber"))
                    .selectDate("1/4")
                    .clickSearch();
        }
    }

    @Then("^user should the flight tracker page$")
    public void validateSearchedFlight() {
        new TrainsPage(driver)
                .validateSearchTrain();
    }
}
