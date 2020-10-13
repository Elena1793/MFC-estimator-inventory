package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.Data.WebElements.Delivery_WebElements;
import site.framework.ApplicationManager.BasisMetods;

/**
 * Created by Lena on 10.11.2019.
 */
public class Delivery_Metods extends BasisMetods {

    public Delivery_Metods(WebDriver wd) {
        super(wd);
    }

    public void clickOnAddVehicles_button_InVehiclesGrid(){
        allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(Delivery_WebElements.AddVehicles_button_VehiclesGrid);
    }
    public void selectVehicleFromDropdownInPopup(){
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(Delivery_WebElements.VehiclesDropdownField);
        click(Delivery_WebElements.VehicleElementInStaffDropdown);

    }

    public void clickOnAddButtonOnAddVehiclePopup(){
        click(Delivery_WebElements.AddButtonOnAddVehiclePopUp);
    }

    public void selectVehicleInVehiclesGrid() {

        click(Delivery_WebElements.VehicleElementInVehicleGrid);
    }

    public void clickOnVehicleTime_button() {
        click(Delivery_WebElements.VehicleTimeButtonOnVehiclesGrid);
    }

    public void clickOnVehicleImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(Delivery_WebElements.VehicleImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }



    public void addRresource_Vehicles() {

        click(Delivery_WebElements.AddVehicles_button_VehiclesGrid);
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Delivery_WebElements.VehiclesDropdownField);
        click(Delivery_WebElements.VehicleElementInStaffDropdown);
        click(Delivery_WebElements.AddButtonOnAddVehiclePopUp);
        click(Delivery_WebElements.VehicleElementInVehicleGrid); //div[@id='vehiclesGrid']//*[@class='k-selectable']
        click(Delivery_WebElements.VehicleTimeButtonOnVehiclesGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Delivery_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(Delivery_WebElements.CloseButtonOnTimesSheetWindow);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(Delivery_WebElements.VehicleImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }





    public void clickOnAddStaff_button() {
        allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        click(Delivery_WebElements.AddStaff_button_StaffGrid);
    }

    public void selectStaffFromDropdownInPopup() {
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Delivery_WebElements.StaffDropdownField);
        click(Delivery_WebElements.StaffElementInStaffDropdown);
    }

    public void clickOnAddButtonOnAddStaffPopup() {
        click(Delivery_WebElements.AddButtonOnAddStaffPopUp);
    }

    public void selectStaffInStaffGrid() {
        allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        click(Delivery_WebElements.StaffElementInStaffGrid);
    }

    public void clickOnStaffTime_button() {
        click(Delivery_WebElements.StaffTimeButtonOnStaffGrid);
    }

    public void clickOnAddTimeSheetButtonInTimesSheetWindow() {
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Delivery_WebElements.AddTimeSheetButtonInTimesSheetWindow);
    }

    public void clickCloseButtonOnTimesSheetWindow() {
        click(Delivery_WebElements.CloseButtonOnTimesSheetWindow);
    }

    public void clickOnStaffImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(Delivery_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }


    public void addRresource_Staff() {

        click(Delivery_WebElements.AddStaff_button_StaffGrid);
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Delivery_WebElements.StaffDropdownField);
        click(Delivery_WebElements.StaffElementInStaffDropdown);
        click(Delivery_WebElements.AddButtonOnAddStaffPopUp);
        click(Delivery_WebElements.StaffElementInStaffGrid);
        click(Delivery_WebElements.StaffTimeButtonOnStaffGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Delivery_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(Delivery_WebElements.CloseButtonOnTimesSheetWindow);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(Delivery_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }

    public void addRresource_Equipment() {
        // app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //   app.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));

        waitForElementByVisibility(Delivery_WebElements.AddEquipment_button_InEquipmentGrid);
        click(Delivery_WebElements.AddEquipment_button_InEquipmentGrid);

        // app.getJobMenu_Metods().click(By.xpath("//button[@id='equipmentAdd']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Delivery_WebElements.EquipmentDropdownField);
        click(Delivery_WebElements.EquipmentElementInStaffDropdown);
        click(Delivery_WebElements.AddButtonOnAddEquipmentPopUp);

        click(Delivery_WebElements.EquipmentElementInEquipmentsGrid); //div[@id='vehiclesGrid']//*[@class='k-selectable']
        click(Delivery_WebElements.EquipmentTimeButtonOnEquipmentsGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Delivery_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(By.xpath("//a[@class='btn btn_sm btn__cancel k-button timesheetClose']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(Delivery_WebElements.EquipmentImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }

    public void clickOnAddEquipment_button_InEquipmentGrid(){
        allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        waitForElementByVisibility(Delivery_WebElements.AddEquipment_button_InEquipmentGrid);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(Delivery_WebElements.AddEquipment_button_InEquipmentGrid);
    }
    public void selectEquipmentFromDropdownInPopup(){
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Delivery_WebElements.EquipmentDropdownField);
        click(Delivery_WebElements.EquipmentElementInStaffDropdown);

    }

    public void clickOnAddButtonOnAddEquipmentPopup() {
        click(Delivery_WebElements.AddButtonOnAddEquipmentPopUp);
    }

    public void selectEquipmentInEquipmentsGrid() {
        click(Delivery_WebElements.EquipmentElementInEquipmentsGrid);
    }

    public void clickOnEquipmentTime_button() {
        click(Delivery_WebElements.EquipmentTimeButtonOnEquipmentsGrid);
    }

    public void clickOnEquipmentImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(Delivery_WebElements.EquipmentImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }
}
