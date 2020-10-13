package tests.mfc;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import configuration.DataProviders;
import configuration.MFC_testConfig;

import static site.Data.WebElements.JobMenu_WebElements.Job_Operations_button;
import static site.Data.WebElements.Operation_CV.New_Operation_button;
import static site.Data.WebElements.Operation_CV.PickupFromTerminal_button;

/**
 * Created by Lena on 22.10.2019.
 */
public class PickupFromTerminal implements MFC_testConfig {
  //  @BeforeClass
    public void Precondition(){
        Integer row1 =(int)(Math.random()*8)+1;
        String row = String.valueOf(row1);
        System.out.print(row);
        appMFC.getOperationsCV_metods().create_PickupFromTerminal(row);

    }
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
        appMFC.getJobGrid_Metods(). click(New_Operation_button);
        appMFC.getJobGrid_Metods().click(PickupFromTerminal_button);
        appMFC.getJobGrid_Metods(). waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        appMFC.getPickupFromTerminal_Metods().clickOnAddStaff_button();
        appMFC.getPickupFromTerminal_Metods().selectStaffFromDropdownInPopup();
        appMFC.getPickupFromTerminal_Metods().clickOnAddButtonOnAddStaffPopup();
        appMFC.getPickupFromTerminal_Metods().selectStaffInStaffGrid();
        appMFC.getPickupFromTerminal_Metods().clickOnStaffTime_button();
        appMFC.getPickupFromTerminal_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getPickupFromTerminal_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getPickupFromTerminal_Metods().clickOnStaffImportToExpenseButton();
        appMFC.getPickupFromTerminal_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        appMFC.getPickupFromTerminal_Metods().selectVehicleFromDropdownInPopup();
        appMFC.getPickupFromTerminal_Metods().clickOnAddButtonOnAddVehiclePopup();
        appMFC.getPickupFromTerminal_Metods().selectVehicleInVehiclesGrid();
        appMFC.getPickupFromTerminal_Metods().clickOnVehicleTime_button();
        appMFC.getPickupFromTerminal_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getPickupFromTerminal_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getPickupFromTerminal_Metods().clickOnVehicleImportToExpenseButton();


    }


  //  @Test
    public void addRresource_Staff() {

        appMFC.getPickupFromTerminal_Metods().clickOnAddStaff_button();
        appMFC.getPickupFromTerminal_Metods().selectStaffFromDropdownInPopup();
        appMFC.getPickupFromTerminal_Metods().clickOnAddButtonOnAddStaffPopup();
        appMFC.getPickupFromTerminal_Metods().selectStaffInStaffGrid();
        appMFC.getPickupFromTerminal_Metods().clickOnStaffTime_button();
        appMFC.getPickupFromTerminal_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getPickupFromTerminal_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getPickupFromTerminal_Metods().clickOnStaffImportToExpenseButton();

    }
    //@Test
    public void addRresource_Vehicles() {
        appMFC.getPickupFromTerminal_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        appMFC.getPickupFromTerminal_Metods().selectVehicleFromDropdownInPopup();
        appMFC.getPickupFromTerminal_Metods().clickOnAddButtonOnAddVehiclePopup();
        appMFC.getPickupFromTerminal_Metods().selectVehicleInVehiclesGrid();
        appMFC.getPickupFromTerminal_Metods().clickOnVehicleTime_button();
        appMFC.getPickupFromTerminal_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getPickupFromTerminal_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getPickupFromTerminal_Metods().clickOnVehicleImportToExpenseButton();
    }



}
