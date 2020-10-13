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
public class OnSite implements MFC_testConfig {
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
        appMFC.getOnSite_Metods().clickOnAddStaff_button();
        appMFC.getOnSite_Metods().selectStaffFromDropdownInPopup();
        appMFC.getOnSite_Metods().clickOnAddButtonOnAddStaffPopup();
        appMFC.getOnSite_Metods().selectStaffInStaffGrid();
        appMFC.getOnSite_Metods().clickOnStaffTime_button();
        appMFC.getOnSite_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getOnSite_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getOnSite_Metods().clickOnStaffImportToExpenseButton();
        appMFC.getOnSite_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        appMFC.getOnSite_Metods().selectVehicleFromDropdownInPopup();
        appMFC.getOnSite_Metods().clickOnAddButtonOnAddVehiclePopup();
        appMFC.getOnSite_Metods().selectVehicleInVehiclesGrid();
        appMFC.getOnSite_Metods().clickOnVehicleTime_button();
        appMFC.getOnSite_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getOnSite_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getOnSite_Metods().clickOnVehicleImportToExpenseButton();
        appMFC.getOnSite_Metods().clickOnAddEquipment_button_InEquipmentGrid();
        appMFC.getOnSite_Metods().selectEquipmentFromDropdownInPopup();
        appMFC.getOnSite_Metods().clickOnAddButtonOnAddEquipmentPopup();
        appMFC.getOnSite_Metods().selectEquipmentInEquipmentsGrid();
        appMFC.getOnSite_Metods().clickOnEquipmentTime_button();
        appMFC.getOnSite_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getOnSite_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getOnSite_Metods().clickOnEquipmentImportToExpenseButton();
    }

   // @Test
    public void addRresource_Staff() {

        appMFC.getOnSite_Metods().clickOnAddStaff_button();
        appMFC.getOnSite_Metods().selectStaffFromDropdownInPopup();
        appMFC.getOnSite_Metods().clickOnAddButtonOnAddStaffPopup();
        appMFC.getOnSite_Metods().selectStaffInStaffGrid();
        appMFC.getOnSite_Metods().clickOnStaffTime_button();
        appMFC.getOnSite_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getOnSite_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getOnSite_Metods().clickOnStaffImportToExpenseButton();

    }
   // @Test
    public void addRresource_Vehicles() {
        appMFC.getOnSite_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        appMFC.getOnSite_Metods().selectVehicleFromDropdownInPopup();
        appMFC.getOnSite_Metods().clickOnAddButtonOnAddVehiclePopup();
        appMFC.getOnSite_Metods().selectVehicleInVehiclesGrid();
        appMFC.getOnSite_Metods().clickOnVehicleTime_button();
        appMFC.getOnSite_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getOnSite_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getOnSite_Metods().clickOnVehicleImportToExpenseButton();
    }

   // @Test
    public void addRresource_Equipment() {
        appMFC.getOnSite_Metods().clickOnAddEquipment_button_InEquipmentGrid();
        appMFC.getOnSite_Metods().selectEquipmentFromDropdownInPopup();
        appMFC.getOnSite_Metods().clickOnAddButtonOnAddEquipmentPopup();
        appMFC.getOnSite_Metods().selectEquipmentInEquipmentsGrid();
        appMFC.getOnSite_Metods().clickOnEquipmentTime_button();
        appMFC.getOnSite_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getOnSite_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getOnSite_Metods().clickOnEquipmentImportToExpenseButton();
    }




}
