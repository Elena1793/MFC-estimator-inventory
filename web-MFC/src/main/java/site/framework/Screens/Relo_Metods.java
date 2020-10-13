package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.Data.WebElements.Relo_WebElements;
import site.framework.ApplicationManager.BasisMetods;

/**
 * Created by Lena on 10.11.2019.
 */
public class Relo_Metods extends BasisMetods {
    public Relo_Metods(WebDriver wd) {
        super(wd);
    }

    public void clickOnAddVehicles_button_InVehiclesGrid(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(Relo_WebElements.AddVehicles_button_VehiclesGrid);
    }
    public void selectVehicleFromDropdownInPopup(){
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(Relo_WebElements.VehiclesDropdownField);
        click(Relo_WebElements.VehicleElementInStaffDropdown);

    }

    public void clickOnAddButtonOnAddVehiclePopup(){
        click(Relo_WebElements.AddButtonOnAddVehiclePopUp);
    }

    public void selectVehicleInVehiclesGrid() {

        click(Relo_WebElements.VehicleElementInVehicleGrid);
    }

    public void clickOnVehicleTime_button() {
        click(Relo_WebElements.VehicleTimeButtonOnVehiclesGrid);
    }

    public void clickOnVehicleImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(Relo_WebElements.VehicleImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }



    public void addRresource_Vehicles() {

        click(Relo_WebElements.AddVehicles_button_VehiclesGrid);
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Relo_WebElements.VehiclesDropdownField);
        click(Relo_WebElements.VehicleElementInStaffDropdown);
        click(Relo_WebElements.AddButtonOnAddVehiclePopUp);
        click(Relo_WebElements.VehicleElementInVehicleGrid); //div[@id='vehiclesGrid']//*[@class='k-selectable']
        click(Relo_WebElements.VehicleTimeButtonOnVehiclesGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Relo_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(Relo_WebElements.CloseButtonOnTimesSheetWindow);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(Relo_WebElements.VehicleImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }





    public void clickOnAddStaff_button() {
        click(Relo_WebElements.AddStaff_button_StaffGrid);
    }

    public void selectStaffFromDropdownInPopup() {
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Relo_WebElements.StaffDropdownField);
        click(Relo_WebElements.StaffElementInStaffDropdown);
    }

    public void clickOnAddButtonOnAddStaffPopup() {
        click(Relo_WebElements.AddButtonOnAddStaffPopUp);
    }

    public void selectStaffInStaffGrid() {
        click(Relo_WebElements.StaffElementInStaffGrid);
    }

    public void clickOnStaffTime_button() {
        click(Relo_WebElements.StaffTimeButtonOnStaffGrid);
    }

    public void clickOnAddTimeSheetButtonInTimesSheetWindow() {
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Relo_WebElements.AddTimeSheetButtonInTimesSheetWindow);
    }

    public void clickCloseButtonOnTimesSheetWindow() {
        click(Relo_WebElements.CloseButtonOnTimesSheetWindow);
    }

    public void clickOnStaffImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(Relo_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }


    public void addRresource_Staff() {

        click(Relo_WebElements.AddStaff_button_StaffGrid);
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Relo_WebElements.StaffDropdownField);
        click(Relo_WebElements.StaffElementInStaffDropdown);
        click(Relo_WebElements.AddButtonOnAddStaffPopUp);
        click(Relo_WebElements.StaffElementInStaffGrid);
        click(Relo_WebElements.StaffTimeButtonOnStaffGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Relo_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(Relo_WebElements.CloseButtonOnTimesSheetWindow);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(Relo_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }

    public void addRresource_Equipment() {
        // app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //   app.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));

        waitForElementByVisibility(Relo_WebElements.AddEquipment_button_InEquipmentGrid);
        click(Relo_WebElements.AddEquipment_button_InEquipmentGrid);

        // app.getJobMenu_Metods().click(By.xpath("//button[@id='equipmentAdd']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Relo_WebElements.EquipmentDropdownField);
        click(Relo_WebElements.EquipmentElementInStaffDropdown);
        click(Relo_WebElements.AddButtonOnAddEquipmentPopUp);

        click(Relo_WebElements.EquipmentElementInEquipmentsGrid); //div[@id='vehiclesGrid']//*[@class='k-selectable']
        click(Relo_WebElements.EquipmentTimeButtonOnEquipmentsGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Relo_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(By.xpath("//a[@class='btn btn_sm btn__cancel k-button timesheetClose']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(Relo_WebElements.EquipmentImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }

    public void clickOnAddEquipment_button_InEquipmentGrid(){
        waitForElementByVisibility(Relo_WebElements.AddEquipment_button_InEquipmentGrid);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(Relo_WebElements.AddEquipment_button_InEquipmentGrid);
    }
    public void selectEquipmentFromDropdownInPopup(){
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(Relo_WebElements.EquipmentDropdownField);
        click(Relo_WebElements.EquipmentElementInStaffDropdown);

    }

    public void clickOnAddButtonOnAddEquipmentPopup() {
        click(Relo_WebElements.AddButtonOnAddEquipmentPopUp);
    }

    public void selectEquipmentInEquipmentsGrid() {
        click(Relo_WebElements.EquipmentElementInEquipmentsGrid);
    }

    public void clickOnEquipmentTime_button() {
        click(Relo_WebElements.EquipmentTimeButtonOnEquipmentsGrid);
    }

    public void clickOnEquipmentImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(Relo_WebElements.EquipmentImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }
}
