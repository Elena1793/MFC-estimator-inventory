package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import site.Data.WebElements.AddressDetails_Webelements;
import site.Data.WebElements.JobSummary_WebElements;
import site.framework.ApplicationManager.BasisMetods;

/**
 * Created by user on 11.11.2018.
 */
public class AddressDetails_Metods extends BasisMetods{

    public AddressDetails_Metods (WebDriver wd){
        super(wd);
    }

    public void editAddress(String editCountry, String editCity, String editStreet1, String editCompany, String editZip, String residenceType,
                            String residenceTypeDescription, String floor, String elevatorDetails, String kindOfCran, String parkingType,
                            String parkingSpotSize, String numberOfSpots, String distanceOfParking, String shuttleDistance, String carryDistance,
                            String stairsCarryDistance, String carryDetails, String stairsCarryDetails, String additionalStopDetails){

        click(JobSummary_WebElements.AddressEdit_button_FromSection);
        isPageOpened("GetAddressDetails");
        addressDetails_setCountry(editCountry);
        addressDetails_setCity(editCity);
        addressDetails_setStreet1 (editStreet1);
        addressDetails_setCompany (editCompany);
        addressDetails_setZip (editZip);
        addressDetails_setResidenceType (residenceType);
        addressDetails_setResidenceTypeDescription (residenceTypeDescription);
        addressDetails_setFloor (floor);
        addressDetails_setElevatorCheckbox_True ();

        addressDetails_setElevatorDetails (elevatorDetails);
        addressDetails_NeedCraneCheckbox_True ();


        addressDetails_KindOfCran (kindOfCran);
        addressDetails_ParkingCheckbox_True ();
        addressDetails_ParkingType (parkingType);
        addressDetails_setParkingSpotSize (parkingSpotSize);
        addressDetails_setNumberOfSpots (numberOfSpots);
        addressDetails_setDistanceOfParking (distanceOfParking);
        addressDetails_NeedShuttleCheckbox_True ();
        shuttleDistance (shuttleDistance);
        addressDetails_CarryRequiredCheckbox_True ();
        carryDistance(carryDistance);
        carryDetails (carryDetails);
        addressDetails_StairsCarryRequiredCheckbox_True ();
        StairsCarryDistance (stairsCarryDistance);
        stairsCarryDetails (stairsCarryDetails);
        addressDetails_additionalStopRequiredCheckbox_True ();
        additionalStopDetails (additionalStopDetails);


    }

    public void clickOnEditAddressButton_FromSection(){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        click(JobSummary_WebElements.AddressEdit_button_FromSection);
        isPageOpened("GetAddressDetails");
    }

    public void addressDetails_setCountry(String editCountry){
        click(AddressDetails_Webelements.Countrylistbox_button);
        dropdownSelectElement_withoutCheckingClickableElement(editCountry, AddressDetails_Webelements.Countrylistbox_dropdown);

    }


    public void addressDetails_setCity(String editCity){
        click(AddressDetails_Webelements.city);
        type(AddressDetails_Webelements.city,editCity);

    }

    public void addressDetails_setStreet1 (String editStreet1){
        type(AddressDetails_Webelements.street1,editStreet1);

    }

    public void addressDetails_setCompany (String editCompany){
        type(AddressDetails_Webelements.company,editCompany);

    }

    public void addressDetails_setZip (String editZip){
        type(AddressDetails_Webelements.zip,editZip);

    }

    public void addressDetails_setResidenceType (String residenceType){
        click(AddressDetails_Webelements.residentTypeListbox_button);
        dropdownSelectElement(residenceType, AddressDetails_Webelements.residentTypeListbox_dropdown);

    }

    public void addressDetails_setResidenceTypeDescription (String residenceTypeDescription){
        type(AddressDetails_Webelements.residenceTypeDescription, residenceTypeDescription);

    }

    public void addressDetails_setFloor (String floor){
        click(AddressDetails_Webelements.floor);
        type(By.xpath("//input[@name=\"addressFloor\"]"), floor);

    }

    public void addressDetails_setElevatorCheckbox_True (){
        Checkbox_True(By.xpath("//label[@for='addressElevatorAvailable']"));

    }

