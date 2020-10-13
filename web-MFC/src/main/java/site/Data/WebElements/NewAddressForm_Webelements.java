package site.Data.WebElements;

import org.openqa.selenium.By;

/**
 * Created by user on 19.11.2018.
 */
public interface NewAddressForm_Webelements {

    By CountrylistboxButton_From = By.xpath("//*[@aria-owns=\"from-newPlaceCountry_listbox\"]//*[@class=\"k-icon k-i-arrow-60-down\"]");
    By KeyboardDriven_Countrylistbox_From = By.xpath("//input[@class=\"k-textbox\"][@aria-owns=\"from-newPlaceCountry_listbox\" ]");
    By city_From = By.xpath("//input[@id='from-newPlaceCity']");
    By street1_From= By.xpath("//*[@id=\"from-newPlaceStreet1\"]");
    By zip_From = By.xpath("//*[@ id=\"from-newPlaceZIP\" ]");
    By footerAddressForm_From= By.xpath("//*[@id=\"createAddressFormfrom\"]//*[@class=\"footer__wrapper\"]");
    //By createButton_From = By.xpath("//button[@id='from-newPlaceSubmit']");//class="btn btn_md btn__submit k-button"
    By createButton_From = By.xpath("//button[@class='btn btn_md btn__submit k-button' and @id='from-newPlaceSubmit']");
    By CountrylistboxButton_To= By.xpath("//*[@aria-owns=\"to-newPlaceCountry_listbox\"]//*[@class=\"k-icon k-i-arrow-60-down\"]");
    By KeyboardDriven_Countrylistbox_To= By.xpath("//input[@class=\"k-textbox\"][@aria-owns=\"to-newPlaceCountry_listbox\" ]");
    By city_To= By.xpath("//input[@id='to-newPlaceCity']");
    By street1_To = By.xpath("//*[@id=\"to-newPlaceStreet1\"]");
    By zip_To = By.xpath("//*[@ id=\"to-newPlaceZIP\" ]");
    // By footerAddressForm_To = By.xpath("//*[@id=\"createAddressFormto\"]//*[@class=\"footer__wrapper\"]"); //div[@id='createAddressFormfrom']//div[@class='new-place__footer']
    By footerAddressForm_To = By.xpath("//div[@id='createAddressFormfrom']//div[@class='new-place__footer']");
    By createButton_To = By.xpath("//button[@id='to-newPlaceSubmit']");
}

