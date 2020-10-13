package site.Data.WebElements;

import org.openqa.selenium.By;

/**
 * Created by user on 29.07.2018.
 */
public interface QuotationDetails_WebElements {
    By ClientFile_Field =By.xpath("//*[@id='clientFile']//..//*[@class='k-input']");
    By ClientFile_dropdown_button =By.xpath("//*[@id='clientFile']//..//*[@class='k-icon k-i-arrow-60-down']");
    By ClientFile_dropdown_list = By.xpath("//ul[@id='clientFile_listbox']/li");



}
