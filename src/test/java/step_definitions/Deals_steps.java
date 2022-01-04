package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.CruisesPage;
import page_objects.DealsPage;
import page_objects.NavigationBar;

public class Deals_steps {
    private static final Logger LOGGER = LogManager.getLogger(Deals_steps.class);

    WebDriver driver = Hooks.driver;

    @When("^user clicks on the deal tab$")
    public void userClicksOnDealsTab() {
        new NavigationBar(driver)
                .navigateToDeals();
    }

    @Then("^user should see header \"(.+?)\"$")
    public void userShouldSeeTitle(String text) {
        new DealsPage(driver)
                .validateDealsPage(text);
    }
}
