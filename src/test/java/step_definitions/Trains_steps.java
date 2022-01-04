package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.HotelPage;
import page_objects.NavigationBar;
import page_objects.TrainsPage;

public class Trains_steps {
    private static final Logger LOGGER = LogManager.getLogger(Trains_steps.class);

    WebDriver driver = Hooks.driver;

    @When("^user clicks on the trains tab$")
    public void userClicksOnStaysTab() {
        new NavigationBar(driver)
                .navigateToTrains();
    }

    @Then("^the user will see the title \"(.+?)\"$")
    public void userShouldSeeTitle(String text) {
        new TrainsPage(driver)
                .validateTrainsPage(text);
    }
}
