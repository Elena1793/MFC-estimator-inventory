package site.Data.WebElements;

import org.openqa.selenium.By;

/**
 * Created by Lena on 10.11.2019.
 */
public interface WarehouseReceiveIn_WebElements {

    By AddStaff_button_StaffGrid =By.xpath("//button[@id='staffAdd']");
    By StaffDropdownField = By.xpath("//div[@class='popup__content']//div[@class='form__group']//div[@class='k-multiselect-wrap k-floatwrap']");
    By StaffElementInStaffDropdown= By.xpath("//ul[@id='resources_listbox']/li[@data-offset-index='0']");


    By AddButtonOnAddStaffPopUp = By.xpath("//button[@id='addResource']");
    By StaffElementInStaffGrid=By.xpath("//div[@id='staffGrid']//div[@class='k-grid-content']//tr");
    By StaffTimeButtonOnStaffGrid = By.xpath("//button[@id='staffTime']");
    By AddTimeSheetButtonInTimesSheetWindow =By.xpath("//button[@id='timeSheetsAdd']");
    By CloseButtonOnTimesSheetWindow=By.xpath("//a[@class='btn btn_sm btn__cancel k-button timesheetClose']");
    By StaffImportToExpenseButton= By.xpath("//button[@id='staffImportToExpense']");
    By AddLoadUnite_Button=By.xpath("//button[@id='loadingUnitsAdd']");
    By LoadingUnitType_dropdown=By.xpath("//div[@class='main']//td[4]");
    By ElementInLoadingUnitType_dropdown=By.xpath("//ul[@id='LoadingUnitType_listbox']/li[@data-offset-index='0']");
    By NetVolumeField_InLoadUnitsGrid=By.xpath("//td[@data-container-for='NetVolume']");
    By GrossVolumeField_InLoadUnitsGrid=By.xpath("//td[@data-container-for='GrossVolume']");
    By NetWeightField_InLoadUnitsGrid=By.xpath("//td[@data-container-for='NetWeight']");
    By GrossWeightField_InLoadUnitsGrid=By.xpath("//td[@data-container-for='GrossWeight']");
    By LocationDropdown_InLoadUnitsGrid=By.xpath("//*[@data-container-for='LocationId']");
    By ElementInLocationDropdown_InLoadUnitsGrid=By.xpath("//ul[@id='LocationId_listbox']/li[@data-offset-index='1']");
    By SaveButton_InLoadUnitsGrid=By.xpath("//button[@id='loadingUnitsTick']");
}
