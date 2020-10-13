package tests.mfc;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import site.Data.WebElements.*;
import configuration.DataProviders;
import configuration.MFC_testConfig;

import static site.Data.Resources.GlobalResources.ScreensURL.Job_Grid;

/**
 * Created by user on 20.05.2019.
 */
public class CheckMenu implements MFC_testConfig, UserMenu_WebElements, MainMenu_WebElements, ManagementScreen_WebElements,JobMenu_WebElements {


    @Test(dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")

    public void checkManagementMenu(By locatorlanguage) {

        appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        Assert.assertTrue(appMFC.getUserMenu_Metods().Check_changeLanguage(locatorlanguage, MainMenu_List));


        appMFC.getMainMenu_Metods().ManagementScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().ReportsGlobalScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().ReportsClientScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().SuppliersScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().AgentsScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().ClientsScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().ResourcesScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().MaterialsScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().ExchangeRatesScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().TasksScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().click(By.xpath("//a[contains(text(),'Quote types')]"));
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().OfficeStaffScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().UsersScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().RolesScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().ItemsScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().ResidenceSettingsScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().OtherSettingsScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().CompanyStructureScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().NotificationConfigScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().DictionaryScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().LeadsScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().Questions_and_servicesScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().StatusesScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().DocumentsScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().Offered_servicesScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().Billable_servicesScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getManagementMenu_Metods().Licenses_servicesScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getMainMenu_Metods().ManagementScreen_Open();
    }

    @Test (dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")

    public void checkMainMenu(By locatorlanguage) {
        appMFC.getUserMenu_Metods().OpenPageByUrl(Job_Grid);
        appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        Assert.assertTrue(appMFC.getUserMenu_Metods().Check_changeLanguage(locatorlanguage, MainMenu_List));

        appMFC.getMainMenu_Metods().ClickOn_Surveys_button();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getMainMenu_Metods().FinancialsScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getMainMenu_Metods().Opportunity_GridScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getMainMenu_Metods().Warehouse_GridScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getMainMenu_Metods().Transactions_GridScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getMainMenu_Metods().ClickOn_Quotation_button();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getMainMenu_Metods().Shipments_GridScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getMainMenu_Metods().Tasks_GridScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getMainMenu_Metods().DailyAgendaScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getMainMenu_Metods().Job_GridScreen_Open();


    }

    @Test (dataProviderClass = DataProviders.class, dataProvider = "changeLanguage")

    public void checkJobMenu(By locatorlanguage) {
        appMFC.getUserMenu_Metods().OpenPageByUrl(Job_Grid);
        appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        Assert.assertTrue(appMFC.getUserMenu_Metods().Check_changeLanguage(locatorlanguage, MainMenu_List));

       // appMFC.getMainMenu_Metods().Job_GridScreen_Open();

        appMFC.getMainMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        appMFC.getJobMenu_Metods().click(By.xpath("//tr[1]/td[1]/a[1]"));
        appMFC.getJobMenu_Metods().Job_SummaryScreen_Open();

        Assert.assertTrue(appMFC.getUserMenu_Metods().Check_changeLanguage(locatorlanguage, Job_Menu_list));

        appMFC.getJobMenu_Metods().Job_TasksScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getJobMenu_Metods().Job_DocumentsScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getJobMenu_Metods().Job_CommunicationHistoryScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getJobMenu_Metods().Job_SurveysScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getJobMenu_Metods().Job_QuotationsScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getJobMenu_Metods().Job_ShipmentsScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getJobMenu_Metods().Job_OperationsScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getJobMenu_Metods().Job_InventoryScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getJobMenu_Metods().Job_ExpensesScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getJobMenu_Metods().Job_InvoicesScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getJobMenu_Metods().Job_WarehouseScreen_Open();
        appMFC.getManagementMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getJobMenu_Metods().Job_SatisfactionSurveyScreen_Open();

        appMFC.getJobMenu_Metods().ReturnToJob_Grid();

    }

}

