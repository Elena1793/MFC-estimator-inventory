package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.Data.WebElements.WarehouseOutload_WebElements;
import site.Data.WebElements.WarehouseReceiveIn_WebElements;
import site.framework.ApplicationManager.BasisMetods;

/**
 * Created by Lena on 10.11.2019.
 */
public class WarehouseOutload_Metods extends BasisMetods {

    public WarehouseOutload_Metods(WebDriver wd) {
        super(wd);
    }
    public void clickOnAddStaff_button() {
        click(WarehouseOutload_WebElements.AddStaff_button_StaffGrid);
    }

    public void selectStaffFromDropdownInPopup() {
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(WarehouseOutload_WebElements.StaffDropdownField);
        click(WarehouseOutload_WebElements.StaffElementInStaffDropdown);
    }

    public void clickOnAddButtonOnAddStaffPopup() {
        click(WarehouseOutload_WebElements.AddButtonOnAddStaffPopUp);
    }

    public void selectStaffInStaffGrid() {
        click(WarehouseOutload_WebElements.StaffElementInStaffGrid);
    }

    public void clickOnStaffTime_button() {
        click(WarehouseOutload_WebElements.StaffTimeButtonOnStaffGrid);
    }

    public void clickOnAddTimeSheetButtonInTimesSheetWindow() {
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(WarehouseOutload_WebElements.AddTimeSheetButtonInTimesSheetWindow);
    }

    public void clickCloseButtonOnTimesSheetWindow() {
        click(WarehouseOutload_WebElements.CloseButtonOnTimesSheetWindow);
    }

    public void clickOnStaffImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(WarehouseOutload_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }


    public void addRresource_Staff() {

        click(WarehouseOutload_WebElements.AddStaff_button_StaffGrid);
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(WarehouseOutload_WebElements.StaffDropdownField);
        click(WarehouseOutload_WebElements.StaffElementInStaffDropdown);
        click(WarehouseOutload_WebElements.AddButtonOnAddStaffPopUp);
        click(WarehouseOutload_WebElements.StaffElementInStaffGrid);
        click(WarehouseOutload_WebElements.StaffTimeButtonOnStaffGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(WarehouseOutload_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(WarehouseOutload_WebElements.CloseButtonOnTimesSheetWindow);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(WarehouseOutload_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }

}
