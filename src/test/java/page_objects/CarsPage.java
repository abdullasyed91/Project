package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarsPage extends NavigationBar {

    private final By onCarsPage = By.xpath("//*[contains(text(),'right one')]");
    private final static Logger LOGGER = LogManager.getLogger(CarsPage.class);
    public CarsPage(WebDriver driver) {
        super(driver);
    }

    public CarsPage validateCarPage(String expectedText) {
//        String actualText = ActOn.element(driver, onCarsPage).getTextValue();
        ActOn.validate(driver, onCarsPage).elementIsDisplayed();
        LOGGER.debug("Validating the car page ");
        return this;
    }
}
