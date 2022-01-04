package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.DealsPage;
import page_objects.FlightTrackerPage;
import page_objects.NavigationBar;

public class FlightTracker_steps {
    private static final Logger LOGGER = LogManager.getLogger(FlightTracker_steps.class);

    WebDriver driver = Hooks.driver;

    @When("^user clicks on flight tracker tab$")
    public void userClicksOnFlightTrackerTab() {
        new NavigationBar(driver)
                .navigateToFlightTracker();
    }

    @Then("^user should see flight tracker page$")
    public void userShouldSeeTitle() {
        new FlightTrackerPage(driver)
                .validateFlightTrackerPage();
    }
}
