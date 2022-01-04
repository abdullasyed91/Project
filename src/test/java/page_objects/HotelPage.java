package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelPage extends NavigationBar {

    private final By onHotelPage = By.xpath("//*[contains(text(),'vacation home')]");
    private final static Logger LOGGER = LogManager.getLogger(HotelPage.class);
    public HotelPage(WebDriver driver) {
        super(driver);
    }

    public HotelPage validateHotelPage(String expectedText) {
//        String actualText = ActOn.element(driver, onHotelPage).getTextValue();
        ActOn.validate(driver, onHotelPage).elementIsDisplayed();
        LOGGER.debug("Validating the hotel page ");
        return this;
    }
}
