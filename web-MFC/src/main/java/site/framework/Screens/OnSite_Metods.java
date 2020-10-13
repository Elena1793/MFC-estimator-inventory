package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import site.Data.WebElements.OnSite_WebElements;
import site.framework.ApplicationManager.BasisMetods;

/**
 * Created by Lena on 10.11.2019.
 */
public class OnSite_Metods extends BasisMetods {
    public OnSite_Metods(WebDriver wd) {
        super(wd);
    }

    public void clickOnAddVehicles_button_InVehiclesGrid(){
        click(OnSite_WebElements.AddVehicles_button_VehiclesGrid);
    }
    public void selectVehicleFromDropdownInPopup(){
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(OnSite_WebElements.VehiclesDropdownField);
        click(OnSite_WebElements.VehicleElementInStaffDropdown);

    }

    public void clickOnAddButtonOnAddVehiclePopup(){
        click(OnSite_WebElements.AddButtonOnAddVehiclePopUp);
    }

    public void selectVehicleInVehiclesGrid() {

        click(OnSite_WebElements.VehicleElementInVehicleGrid);
    }

    public void clickOnVehicleTime_button() {
        click(OnSite_WebElements.VehicleTimeButtonOnVehiclesGrid);
    }

    public void clickOnVehicleImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(OnSite_WebElements.VehicleImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }



    public void addRresource_Vehicles() {

        click(OnSite_WebElements.AddVehicles_button_VehiclesGrid);
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(OnSite_WebElements.VehiclesDropdownField);
        click(OnSite_WebElements.VehicleElementInStaffDropdown);
        click(OnSite_WebElements.AddButtonOnAddVehiclePopUp);
        click(OnSite_WebElements.VehicleElementInVehicleGrid); //div[@id='vehiclesGrid']//*[@class='k-selectable']
        click(OnSite_WebElements.VehicleTimeButtonOnVehiclesGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(OnSite_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(OnSite_WebElements.CloseButtonOnTimesSheetWindow);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(OnSite_WebElements.VehicleImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }





    public void clickOnAddStaff_button() {
        click(OnSite_WebElements.AddStaff_button_StaffGrid);
    }

    public void selectStaffFromDropdownInPopup() {
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(OnSite_WebElements.StaffDropdownField);
        click(OnSite_WebElements.StaffElementInStaffDropdown);
    }

    public void clickOnAddButtonOnAddStaffPopup() {
        click(OnSite_WebElements.AddButtonOnAddStaffPopUp);
    }

    public void selectStaffInStaffGrid() {
        click(OnSite_WebElements.StaffElementInStaffGrid);
    }

    public void clickOnStaffTime_button() {
        click(OnSite_WebElements.StaffTimeButtonOnStaffGrid);
    }

    public void clickOnAddTimeSheetButtonInTimesSheetWindow() {
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(OnSite_WebElements.AddTimeSheetButtonInTimesSheetWindow);
    }

    public void clickCloseButtonOnTimesSheetWindow() {
        click(OnSite_WebElements.CloseButtonOnTimesSheetWindow);
    }

    public void clickOnStaffImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(OnSite_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }


    public void addRresource_Staff() {

        click(OnSite_WebElements.AddStaff_button_StaffGrid);
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(OnSite_WebElements.StaffDropdownField);
        click(OnSite_WebElements.StaffElementInStaffDropdown);
        click(OnSite_WebElements.AddButtonOnAddStaffPopUp);
        click(OnSite_WebElements.StaffElementInStaffGrid);
        click(OnSite_WebElements.StaffTimeButtonOnStaffGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(OnSite_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(OnSite_WebElements.CloseButtonOnTimesSheetWindow);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(OnSite_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }

    public void addRresource_Equipment() {
        // app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //   app.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));

        waitForElementByVisibility(OnSite_WebElements.AddEquipment_button_InEquipmentGrid);
       click(OnSite_WebElements.AddEquipment_button_InEquipmentGrid);

        // app.getJobMenu_Metods().click(By.xpath("//button[@id='equipmentAdd']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(OnSite_WebElements.EquipmentDropdownField);
        click(OnSite_WebElements.EquipmentElementInStaffDropdown);
        click(OnSite_WebElements.AddButtonOnAddEquipmentPopUp);

        click(OnSite_WebElements.EquipmentElementInEquipmentsGrid); //div[@id='vehiclesGrid']//*[@class='k-selectable']
        click(OnSite_WebElements.EquipmentTimeButtonOnEquipmentsGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(OnSite_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(By.xpath("//a[@class='btn btn_sm btn__cancel k-button timesheetClose']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(OnSite_WebElements.EquipmentImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }

    public void clickOnAddEquipment_button_InEquipmentGrid(){
        waitForElementByVisibility(OnSite_WebElements.AddEquipment_button_InEquipmentGrid);
        click(OnSite_WebElements.AddEquipment_button_InEquipmentGrid);
    }
    public void selectEquipmentFromDropdownInPopup(){
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(OnSite_WebElements.EquipmentDropdownField);
        click(OnSite_WebElements.EquipmentElementInStaffDropdown);

    }

    public void clickOnAddButtonOnAddEquipmentPopup() {
        click(OnSite_WebElements.AddButtonOnAddEquipmentPopUp);
    }

    public void selectEquipmentInEquipmentsGrid() {
        click(OnSite_WebElements.EquipmentElementInEquipmentsGrid);
    }

    public void clickOnEquipmentTime_button() {
        click(OnSite_WebElements.EquipmentTimeButtonOnEquipmentsGrid);
    }

    public void clickOnEquipmentImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(OnSite_WebElements.EquipmentImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }
}
