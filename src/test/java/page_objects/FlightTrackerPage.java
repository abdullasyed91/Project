package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightTrackerPage extends NavigationBar {

    private final By FlightNumberTab = By.xpath("//*[contains(text(),'Flight number')]");
    private final By onFlightTrackerPage = By.xpath("//*[contains(text(),'worldwide flight')]");
    private final By AirlineInputField = By.id("E8Y--flightNumberTrackForm-airline");
    private final By FlightNumberInputField = By.id("E8Y--flightNumberTrackForm-flight-number");
    private final By FlightDate = By.id("E8Y--flightNumberTrackForm-date-start");
    private final By SearchButton = By.id("E8Y--flightNumberTrackForm-submit");
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

    public FlightTrackerPage typeAirlineName(String value) {
        ActOn.element(driver, AirlineInputField).setValue(value);
        LOGGER.debug("Typing the airline name "  + value);
        return this;
    }
    public FlightTrackerPage typeFlightNumber(String value) {
        ActOn.element(driver, FlightNumberInputField).setValue(value);
        LOGGER.debug("Typing the flight number " + value);
        return this;
    }

    public FlightTrackerPage selectDate(String value){
        ActOn.element(driver, FlightDate).selectValue(value);
        LOGGER.debug("Selecting the flight date");
        return this;
    }

    public FlightTrackerPage clickSearch() {
        ActOn.element(driver, SearchButton).click();
        return this;
    }
}
