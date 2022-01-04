package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CruisesPage extends NavigationBar {

    private final By onCruisePage = By.xpath("//*[contains(text(),'Find Cruise')]");
    private final static Logger LOGGER = LogManager.getLogger(CruisesPage.class);

    public CruisesPage(WebDriver driver) {
        super(driver);
    }

    public CruisesPage validateCruisePage(String expectedText) {
//        String actualText = ActOn.element(driver, onCruisePage).getTextValue();
        ActOn.validate(driver, onCruisePage).elementIsDisplayed();
        LOGGER.debug("Validating the cruise page");
        return this;
    }
}
