package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.CruisesPage;
import page_objects.NavigationBar;
import page_objects.TrainsPage;

public class Cruise_steps {
    private static final Logger LOGGER = LogManager.getLogger(Cruise_steps.class);

    WebDriver driver = Hooks.driver;

    @When("^user clicks on the cruises tab$")
    public void userClicksOnCruisesTab() {
        new NavigationBar(driver)
                .navigateToCruises();
    }

    @Then("^user should see the header \"(.+?)\"$")
    public void userShouldSeeTitle(String text) {
        new CruisesPage(driver)
                .validateCruisePage(text);
    }

}
