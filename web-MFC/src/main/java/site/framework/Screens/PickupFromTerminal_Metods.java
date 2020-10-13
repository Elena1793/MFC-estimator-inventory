package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.Data.WebElements.PickupFromTerminal_WebElements;
import site.Data.WebElements.WarehouseOutload_WebElements;
import site.framework.ApplicationManager.BasisMetods;

/**
 * Created by Lena on 10.11.2019.
 */
public class PickupFromTerminal_Metods extends BasisMetods {
    public PickupFromTerminal_Metods(WebDriver wd) {
        super(wd);
    }

    public void clickOnAddVehicles_button_InVehiclesGrid(){
        allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(PickupFromTerminal_WebElements.AddVehicles_button_VehiclesGrid);
    }
    public void selectVehicleFromDropdownInPopup(){
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(PickupFromTerminal_WebElements.VehiclesDropdownField);
        click(PickupFromTerminal_WebElements.VehicleElementInStaffDropdown);

    }

    public void clickOnAddButtonOnAddVehiclePopup(){
        click(PickupFromTerminal_WebElements.AddButtonOnAddVehiclePopUp);
    }

    public void selectVehicleInVehiclesGrid() {

        click(PickupFromTerminal_WebElements.VehicleElementInVehicleGrid);
    }

    public void clickOnVehicleTime_button() {
        click(PickupFromTerminal_WebElements.VehicleTimeButtonOnVehiclesGrid);
    }

    public void clickOnVehicleImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(PickupFromTerminal_WebElements.VehicleImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }



    public void addRresource_Vehicles() {

        click(PickupFromTerminal_WebElements.AddVehicles_button_VehiclesGrid);
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(PickupFromTerminal_WebElements.VehiclesDropdownField);
        click(PickupFromTerminal_WebElements.VehicleElementInStaffDropdown);
        click(PickupFromTerminal_WebElements.AddButtonOnAddVehiclePopUp);
        click(PickupFromTerminal_WebElements.VehicleElementInVehicleGrid); //div[@id='vehiclesGrid']//*[@class='k-selectable']
        click(PickupFromTerminal_WebElements.VehicleTimeButtonOnVehiclesGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(PickupFromTerminal_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(PickupFromTerminal_WebElements.CloseButtonOnTimesSheetWindow);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(PickupFromTerminal_WebElements.VehicleImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }





    public void clickOnAddStaff_button() {
        click(PickupFromTerminal_WebElements.AddStaff_button_StaffGrid);
    }

    public void selectStaffFromDropdownInPopup() {
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(PickupFromTerminal_WebElements.StaffDropdownField);
        click(PickupFromTerminal_WebElements.StaffElementInStaffDropdown);
    }

    public void clickOnAddButtonOnAddStaffPopup() {
        click(PickupFromTerminal_WebElements.AddButtonOnAddStaffPopUp);
    }

    public void selectStaffInStaffGrid() {
        click(PickupFromTerminal_WebElements.StaffElementInStaffGrid);
    }

    public void clickOnStaffTime_button() {
        click(PickupFromTerminal_WebElements.StaffTimeButtonOnStaffGrid);
    }

    public void clickOnAddTimeSheetButtonInTimesSheetWindow() {
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(PickupFromTerminal_WebElements.AddTimeSheetButtonInTimesSheetWindow);
    }

    public void clickCloseButtonOnTimesSheetWindow() {
        click(PickupFromTerminal_WebElements.CloseButtonOnTimesSheetWindow);
    }

    public void clickOnStaffImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(PickupFromTerminal_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }


    public void addRresource_Staff() {

        click(PickupFromTerminal_WebElements.AddStaff_button_StaffGrid);
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(PickupFromTerminal_WebElements.StaffDropdownField);
        click(PickupFromTerminal_WebElements.StaffElementInStaffDropdown);
        click(PickupFromTerminal_WebElements.AddButtonOnAddStaffPopUp);
        click(PickupFromTerminal_WebElements.StaffElementInStaffGrid);
        click(PickupFromTerminal_WebElements.StaffTimeButtonOnStaffGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(PickupFromTerminal_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(PickupFromTerminal_WebElements.CloseButtonOnTimesSheetWindow);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(PickupFromTerminal_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }
}
