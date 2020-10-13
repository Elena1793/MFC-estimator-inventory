package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.Data.WebElements.Booking_Webelements;
import site.framework.ApplicationManager.BasisMetods;

/**
 * Created by user on 23.05.2019.
 */
public class BookingSection_Metods extends BasisMetods {

    public BookingSection_Metods(WebDriver wd){
        super(wd);
    }

    public void FillBookingSection(){

    }

    public void ClickOn_Source_dropdown(){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        click(Booking_Webelements.BookedSource_button);

    }

    public void Select_Source(String source){
        waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-image']"));
        ClickOn_Source_dropdown();
        waitForElementByNOTvisibility(By.id("page-preloader"));
        //dropdownSelectElement_withoutCheckingClickableElement(source, Booking_Webelements.Source_dropdown_List);//By.xpath("//ul[@id='source_listbox']//li"));
        dropdownSelectElement(source, Booking_Webelements.Source_dropdown_List);
    }

    public void ClickOn_BookigType_dropdwon(){

        waitForElementByNOTvisibility(By.id("page-preloader"));
        click(Booking_Webelements.BookingType_dropdown_button);//By.xpath("/[@aria-owns=\"bookingType_listbox\"]")
    }



    public void Select_BookingType (String bookingType){
        //waitForElementByLeavingDOM(By.cssSelector(".k-loading-image"));
        waitForElementByNOTvisibility(By.id("page-preloader"));
        ClickOn_BookigType_dropdwon();

        dropdownSelectElement1(bookingType,Booking_Webelements.BookingType_dropdown_List);
       // waitForElementByLeavingDOM(By.id("spinner-js-booking"));
        /*(new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-booking"))));*/
    }

    public void ClickOn_Booker(){
        waitForElementByLeavingDOM(By.id("spinner-js-booking"));
        click(By.xpath("//*[@id='booker']"));
    }

    public void TypeIn_BookerField(String booker){
        type(By.xpath("//*[@id='booker']"),booker);
    }
    private void selectBooker (String booker){
        ClickOn_Booker();
        TypeIn_BookerField(booker);
        dropdownSelectElement_withoutCheckingClickableElement(booker, By.xpath("//ul[@id='booker_listbox']//li"));
    }

    public void ClickOn_Account(){
        waitForElementByLeavingDOM(By.id("spinner-js-booking"));
        click(By.id("account"));
    }
    public void TypeIn_Account(String account){
        type(By.id("account"),account );
    }


    private void selectAccount(String account){
        /*(new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-booking"))));*/

        ClickOn_Account();
        TypeIn_Account(account);
        dropdownSelectElement_withoutCheckingClickableElement(account, By.xpath("//ul[@id='account_listbox']//li"));
    }

}

