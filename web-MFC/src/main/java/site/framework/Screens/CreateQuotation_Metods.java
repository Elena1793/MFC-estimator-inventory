package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import site.Data.Resources.BookingType;
import site.Data.Resources.GlobalResources.ScreensURL;
import site.Data.WebElements.*;
import site.framework.ApplicationManager.BasisMetods;

/**
 * Created by user on 15.07.2018.
 */
public class CreateQuotation_Metods extends BasisMetods {

    public CreateQuotation_Metods(WebDriver wd) {

        super(wd);
    }

    public void CreateQuotationSA_BookingType_Private(String bookingType, String source, String client, String JobRef){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        OpenPage(MainMenu_WebElements.Quotations_button, ScreensURL.Quotation_Grid);
        click(QuotationGrid_WebElements.CreateQuotation_button);
        waitForElementByNOTvisibility(By.id("page-preloader"));
        isPageOpened("Quotation");
      //  selectBookingType(bookingType);
        click(Booking_Webelements.BookingType_dropdown_button);//By.xpath("/[@aria-owns=\"bookingType_listbox\"]")
        dropdownSelectElement(bookingType,Booking_Webelements.BookingType_dropdown_List);

        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-booking"))));

        if (bookingType==BookingType.Private){
            click(Booking_Webelements.BookedSource_button);
            waitForElementByNOTvisibility(By.id("page-preloader"));
            dropdownSelectElement_withoutCheckingClickableElement(source, By.xpath("//ul[@id='source_listbox']//li"));

            (new WebDriverWait(wd, 300))
                    .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-header"))));

            click(By.xpath("//*[@id='client']"));
            type(By.xpath("//*[@id='client']"),client);
            dropdownSelectElement(client,By.xpath("//ul[@id='client_listbox']/li"));

            waitForElementByNOTvisibility(By.id("clientErrorWrapper"));
            click(By.xpath("//*[@aria-owns='clientFile_listbox']"));
            type(By.xpath("//*[@class='k-animation-container']//*[@class='k-textbox']"),JobRef);
            dropdownSelectElement_withoutCheckingClickableElement(JobRef, QuotationDetails_WebElements.ClientFile_dropdown_list);

           // click(By.xpath("//ul[@id='jobs_taglist']//*[@class='k-icon k-i-close']"));
        }
        if (bookingType== BookingType.Agent || bookingType==BookingType.Move_management){
            click(By.xpath("//*[@id='booker']"));
            type(By.xpath("//*[@id='booker']"),"Moscow");
            dropdownSelectElement_withoutCheckingClickableElement("Moscow", By.xpath("//ul[@id='booker_listbox']//li"));
            (new WebDriverWait(wd, 300))
                    .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-header"))));

            click(By.xpath("//*[@id='client']"));
            type(By.xpath("//*[@id='client']"),client);
            dropdownSelectElement(client,By.xpath("//ul[@id='client_listbox']/li"));
        }
        if (bookingType == BookingType.Corporate || bookingType==BookingType.Corporate_competitive || bookingType==BookingType.Commercial){
            click(By.id("account"));
            type(By.id("account"),"ES_Account1" );
            dropdownSelectElement_withoutCheckingClickableElement("ES_Account1", By.xpath("//ul[@id='account_listbox']//li"));

            click(Booking_Webelements.BookedSource_button);
            waitForElementByNOTvisibility(By.id("page-preloader"));
            dropdownSelectElement_withoutCheckingClickableElement(source, By.xpath("//ul[@id='source_listbox']//li"));

        }

    }
   /* private void selectBookingType(String bookingType){
        click(Booking_Webelements.BookingType_dropdown_button);//By.xpath("/*//*[@aria-owns=\"bookingType_listbox\"]")
        dropdownSelectElement(bookingType,Booking_Webelements.BookingType_dropdown_List);

    }

    private void selectSource (String source){
        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-booking"))));

        click(Booking_Webelements.BookedSource_button);
        waitForElementByNOTvisibility(By.id("page-preloader"));
        dropdownSelectElement_withoutCheckingClickableElement(source, By.xpath("//ul[@id='source_listbox']//li"));
    }

    private void selectBooker (){
        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-booking"))));
        click(By.xpath("/*//*[@id='booker']"));
        type(By.xpath("/*//*[@id='booker']"),ExistedData.booker);
        dropdownSelectElement_withoutCheckingClickableElement(ExistedData.booker, By.xpath("//ul[@id='booker_listbox']//li"));
    }

    private void selectAccount(){
        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-booking"))));
        click(By.id("account"));
        type(By.id("account"),ExistedData.account );
        dropdownSelectElement_withoutCheckingClickableElement(ExistedData.account, By.xpath("//ul[@id='account_listbox']//li"));
    }

    private void selectClient(String client){
        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-header"))));

        click(By.xpath("/*//*[@id='client']"));
        type(By.xpath("/*//*[@id='client']"),client);
        dropdownSelectElement(client,By.xpath("//ul[@id='client_listbox']/li"));

    }

    private void selectJobRef(String JobRef){
        waitForElementByNOTvisibility(By.id("clientErrorWrapper"));
        click(By.xpath("/*//*[@aria-owns='clientFile_listbox']"));
        type(By.xpath("/*//*[@class='k-animation-container']/*//*[@class='k-textbox']"),JobRef);
        dropdownSelectElement_withoutCheckingClickableElement(JobRef, QuotationDetails_WebElements.ClientFile_dropdown_list);

    }

    private void fillBookingForm(String bookingType, String source){
        selectBookingType(bookingType);
        if (bookingType==BookingType.Private){
            selectSource(source);
        }
        if (bookingType== BookingType.Agent || bookingType==BookingType.Move_management){
            selectBooker();
        }
        if (bookingType == BookingType.Corporate || bookingType==BookingType.Corporate_competitive || bookingType==BookingType.Commercial){
            selectAccount();
            selectSource(source);
        }
    }
*/
}
