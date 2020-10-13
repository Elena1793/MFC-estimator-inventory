package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.Data.WebElements.NewAddressForm_Webelements;
import site.Data.WebElements.JobSummary_WebElements;
import site.framework.ApplicationManager.BasisMetods;

/**
 * Created by user on 04.11.2018.
 */
public class NewAddressForm_Metods extends BasisMetods {
    private String sectionFrom = "From";
    private String sectionTo = "To";

    public NewAddressForm_Metods(WebDriver wd){
        super(wd);
    }

    public void createNewAddtess(String section, String country, String city, String street1, String zip){

        if (section.equalsIgnoreCase(sectionFrom)){
            click(JobSummary_WebElements.AddressCreateNew_button_FromSection);
            newOriginAddress_setCountry(country);
            newOriginAddress_setCity(city);
            newOriginAddress_setZip(zip);
            newOriginAddress_setStreet1(street1);
            newOriginAddress_CreateButton();
        }
        if (section.equalsIgnoreCase(sectionTo)){
            click(JobSummary_WebElements.AddressCreateNew_button_ToSection);
            newDestinationAddress_setCountry(country);
            newDestinationAddress_setCity(city);
            newDestinationAddress_setZip(zip);
            newDestinationAddress_setStreet1(street1);
            newDestinationAddress_CreateButton();

        }

    }

    public void clickAddNewAddressButton_FromSection() {
        waitForElementByNOTvisibility(By.id("page-preloader"));
        click(JobSummary_WebElements.AddressCreateNew_button_FromSection);
    }
    public void clickAddNewAddressButton_ToSection() {
        waitForElementByNOTvisibility(By.id("page-preloader"));
        click(JobSummary_WebElements.AddressCreateNew_button_ToSection);
    }

    public void newOriginAddress_setCountry (String country){

        click(NewAddressForm_Webelements.CountrylistboxButton_From);
        type(NewAddressForm_Webelements.KeyboardDriven_Countrylistbox_From,country);
        click(By.xpath("//*[@class='k-item k-state-focused'][contains( text(), "+country+")]"));

    }

    public void newOriginAddress_setCity (String city){
        type(NewAddressForm_Webelements.city_From,city);

    }

    public void newOriginAddress_setStreet1 (String street1){
        type(NewAddressForm_Webelements.street1_From,street1);

    }

    public void newOriginAddress_setZip (String zip){
        type(NewAddressForm_Webelements.zip_From,zip);

    }

    public void newOriginAddress_CreateButton (){
        click(By.cssSelector("#from-newPlaceStreet2"));
       // click(NewAddressForm_Webelements.footerAddressForm_From);
        click(NewAddressForm_Webelements.createButton_From);
    }

    public void newDestinationAddress_setCountry (String country){
        click(NewAddressForm_Webelements.CountrylistboxButton_To);
        type(NewAddressForm_Webelements.KeyboardDriven_Countrylistbox_To,country);
        click(By.xpath("//*[@class='k-item k-state-focused'][contains( text(),'"+country+"')]"));

    }
    public void newDestinationAddress_setCity (String city){
        type(NewAddressForm_Webelements.city_To,city);

    }

    public void newDestinationAddress_setStreet1 (String street1){
        type(NewAddressForm_Webelements.street1_To,street1);

    }

    public void newDestinationAddress_setZip (String zip){
        type(NewAddressForm_Webelements.zip_To,zip);

    }

    public void newDestinationAddress_CreateButton (){
        click(By.cssSelector("#to-newPlaceStreet2"));
       // click(NewAddressForm_Webelements.footerAddressForm_To);
        click(NewAddressForm_Webelements.createButton_To);

    }


}
