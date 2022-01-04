package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightsPage extends NavigationBar {

    private final By FlightPageHeader = By.xpath("//*[contains(text(),'no change')]");
//    private final By SelectOneWayTrip = By.xpath("//*[text()='One-way']");
    private final By SelectOneWayTrip = By.xpath("//div[@class='wIIH-handle']");

    private final By PassengerDropDown = By.xpath("UKFa-dropdownOptions");
    private final By FromInputField = By.xpath("//*[@placeholder='From?']");
    private final By ToInputField = By.xpath("//*[@placeholder='To?']");
    private final By SelectDate = By.className("ATGJ-monthWrapper");
    private final By SearchButton = By.className("Iqt3-button-container");
    private final By AfterSearchFLight = By.xpath("//*[contains(text(),'Take-off from')]");
    private static final Logger LOGGER = LogManager.getLogger(FlightsPage.class);
    public FlightsPage(WebDriver driver) {
        super(driver);
    }


    public FlightsPage validateFlightsPage(String expectedText) {
//        String actualText = ActOn.element(driver,onFlightPage).getTextValue();
        ActOn.validate(driver, FlightPageHeader).elementIsDisplayed();
        LOGGER.debug("Validating the flights page ");
        return this;
    }

    public FlightsPage selectOneWay(String tripType) {
        LOGGER.debug("Selecting one-way trip");
        ActOn.element(driver, SelectOneWayTrip).setValue(tripType);
        return this;
    }

    public FlightsPage typeFrom (String from) {
        LOGGER.debug("typing from " + from);
        ActOn.element(driver, FromInputField).setValue(from);
        return this;
    }

    public FlightsPage typeTo (String to) {
        LOGGER.debug("typing to " + to);
        ActOn.element(driver, ToInputField).setValue(to);
        return this;
    }

    public FlightsPage selectDate(String date) {
        LOGGER.debug("Selecting the travel date " + date);
        ActOn.element(driver, SelectDate).selectValue(date);
        return this;
    }

    public FlightsPage clickSearch() {
        LOGGER.debug("Clicking on the search button");
        ActOn.element(driver, SearchButton).click();
        return this;
    }

    public FlightsPage validatingSearcherFlight() {
        LOGGER.debug("Validating searched flight");
        ActOn.validate(driver, AfterSearchFLight).elementIsDisplayed();
        return this;
    }

}
