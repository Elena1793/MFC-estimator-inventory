package tests.mfc;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import configuration.DataProviders;
import configuration.MFC_testConfig;

import static site.Data.WebElements.JobMenu_WebElements.Job_Operations_button;
import static site.Data.WebElements.Operation_CV.New_Operation_button;
import static site.Data.WebElements.Operation_CV.Relo_button;

/**
 * Created by Lena on 22.10.2019.
 */
public class Relo implements MFC_testConfig {


    @Test(priority=1,dataProviderClass = DataProviders.class, dataProvider = "createFileForNewClient")
    public void init(By locatorlanguage, String bookingType, String source, String jobType,
                     String mode, String serviceType, String serviceLevel,
                     String firstName, String lastName, String email, String phone,
                     String country1, String country2, String city1, String city2,
                     String street1, String street2, String zip1, String zip2) {

        appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        String client = firstName + " " + lastName;
        appMFC.getJobGrid_Metods().openJobByClientName(client);
        appMFC.getJobGrid_Metods().OpenPage(Job_Operations_button, "Transaction/ClientFileGrid");
        appMFC.getJobGrid_Metods().click(New_Operation_button);
        appMFC.getJobGrid_Metods().click(Relo_button);
        appMFC.getJobGrid_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        appMFC.getRelo_Metods().clickOnAddStaff_button();
        appMFC.getRelo_Metods().selectStaffFromDropdownInPopup();
        appMFC.getRelo_Metods().clickOnAddButtonOnAddStaffPopup();
        appMFC.getRelo_Metods().selectStaffInStaffGrid();
        appMFC.getRelo_Metods().clickOnStaffTime_button();
        appMFC.getRelo_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getRelo_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getRelo_Metods().clickOnStaffImportToExpenseButton();
        appMFC.getRelo_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        appMFC.getRelo_Metods().selectVehicleFromDropdownInPopup();
        appMFC.getRelo_Metods().clickOnAddButtonOnAddVehiclePopup();
        appMFC.getRelo_Metods().selectVehicleInVehiclesGrid();
        appMFC.getRelo_Metods().clickOnVehicleTime_button();
        appMFC.getRelo_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getRelo_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getRelo_Metods().clickOnVehicleImportToExpenseButton();
        appMFC.getRelo_Metods().clickOnAddEquipment_button_InEquipmentGrid();
        appMFC.getRelo_Metods().selectEquipmentFromDropdownInPopup();
        appMFC.getRelo_Metods().clickOnAddButtonOnAddEquipmentPopup();
        appMFC.getRelo_Metods().selectEquipmentInEquipmentsGrid();
        appMFC.getRelo_Metods().clickOnEquipmentTime_button();
        appMFC.getRelo_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getRelo_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getRelo_Metods().clickOnEquipmentImportToExpenseButton();
    }


  //  @Test
    public void addRresource_Staff() {

        appMFC.getRelo_Metods().clickOnAddStaff_button();
        appMFC.getRelo_Metods().selectStaffFromDropdownInPopup();
        appMFC.getRelo_Metods().clickOnAddButtonOnAddStaffPopup();
        appMFC.getRelo_Metods().selectStaffInStaffGrid();
        appMFC.getRelo_Metods().clickOnStaffTime_button();
        appMFC.getRelo_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getRelo_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getRelo_Metods().clickOnStaffImportToExpenseButton();

    }
  //  @Test
    public void addRresource_Vehicles() {
        appMFC.getRelo_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        appMFC.getRelo_Metods().selectVehicleFromDropdownInPopup();
        appMFC.getRelo_Metods().clickOnAddButtonOnAddVehiclePopup();
        appMFC.getRelo_Metods().selectVehicleInVehiclesGrid();
        appMFC.getRelo_Metods().clickOnVehicleTime_button();
        appMFC.getRelo_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getRelo_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getRelo_Metods().clickOnVehicleImportToExpenseButton();
    }

  //  @Test
    public void addRresource_Equipment() {
        appMFC.getRelo_Metods().clickOnAddEquipment_button_InEquipmentGrid();
        appMFC.getRelo_Metods().selectEquipmentFromDropdownInPopup();
        appMFC.getRelo_Metods().clickOnAddButtonOnAddEquipmentPopup();
        appMFC.getRelo_Metods().selectEquipmentInEquipmentsGrid();
        appMFC.getRelo_Metods().clickOnEquipmentTime_button();
        appMFC.getRelo_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getRelo_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getRelo_Metods().clickOnEquipmentImportToExpenseButton();
    }




}
