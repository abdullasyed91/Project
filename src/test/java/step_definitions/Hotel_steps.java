package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.FlightsPage;
import page_objects.HotelPage;
import page_objects.NavigationBar;

public class Hotel_steps {
    private static final Logger LOGGER = LogManager.getLogger(Hotel_steps.class);

    WebDriver driver = Hooks.driver;

    @When("^user clicks on the stays tab$")
    public void userClicksOnStaysTab() {
        new NavigationBar(driver)
                .navigateToHotel();
    }

    @Then("^user will see title \"(.+?)\"$")
    public void userShouldSeeTitle(String text) {
        new HotelPage(driver)
                .validateHotelPage(text);
    }
}
