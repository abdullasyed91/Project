package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.CruisesPage;
import page_objects.ExplorePage;
import page_objects.NavigationBar;

public class Explore_steps {
    private static final Logger LOGGER = LogManager.getLogger(Explore_steps.class);

    WebDriver driver = Hooks.driver;

    @When("^user clicks on the explore tab$")
    public void userClicksOnExploreTab() {
        new NavigationBar(driver)
                .navigateToExplore();
    }

    @Then("^the user should see header \"(.+?)\"$")
    public void userShouldSeeTitle(String text) {
        new ExplorePage(driver)
                .validateExplorePage(text);
    }
}
