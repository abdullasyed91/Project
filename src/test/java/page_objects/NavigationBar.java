package page_objects;

import command_providers.ActOn;
import io.cucumber.java.en_old.Ac;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {
    public WebDriver driver;

    private final By FlightsTab = By.xpath("//*[text()='Flights']");
    private final By HotelTab = By.xpath("//*[text()='Stays']");
    private final By CarsTab = By.xpath("//*[text()='Cars']");
    private final By ThingsToDoTab = By.xpath("//*[contains(text(),'Things')]");
    private final By PackagesTab = By.xpath("//*[text()='Packages']");
    private final By TrainsTab = By.xpath("//*[text()='Trains']");
    private final By CruisesTab = By.xpath("//*[text()='Cruises']");
    private final By ExploreTab = By.xpath("//*[text()='Explore']");
    private final By DealsTab = By.xpath("//*[text()='Deals']");
    private final By FlightTrackerTab = By.xpath("//*[text()='Flight Tracker']");
    private final By TravelRestrictionTab = By.xpath("//*[contains(text(),'Travel')]");

    private static final Logger LOGGER = LogManager.getLogger(NavigationBar.class);

    public NavigationBar(WebDriver driver) {
        this.driver = driver;
    }

    public FlightsPage navigateToFlights() {
        ActOn.element(driver, FlightsTab).click();
        LOGGER.debug("Navigating to flights page");
        return new FlightsPage(driver);
    }

    public HotelPage navigateToHotel() {
        ActOn.element(driver, HotelTab).click();
        LOGGER.debug("Navigating to hotel page");
        return new HotelPage(driver);
    }

    public CarsPage navigateToCars() {
        ActOn.element(driver, CarsTab).click();
        LOGGER.debug("Navigating to cars page");
        return new CarsPage(driver);
    }

    public ThingsToDoPage navigateToThingsToDo() {
        ActOn.element(driver, ThingsToDoTab).click();
        LOGGER.debug("Navigating to the things to do page");
        return new ThingsToDoPage(driver);
    }

    public PackagesPage navigateToPackages() {
        ActOn.element(driver,PackagesTab).click();
        LOGGER.debug("Navigating to the packages page");
        return new PackagesPage(driver);
    }

    public TrainsPage navigateToTrains() {
        ActOn.element(driver, TrainsTab).click();
        LOGGER.debug("Navigating to the trains page");
        return new TrainsPage(driver);
    }

    public CruisesPage navigateToCruises() {
        ActOn.element(driver, CruisesTab).click();
        LOGGER.debug("Navigating to the cruises page");
        return new CruisesPage(driver);
    }

    public ExplorePage navigateToExplore() {
        ActOn.element(driver, ExploreTab).click();
        LOGGER.debug("navigating to the explore page");
        return new ExplorePage(driver);
    }

    public DealsPage navigateToDeals() {
        ActOn.element(driver, DealsTab).click();
        LOGGER.debug("Navigating to the deals page");
        return new DealsPage(driver);
    }

    public FlightTrackerPage navigateToFlightTracker() {
        ActOn.element(driver, FlightTrackerTab).click();
        LOGGER.debug("Navigating to the flight tracker page");
        return new FlightTrackerPage(driver);
    }

}
