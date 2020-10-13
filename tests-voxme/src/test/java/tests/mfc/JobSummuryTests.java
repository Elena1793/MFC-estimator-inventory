package tests.mfc;

import org.openqa.selenium.By;

import configuration.MFC_testConfig;

/**
 * Created by user on 27.05.2018.
 */
public class JobSummuryTests implements MFC_testConfig {


    //@Test(dataProviderClass = DataProviders.class,dataProvider ="NewAddress")
    public void CreateNewAddresses(By locatorlanguage, String countryOtigin, String countryDestinaton, String city, String street1, String zip){
        appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        appMFC.getJobMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        appMFC.getJobMenu_Metods().click(By.xpath("//a[@href=\"/Job/JobSummary?id=893\"]"));
        appMFC.getAddressForm_Metods().createNewAddtess("from",countryOtigin, city, street1, zip);
        appMFC.getAddressForm_Metods().createNewAddtess("to",countryDestinaton, city, street1, zip);

    }


    // @Test(dataProviderClass = DataProviders.class,dataProvider ="EditAddressDetails")
    public void EditAddressDetails (By locatorlanguage,String editCountry, String editCity, String editStreet1, String editCompany, String editZip, String residenceType,
                                     String residenceTypeDescription, String floor, String elevatorDetails, String kindOfCran, String parkingType,
                                     String parkingSpotSize, String numberOfSpots, String distanceOfParking, String shuttleDistance, String carryDistance,
                                     String stairsCarryDistance, String carryDetails, String stairsCarryDetails, String additionalStopDetails){
        appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        appMFC.getJobMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        appMFC.getJobMenu_Metods().click(By.xpath("//tr[1]/td[1]//a")); //appMFC.getJobMenu_Metods().click(By.xpath("//a[@href=\"/Job/JobSummary?id=893\"]"));


        appMFC.getAddressDetails_Metods().editAddress(editCountry, editCity, editStreet1, editCompany, editZip, residenceType,
                residenceTypeDescription, floor, elevatorDetails, kindOfCran, parkingType,
                parkingSpotSize, numberOfSpots, distanceOfParking, shuttleDistance, carryDistance, stairsCarryDistance,
                carryDetails, stairsCarryDetails, additionalStopDetails);

    }
}
