package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightTrackerPage extends NavigationBar {

    private final By FlightNumberTab = By.id("//*[contains(text(),'Flight number')]");
    private final By onFlightTrackerPage = By.xpath("//*[contains(text(),'worldwide flight')]");
    private final static Logger LOGGER = LogManager.getLogger(FlightTrackerPage.class);

    public FlightTrackerPage(WebDriver driver) {
        super(driver);
    }

    public FlightTrackerPage validateFlightTrackerPage() {
//        String actualText = ActOn.element(driver, TrackFlightButton).getTextValue();
        ActOn.wait(driver, onFlightTrackerPage).waitForElementToBeVisible();
        ActOn.validate(driver, onFlightTrackerPage).elementIsDisplayed();
        LOGGER.debug("Validating the flight tracker page");
        return this;
    }
}
