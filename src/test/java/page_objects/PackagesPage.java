package page_objects;

import command_providers.ActOn;
import command_providers.ElementAssertion;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PackagesPage extends NavigationBar {

    private final By onPackagesPage = By.xpath("//*[contains(text(),'right package')]");
    private final static Logger LOGGER = LogManager.getLogger(PackagesPage.class);

    public PackagesPage(WebDriver driver) {
        super(driver);
    }

    public PackagesPage validatePackagesPage(String expectedText) {
//        String actualText = ActOn.element(driver, onPackagesPage).getTextValue();
        ActOn.validate(driver, onPackagesPage).elementIsDisplayed();
        LOGGER.debug("Validating packages page");
        return this;
    }
}
