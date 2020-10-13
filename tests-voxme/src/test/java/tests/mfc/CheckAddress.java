package tests.mfc;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import configuration.DataProviders;
import configuration.MFC_testConfig;

import static site.Data.WebElements.MainMenu_WebElements.MainMenu_List;

/**
 * Created by user on 23.05.2019.
 */
public class CheckAddress implements MFC_testConfig {

    @Test(dataProviderClass = DataProviders.class,dataProvider = "NewAddress")

    public void CreateNewAddress_FromSection(By language, String country1, String country2,String city1, String street1, String zip){


        appMFC.getUserMenu_Metods().changeLanguage(language);
        Assert.assertTrue(appMFC.getUserMenu_Metods().Check_changeLanguage(language, MainMenu_List));

        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        appMFC.getJobGrid_Metods().clickOnRowInGrid("1");

        appMFC.getAddressForm_Metods().clickAddNewAddressButton_FromSection();
        appMFC.getAddressForm_Metods().newOriginAddress_setCountry(country1);
        appMFC.getAddressForm_Metods().newOriginAddress_setCity(city1);
        appMFC.getAddressForm_Metods().newOriginAddress_setZip(zip);
        appMFC.getAddressForm_Metods().newOriginAddress_setStreet1(street1);
        appMFC.getAddressForm_Metods().newOriginAddress_CreateButton();
        Assert.assertTrue(appMFC.getAddressForm_Metods().
                isElementPresent(By.xpath("//*[@class='place place_from']//span[contains(text(),'"+street1+", "+city1+", "+zip+", "+country1+"')]")));
        appMFC.getJobMenu_Metods().ReturnToJob_Grid();

    }

    @Test(dataProviderClass = DataProviders.class,dataProvider = "NewAddress")

    public void CreateNewAddress_ToSection(By language, String country1, String country2,String city1, String street1, String zip){


        appMFC.getUserMenu_Metods().changeLanguage(language);
        Assert.assertTrue(appMFC.getUserMenu_Metods().Check_changeLanguage(language, MainMenu_List));

        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        appMFC.getJobGrid_Metods().clickOnRowInGrid("1");

        appMFC.getAddressForm_Metods().clickAddNewAddressButton_ToSection();
        appMFC.getAddressForm_Metods().newDestinationAddress_setCountry(country2);
        appMFC.getAddressForm_Metods().newDestinationAddress_setCity(city1);
        appMFC.getAddressForm_Metods().newDestinationAddress_setZip(zip);
        appMFC.getAddressForm_Metods().newDestinationAddress_setStreet1(street1);
        appMFC.getAddressForm_Metods().newDestinationAddress_CreateButton();
        Assert.assertTrue(appMFC.getAddressForm_Metods().
                isElementPresent(By.xpath("//*[@class='place place_to']//span[contains(text(),'"+street1+", "+city1+", "+zip+", "+country2+"')]")));
        appMFC.getJobMenu_Metods().ReturnToJob_Grid();

    }

  //  @Test(dataProviderClass = DataProviders.class,dataProvider= "EditAddressDetails")
    public void editAddressDetails(By language,String editCountry, String editCity, String editStreet1, String editCompany, String editZip, String residenceType,
                                   String residenceTypeDescription, String floor, String elevatorDetails, String kindOfCran, String parkingType,
                                   String parkingSpotSize, String numberOfSpots, String distanceOfParking, String shuttleDistance, String carryDistance,
                                   String stairsCarryDistance, String carryDetails, String stairsCarryDetails, String additionalStopDetails){

        appMFC.getUserMenu_Metods().changeLanguage(language);
        Assert.assertTrue(appMFC.getUserMenu_Metods().Check_changeLanguage(language, MainMenu_List));

        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        appMFC.getJobGrid_Metods().clickOnRowInGrid("1");

        appMFC.getAddressDetails_Metods().clickOnEditAddressButton_FromSection();
        appMFC.getAddressDetails_Metods().addressDetails_setCountry(editCountry);
        appMFC.getAddressDetails_Metods().addressDetails_setCity(editCity);
        appMFC.getAddressDetails_Metods().addressDetails_setStreet1 (editStreet1);
        appMFC.getAddressDetails_Metods().addressDetails_setCompany (editCompany);
        appMFC.getAddressDetails_Metods().addressDetails_setZip (editZip);
        appMFC.getAddressDetails_Metods().addressDetails_setResidenceType (residenceType);
        appMFC.getAddressDetails_Metods().addressDetails_setResidenceTypeDescription (residenceTypeDescription);
        appMFC.getAddressDetails_Metods().addressDetails_setFloor (floor);
        appMFC.getAddressDetails_Metods().addressDetails_setElevatorCheckbox_True ();

        appMFC.getAddressDetails_Metods().addressDetails_setElevatorDetails (elevatorDetails);
        appMFC.getAddressDetails_Metods().addressDetails_NeedCraneCheckbox_True ();


     //   appMFC.getAddressDetails_Metods().addressDetails_KindOfCran (kindOfCran);

        appMFC.getAddressDetails_Metods().addressDetails_ParkingCheckbox_True ();
        appMFC.getAddressDetails_Metods().addressDetails_ParkingType (parkingType);


        appMFC.getAddressDetails_Metods().addressDetails_setParkingSpotSize (parkingSpotSize);
        appMFC.getAddressDetails_Metods().addressDetails_setNumberOfSpots (numberOfSpots);
        appMFC.getAddressDetails_Metods().addressDetails_setDistanceOfParking (distanceOfParking);
        appMFC.getAddressDetails_Metods().addressDetails_NeedShuttleCheckbox_True ();
        appMFC.getAddressDetails_Metods().shuttleDistance (shuttleDistance);
        appMFC.getAddressDetails_Metods().addressDetails_CarryRequiredCheckbox_True ();
        appMFC.getAddressDetails_Metods().carryDistance(carryDistance);
        appMFC.getAddressDetails_Metods().carryDetails (carryDetails);
        appMFC.getAddressDetails_Metods().addressDetails_StairsCarryRequiredCheckbox_True ();
        appMFC.getAddressDetails_Metods().StairsCarryDistance (stairsCarryDistance);
        appMFC.getAddressDetails_Metods().stairsCarryDetails (stairsCarryDetails);
        appMFC.getAddressDetails_Metods().addressDetails_additionalStopRequiredCheckbox_True ();
        appMFC.getAddressDetails_Metods().additionalStopDetails (additionalStopDetails);
        appMFC.getAddressDetails_Metods().click(By.xpath("//*[@class='header']//a[@*]"));
        appMFC.getAddressDetails_Metods().click(By.xpath("//a[@*='/Job/Grid']"));



    }
}
