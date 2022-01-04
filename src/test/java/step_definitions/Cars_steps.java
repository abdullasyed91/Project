package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.CarsPage;
import page_objects.HotelPage;
import page_objects.NavigationBar;

public class Cars_steps {
    private static final Logger LOGGER = LogManager.getLogger(Cars_steps.class);

    WebDriver driver = Hooks.driver;

    @When("^user clicks on cars tab$")
    public void userClicksOnCarsTab() {
        new NavigationBar(driver)
                .navigateToCars();
    }

    @Then("^user should see the title \"(.+?)\"$")
    public void userShouldSeeTitle(String text) {
        new CarsPage(driver)
                .validateCarPage(text);
    }
}
