package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.Data.Resources.GlobalResources.ScreensURL;
import site.framework.ApplicationManager.BasisMetods;

import static site.Data.WebElements.JobMenu_WebElements.Job_Operations_button;
import static site.Data.WebElements.MainMenu_WebElements.Jobs_button;
import static site.Data.WebElements.Operation_CV.*;

/**
 * Created by Lena on 22.10.2019.
 */
public class OperationsCV_metods extends BasisMetods {

    By HomeButtonOnJobMenu;

    public OperationsCV_metods(WebDriver wd) {
        super(wd);
    }

    public void create_Pickup(String row){
        waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-mask']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        OpenPage(Jobs_button, ScreensURL.Job_Grid);
        clickOnRowInGrid(row);
        OpenPage(Job_Operations_button,"Transaction/ClientFileGrid");
        click(New_Operation_button);
        click(Pickup_button);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }
    public void clickOnRowInGrid(String row){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        click(By.xpath("//tr["+row+"]/td[1]/a[1]"));
    }
    public void create_Delivery(String row ) {

       // waitForElementByLeavingDOM(By.xpath("/[@class='k-loading-mask']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        OpenPage(Jobs_button, ScreensURL.Job_Grid);
        clickOnRowInGrid(row);
        OpenPage(Job_Operations_button,"Transaction/ClientFileGrid");
        click(New_Operation_button);
        click(Delivery_button);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }
    public void create_PickupFromTerminal(String row){
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        OpenPage(Jobs_button, ScreensURL.Job_Grid);
        clickOnRowInGrid(row);
        OpenPage(Job_Operations_button,"Transaction/ClientFileGrid");
        click(New_Operation_button);
        click(PickupFromTerminal_button);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }

    public void create_DeliveryToTerminal(String row){
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        OpenPage(Jobs_button, ScreensURL.Job_Grid);
        clickOnRowInGrid(row);
        OpenPage(Job_Operations_button,"Transaction/ClientFileGrid");
        click(New_Operation_button);
        click(By.xpath("//li[@trans-type='Enum.TransactionType.DeliveryToTerminal']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }
    public void create_WarehouseReceiveIn(String row) {
        //    app.getUserMenu_Metods(). waitForElementByLeavingDOM(By.xpath("/[@class='k-loading-mask']"));
        OpenPage(Jobs_button, ScreensURL.Job_Grid);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        clickOnRowInGrid(row);
        OpenPage(Job_Operations_button,"Transaction/ClientFileGrid");
        click(New_Operation_button);
        click(By.xpath("//li[@trans-type='Enum.TransactionType.WarehouseReceiveIn']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));


    }

    public void create_WarehouseOutload(String row) {


        OpenPage(Jobs_button, ScreensURL.Job_Grid);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        clickOnRowInGrid(row);
        OpenPage(Job_Operations_button,"Transaction/ClientFileGrid");
        click(New_Operation_button);
        click(By.xpath("//li[@trans-type='Enum.TransactionType.WarehouseOutload']"));
       waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));


    }

    public void create_BoxDelivery(String row) {
        OpenPage(Jobs_button, ScreensURL.Job_Grid);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        clickOnRowInGrid(row);
        OpenPage(Job_Operations_button,"Transaction/ClientFileGrid");
        click(New_Operation_button);
        click(By.xpath("//li[@trans-type='Enum.TransactionType.BoxDelivery']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));


    }

    public void create_OnSite(String row) {
        OpenPage(Jobs_button, ScreensURL.Job_Grid);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        clickOnRowInGrid(row);
        OpenPage(Job_Operations_button,"Transaction/ClientFileGrid");
        click(New_Operation_button);
        click(By.xpath("//li[@trans-type='Enum.TransactionType.OnSite']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));


    }
    public void create_Relo(String row) {
        //   app.getUserMenu_Metods(). waitForElementByLeavingDOM(By.xpath("/[@class='k-loading-mask']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));;
        OpenPage(Jobs_button, ScreensURL.Job_Grid);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        clickOnRowInGrid(row);
        OpenPage(Job_Operations_button,"Transaction/ClientFileGrid");
        click(New_Operation_button);
        click(By.xpath("//li[@trans-type='Enum.TransactionType.Relo']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));


    }

}
