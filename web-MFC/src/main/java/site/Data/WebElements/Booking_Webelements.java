package site.Data.WebElements;

import org.openqa.selenium.By;

/**
 * Created by user on 29.05.2018.
 */
public interface Booking_Webelements {
    //Booking Section
    By BookingType_Field = By.xpath("//*[@id='bookingType']//..//*[@class='k-input']");
    By BookingType_dropdown_button = By.xpath("//*[@id='bookingType']//..//*[@class='k-select']");//("//*[@aria-owns= 'bookingType_listbox']");
    By BookingType_dropdown_List = By.xpath("//ul[@id='bookingType_listbox']/li");

    By Booker_Field = By.xpath("//ul[@id='booker_listbox']//li[@aria-selected='true']");

    By BookerEdit_button = By.xpath("//button[@id='bookerMore']");
    By BookerCreateNew_button = By.xpath("//button[@id='bookerPlus']");

    By BookerContact_Field = By.xpath("//*[@id='bookedContact']//..//*[@class='k-input']");
    By BookerContactInfo_button = By.xpath("//button[@id='bookedContactInfo']");

    By BookedSource_Field = By.xpath("//*[@id='bookedSource']//..//*[@class='k-input']");
    By BookedSource_button = By.xpath("//*[@id='source']//..//*[@class='k-select']"); //*[@aria-owns='source_listbox']
    By Source_dropdown_List = By.xpath("//ul[@id='source_listbox']/li");

    By BookerAccount_Field = By.xpath("//ul[@id='bookedAccount_listbox']//li[@aria-selected='true']");
    By BookerAccountEdit_button = By.xpath("//button[@id='bookedAccountMore']");
    By BookerAccountCreateNew_button = By.xpath("//button[@id='bookedAccountPlus']");

    By BookerAccountContact_Field = By.xpath("//*[@id='bookedAccountContact']//..//*[@class='k-input']");
    By BookerAccountContactInfo_button = By.xpath("//button[@id='bookedAccountContactInfo']");
}
