package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExplorePage extends NavigationBar {

    private final By onExplorePage = By.xpath("//*[contains(text(),'destinations')]");
    private final static Logger LOGGER = LogManager.getLogger(ExplorePage.class);

    public ExplorePage(WebDriver driver) {
        super(driver);
    }

    public ExplorePage validateExplorePage(String expectedText) {
//        String actualText = ActOn.element(driver, onExplorePage).getTextValue();
        ActOn.wait(driver, onExplorePage).waitForElementToBeVisible();
        ActOn.validate(driver, onExplorePage).elementIsDisplayed();
        LOGGER.debug("Validating the explore page");
        return this;
    }
}
