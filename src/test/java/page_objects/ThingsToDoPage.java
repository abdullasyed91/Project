package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThingsToDoPage extends NavigationBar {
    private final By onThingsToDoPage = By.xpath("//*[contains(text(),'best things')]");
    private final static Logger LOGGER = LogManager.getLogger(ThingsToDoPage.class);

    public ThingsToDoPage(WebDriver driver) {
        super(driver);
    }

    public ThingsToDoPage validateThingsToDoPage(String expectedText) {
//        String actualText = ActOn.element(driver, onThingsToDoPage).getTextValue();
        ActOn.validate(driver, onThingsToDoPage).elementIsDisplayed();
        LOGGER.debug("Validating the things to do page ");
        return this;
    }
}
