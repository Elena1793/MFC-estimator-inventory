package tests.mfc;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import configuration.DataProviders;
import configuration.MFC_testConfig;

import static site.Data.WebElements.JobMenu_WebElements.Job_Operations_button;
import static site.Data.WebElements.Operation_CV.New_Operation_button;
import static site.Data.WebElements.Operation_CV.Pickup_button;

/**
 * Created by Lena on 22.10.2019.
 */
public class Pickup implements MFC_testConfig {

    @Test(priority=1,dataProviderClass = DataProviders.class, dataProvider = "createFileForNewClient")

   // @Test(dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_gblinerstest")

    public void init(By locatorlanguage, String bookingType, String source, String jobType,
                     String mode, String serviceType, String serviceLevel,
                     String firstName, String lastName, String email, String phone,
                     String country1, String country2, String city1, String city2,
                     String street1, String street2, String zip1, String zip2){

        appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        String client = firstName + " " + lastName;
        appMFC.getJobGrid_Metods().openJobByClientName(client);
        appMFC.getJobGrid_Metods().OpenPage(Job_Operations_button,"Transaction/ClientFileGrid");
        appMFC.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getJobGrid_Metods(). click(New_Operation_button);
        appMFC.getJobGrid_Metods().click(Pickup_button);
        appMFC.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getPickup_Metods().clickOnAddStaff_button();
        appMFC.getPickup_Metods().selectStaffFromDropdownInPopup();
        appMFC.getPickup_Metods().clickOnAddButtonOnAddStaffPopup();
        appMFC.getPickup_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getPickup_Metods().selectStaffInStaffGrid();
        appMFC.getPickup_Metods().clickOnStaffTime_button();
        appMFC.getPickup_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getPickup_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getPickup_Metods().clickOnStaffImportToExpenseButton();
        appMFC.getPickup_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        appMFC.getPickup_Metods().selectVehicleFromDropdownInPopup();
        appMFC.getPickup_Metods().clickOnAddButtonOnAddVehiclePopup();
        appMFC.getPickup_Metods().selectVehicleInVehiclesGrid();
        appMFC.getPickup_Metods().clickOnVehicleTime_button();
        appMFC.getPickup_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getPickup_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getPickup_Metods().clickOnVehicleImportToExpenseButton();
        appMFC.getPickup_Metods().clickOnAddEquipment_button_InEquipmentGrid();
        appMFC.getPickup_Metods().selectEquipmentFromDropdownInPopup();
        appMFC.getPickup_Metods().clickOnAddButtonOnAddEquipmentPopup();
        appMFC.getPickup_Metods().selectEquipmentInEquipmentsGrid();
        appMFC.getPickup_Metods().clickOnEquipmentTime_button();
        appMFC.getPickup_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getPickup_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getPickup_Metods().clickOnEquipmentImportToExpenseButton();
        appMFC.getPickup_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
    }



  //  @Test(priority=2)
    public void addRresource_Staff() {

        appMFC.getPickup_Metods().clickOnAddStaff_button();
        appMFC.getPickup_Metods().selectStaffFromDropdownInPopup();
        appMFC.getPickup_Metods().clickOnAddButtonOnAddStaffPopup();
        appMFC.getPickup_Metods().selectStaffInStaffGrid();
        appMFC.getPickup_Metods().clickOnStaffTime_button();
        appMFC.getPickup_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getPickup_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getPickup_Metods().clickOnStaffImportToExpenseButton();

    }
  //  @Test(priority=3)
    public void addRresource_Vehicles() {
        appMFC.getPickup_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        appMFC.getPickup_Metods().selectVehicleFromDropdownInPopup();
        appMFC.getPickup_Metods().clickOnAddButtonOnAddVehiclePopup();
        appMFC.getPickup_Metods().selectVehicleInVehiclesGrid();
        appMFC.getPickup_Metods().clickOnVehicleTime_button();
        appMFC.getPickup_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getPickup_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getPickup_Metods().clickOnVehicleImportToExpenseButton();
    }

  //  @Test(priority=4)
    public void addRresource_Equipment() {
        appMFC.getPickup_Metods().clickOnAddEquipment_button_InEquipmentGrid();
        appMFC.getPickup_Metods().selectEquipmentFromDropdownInPopup();
        appMFC.getPickup_Metods().clickOnAddButtonOnAddEquipmentPopup();
        appMFC.getPickup_Metods().selectEquipmentInEquipmentsGrid();
        appMFC.getPickup_Metods().clickOnEquipmentTime_button();
        appMFC.getPickup_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getPickup_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getPickup_Metods().clickOnEquipmentImportToExpenseButton();
    }


}
