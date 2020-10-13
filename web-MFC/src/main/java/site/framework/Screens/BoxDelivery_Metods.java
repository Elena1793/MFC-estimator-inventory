package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.Data.WebElements.BoxDelivery_WebElements;
import site.framework.ApplicationManager.BasisMetods;

/**
 * Created by Lena on 10.11.2019.
 */
public class BoxDelivery_Metods extends BasisMetods {
    public BoxDelivery_Metods(WebDriver wd) {
        super(wd);
    }

    public void clickOnAddVehicles_button_InVehiclesGrid(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(BoxDelivery_WebElements.AddVehicles_button_VehiclesGrid);
    }
    public void selectVehicleFromDropdownInPopup(){
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(BoxDelivery_WebElements.VehiclesDropdownField);
        click(BoxDelivery_WebElements.VehicleElementInStaffDropdown);

    }

    public void clickOnAddButtonOnAddVehiclePopup(){
        click(BoxDelivery_WebElements.AddButtonOnAddVehiclePopUp);
    }

    public void selectVehicleInVehiclesGrid() {

        click(BoxDelivery_WebElements.VehicleElementInVehicleGrid);
    }

    public void clickOnVehicleTime_button() {
        click(BoxDelivery_WebElements.VehicleTimeButtonOnVehiclesGrid);
    }

    public void clickOnVehicleImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(BoxDelivery_WebElements.VehicleImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }



    public void addRresource_Vehicles() {

        click(BoxDelivery_WebElements.AddVehicles_button_VehiclesGrid);
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(BoxDelivery_WebElements.VehiclesDropdownField);
        click(BoxDelivery_WebElements.VehicleElementInStaffDropdown);
        click(BoxDelivery_WebElements.AddButtonOnAddVehiclePopUp);
        click(BoxDelivery_WebElements.VehicleElementInVehicleGrid); //div[@id='vehiclesGrid']//*[@class='k-selectable']
        click(BoxDelivery_WebElements.VehicleTimeButtonOnVehiclesGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(BoxDelivery_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(BoxDelivery_WebElements.CloseButtonOnTimesSheetWindow);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(BoxDelivery_WebElements.VehicleImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }





    public void clickOnAddStaff_button() {
        try {
            Thread.sleep((long) 1000.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(BoxDelivery_WebElements.AddStaff_button_StaffGrid);
    }

    public void selectStaffFromDropdownInPopup() {
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(BoxDelivery_WebElements.StaffDropdownField);
        click(BoxDelivery_WebElements.StaffElementInStaffDropdown);
    }

    public void clickOnAddButtonOnAddStaffPopup() {
        click(BoxDelivery_WebElements.AddButtonOnAddStaffPopUp);
    }

    public void selectStaffInStaffGrid() {
        click(BoxDelivery_WebElements.StaffElementInStaffGrid);
    }

    public void clickOnStaffTime_button() {
        click(BoxDelivery_WebElements.StaffTimeButtonOnStaffGrid);
    }

    public void clickOnAddTimeSheetButtonInTimesSheetWindow() {
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(BoxDelivery_WebElements.AddTimeSheetButtonInTimesSheetWindow);
    }

    public void clickCloseButtonOnTimesSheetWindow() {
        click(BoxDelivery_WebElements.CloseButtonOnTimesSheetWindow);
    }

    public void clickOnStaffImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(BoxDelivery_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }


    public void addRresource_Staff() {

        click(BoxDelivery_WebElements.AddStaff_button_StaffGrid);
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(BoxDelivery_WebElements.StaffDropdownField);
        click(BoxDelivery_WebElements.StaffElementInStaffDropdown);
        click(BoxDelivery_WebElements.AddButtonOnAddStaffPopUp);
        click(BoxDelivery_WebElements.StaffElementInStaffGrid);
        click(BoxDelivery_WebElements.StaffTimeButtonOnStaffGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(BoxDelivery_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(BoxDelivery_WebElements.CloseButtonOnTimesSheetWindow);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(BoxDelivery_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }

    public void addRresource_Equipment() {
        // app.getUserMenu_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //   app.getUserMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));

        waitForElementByVisibility(BoxDelivery_WebElements.AddEquipment_button_InEquipmentGrid);
        click(BoxDelivery_WebElements.AddEquipment_button_InEquipmentGrid);

        // app.getJobMenu_Metods().click(By.xpath("//button[@id='equipmentAdd']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(BoxDelivery_WebElements.EquipmentDropdownField);
        click(BoxDelivery_WebElements.EquipmentElementInStaffDropdown);
        click(BoxDelivery_WebElements.AddButtonOnAddEquipmentPopUp);

        click(BoxDelivery_WebElements.EquipmentElementInEquipmentsGrid); //div[@id='vehiclesGrid']//*[@class='k-selectable']
        click(BoxDelivery_WebElements.EquipmentTimeButtonOnEquipmentsGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(BoxDelivery_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(By.xpath("//a[@class='btn btn_sm btn__cancel k-button timesheetClose']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(BoxDelivery_WebElements.EquipmentImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }

    public void clickOnAddEquipment_button_InEquipmentGrid(){
        waitForElementByVisibility(BoxDelivery_WebElements.AddEquipment_button_InEquipmentGrid);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(BoxDelivery_WebElements.AddEquipment_button_InEquipmentGrid);
    }
    public void selectEquipmentFromDropdownInPopup(){
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(BoxDelivery_WebElements.EquipmentDropdownField);
        click(BoxDelivery_WebElements.EquipmentElementInStaffDropdown);

    }

    public void clickOnAddButtonOnAddEquipmentPopup() {
        click(BoxDelivery_WebElements.AddButtonOnAddEquipmentPopUp);
    }

    public void selectEquipmentInEquipmentsGrid() {
        click(BoxDelivery_WebElements.EquipmentElementInEquipmentsGrid);
    }

    public void clickOnEquipmentTime_button() {
        click(BoxDelivery_WebElements.EquipmentTimeButtonOnEquipmentsGrid);
    }

    public void clickOnEquipmentImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(BoxDelivery_WebElements.EquipmentImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }
}
