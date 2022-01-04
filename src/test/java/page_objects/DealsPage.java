package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DealsPage extends NavigationBar {

    private final By onDealsPage = By.xpath("//*[contains(text(),'quick escape')]");
    private final static Logger LOGGER = LogManager.getLogger(DealsPage.class);

    public DealsPage(WebDriver driver) {
        super(driver);
    }

    public DealsPage validateDealsPage(String expectedText) {
//        String actualText = ActOn.element(driver, onDealsPage).getTextValue();
        ActOn.wait(driver, onDealsPage).waitForElementToBeVisible();
        ActOn.validate(driver, onDealsPage).elementIsDisplayed();
        LOGGER.debug("Validating the deals page");
        return this;
    }
}
