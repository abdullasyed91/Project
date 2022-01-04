package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.FlightsPage;
import page_objects.NavigationBar;
import utilities.ReadConfigFiles;

public class Flights_steps {

    private static final Logger LOGGER = LogManager.getLogger(Flights_steps.class);

    WebDriver driver = Hooks.driver;
    @Given("^user is on the kayak home page$")
    public void userIsOnTheKayakHomePage() {
        LOGGER.debug("User is on the home page");
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("KayakUrl"));
    }

    @When("^user clicks on flights tab$")
    public void userClicksOnFlightsTab() {
        new NavigationBar(driver)
                .navigateToFlights();
    }

    @Then("^user should see title \"(.+?)\"$")
    public void userShouldSeeTitle(String text) {
        new FlightsPage(driver)
                .validateFlightsPage(text);
    }
}