    public void addressDetails_setElevatorCheckbox_False (){
        Checkbox_False(By.xpath("//input[@id='addressElevatorAvailable']"));

    }

    public void addressDetails_setElevatorDetails (String elevatorDetails){
        waitForElementByClickable_Locator(AddressDetails_Webelements.elevatorDetails);
        type(AddressDetails_Webelements.elevatorDetails, elevatorDetails);

    }


    public void addressDetails_NeedCraneCheckbox_True (){
        Checkbox_True(By.xpath("//label[@for='addressNeedCrane']"));

    }

    public void addressDetails_NeedCraneCheckbox_False (){
        Checkbox_False(By.xpath("//label[@for='addressNeedCrane']"));

    }

    public void addressDetails_KindOfCran (String kindOfCran){
        waitForElementByClickable_Locator(AddressDetails_Webelements.kindOfCraneListbox_button);
        click(AddressDetails_Webelements.kindOfCraneListbox_button);
        dropdownSelectElement(kindOfCran,AddressDetails_Webelements.kindOfCraneListbox_dropdown);
    }



    public void addressDetails_ParkingCheckbox_True (){
        Checkbox_True(By.xpath("//label[@for='addressReserveParking']"));

    }

    public void addressDetails_ParkingCheckbox_False (){
        Checkbox_False(By.xpath("//label[@for='addressReserveParking']"));

    }

    public void addressDetails_ParkingType (String parkingType){
        click(AddressDetails_Webelements.parkingTypeListbox_button);
        dropdownSelectElement(parkingType,AddressDetails_Webelements.parkingTypeListbox_dropdown);//ul[@id='addressParkingType_listbox']//li[contains(text(),'Blue Zone')]

    }

    public void addressDetails_setParkingSpotSize (String parkingSpotSize){
        click(AddressDetails_Webelements.parkingSpotSize_fieldblock);
        waitForElementByVisibility(AddressDetails_Webelements.parkingSpotSize_field);
        type(AddressDetails_Webelements.parkingSpotSize_field, parkingSpotSize);

    }

    public void addressDetails_setNumberOfSpots (String numberOfSpots){
        waitForElementByClickable_Locator(AddressDetails_Webelements.numberOfSpots_fieldBlock);
        click(AddressDetails_Webelements.numberOfSpots_fieldBlock);
        waitForElementByVisibility(AddressDetails_Webelements.numberOfSpots_field);
        type(AddressDetails_Webelements.numberOfSpots_field, numberOfSpots);

//input[@name='addressNumberOfSpots']//..//*[@class='k-formatted-value numerictextbox_sm k-input']
    }

    public void addressDetails_setDistanceOfParking (String distanceOfParking){
        waitForElementByClickable_Locator(AddressDetails_Webelements.distanceOfParking_fieldBlock);
        click(AddressDetails_Webelements.distanceOfParking_fieldBlock);
        waitForElementByVisibility(AddressDetails_Webelements.distanceOfParking_field);
        type(AddressDetails_Webelements.distanceOfParking_field, distanceOfParking);

    }

    public void addressDetails_NeedShuttleCheckbox_True (){
        Checkbox_True (By.xpath("//input[@id='addressNeedShuttle']"));
        /*String a = String.valueOf(By.xpath("//input[@id='addressNeedShuttle']"));
        System.out.println(a);
        String [] xpathCheckbox = a.split("'");
        String b= xpathCheckbox[1];
        System.out.println(b);
        if(!wd.findElement(By.xpath("//input[@type='checkbox' and @id='addressNeedShuttle']")).isSelected())
        {
            click(By.xpath("//label[@for='addressNeedShuttle']"));//label[@for='addressNeedShuttle']
        }*/

    }
    public void addressDetails_NeedShuttleCheckbox_False () {
        Checkbox_False(By.xpath("//input[@id='addressNeedShuttle']"));
    }

    public void shuttleDistance (String shuttleDistance){
        if(findElement(By.xpath("//input[@type='checkbox' and @id='addressNeedShuttle']")).isSelected()){
            click(AddressDetails_Webelements.shuttleDistance_fieldBlock);
            type(AddressDetails_Webelements.shuttleDistance_field,shuttleDistance);
        }

    }
    public void addressDetails_CarryRequiredCheckbox_True () {
        Checkbox_True(By.xpath("//input[@id='addressCarryRequired']"));
    }

