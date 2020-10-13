package tests.mfc;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import configuration.DataProviders;
import configuration.MFC_testConfig;

import static site.Data.WebElements.JobMenu_WebElements.Job_Operations_button;
import static site.Data.WebElements.Operation_CV.Delivery_button;
import static site.Data.WebElements.Operation_CV.New_Operation_button;


/**
 * Created by Lena on 22.10.2019.
 */
public class Delivery implements MFC_testConfig {
    // @Test(dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_gblinerstest")
    @Test(priority=1,dataProviderClass = DataProviders.class, dataProvider = "createFileForNewClient")
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
        appMFC.getJobGrid_Metods().click(Delivery_button);
        appMFC.getDelivery_Metods().clickOnAddStaff_button();
        appMFC.getDelivery_Metods().selectStaffFromDropdownInPopup();
        appMFC.getDelivery_Metods().clickOnAddButtonOnAddStaffPopup();
        appMFC.getDelivery_Metods().selectStaffInStaffGrid();
        appMFC.getDelivery_Metods().clickOnStaffTime_button();
        appMFC.getDelivery_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getDelivery_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getDelivery_Metods().clickOnStaffImportToExpenseButton();
        appMFC.getDelivery_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        appMFC.getDelivery_Metods().selectVehicleFromDropdownInPopup();
        appMFC.getDelivery_Metods().clickOnAddButtonOnAddVehiclePopup();
        appMFC.getDelivery_Metods().selectVehicleInVehiclesGrid();
        appMFC.getDelivery_Metods().clickOnVehicleTime_button();
        appMFC.getDelivery_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getDelivery_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getDelivery_Metods().clickOnVehicleImportToExpenseButton();
        appMFC.getDelivery_Metods().clickOnAddEquipment_button_InEquipmentGrid();
        appMFC.getDelivery_Metods().selectEquipmentFromDropdownInPopup();
        appMFC.getDelivery_Metods().clickOnAddButtonOnAddEquipmentPopup();
        appMFC.getDelivery_Metods().selectEquipmentInEquipmentsGrid();
        appMFC.getDelivery_Metods().clickOnEquipmentTime_button();
        appMFC.getDelivery_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getDelivery_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getDelivery_Metods().clickOnEquipmentImportToExpenseButton();
    }



   // @Test
    public void addRresource_Staff() {

        appMFC.getBoxDelivery_Metods().clickOnAddStaff_button();
        appMFC.getBoxDelivery_Metods().selectStaffFromDropdownInPopup();
        appMFC.getBoxDelivery_Metods().clickOnAddButtonOnAddStaffPopup();
        appMFC.getBoxDelivery_Metods().selectStaffInStaffGrid();
        appMFC.getBoxDelivery_Metods().clickOnStaffTime_button();
        appMFC.getBoxDelivery_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getBoxDelivery_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getBoxDelivery_Metods().clickOnStaffImportToExpenseButton();

    }
   // @Test
    public void addRresource_Vehicles() {
        appMFC.getBoxDelivery_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        appMFC.getBoxDelivery_Metods().selectVehicleFromDropdownInPopup();
        appMFC.getBoxDelivery_Metods().clickOnAddButtonOnAddVehiclePopup();
        appMFC.getBoxDelivery_Metods().selectVehicleInVehiclesGrid();
        appMFC.getBoxDelivery_Metods().clickOnVehicleTime_button();
        appMFC.getBoxDelivery_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getBoxDelivery_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getBoxDelivery_Metods().clickOnVehicleImportToExpenseButton();
    }

   // @Test
    public void addRresource_Equipment() {
        appMFC.getBoxDelivery_Metods().clickOnAddEquipment_button_InEquipmentGrid();
        appMFC.getBoxDelivery_Metods().selectEquipmentFromDropdownInPopup();
        appMFC.getBoxDelivery_Metods().clickOnAddButtonOnAddEquipmentPopup();
        appMFC.getBoxDelivery_Metods().selectEquipmentInEquipmentsGrid();
        appMFC.getBoxDelivery_Metods().clickOnEquipmentTime_button();
        appMFC.getBoxDelivery_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getBoxDelivery_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getBoxDelivery_Metods().clickOnEquipmentImportToExpenseButton();
    }

 }
