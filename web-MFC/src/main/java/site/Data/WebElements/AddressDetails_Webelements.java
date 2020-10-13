package site.Data.WebElements;

import org.openqa.selenium.By;

/**
 * Created by user on 19.11.2018.
 */
public interface AddressDetails_Webelements {

    By Countrylistbox_button = By.xpath("//*[@aria-controls=\"addressCountry_listbox\"]//*[@class=\"k-icon k-i-arrow-60-down\"]");
    By Countrylistbox_dropdown= By.xpath("//ul[@id='addressCountry_listbox' ]/li");
    By city = By.xpath("//input[@id='addressCity']");
    By street1 = By.xpath("//input[@id='addressStreet1']");
    By company = By.xpath("//input[@id='addressCompany']");
    By zip = By.xpath("//input[@id='addressZip']");
    By residentTypeListbox_button = By.xpath("//*[@aria-owns=\"addressPropertyType_listbox\"]//*[@class=\"k-icon k-i-arrow-60-down\"]");
    By residentTypeListbox_dropdown= By.xpath("//ul[@id='addressPropertyType_listbox']/li");
    By residenceTypeDescription = By.xpath("//input[@id='addressDescription']");
    By floor = By.xpath("//div[@class='address__block']//span[@class='k-widget k-numerictextbox numerictextbox_sm']");
    By elevatorDetails = By.xpath("//input[@id='addressElevatorDetails']");
    By kindOfCrane_field  = By.xpath("//input[@id='addressCraneType']//..//span[@class='k-input']");

    By kindOfCraneListbox_button = By.xpath("//*[@for='addressCraneType']");//span[@aria-owns='addressCraneType_listbox']
    By kindOfCraneListbox_dropdown = By.xpath("//ul[@id='addressCraneType_listbox']//li");

    By parkingTypeListbox_button = By.xpath("//*[@for='addressParkingType']");

    //ul[@id='addressParkingType_listbox']//li[contains(text(),'Blue Zone')]
    By parkingTypeListbox_dropdown = By.xpath("//ul[@id='addressParkingType_listbox']//li");//ul[@id='addressParkingType_listbox']//li[contains(text(),'Blue Zone')]

    By parkingSpotSize_fieldblock =
            By.xpath("//*[contains(@*,'addressParkingSpotSize')]//..//*[@class='k-widget k-numerictextbox form__input form__input_sm']");
    By parkingSpotSize_field = By.xpath("//input[@id='addressParkingSpotSize']");

    By numberOfSpots_fieldBlock =
            By.xpath("//*[contains(@*,'addressNumberOfSpots')]//..//*[@class='k-widget k-numerictextbox numerictextbox_sm']");

    //*[contains(@*,'addressParkingSpotSize')]//..//* ==e1elements
    //*[contains(@*,'addressParkingSpotSize')]//..//*[@class='k-formatted-value form__input form__input_sm k-input']==1 element
    //*[contains(@*,'addressParkingSpotSize')]//..//*[@class='k-numeric-wrap k-state-default']==1 element

    //*[contains(@*,'addressParkingSpotSize')]//..//*[@class='k-widget k-numerictextbox form__input form__input_sm']

    By numberOfSpots_field = By.xpath("//input[@name='addressNumberOfSpots']");
    By distanceOfParking_fieldBlock = By.xpath("//input[@id=\"addressDistanceOfParking\"]//..//input[@title]");
    By distanceOfParking_field = By.xpath("//input[@id=\"addressDistanceOfParking\"]");
    By shuttleDistance_fieldBlock = By.xpath("//input[@id='addressShuttleDistance']//..//input[@title]");
    By shuttleDistance_field = By.xpath("//input[@id='addressShuttleDistance']");
    By carryDistance_fieldBlock = By.xpath("//input[@id='addressCarryDistance']//..//input[@title]");
    By carryDistance_field = By.xpath("//input[@id='addressCarryDistance']");
    By carryDetails = By.xpath("//input[@id='addressCarryDetails']");
    By stairsCarryDistance_fieldBlock = By.xpath("//input[@id='addressStairsCarryDistance']//..//input[@title]");
    By stairsCarryDistance_field = By.xpath("//input[@id='addressStairsCarryDistance']");
    By stairsCarryDetails = By.xpath("//input[@id='addressStairsCarryDetails']");
    By additionalStopDetails = By.xpath("//input[@id='additionalStopDetails']");
}
