package site.Data.WebElements;

import org.openqa.selenium.By;

/**
 * Created by user on 20.05.2018.
 */
public interface JobSummary_WebElements {
    By Mode_dropdown_button = By.xpath("//*[@aria-owns= 'mode_listbox']");
    By Mode_dropdown_List = By.xpath("//ul[@id='mode_listbox']//*");//ul[@id='mode_listbox']/li
    By ServiceType_dropdown_button = By.xpath("//*[@aria-owns= 'type_listbox']"); //*[@id='mode-list']//li
    By ServiceType_dropdown_List = By.xpath("//ul[@id='type_listbox']//*"); //ul[@id='type_listbox']/li
    By ServiceLevel_dropdown_button = By.xpath("//*[@aria-owns= 'service_listbox']");
    By ServiceLevel_dropdown_List = By.xpath("//ul[@id='service_listbox']//*"); //ul[@id='service_listbox']/li
    By Popup_wrapper = By.xpath("//*[@class='popup-wrapper properties-wrapper']");//a cover on all elements( impossible to use web elements if the style equals display)
//span[contains(text(),'Client')]//

    By Mode_field = By.xpath("//*[@aria-owns='mode_listbox']//*[@class='k-input']"); //working    //*[@aria-owns='mode_listbox']//*[@class='k-input']
    By ServiceType_field = By.xpath("//*[@id='type']//..//*[@class='k-input']");
    By ServiceLevel_field = By.xpath("//*[@id='service']//..//*[@class='k-input']");
    By JobType_field = By.xpath("//*[@id='jobType']//..//*[@class='k-input']");
    By Status_field = By.xpath("//*[@id='status']//..//*[@class='k-input']");
    By CurrentDivision_field = By.xpath("//*[@id='curDivision']//..//*[@class='k-input']");
    By NextDivision_field = By.xpath("//*[@id='nextDivision']//..//*[@class='k-input']");
    By Handler_field = By.xpath("//*[@id='handler']//..//*[@class='k-input']");
    By BillTo_field = By.xpath("//*[@id='jobBillTo']//..//*[@class='k-input']");
    By JobRef_field = By.xpath("//*[@id='jobSelect']//..//*[@class='k-input']");////*[@id="clientFile"]//..//*[@class='k-input']


    //From section
    //ul[@id='from-placeTo_listbox']//*[@class='k-item']
    //ul[@id='from-placeTo_listbox']//*[@class='k-item k-state-focused k-state-selected']
    //ul[@id='from-placeTo_listbox']//*[@role='option']
    By Address_Field_FromSection = By.xpath("//*[@id='from-placeTo']//..//*[@class='k-input']");
    By AddressEdit_button_FromSection = By.xpath("//a[@id='from-placeToMore']");
    By AddressCreateNew_button_FromSection = By.xpath("//a[@id='newPlacefrom']");
    //*[@aria-owns="from-newPlaceCountry_listbox"]//*[@class="k-icon k-i-arrow-60-down"]
    //   By Address= //div[@id='newPlacefromPopup']    //*[@class='k-widget k-dropdown k-header dropdown dropdown_lg js-country']//*[@class='k-dropdown-wrap k-state-default drop-invalid']//*[@class='k-input']
    By AddressCreateNew_CountryDropdownButton_FromSection = By.xpath("//span[@class='k-widget k-dropdown k-header dropdown dropdown_lg js-country']//span[@class='k-dropdown-wrap k-state-default drop-invalid']//span[@class='k-icon k-i-arrow-60-down']");
    By AddressCreateNew_CountryDropdownList_FromSection = By.xpath("//*[@id=\"from-newPlaceCountry\" ]");



    By Shipper_Field_FromSection = By.xpath("//*[@id='from-detailName']//..//*[@class='k-input']");
    By ShipperContactInfo_button_FromSection = By.xpath("//button[@id='from-contactInfo']");//*[@id="from-contactInfo"]//a[@id='from-placeToMore']
    By ShipperStatus_DetailsSection = By.xpath("//span[@id='from-resStatus']");
    By ShipperEmail_DetailsSection = By.xpath("//span[@id='from-email']");
    By ShipperMobilePhone_DetailsSection = By.xpath("//span[@id='from-mobilePhone']");
    By ShipperHomePhone_DetailsSection = By.xpath("//span[@id='from-homePhone']");
    By ShipperWorkPhone_DetailsSection = By.xpath("//span[@id='from-workPhone']");

    //To section
    By Address_Field_ToSection = By.xpath("//*[@id='to-placeTo']//..//*[@class='k-input']");
    By AddressEdit_button_ToSection = By.xpath("//a[@id='to-placeToMore']");
    By AddressCreateNew_button_ToSection = By.xpath("//a[@id='newPlaceto']");
    By Consignee_Field_ToSection = By.xpath("//*[@id='to-detailName']//..//*[@class='k-input']");
    By ConsigneeContactInfo_button_ToSection = By.xpath("//button[@id='to-contactInfo']");//a[@id='from-placeToMore']
    By ConsigneeStatus_DetailsSection = By.xpath("//span[@id='to-resStatus']");
    By ConsigneeEmail_DetailsSection = By.xpath("//span[@id='to-email']");
    By ConsigneeMobilePhone_DetailsSection = By.xpath("//span[@id='to-mobilePhone']");
    By ConsigneeHomePhone_DetailsSection = By.xpath("//span[@id='to-homePhone']");
    By ConsigneeWorkPhone_DetailsSection = By.xpath("//span[@id='to-workPhone']");


   /* //Booking Section
    By BookingType_Field = By.xpath("/*//*[@id='bookingType']//../*//*[@class='k-input']");
    By BookingType_dropdown_button = By.xpath("/*//*[@aria-owns= 'bookingType_listbox']");
    By BookingType_dropdown_List = By.xpath("//ul[@id='bookingType_listbox']/li");

    By Booker_Field = By.xpath("//ul[@id='booker_listbox']//li[@aria-selected='true']");

    By BookerEdit_button = By.xpath("//button[@id='bookerMore']");
    By BookerCreateNew_button = By.xpath("//button[@id='bookerPlus']");

    By BookerContact_Field = By.xpath("/*//*[@id='bookedContact']//../*//*[@class='k-input']");
    By BookerContactInfo_button = By.xpath("//button[@id='bookedContactInfo']");

    By BookedSource_Field = By.xpath("/*//*[@id='bookedSource']//../*//*[@class='k-input']");

    By BookerAccount_Field = By.xpath("//ul[@id='bookedAccount_listbox']//li[@aria-selected='true']");
    By BookerAccountEdit_button = By.xpath("//button[@id='bookedAccountMore']");
    By BookerAccountCreateNew_button = By.xpath("//button[@id='bookedAccountPlus']");

    By BookerAccountContact_Field = By.xpath("/*//*[@id='bookedAccountContact']//../*//*[@class='k-input']");
    By BookerAccountContactInfo_button = By.xpath("//button[@id='bookedAccountContactInfo']");*/






}
