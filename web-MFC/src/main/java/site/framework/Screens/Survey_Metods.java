package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import site.Data.Resources.GlobalResources.ScreensURL;
import site.Data.WebElements.*;
import site.framework.ApplicationManager.BasisMetods;


import java.io.File;
import java.util.List;

import static site.Data.WebElements.Inventory_WebElements.addElementBefore_buton;
import static site.Data.WebElements.Inventory_WebElements.elementBefore_listbox_button;
import static site.Data.WebElements.Inventory_WebElements.elementBefore_listbox_dropdown;
import static site.Data.WebElements.JobMenu_WebElements.Job_Home_button;
import static site.Data.WebElements.JobMenu_WebElements.Job_Surveys_button;

/**
 * Created by user on 12.12.2018.
 */
public class Survey_Metods extends BasisMetods{

    public Survey_Metods (WebDriver wd){
        super(wd);
    }

    public void CreateSurvey_SA_Private_NewClient(By locatorlanguage, String source, String jobType, String mode, String serviceType, String serviceLevel,
                                                  String firstName, String lastName, String email, String phone){

    }

    public void CreateSurvey_SA_Private_ExistedClient (By locatorlanguage, String source, String jobType, String mode, String serviceType, String serviceLevel,
                                                       String firstName, String lastName, String email, String phone){

    }

    public void createSyrveyForClientWithJob(String ClientName){
        OpenPage(MainMenu_WebElements.Jobs_button, ScreensURL.Job_Grid);
        waitForElementByLeavingDOM(By.xpath("//div[@class='k-loading-image']"));
        click(By.xpath("//span[@class='k-input'][contains(text(),'10')]"));
        dropdownSelectElement("20",By.xpath("//div[@class='k-animation-container']//ul//li"));//div[@class='k-animation-container']//ul//li
        waitForElementByLeavingDOM(By.xpath("//div[@class='k-loading-image']"));
        click(By.xpath("//td[contains(text(),'"+ClientName+"')]//..//a"));
        OpenPage(Job_Surveys_button,"Survey/ClientFileGrid");
        waitForElementByLeavingDOM(By.xpath("//div[@class='k-loading-image']"));
        click(By.xpath("//button[@id='newSurvey']"));
        waitForElementByLeavingDOM(By.xpath("//div[@class='k-loading-image']"));

    }

    public void ClickOn_CreateNewSurvey_CV_button(){
        waitForElementByLeavingDOM(By.xpath("//div[@class='k-loading-image']"));
        click(By.xpath("//button[@id='newSurvey']"));
    }

    public void ClickOn_CreateSurveyInventory_button(){
        waitForElementByLeavingDOM(By.xpath("//div[@class='k-loading-image']"));
        click(By.xpath("//a[@class='btn btn_sm btn__orange']"));
    }
    public void ClickOn_ModeDropdown(){
       waitForElementByLeavingDOM(By.xpath("//div[@class='k-loading-image']"));
       // click(By.xpath("//span[@aria-owns='modeHead_listbox']"));
        click(SurveyInventory_WebElements.ModeDropdown_button);
    }

    public void ClickOn_RoomDropdown(){
        waitForElementByLeavingDOM(By.xpath("//div[@class='k-loading-image']"));
     //   click(By.xpath("//span[@aria-owns='roomHead_listbox']"));
        click(SurveyInventory_WebElements.RoomDropdown_button);

    }
    public void SelectModeFromDropdown(String mode){
        //dropdownSelectElement("Air",By.xpath("//ul[@id='modeHead_listbox']/li"));
        dropdownSelectElement("Air",SurveyInventory_WebElements.ModeDropdown_list);
    }

