package tests.mfc;


import org.openqa.selenium.By;

import org.testng.annotations.Test;
import site.Data.Resources.Units;
import configuration.DataProviders;
import configuration.MFC_testConfig;


import static site.Data.WebElements.JobMenu_WebElements.Job_Operations_button;
import static site.Data.WebElements.Operation_CV.New_Operation_button;

import static site.Data.WebElements.Operation_CV.WarehouseReceiveIn_button;

/**
 * Created by Lena on 22.10.2019.
 */
public class WarehouseReceiveIn implements MFC_testConfig {
  //  @BeforeClass
    public void Precondition(){
        Integer row1 =(int)(Math.random()*8)+1;
        String row = String.valueOf(row1);
        System.out.print(row);

        appMFC.getOperationsCV_metods().create_WarehouseReceiveIn(row);

    }

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
        appMFC.getJobGrid_Metods().click(WarehouseReceiveIn_button);
        appMFC.getJobGrid_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        appMFC.getWarehouseReceiveIn_Metods().AddLoadUniteButton();
        appMFC.getWarehouseReceiveIn_Metods().selectLoadUniteInLoadingUnitType_dropdown(new Units(locatorlanguage).getAirvan());
        appMFC.getWarehouseReceiveIn_Metods().setNetVolumeInLoadUnitsGrid("100");
        appMFC.getWarehouseReceiveIn_Metods().setGrossVolumeInLoadUnitsGrid("200");
        appMFC.getWarehouseReceiveIn_Metods().setNetWeightInLoadUnitsGrid("300");
        appMFC.getWarehouseReceiveIn_Metods().setGrossWeightInLoadUnitsGrid("400");
        appMFC.getWarehouseReceiveIn_Metods().setLocationInLoadUnitsGrid();
        appMFC.getWarehouseReceiveIn_Metods().clickOnSaveButtonInLoadUnitsGrid();
        appMFC.getWarehouseReceiveIn_Metods().clickOnAddStaff_button();
        appMFC.getWarehouseReceiveIn_Metods().selectStaffFromDropdownInPopup();
        appMFC.getWarehouseReceiveIn_Metods().clickOnAddButtonOnAddStaffPopup();
        appMFC.getWarehouseReceiveIn_Metods().selectStaffInStaffGrid();
        appMFC.getWarehouseReceiveIn_Metods().clickOnStaffTime_button();
        appMFC.getWarehouseReceiveIn_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getWarehouseReceiveIn_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getWarehouseReceiveIn_Metods().clickOnStaffImportToExpenseButton();

    }




}
