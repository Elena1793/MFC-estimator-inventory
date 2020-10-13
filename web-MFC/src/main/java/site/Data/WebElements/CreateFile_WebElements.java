package site.Data.WebElements;

import org.openqa.selenium.By;

/**
 * Created by user on 20.05.2018.
 */
public interface CreateFile_WebElements {
    By Private_button = By.xpath("//*[@data-booking-type='Enum.BookingType.Private']//a[@class='k-link']");//By.linkText("Private");
    By Source_dropdown_button = By.xpath("//*[@aria-controls='prSource_listbox']");
    By Source_dropdown_List = By.xpath("//ul[@id='prSource_listbox']/li");
    By JobType_dropdown = By.xpath("//*[@aria-owns='prJobType_listbox']");
    By JobType_dropdown_List = By.xpath("//ul[@id='prJobType_listbox']/li");
    By FirstName_field = By.xpath("//*[@id='pr-firstName']");

    By LastName_field = By.xpath("//*[@id='pr-lastName']");
    By Email = By.xpath("//*[@id='pr-email']");
    By Phone = By.xpath("//*[@id='pr-phone']");
    By Create_button = By.xpath("//*[@id='submitCreate']");

}