    public void SelectModeFromDropdown1(String mode){
        dropdownSelectElement(mode.split(" ")[0],By.xpath("//ul[@id='modeHead_listbox']/li"));
    }
    public void SelectRoomFromDropdown(String room){
      //  dropdownSelectElement(room,By.xpath("//ul[@id='roomHead_listbox']/li"));
        dropdownSelectElement(room,SurveyInventory_WebElements.RoomDropdown_List);
    }
 public void ClickOn_AddStandartItems(){
     try {
         Thread.sleep((long) 500.00);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
     waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
     waitForElementByNOTvisibility(By.id("page-preloader"));
   // waitForElementByVisibility(By.xpath("//div[@id='itemspin']//button[@id='addStandardItem']"));
     waitForElementByVisibility(SurveyInventory_WebElements.AddStandartItem_button);
     waitForElementByNOTvisibility(By.xpath("id=\"spinner-itemspin\""));
    // click(By.xpath("//div[@id='itemspin']//button[@id='addStandardItem']"));
     click(SurveyInventory_WebElements.AddStandartItem_button);
 }

 public void SetQtyForItem_onAddItemModalWindow(String item, int qty){
     waitForElementByNOTvisibility(By.xpath("/[@class='k-overlay']"));
     waitForElementByNOTvisibility(By.id("page-preloader"));
     List<WebElement> dropdown = getList_byLocator(SurveyInventory_WebElements.AddItemsGrid_ItemsColumn);
     for (int i = 0; i < dropdown.size(); i++) {
         System.out.println(dropdown.get(i).getText());
         if (dropdown.get(i).getText().equalsIgnoreCase(item)) {

             type(By.xpath("//div[@id='addItemsGrid']//tbody//tr[td//*[contains(text(),'"+item+"')]]//td[2]"),Integer.toString(qty));

             break;
         }

     }
 }
    public void SetQtyForItem_onAddItemModalWindow1(String item){

       // waitForElementByVisibility(By.xpath("//div[@id='addItemModal']"));
        //waitForElementByLeavingDOM(By.xpath("//div[@class='k-loading-image']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window']//div[@id='addGridWindow']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        waitForElementByNOTvisibility(By.id("page-preloader"));

        waitForElementByVisibility(By.xpath("//div[@id='addGridWindow']//div[@class='popup__content']//tr//td//*[contains(text(),'"+item+"')]"));
        click(By.xpath("//div[@id='addGridWindow']//div[@class='popup__content']//tr[td//*[contains(text(),'"+item+"')]]//td[2]"));
       // waitForElementByClickable_Locator(By.xpath("//div[@id='addGridWindow']//div[@class='popup__content']//tr[td//*[contains(text(),'"+item+"')]]//td[2]"));
        type(By.xpath("//div[@id='addGridWindow']//div[@class='popup__content']//tr[td//*[contains(text(),'"+item+"')]]//td[2]"),"2");
    }





 public void ClickOn_SaveButton_onAddItemModalWindow(){
     click(SurveyInventory_WebElements.SaveButton_onAddItemModalWindow);
     try {
         Thread.sleep((long) 500.00);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
 }

 public void SetPackTypeForItem(String packType){
     waitForElementByLeavingDOM(By.xpath("//div[@class='k-loading-image']"));
     waitForElementByNOTvisibility(By.xpath("id=\"spinner-itemDetails\""));
     //click(By.xpath("//*[@aria-owns='packType_listbox']"));
     click(SurveyInventory_WebElements.PackTypeForItemDropdown_button);
    // dropdownSelectElement_withoutCheckingClickableElement(packType,By.xpath("//div[@id='packType-list']//ul/li"));
     dropdownSelectElement_withoutCheckingClickableElement(packType,SurveyInventory_WebElements.PackTypeForItemDropdown_List);
     waitForElementByNOTvisibility(By.id("page-preloader"));
     waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
 }

 public void attachPhotoForItem(File path){
//     waitForElementByLeavingDOM(By.xpath("//div[@class='k-loading-image']"));
     //attachFileByPath(By.xpath("//*[@id='surveyItemUpload']"),path);
     attachFileByPath(SurveyInventory_WebElements.AttachPhotoForItem,path);
 }

 public void selectRowInItemsGrid(String numOfRow){
     waitForElementByNOTvisibility(By.id("page-preloader"));
     click(By.xpath("//table[@class='js-items-content k-selectable']//tr["+numOfRow+"]/td[2]"));
 }
    public void selectItemInItemsGrid(String item){
        waitForElementByNOTvisibility(By.id("page-preloader"));
       // click(By.xpath("//table[@class='js-items-content k-selectable']//tr["+numOfRow+"]/td[2]"));
    }


 public void ClickOn_CancelButton_onAddItemModalWindow(){
     click(SurveyInventory_WebElements.CancelButton_onAddItemModalWindow);
 }
    public void checkboxPBOisTRUE() {
        boolean isSelectedCheckbox= wd.findElement(SurveyInventory_WebElements.CheckboxPBO_value).isSelected();
        System.out.println(isSelectedCheckbox);
        if(!isSelectedCheckbox){
           // click(By.xpath("//label[@for='pbo']"));
            click(SurveyInventory_WebElements.CheckboxPBO);
        }
    }
    public void checkboxPBOisFALSE() {
       // boolean bb= wd.findElement(By.xpath("//input[@type='checkbox' and @id='pbo']")).isSelected();
        boolean isSelectedCheckbox= wd.findElement(SurveyInventory_WebElements.CheckboxPBO_value).isSelected();
        System.out.println(isSelectedCheckbox);
        if(isSelectedCheckbox){
            click(SurveyInventory_WebElements.CheckboxPBO);
        }
    }

    public void checkboxBOXRequiredIsTRUE() {
        boolean isSelectedCheckbox= wd.findElement(SurveyInventory_WebElements.CheckboxBOXRequired_value).isSelected();
        System.out.println(isSelectedCheckbox);
        if(!isSelectedCheckbox){
            click(SurveyInventory_WebElements.CheckboxBOXRequired);
        }
    }
    public void checkboxBOXRequiredIsFALSE() {
        boolean isSelectedCheckbox= wd.findElement(SurveyInventory_WebElements.CheckboxBOXRequired_value).isSelected();
        System.out.println(isSelectedCheckbox);
        if(isSelectedCheckbox){
            click(SurveyInventory_WebElements.CheckboxBOXRequired);
        }
    }

    public void checkboxCrateRequiredIsTRUE() {
        boolean isSelectedCheckbox= wd.findElement(SurveyInventory_WebElements.CheckboxCrateRequired_value).isSelected();
        System.out.println(isSelectedCheckbox);
        if(!isSelectedCheckbox){
            click(SurveyInventory_WebElements.CheckboxCrateRequired);
        }
    }
    public void checkboxCrateRequiredIsFALSE() {
        boolean isSelectedCheckbox= wd.findElement(SurveyInventory_WebElements.CheckboxCrateRequired_value).isSelected();
        System.out.println(isSelectedCheckbox);
        if(isSelectedCheckbox){
            click(SurveyInventory_WebElements.CheckboxCrateRequired);
        }
    }
    public void checkboxDismantleIsTRUE() {
        boolean isSelectedCheckbox= wd.findElement(SurveyInventory_WebElements.CheckboxDismantle_value).isSelected();
        System.out.println(isSelectedCheckbox);
        if(!isSelectedCheckbox){
            click(SurveyInventory_WebElements.CheckboxDismantle);
        }
    }
    public void checkboxDismantleIsFALSE() {
        boolean isSelectedCheckbox= wd.findElement(SurveyInventory_WebElements.CheckboxDismantle_value).isSelected();
        System.out.println(isSelectedCheckbox);
        if(isSelectedCheckbox){
            click(SurveyInventory_WebElements.CheckboxDismantle);
        }
    }

    public void checkboxNotGoingIsTRUE() {
        boolean isSelectedCheckbox= wd.findElement(SurveyInventory_WebElements.CheckboxNotGoing_value).isSelected();
        System.out.println(isSelectedCheckbox);
        if(!isSelectedCheckbox){
            click(SurveyInventory_WebElements.CheckboxNotGoing);
        }
    }
    public void checkboxNotGoingIsFALSE() {
        boolean isSelectedCheckbox= wd.findElement(SurveyInventory_WebElements.CheckboxNotGoing_value).isSelected();
        System.out.println(isSelectedCheckbox);
        if(isSelectedCheckbox){
            click(SurveyInventory_WebElements.CheckboxNotGoing);
        }
    }


    public void ClickOn_CreateSurveySA_button(){
        click(SurveyGrid_Webelements.CreateSurvey_button);
        // waitForElementByVisibility(By.xpath("//span[@class='spinner']"));
        waitForElementByNOTvisibility(By.cssSelector(".k-loading-image"));
        isPageOpened("Survey/Details");
    }

    public void ClickOn_Client_Field(){
//        waitForElementByLeavingDOM(By.id("spinner-js-header"));
        click(SurveyDetails_WebElements.Client_Field);
    }

    public void Select_Client(String client){
        type(SurveyDetails_WebElements.Client_Field, client);//By.xpath("//*[@id='client']")
        dropdownSelectElement(client,SurveyDetails_WebElements.Client_dropdown_List );//By.xpath("//ul[@id='client_listbox']/li")
    }



    public void ClickOn_ClientFile_Field(){
        waitForElementByNOTvisibility(By.xpath("//div[@class=\"block-wrapper \"]"));
        click(SurveyDetails_WebElements.ClientFile_Field); //By.xpath("//*[@aria-owns='clientFile_listbox']")
    }

    public void Select_ClientFile(String JobRef){
        waitForElementByNOTvisibility(By.id("clientErrorWrapper"));
        type(SurveyDetails_WebElements.KeyboardDriven_ClientFile,JobRef);//By.xpath("//*[@class='k-animation-container']//*[@class='k-textbox']")
        dropdownSelectElement_withoutCheckingClickableElement(JobRef, SurveyDetails_WebElements.ClientFile_dropdown_list);
    }

    public void ClickOn_JobRef_Field(){
        checkLoadingElementBySpinner(By.id("spinner-js-properties"));
        click(SurveyDetails_WebElements.JobRef_field);//By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']")
    }
    public void ClickOn_DeselectAll_JobRef(){
        click(SurveyDetails_WebElements.DeselectALL_JobRef);//By.xpath("//div[@class='k-animation-container']//button[@id='filterClearBtn']")
    }
    public void ClickOn_confirmToStandalone_button(){
        waitForElementByNOTvisibility(By.xpath("/[@//class=\"k-overlay\"]"));
        click(SurveyDetails_WebElements.ConfirmToStandalone_button);//By.xpath("//button[@id='confirmToStandalone']")
    }

    public void ClickOn_toStandaloneWindowClose(){
        waitForElementByNOTvisibility(By.xpath("/[@//class=\"k-overlay\"]"));//By.xpath("/[@//class=\"k-overlay\"]")
        click(SurveyDetails_WebElements.ToStandaloneWindowClose);//By.xpath("//a[@id='toStandaloneWindowClose']")
    }
    public void ReturnToJob_Grid(){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        click(Job_Home_button);
        isPageOpened(ScreensURL.Job_Grid);
    }


    public void addElementBeforeCondition(String elementBeforeCondition) {
            click(elementBefore_listbox_button);
            dropdownSelectElement(elementBeforeCondition,elementBefore_listbox_dropdown);
            click(addElementBefore_buton);
        }

        public void click_QuotREF(){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            click(By.xpath("//tr[1]//a[starts-with(@href, '/Quotation/Details')]"));
        }

    public void click_TasksGeneration() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//div[@class='generate-task__icon']"));
    }

    public void select_source(String source) {
        waitForElementByNOTvisibility(By.id("page-preloader"));
       /* try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        click1309(By.xpath("//div[@class='row-flex middle-xs']//span[@class='k-widget k-dropdown k-header dropdown dropdown_full']"));
        dropdownSelectElement_withoutCheckingClickableElement(source, By.xpath("//ul[@id='source_listbox']//li"));
    }

    public void ClickOn_Client_Field_new(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if( isElementPresent(By.xpath("//*[@class='main__header descr row']/div[@class='block-wrapper' and @style='display: none;']"))){
            click(By.xpath("//input[@name='client_input']"));
        }
    }

    public void Select_Client_new(String client){
        type(By.xpath("//input[@name='client_input']"),client);
        click(By.xpath("//ul[@id='client_listbox']/li[contains(text(),'"+client+"')]"));

    }
    public void ClickOn_JobRef_Field_new(){
        //  waitForElementByNOTvisibility(By.xpath("//*[@class='k-loading-image']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//div[@class='k-widget k-multiselect k-header big']"));
    }
    public void ClickOn_DeselectAll_JobRef_new(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        click(By.xpath("//button[@onclick=\"deselect('jobs', false)\"]"));
    }
    public void ClickOn_confirmToStandalone_button_new(){
        waitForElementByNOTvisibility(By.xpath("//*[@//class='k-overlay']"));
        click(By.xpath("//button[@id='confirmToStandalone']"));
    }


    public void ClickON_EditServices_From() {
        allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        click1309(By.xpath("//button[@id='js-services-fromEdit']"));
    }
}