    public void addressDetails_CarryRequiredCheckbox_False () {
        Checkbox_False(By.xpath("//input[@id='addressCarryRequired']"));
    }

    public void carryDistance(String carryDistance) {
        if (findElement(By.xpath("//input[@type='checkbox' and @id='addressCarryRequired']")).isSelected()) {
            click(AddressDetails_Webelements.carryDistance_fieldBlock);
            type(AddressDetails_Webelements.carryDistance_field, carryDistance);
        }
    }

    public void carryDetails (String carryDetails){
        if (findElement(By.xpath("//input[@type='checkbox' and @id='addressCarryRequired']")).isSelected()){
            waitForElementByClickable_Locator(AddressDetails_Webelements.carryDetails);
            type(AddressDetails_Webelements.carryDetails, carryDetails);
        }

    }

    public void addressDetails_StairsCarryRequiredCheckbox_True () {
        Checkbox_True(By.xpath("//input[@id='addressStairsCarryRequired']"));
    }

    public void addressDetails_StairsCarryRequiredCheckbox_False () {
        Checkbox_False(By.xpath("//input[@id='addressStairsCarryRequired']"));
    }

    public void StairsCarryDistance (String stairsCarryDistance) {
        if (findElement(By.xpath("//input[@type='checkbox' and @id='addressStairsCarryRequired']")).isSelected()) {
            click(AddressDetails_Webelements.stairsCarryDistance_fieldBlock);
            type(AddressDetails_Webelements.stairsCarryDistance_field, stairsCarryDistance);
        }
    }

    public void stairsCarryDetails (String stairsCarryDetails){
        if (findElement(By.xpath("//input[@type='checkbox' and @id='addressCarryRequired']")).isSelected()){
            waitForElementByClickable_Locator(AddressDetails_Webelements.stairsCarryDetails);
            type(AddressDetails_Webelements.stairsCarryDetails, stairsCarryDetails);
        }

    }

    public void addressDetails_additionalStopRequiredCheckbox_True () {
        Checkbox_True(By.xpath("//input[@id='additionalStopRequired']"));
    }

    public void addressDetails_additionalStopRequiredCheckbox_False () {
        Checkbox_False(By.xpath("//input[@id='additionalStopRequired']"));
    }

    public void additionalStopDetails (String additionalStopDetails){
        if (findElement(By.xpath("//input[@type='checkbox' and @id='additionalStopRequired']")).isSelected()){
            waitForElementByClickable_Locator(AddressDetails_Webelements.additionalStopDetails);
            type(AddressDetails_Webelements.additionalStopDetails, additionalStopDetails);
        }

    }



    private void Checkbox_True (By locator){
        String a = String.valueOf(locator);
        System.out.println(a);
        String [] xpathCheckbox = a.split("'");
        String b= xpathCheckbox[1];
        System.out.println(b);
        boolean bb=wd.findElement(By.xpath("//input[@type='checkbox' and @id='"+b+"']")).isSelected();
        System.out.println(bb);
        if(!bb)
        {
            click(By.xpath("//label[@for='"+b+"']"));//label[@for='addressNeedShuttle']
        }

    }
    private void Checkbox_False (By locator){
        String a = String.valueOf(locator);
        System.out.println(a);
        String [] xpathCheckbox = a.split("'");
        String b= xpathCheckbox[1];
        System.out.println(b);
        boolean bb=wd.findElement(By.xpath("//input[@type='checkbox' and @id='"+b+"']")).isSelected();
        System.out.println(bb);
        if(bb){
            click(By.xpath("//label[@for='"+b+"']"));//label[@for='addressNeedShuttle']
        }
    }


    public void checkbox_false(By locator){
        WebElement checkbox=wd.findElement(locator);
        if (checkbox.isSelected()){
            click(locator);
        }
    }
    public void checkbox_true(By locator){
        WebElement checkbox=wd.findElement(locator);
        if (!checkbox.isSelected()){
            click(locator);
        }
    }



}
