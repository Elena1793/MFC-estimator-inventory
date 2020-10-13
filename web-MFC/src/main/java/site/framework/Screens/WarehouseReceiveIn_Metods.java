package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.Data.Resources.Units;
import site.Data.WebElements.WarehouseReceiveIn_WebElements;
import site.framework.ApplicationManager.BasisMetods;
/*import site.tests.WarehouseReceiveIn;*/

/**
 * Created by Lena on 10.11.2019.
 */
public class WarehouseReceiveIn_Metods  extends BasisMetods {

    public WarehouseReceiveIn_Metods(WebDriver wd) {
        super(wd);
    }

    public void AddLoadUniteButton(){
        allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(WarehouseReceiveIn_WebElements.AddLoadUnite_Button);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void selectLoadUniteInLoadingUnitType_dropdown(String unit){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//span[@aria-owns='LoadingUnitType_listbox']"));
        dropdownSelectElement( unit,By.xpath("//ul[@id='LoadingUnitType_listbox']/li"));
    }
    public void selectLoadUniteInLoadingUnitType_dropdown(){
        waitForElementByNOTvisibility(WarehouseReceiveIn_WebElements.AddLoadUnite_Button);
        click(WarehouseReceiveIn_WebElements.LoadingUnitType_dropdown);
        click(WarehouseReceiveIn_WebElements.ElementInLoadingUnitType_dropdown);
    }
public void setNetVolumeInLoadUnitsGrid(String NetVolume){
    click(WarehouseReceiveIn_WebElements.NetVolumeField_InLoadUnitsGrid);
    type(WarehouseReceiveIn_WebElements.NetVolumeField_InLoadUnitsGrid,NetVolume);
}

public void setGrossVolumeInLoadUnitsGrid(String GrossVolume){
    click(WarehouseReceiveIn_WebElements.GrossVolumeField_InLoadUnitsGrid);
    type(WarehouseReceiveIn_WebElements.GrossVolumeField_InLoadUnitsGrid,GrossVolume);
}
public void setNetWeightInLoadUnitsGrid(String NetWeight){
    click(WarehouseReceiveIn_WebElements.NetWeightField_InLoadUnitsGrid);
    type(WarehouseReceiveIn_WebElements.NetWeightField_InLoadUnitsGrid,NetWeight);
}

public void setGrossWeightInLoadUnitsGrid(String GrossWeight){
    click(WarehouseReceiveIn_WebElements.GrossWeightField_InLoadUnitsGrid);
    type(WarehouseReceiveIn_WebElements.GrossWeightField_InLoadUnitsGrid,GrossWeight);
}
public void setLocationInLoadUnitsGrid(){
    click(WarehouseReceiveIn_WebElements.LocationDropdown_InLoadUnitsGrid);
    click(WarehouseReceiveIn_WebElements.ElementInLocationDropdown_InLoadUnitsGrid);
}

public void clickOnSaveButtonInLoadUnitsGrid(){
    click(WarehouseReceiveIn_WebElements.SaveButton_InLoadUnitsGrid);
}


    public void addLoadUnit(){
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(By.xpath("//button[@id='loadingUnitsAdd']"));
        waitForElementByNOTvisibility(By.xpath("//button[@id='loadingUnitsAdd']"));
        click(By.xpath("//div[@class='main']//td[4]"));
        click(By.xpath("//ul[@id='LoadingUnitType_listbox']/li[@data-offset-index='0']"));
        click(By.xpath("//td[@data-container-for='NetVolume']"));
        type(By.xpath("//td[@data-container-for='NetVolume']"),"100");
        click(By.xpath("//td[@data-container-for='GrossVolume']"));
        type(By.xpath("//td[@data-container-for='GrossVolume']"),"200");
        click(By.xpath("//td[@data-container-for='NetWeight']"));
        type(By.xpath("//td[@data-container-for='NetWeight']"),"300");
        click(By.xpath("//td[@data-container-for='GrossWeight']"));
        type(By.xpath("//td[@data-container-for='GrossWeight']"),"400");
        click(By.xpath("//*[@data-container-for='LocationId']"));
        click(By.xpath("//ul[@id='LocationId_listbox']/li[@data-offset-index='1']"));
        click(By.xpath("//button[@id='loadingUnitsTick']"));




    }




    public void clickOnAddStaff_button() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(WarehouseReceiveIn_WebElements.AddStaff_button_StaffGrid);
    }

    public void selectStaffFromDropdownInPopup() {
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(WarehouseReceiveIn_WebElements.StaffDropdownField);
        click(WarehouseReceiveIn_WebElements.StaffElementInStaffDropdown);
    }

    public void clickOnAddButtonOnAddStaffPopup() {
        click(WarehouseReceiveIn_WebElements.AddButtonOnAddStaffPopUp);
    }

    public void selectStaffInStaffGrid() {
        click(WarehouseReceiveIn_WebElements.StaffElementInStaffGrid);
    }

    public void clickOnStaffTime_button() {
        click(WarehouseReceiveIn_WebElements.StaffTimeButtonOnStaffGrid);
    }

    public void clickOnAddTimeSheetButtonInTimesSheetWindow() {
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(WarehouseReceiveIn_WebElements.AddTimeSheetButtonInTimesSheetWindow);
    }

    public void clickCloseButtonOnTimesSheetWindow() {
        click(WarehouseReceiveIn_WebElements.CloseButtonOnTimesSheetWindow);
    }

    public void clickOnStaffImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(WarehouseReceiveIn_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }


    public void addRresource_Staff() {

        click(WarehouseReceiveIn_WebElements.AddStaff_button_StaffGrid);
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(WarehouseReceiveIn_WebElements.StaffDropdownField);
        click(WarehouseReceiveIn_WebElements.StaffElementInStaffDropdown);
        click(WarehouseReceiveIn_WebElements.AddButtonOnAddStaffPopUp);
        click(WarehouseReceiveIn_WebElements.StaffElementInStaffGrid);
        click(WarehouseReceiveIn_WebElements.StaffTimeButtonOnStaffGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(WarehouseReceiveIn_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(WarehouseReceiveIn_WebElements.CloseButtonOnTimesSheetWindow);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(WarehouseReceiveIn_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }
}





