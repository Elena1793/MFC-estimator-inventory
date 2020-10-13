package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.Data.WebElements.ItemsConfig_Webelemets;
import site.framework.ApplicationManager.BasisMetods;
import site.framework.Menu.ManagementMenu_Metods;
import configuration.DataProviders;

/**
 * Created by Lena on 21.11.2019.
 */
public class ItemsConfig_Methods extends BasisMetods {

    public ItemsConfig_Methods(WebDriver wd) {
        super(wd);
    }

    public void createItem(DataProviders.Item item) {
        waitForElementByNOTvisibility(By.id("page-preloader"));
        clickOnAddNewItem_button();
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        enterItem(item.getItemType());
        selectItemCategory(item.getItemCategory());
        enterVolumeItem(item.getVolumeItem());
        enterWeightItem(item.getWidthItem());
        chooseRoom(item.getRoom());
        setAplicationField(item.getApplication());
        setUseForField(item.getUseFor());
        clickOnSaveAddedItem_button();

        //String itemName, String itemCategory, float volumeItem,
       // float weightItem, String room, String application, String useFor
    }


    public void createItemWithAsssociatedMaterials(DataProviders.Item itemWithAssociatedMaterials,
                                                   String assotiatedMaterialType, int quantity){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        clickOnAddNewItem_button();
        enterItem(itemWithAssociatedMaterials.getItemType());
        selectItemCategory(itemWithAssociatedMaterials.getItemCategory());
        enterVolumeItem(itemWithAssociatedMaterials.getVolumeItem());
        enterWeightItem(itemWithAssociatedMaterials.getWidthItem());
        chooseRoom(itemWithAssociatedMaterials.getRoom());
        setAplicationField(itemWithAssociatedMaterials.getApplication());
        setUseForField(itemWithAssociatedMaterials.getUseFor());
        clickOnSaveAddedItem_button();
        chooseItem_inItemsGrid(itemWithAssociatedMaterials.getItemType());
        clickOnAddAssociatedMaterials_button();
        selectMaterialFrom_MaterialsDropdown_InAssociatedMaterialsGrid(assotiatedMaterialType);
        enterQuantityForAssociatedMaterial(quantity);
        saveAddedAssociatedMaterial_button();

        /*String itemName, String itemCategory,float volumeItem,
        float weightItem, String room, String application,
                String useFor, String associatedMaterial, int quantity*/
    }

    public void clickOnAddNewItem_button(){
        new ManagementMenu_Metods(wd).ItemsScreen_Open();
        waitForElementByLeavingDOM(By.xpath("//div[@class='k-loading-image']"));
        waitForElementByNOTvisibility(By.id("page-preloader"));

        click(ItemsConfig_Webelemets.AddItem_button);
        waitForElementByNOTvisibility(By.id("page-preloader"));
      //  waitForElementByLeavingDOM(By.xpath("//div[@id='itemGrid']//div[@class='k-grid-content']//*[@class='k-loading-mask']"));

    }
    public void enterItem(String item){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
      // waitForElementByLeavingDOM(By.cssSelector("header[id*='spinner']"));
        //waitForElementByVisibility(By.xpath("//*[@class=\"k-widget k-grid report k-editable\"]"));
      //  waitForElementByVisibility(By.xpath("//div[@class='k-grid-header edit-mode-on']"));
     //   waitForElementByVisibility(By.xpath("//div[@class='k-grid-content edit-mode-on']"));

        waitForElementByVisibility(By.xpath("//tr[@class='k-grid-edit-row']"));
        type(ItemsConfig_Webelemets.itemField,item);

    }

    public void selectItemCategory(String others) {
        click(By.xpath("//td[@data-container-for='ItemCategory']//*[@class='k-select']"));
        dropdownSelectElement1("Others",By.xpath("//ul[@id='ItemCategory_listbox']/li"));
    }

    public void enterVolumeItem(float volume){
        type(ItemsConfig_Webelemets.VolumeItemField, String.valueOf(volume));
    }
    public void enterWeightItem(float weight){
        type(ItemsConfig_Webelemets.WeightItemField, String.valueOf(weight));
    }

    public void chooseItem_inItemsGrid(String itemWithAssociatedMaterials){
        new ManagementMenu_Metods(wd).ItemsScreen_Open();
        waitForElementByNOTvisibility(By.id("page-preloader"));
        click(By.xpath("//div[@id='itemGrid']//div[@class='k-grid-content']//tr//td[contains(text(),'"+itemWithAssociatedMaterials+"')]"));
        waitForElementByLeavingDOM(By.xpath("//div[@class='k-loading-image']"));
    }
    public void clickOnAddAssociatedMaterials_button(){
        waitForElementByVisibility(ItemsConfig_Webelemets.AssociatedMaterials_buttonsGroup);
        click(ItemsConfig_Webelemets.AddAssociatedMaterials_button);
    }

    public void selectMaterialFrom_MaterialsDropdown_InAssociatedMaterialsGrid(String materials_fromListOfMateria_NoPakingTypeNoCrate){
        waitForElementByVisibility(By.xpath("//tr[@class='k-grid-edit-row']"));
        click(ItemsConfig_Webelemets.MaterialsDropdown_Button_InAssociatedMaterialsGrid);
        dropdownSelectElement(materials_fromListOfMateria_NoPakingTypeNoCrate,ItemsConfig_Webelemets.MaterialsDropdown_List_InAssociatedMaterialsGrid);
    }

    public void enterQuantityForAssociatedMaterial(int quantity){
        type(ItemsConfig_Webelemets.QuantityForAssociatedMaterialField, String.valueOf(quantity));
    }
    public void saveAddedAssociatedMaterial_button(){
        click(ItemsConfig_Webelemets.saveAddedAssociatedMaterial_button);
    }

    public void chooseRoom(String room){
        click(By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']"));
        dropdownSelectElement(room,By.xpath("//ul[@id='RoomNamesSelect_listbox']/li"));

    }
    public void setAplicationField(String app){
        click(By.xpath("//*[@aria-owns='Application_listbox']//*[@class='k-select']"));
        dropdownSelectElement1(app,By.xpath("//ul[@id='Application_listbox']/li"));
    }

    public void setUseForField(String useFor){
        click(By.xpath("//*[@aria-owns='UseFor_listbox']//*[@class='k-select']"));
        dropdownSelectElement1(useFor,By.xpath("//ul[@id='UseFor_listbox']/li"));
    }
    public void clickOnSaveAddedItem_button(){
        click(By.xpath("//button[@id='itemTick']"));
    }
}
