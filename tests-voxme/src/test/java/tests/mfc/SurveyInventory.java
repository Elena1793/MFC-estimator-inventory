package tests.mfc;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import site.Data.Resources.GlobalResources.ScreensURL;
import site.Data.Resources.Item;
import configuration.DataProviders;
import configuration.MFC_testConfig;

import java.io.File;
import java.time.LocalTime;
import static site.Data.WebElements.MainMenu_WebElements.Management_button;
import static site.Data.WebElements.Operation_CV.HomeButtonOnJobMenu;

/**
 * Created by Lena on 11.11.2019.
 */
public class SurveyInventory implements MFC_testConfig {
    LocalTime date = LocalTime.now();
   // int date=2323;
    public DataProviders.Materials existMaterialsPackType;
    DataProviders.Materials existMaterialsPackType1;
    DataProviders.Materials existMaterialsCrate;
    DataProviders.Materials existMaterialsCrate1;
    DataProviders.Materials existAssociatedMaterials;
    DataProviders.Item existItem = new DataProviders.Item("Item"+date, Item.Category.Other,5,6,
            Item.Room.Hallway1,Item.Application.Both,Item.UseFor.Both);
    DataProviders.Item existItemWithAssociatedMaterials = new DataProviders.Item("Item-AM"+date,Item.Category.Other,7,8,
            Item.Room.Hallway1,Item.Application.Both,Item.UseFor.Both);

    @Test(priority=1,dataProviderClass = DataProviders.class,dataProvider = "createMaterialsConfig")
    public void precondition1(By locatorlanguage, String FirstName,
                              DataProviders.Materials materialsPackType,
                              DataProviders.Materials materialsPackType1,DataProviders.Materials materialsCrate,
                              DataProviders.Materials materialsCrate1, DataProviders.Materials associatedMaterials) {
        appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
       // appMFC.getMainMenu_Metods().ManagementScreen_Open();
        appMFC.getUserMenu_Metods().OpenPage(Management_button, ScreensURL.Iterators);
        appMFC.getManagementMenu_Metods().MaterialsScreen_Open();

        appMFC.getMaterialsConfig_Methods().createNewMaterials_PakingType(
                materialsPackType.getMaterialType(), materialsPackType.getCoast(),materialsPackType.getWidth(),
                materialsPackType.getLength(), materialsPackType.getHeight(), materialsPackType.getVolume());

        appMFC.getMaterialsConfig_Methods().createNewMaterials_PakingType(
                materialsPackType1.getMaterialType(), materialsPackType1.getCoast(),materialsPackType1.getWidth(),
                materialsPackType1.getLength(),materialsPackType1.getHeight(),materialsPackType1.getVolume());

        appMFC.getMaterialsConfig_Methods().createNewMaterials_NotPackTypeNotCrate(
                associatedMaterials.getMaterialType(), associatedMaterials.getCoast(),associatedMaterials.getWidth(),
                associatedMaterials.getLength(),associatedMaterials.getHeight(),associatedMaterials.getVolume());

        appMFC.getMaterialsConfig_Methods().createNewMaterials_CRATE(
                materialsCrate.getMaterialType(), materialsCrate.getCoast(), materialsCrate.getWidth(),
                materialsCrate.getLength(),materialsCrate.getHeight(),materialsCrate.getVolume());

        appMFC.getMaterialsConfig_Methods().createNewMaterials_CRATE(
                materialsCrate1.getMaterialType(),materialsCrate1.getCoast(),materialsCrate1.getWidth(),
                materialsCrate1.getLength(),materialsCrate1.getHeight(),materialsCrate1.getVolume());

        appMFC.getMaterialsConfig_Methods().addAssociatedMaterials(
                materialsPackType.getMaterialType(), associatedMaterials.getMaterialType(), associatedMaterials.getQuantity());
        existMaterialsPackType=materialsPackType;
        existMaterialsPackType1=materialsPackType1;
        existMaterialsCrate=materialsCrate;
        existMaterialsCrate1=materialsCrate1;
        existAssociatedMaterials=associatedMaterials;

        appMFC.getManagementMenu_Metods().ItemsScreen_Open();
        appMFC.getItemsConfig_Methods().createItem(existItem);
        appMFC.getItemsConfig_Methods().createItemWithAsssociatedMaterials(existItemWithAssociatedMaterials,
                associatedMaterials.getMaterialType(),associatedMaterials.getQuantity());

    }

   @Test(priority=2,dataProviderClass = DataProviders.class, dataProvider = "createFileForNewClient")
  //@Test(priority=2,dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_gblinerstest")

    public void CreateSurvey_ForExistClientFile(By locatorlanguage, String bookingType, String source, String jobType,
                                                String mode, String serviceType, String serviceLevel,
                                                String firstName, String lastName, String email, String phone,
                                                String country1, String country2, String city1, String city2,
                                                String street1, String street2, String zip1, String zip2) {

        appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);

        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        String client = firstName + " " + lastName;

        appMFC.getJobGrid_Metods().openJobByClientName(client);
        appMFC.getJobMenu_Metods().Job_SurveysScreen_Open();
        appMFC.getSurvey_Metods().ClickOn_CreateNewSurvey_CV_button();
       appMFC.getSurvey_Metods().click_TasksGeneration();
        appMFC.getSurvey_Metods().ClickOn_CreateSurveyInventory_button();

