package tests.mfc;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import configuration.MFC_testConfig;

import static site.Data.WebElements.Operation_CV.HomeButtonOnJobMenu;
import static site.Data.WebElements.Operation_CV.New_Operation_button;
import static site.Data.WebElements.Operation_CV.Pickup_button;

/**
 * Created by user on 15.08.2019.
 */
public class OperationsCV implements MFC_testConfig {
    Integer row1 =(int)(Math.random()*8)+1;
    String row = String.valueOf(row1);


    @Test// (dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")
    public void create_Pickup() {
        appMFC.getUserMenu_Metods(). waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-mask']"));
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
      appMFC.userMenu_Metods_lang().changeLanguage_byApp();
        appMFC.getJobGrid_Metods().clickOnRowInGrid(row);
        appMFC.getJobMenu_Metods().Job_OperationsScreen_Open();
        appMFC.getJobMenu_Metods().click(New_Operation_button);
        appMFC.getJobMenu_Metods().click(Pickup_button);
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        appMFC.getMainMenu_Metods().click(HomeButtonOnJobMenu);


    }

    @Test //(dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")
    public void create_Delivery( ) {
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
       appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        appMFC.userMenu_Metods_lang().changeLanguage_byApp();
        appMFC.getJobGrid_Metods().clickOnRowInGrid(row);
        appMFC.getJobMenu_Metods().Job_OperationsScreen_Open();
        appMFC.getJobMenu_Metods().click(New_Operation_button);
        appMFC.getJobMenu_Metods().click(By.xpath("//li[@trans-type='Enum.TransactionType.Delivery']"));
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        appMFC.getMainMenu_Metods().click(HomeButtonOnJobMenu);
    }

    @Test//(dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")
    public void create_PickupFromTerminal() {
        appMFC.getMainMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
       appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        appMFC.userMenu_Metods_lang().changeLanguage_byApp();        //appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        appMFC.getJobGrid_Metods().clickOnRowInGrid(row);
        appMFC.getJobMenu_Metods().Job_OperationsScreen_Open();
        appMFC.getJobMenu_Metods().click(New_Operation_button);
        appMFC.getJobMenu_Metods().click(By.xpath("//li[@trans-type='Enum.TransactionType.PickupFromTerminal']"));
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        appMFC.getMainMenu_Metods().click(HomeButtonOnJobMenu);


    }

    @Test//(dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")
    public void create_DeliveryToTerminal() {
        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        appMFC.userMenu_Metods_lang().changeLanguage_byApp();        appMFC.getJobGrid_Metods().clickOnRowInGrid(row);
        appMFC.getJobMenu_Metods().Job_OperationsScreen_Open();
        appMFC.getJobMenu_Metods().click(New_Operation_button);
        appMFC.getJobMenu_Metods().click(By.xpath("//li[@trans-type='Enum.TransactionType.DeliveryToTerminal']"));
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        appMFC.getMainMenu_Metods().click(HomeButtonOnJobMenu);

    }
    @Test//(dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")
    public void create_WarehouseOutload() {
        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        appMFC.userMenu_Metods_lang().changeLanguage_byApp();
        appMFC.getJobGrid_Metods().clickOnRowInGrid(row);
        appMFC.getJobMenu_Metods().Job_OperationsScreen_Open();
        appMFC.getJobMenu_Metods().click(New_Operation_button);
        appMFC.getJobMenu_Metods().click(By.xpath("//li[@trans-type='Enum.TransactionType.WarehouseOutload']"));
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        appMFC.getMainMenu_Metods().click(HomeButtonOnJobMenu);
    }

    @Test//(dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")
    public void create_WarehouseReceiveIn() {
        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        appMFC.userMenu_Metods_lang().changeLanguage_byApp();
        appMFC.getJobGrid_Metods().clickOnRowInGrid(row);
        appMFC.getJobMenu_Metods().Job_OperationsScreen_Open();
        appMFC.getJobMenu_Metods().click(New_Operation_button);
        appMFC.getJobMenu_Metods().click(By.xpath("//li[@trans-type='Enum.TransactionType.WarehouseReceiveIn']"));
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        appMFC.getMainMenu_Metods().click(HomeButtonOnJobMenu);

    }


    @Test//(dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")
    public void create_BoxDelivery() {

       appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
       // appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        appMFC.userMenu_Metods_lang().changeLanguage_byApp();
        appMFC.getJobGrid_Metods().clickOnRowInGrid(row);
        appMFC.getJobMenu_Metods().Job_OperationsScreen_Open();
        appMFC.getJobMenu_Metods().click(New_Operation_button);
        appMFC.getJobMenu_Metods().click(By.xpath("//li[@trans-type='Enum.TransactionType.BoxDelivery']"));
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        appMFC.getMainMenu_Metods().click(HomeButtonOnJobMenu);
    }

    @Test//(dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")
    public void create_OnSite() {

        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
       // appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        appMFC.userMenu_Metods_lang().changeLanguage_byApp();
        appMFC.getJobGrid_Metods().clickOnRowInGrid(row);
        appMFC.getJobMenu_Metods().Job_OperationsScreen_Open();
        appMFC.getJobMenu_Metods().click(New_Operation_button);
        appMFC.getJobMenu_Metods().click(By.xpath("//li[@trans-type='Enum.TransactionType.OnSite']"));
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));

        appMFC.getMainMenu_Metods().click(By.xpath("//a[@class='job-menu__item small-font']"));
    }

    @Test// (dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")
    public void create_Relo() {
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
       // appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        appMFC.userMenu_Metods_lang().changeLanguage_byApp();
        appMFC.getJobGrid_Metods().clickOnRowInGrid(row);
        appMFC.getJobMenu_Metods().Job_OperationsScreen_Open();
        appMFC.getJobMenu_Metods().click(New_Operation_button);
        appMFC.getJobMenu_Metods().click(By.xpath("//li[@trans-type='Enum.TransactionType.Relo']"));
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        appMFC.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        appMFC.getMainMenu_Metods().click(By.xpath("//a[@class='job-menu__item small-font']"));


    }
}