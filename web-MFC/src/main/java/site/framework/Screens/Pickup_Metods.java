package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.Data.WebElements.Pickup_WebElements;
import site.framework.ApplicationManager.BasisMetods;

/**
 * Created by Lena on 07.11.2019.
 */
public class Pickup_Metods extends BasisMetods {

    public Pickup_Metods(WebDriver wd) {
        super(wd);
    }

    public void clickOnAddVehicles_button_InVehiclesGrid(){
        click(Pickup_WebElements.AddVehicles_button_VehiclesGrid);
    }
    public void selectVehicleFromDropdownInPopup(){
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Pickup_WebElements.VehiclesDropdownField);
        click(Pickup_WebElements.VehicleElementInStaffDropdown);

    }

    public void clickOnAddButtonOnAddVehiclePopup(){
        click(Pickup_WebElements.AddButtonOnAddVehiclePopUp);
    }

    public void selectVehicleInVehiclesGrid() {

        click(Pickup_WebElements.VehicleElementInVehicleGrid);
    }

    public void clickOnVehicleTime_button() {
        click(Pickup_WebElements.VehicleTimeButtonOnVehiclesGrid);
    }

    public void clickOnVehicleImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(Pickup_WebElements.VehicleImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }



    public void addRresource_Vehicles() {

        click(Pickup_WebElements.AddVehicles_button_VehiclesGrid);
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Pickup_WebElements.VehiclesDropdownField);
        click(Pickup_WebElements.VehicleElementInStaffDropdown);
        click(Pickup_WebElements.AddButtonOnAddVehiclePopUp);
        click(Pickup_WebElements.VehicleElementInVehicleGrid); //div[@id='vehiclesGrid']//*[@class='k-selectable']
        click(Pickup_WebElements.VehicleTimeButtonOnVehiclesGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Pickup_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(Pickup_WebElements.CloseButtonOnTimesSheetWindow);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(Pickup_WebElements.VehicleImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }





    public void clickOnAddStaff_button() {
        click(Pickup_WebElements.AddStaff_button_StaffGrid);
    }

    public void selectStaffFromDropdownInPopup() {
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Pickup_WebElements.StaffDropdownField);
        click(Pickup_WebElements.StaffElementInStaffDropdown);
    }

    public void clickOnAddButtonOnAddStaffPopup() {
        click(Pickup_WebElements.AddButtonOnAddStaffPopUp);
    }

    public void selectStaffInStaffGrid() {
        click(Pickup_WebElements.StaffElementInStaffGrid);
    }

    public void clickOnStaffTime_button() {
        click(Pickup_WebElements.StaffTimeButtonOnStaffGrid);
    }

    public void clickOnAddTimeSheetButtonInTimesSheetWindow() {
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Pickup_WebElements.AddTimeSheetButtonInTimesSheetWindow);
    }

    public void clickCloseButtonOnTimesSheetWindow() {
        click(Pickup_WebElements.CloseButtonOnTimesSheetWindow);
    }

    public void clickOnStaffImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(Pickup_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }


    public void addRresource_Staff() {

        click(Pickup_WebElements.AddStaff_button_StaffGrid);
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Pickup_WebElements.StaffDropdownField);
        click(Pickup_WebElements.StaffElementInStaffDropdown);
        click(Pickup_WebElements.AddButtonOnAddStaffPopUp);
        click(Pickup_WebElements.StaffElementInStaffGrid);
        click(Pickup_WebElements.StaffTimeButtonOnStaffGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Pickup_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(Pickup_WebElements.CloseButtonOnTimesSheetWindow);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(Pickup_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }

    public void addRresource_Equipment() {
        // app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //   app.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));

        waitForElementByVisibility(Pickup_WebElements.AddEquipment_button_InEquipmentGrid);
        click(Pickup_WebElements.AddEquipment_button_InEquipmentGrid);

        // app.getJobMenu_Metods().click(By.xpath("//button[@id='equipmentAdd']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Pickup_WebElements.EquipmentDropdownField);
        click(Pickup_WebElements.EquipmentElementInStaffDropdown);
        click(Pickup_WebElements.AddButtonOnAddEquipmentPopUp);

        click(Pickup_WebElements.EquipmentElementInEquipmentsGrid); //div[@id='vehiclesGrid']//*[@class='k-selectable']
        click(Pickup_WebElements.EquipmentTimeButtonOnEquipmentsGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Pickup_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(By.xpath("//a[@class='btn btn_sm btn__cancel k-button timesheetClose']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(Pickup_WebElements.EquipmentImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }

    public void clickOnAddEquipment_button_InEquipmentGrid(){
        waitForElementByVisibility(Pickup_WebElements.AddEquipment_button_InEquipmentGrid);
        click(Pickup_WebElements.AddEquipment_button_InEquipmentGrid);
    }
    public void selectEquipmentFromDropdownInPopup(){
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Pickup_WebElements.EquipmentDropdownField);
        click(Pickup_WebElements.EquipmentElementInStaffDropdown);

    }

    public void clickOnAddButtonOnAddEquipmentPopup() {
        click(Pickup_WebElements.AddButtonOnAddEquipmentPopUp);
    }

    public void selectEquipmentInEquipmentsGrid() {
        click(Pickup_WebElements.EquipmentElementInEquipmentsGrid);
    }

    public void clickOnEquipmentTime_button() {
        click(Pickup_WebElements.EquipmentTimeButtonOnEquipmentsGrid);
    }

    public void clickOnEquipmentImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(Pickup_WebElements.EquipmentImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }
}