        appMFC.getSurvey_Metods().ClickOn_ModeDropdown();
        appMFC.getSurvey_Metods().SelectModeFromDropdown(mode);
        appMFC.getSurvey_Metods().ClickOn_RoomDropdown();
        appMFC.getSurvey_Metods().SelectRoomFromDropdown(existItem.getRoom());
        try {
            Thread.sleep((long) 1500.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        appMFC.getSurvey_Metods().ClickOn_AddStandartItems();
        appMFC.getSurvey_Metods().waitForElementByNOTvisibility(By.xpath("/[@class='k-overlay']"));
        appMFC.getSurvey_Metods().SetQtyForItem_onAddItemModalWindow(existItem.getItemType(),2);
        appMFC.getSurvey_Metods().ClickOn_SaveButton_onAddItemModalWindow();
      appMFC.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getSurvey_Metods().ClickOn_AddStandartItems();
        appMFC.getSurvey_Metods().waitForElementByNOTvisibility(By.xpath("/[@class='k-overlay']"));
        appMFC.getSurvey_Metods().SetQtyForItem_onAddItemModalWindow(existItemWithAssociatedMaterials.getItemType(),2);
        appMFC.getSurvey_Metods().ClickOn_SaveButton_onAddItemModalWindow();
        System.out.println("existMaterialsPackType.getMaterialType()=" + existMaterialsPackType.getMaterialType());
        appMFC.getSurvey_Metods().SetPackTypeForItem(existMaterialsPackType.getMaterialType());
       appMFC.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        File attachFile = new File("src/test/resources/item.png");
       File attachBeforeRoom = new File("src/test/resources/roomBefore.png");
       File roomElementBefore=new File("src/test/resources/roomElementBefore.png");
       File attachAfterRoom = new File("src/test/resources/roomAfter.png");
       File roomElementAfter=new File("src/test/resources/roomElementAfter.png");
       appMFC.getSurvey_Metods().attachPhotoForItem(attachFile);
        try {
            Thread.sleep((long) 500.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        appMFC.getSurvey_Metods().checkboxPBOisTRUE();
       // appMFC.getSurvey_Metods().OpenPageByUrl("https://mfcdev.voxme.com/SurveyInventory/SurveyInventory?surveyId=3031");
       selectRoomInTable_RoomConditionSection(existItem.getRoom());
       enterRoomNoteDetails("Details");
       clickOnCreateRommCondition();
       enterConditionBeforeDescription("before");
        appMFC.getSurvey_Metods().attachFileByPath(By.xpath("//*[@id='roomBeforeUpload']"),attachBeforeRoom);
        appMFC.getSurvey_Metods().click(By.xpath("//*[@aria-owns=\"elementBefore_listbox\"]"));
        appMFC.getSurvey_Metods().dropdownSelectElement("Walls",By.xpath("//ul[@id='elementBefore_listbox']/li"));
        appMFC.getSurvey_Metods().click(By.xpath("//button[@id='addElementBefore']"));
        appMFC.getSurvey_Metods().click(By.xpath("//div[@id='roomElementBeforeGrid']//td[contains(text(),'Walls')]"));
        appMFC.getSurvey_Metods().attachFileByPath(By.xpath("//*[@id='roomElementBeforeUpload']"),roomElementBefore);
        appMFC.getSurvey_Metods().click(By.xpath("//textarea[@id='conditionAfterDescription']"));
        appMFC.getSurvey_Metods().type(By.xpath("//textarea[@id='conditionAfterDescription']"),"conditionAfterDescription");
        appMFC.getSurvey_Metods().attachFileByPath(By.xpath("//input[@id='roomAfterUpload']"),attachAfterRoom);

        appMFC.getSurvey_Metods().click(By.xpath("//div[@id='roomElementAfterGrid']//td[contains(text(),'Walls')]"));
        appMFC.getSurvey_Metods().attachFileByPath(By.xpath("//*[@id='roomElementAfterUpload']"),roomElementAfter);


        appMFC.getMainMenu_Metods().click(HomeButtonOnJobMenu);

    }

    private void enterConditionBeforeDescription(String before) {
        appMFC.getSurvey_Metods().click(By.xpath("//textarea[@id='conditionBeforeDescription']"));
        appMFC.getSurvey_Metods().type(By.xpath("//textarea[@id='conditionBeforeDescription']"),"before");
    }

    private void clickOnCreateRommCondition() {
        appMFC.getSurvey_Metods().click(By.xpath("//button[@id='createRoomConditions']"));
        appMFC.getSurvey_Metods().waitForElementByLeavingDOM(By.id("spinner-roomDetails"));
    }

    private void enterRoomNoteDetails(String details) {
        appMFC.getSurvey_Metods().click(By.xpath("//textarea[@id='roomNoteDetails']"));
        appMFC.getSurvey_Metods().type(By.xpath("//textarea[@id='roomNoteDetails']"),"Details");
    }

    private void selectRoomInTable_RoomConditionSection(String room) {
        appMFC.getSurvey_Metods().click(By.xpath("//table[contains(@class,'js-rooms-content k-selectable')]//tr//td[contains(text(),'"+existItem.getRoom()+"')]"));
    }


}

