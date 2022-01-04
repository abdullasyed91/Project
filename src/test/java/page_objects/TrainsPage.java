package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrainsPage extends NavigationBar {
    private final By onTrainsPage = By.xpath("//*[contains(text(),'train deals')]");
    private final By FromInputField = By.id("b2Qy-origin");
    private final By ToInputField = By.id("b2Qy-destination");
    private final By TravelDateInputField = By.id("b2Qy-start-date");
    private final By ReturnDateInputField = By.id("b2Qy-end-date");
    private final By SearchButton = By.id("b2Qy-submit");
    private final By AfterSearchTrain = By.id("a9uG-times-takeoff-label-0");
    private final static Logger LOGGER = LogManager.getLogger(TrainsPage.class);

    public TrainsPage(WebDriver driver) {
        super(driver);
    }

    public TrainsPage validateTrainsPage(String expectedText) {
//        String actualText = ActOn.element(driver, onTrainsPage).getTextValue();
        ActOn.validate(driver, onTrainsPage).elementIsDisplayed();
        LOGGER.debug("Validating the trains page");
        return this;
    }

    public TrainsPage typeFrom(String value) {
        ActOn.element(driver, FromInputField).setValue(value);
        LOGGER.debug("Typing the from " + value);
        return this;
    }

    public TrainsPage typeTo(String value) {
        ActOn.element(driver, ToInputField).setValue(value);
        LOGGER.debug("Typing the to " + value);
        return this;
    }

    public TrainsPage selectTravelDate(String value) {
        ActOn.element(driver, TravelDateInputField).selectValue(value);
        LOGGER.debug("Selecting the travel " + value);
        return this;
    }

    public TrainsPage selectReturnDate(String value) {
        ActOn.element(driver, ReturnDateInputField).selectValue(value);
        LOGGER.debug("Selecting the return date " + value);
        return this;
    }

    public TrainsPage clickSearchButton() {
        ActOn.element(driver, SearchButton).click();
        LOGGER.debug("Clicking on the search button");
        return this;
    }

    public TrainsPage validateSearchTrain() {
        ActOn.validate(driver, AfterSearchTrain).elementIsDisplayed();
        LOGGER.debug("Validating the searched train");
        return this;
    }
}
