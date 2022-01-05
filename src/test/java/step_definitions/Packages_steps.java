package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.HotelPage;
import page_objects.NavigationBar;
import page_objects.PackagesPage;

public class Packages_steps {
    private static final Logger LOGGER = LogManager.getLogger(Packages_steps.class);

    WebDriver driver = Hooks.driver;

    @When("^user clicks on packages tab$")
    public void userClicksOnPackagesTab() {
        new NavigationBar(driver)
                .navigateToPackages();
    }

    @Then("^the user should see title \"(.+?)\"$")
    public void userShouldSeeTitle(String text) {
        new PackagesPage(driver)
                .validatePackagesPage(text);
    }
}
