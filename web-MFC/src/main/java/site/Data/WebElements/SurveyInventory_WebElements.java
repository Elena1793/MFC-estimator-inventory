package site.Data.WebElements;

import org.openqa.selenium.By;

/**
 * Created by Lena on 18.12.2019.
 */
public interface SurveyInventory_WebElements {

    By ModeDropdown_button = By.xpath("//span[@aria-owns='modeHead_listbox']");
    By ModeDropdown_list = By.xpath("//ul[@id='modeHead_listbox']/li");
    By RoomDropdown_button = By.xpath("//span[@aria-owns='roomHead_listbox']");
    By RoomDropdown_List = By.xpath("//ul[@id='roomHead_listbox']/li");
    By AddStandartItem_button =By.xpath("//div[@id='itemspin']//button[@id='addStandardItem']");
    By AddItemsGrid_ItemsColumn=By.xpath("//div[@id='addItemsGrid']//tbody//tr//td[3]");
    By SaveButton_onAddItemModalWindow = By.xpath("//button[@id='saveAddGrid']");
    By PackTypeForItemDropdown_button=By.xpath("//*[@aria-owns='packType_listbox']");
    By PackTypeForItemDropdown_List=By.xpath("//div[@id='packType-list']//ul/li");
    By AttachPhotoForItem = By.xpath("//*[@id='surveyItemUpload']");
    By CancelButton_onAddItemModalWindow=By.xpath("//button[@id='cancelAddGrid']");
    By CheckboxPBO= By.xpath("//label[@for='pbo']");
    By CheckboxPBO_value=By.xpath("//input[@type='checkbox' and @id='pbo']");
    By CheckboxBOXRequired=By.xpath("//label[@for='boxRequired']");
    By CheckboxBOXRequired_value=By.xpath("//input[@type='checkbox' and @id='boxRequired']");
    By CheckboxCrateRequired = By.xpath("//label[@for='crateRequired']");
    By CheckboxCrateRequired_value=By.xpath("//input[@type='checkbox' and @id='crateRequired']");
    By CheckboxDismantle =By.xpath("//label[@for='dismantle']");
    By CheckboxDismantle_value=By.xpath("//input[@type='checkbox' and @id='dismantle']");
    By CheckboxNotGoing =By.xpath("//label[@for='notGoing']");
    By CheckboxNotGoing_value=By.xpath("//input[@type='checkbox' and @id='notGoing']");
}
