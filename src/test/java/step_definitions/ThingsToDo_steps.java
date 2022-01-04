package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.HotelPage;
import page_objects.NavigationBar;
import page_objects.ThingsToDoPage;

public class ThingsToDo_steps {
    private static final Logger LOGGER = LogManager.getLogger(ThingsToDo_steps.class);

    WebDriver driver = Hooks.driver;

    @When("^user click on things to do tab$")
    public void userClicksOnThingsToDoTab() {
        new NavigationBar(driver)
                .navigateToThingsToDo();
    }

    @Then("^user will be able to see \"(.+?)\"$")
    public void userShouldSeeTitle(String text) {
        new ThingsToDoPage(driver)
                .validateThingsToDoPage(text);
    }
}
