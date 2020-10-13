package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import site.framework.ApplicationManager.BasisMetods;

import java.io.File;
import java.util.List;

import static site.Data.WebElements.Inventory_WebElements.*;
import static site.Data.WebElements.Inventory_WebElements.note_roomDetails;


/**
 * Created by Lena on 26.01.2020.
 */
public class Inventory_Methods extends BasisMetods {

    public Inventory_Methods(WebDriver wd) {
        super(wd);
    }

    public void loadedIn(String loadUnit) {
        click(By.xpath("/*//*[@id='pieceDetails']/form[@id='pieceDetailsSection']/*//*[@aria-owns='loadedIn_listbox']"));
        dropdownSelectElement_withoutCheckingClickableElement(loadUnit,By.xpath("//ul[@id=\"loadedIn_listbox\"]/li"));
    }

    public void inputItem(String item){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));

        String [] str=item.split("");
        String firstLetter=str[0].toLowerCase();

        click(By.xpath("//div[@id='items']//div[@class='row-flex']//input[@name='itemName_input']"));
        type(By.xpath("//div[@id='items']//div[@class='row-flex']//input[@name='itemName_input']"),firstLetter);
        dropdownSelectElement_withoutCheckingClickableElement(item,By.xpath("//div[@class='k-animation-container']//div[@id='itemName-list']//ul[@id='itemName_listbox']/li"));
        enter(By.xpath("//div[@id='items']//div[@class='row-flex']//input[@name='itemName_input']"));
    }

    public void createCommentForItem(String item,String comment) {
        click(By.xpath("//div[@id='itemsGrid']//td[contains(text(),'"+item+"')]"));
        click(By.xpath("//textarea[@id='comment']"));
        type(By.xpath("//textarea[@id='comment']"),comment);
    }

    public void addPiece(){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-image']"));
        try {
            Thread.sleep((long) 1500.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//div[@id='pieces']//button[@id='piecesAdd']"));
        allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));

    }

    public String getNumbeOfPieces(){
        //  app.getJobMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        //  app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        try {
            Thread.sleep((long) 700.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String num = getAtributExistTextByAnyAtribut(By.xpath("//input[@id='numOfPieces']"),"value");
        System.out.println(num);
        return num;
    }

    public void selectPieceByIdInPiecesGrid (String num){
        try {
            Thread.sleep((long) 200.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> dropdown = getList_byLocator(By.xpath("//div[@id='piecesGrid']//tbody/tr//td[3]"));
        for (int i = 0; i < dropdown.size(); i++) {
            System.out.println(dropdown.get(i).getText());
            if (dropdown.get(i).getText().equalsIgnoreCase(num)) {
                click(By.xpath("//div[@id='piecesGrid']//tbody//tr["+num+"]"));
                break;
            }

        }
    }
    public void deleteLastPiece(){
        try {
            Thread.sleep((long) 150.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        click(By.xpath("//button[@id='deleteLast']"));
        waitForElementByVisibility(By.xpath("//div[@class='k-overlay']"));
        click(By.xpath("//div[@id='confirmWindow']//button[@id='confirmYes']"));
        waitForElementByNOTvisibility(By.xpath("//div[@class='k-overlay']"));
        allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
    }

    public void deleteAllPieces(){
        String numOfPiece=getNumbeOfPieces();
        for(int i= Integer.parseInt(numOfPiece);i>0;i--){
            deleteLastPiece();
        }
    }

    public void attachPhotoForItem(String item){
        click(By.xpath("//div[@id='itemsGrid']//td[contains(text(),'"+item+"')]"));
        File attachFile = new File("src/test/resources/item.png");
        attachFileByPath(By.xpath("//input[@id='inventoryItemUpload']"),attachFile);
        try {
            Thread.sleep((long) 2500.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickOninitializeInventoryButton() {

            try {
                Thread.sleep((long) 1000.00);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(isDisplayed(initializeInventory_button)){
                click(initializeInventory_button);
            }
            try {
                Thread.sleep((long) 1500.00);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }

    public void selectAddedPieces() {

            try {
                Thread.sleep((long) 1500.00);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String numOfPiece=getNumbeOfPieces();
          //  waitForElementByNOTvisibility(By.xpath("//[@class=\"k-overlay\"]"));
        //waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-image']"));
            selectPieceByIdInPiecesGrid(numOfPiece);
        }

    public void selectRoomInTable_RoomConditionSection() {
        List<WebElement> list=getList_byLocator(roomsColuomnInTableRoomCodition);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
            if (list.get(i).getText()!="0") {
                list.get(i).click();
                break;
            }
        }

    }

    public void clickOnCreateRommCondition() {
            if(isElementPresent(createRoomCondition_button)){
                click(createRoomCondition_button);
            }
    }

    public void enterRoomNoteDetails(String noteRoomDetails) {
        allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
            click(note_roomDetails);
            type(note_roomDetails,noteRoomDetails);
        }

    public void enterConditionBeforeDescription(String conditionBeforeDescription) {
            click(note_conditionBefore);
            type(note_conditionBefore,conditionBeforeDescription);
        }

    public void addElementBeforeCondition(String elementBeforeCondition) {
            click(elementBefore_listbox_button);
            dropdownSelectElement(elementBeforeCondition,elementBefore_listbox_dropdown);
            click(addElementBefore_buton);
        }

    public void attachPhotoElementBefore(String elementBefore, File attachFile) {
            click(By.xpath("//div[@id='roomElementBeforeGrid']//td[contains(text(),'"+elementBefore+"')]"));
            attachFileByPath(uploadButton_roomElementBefore,attachFile);
        }

    public void enterConditionAfterDescription(String conditionAfterDescription) {
            click(note_conditionAfter);
            type(note_conditionAfter,conditionAfterDescription);
        }

    public void attachPhotoElementAfter(String elementAfter, File attachFile) {
            click(By.xpath("//div[@id='roomElementAfterGrid']//td[contains(text(),'"+elementAfter+"')]"));
            attachFileByPath(uploadButton_roomAfter,attachFile);
            try {
                Thread.sleep((long) 1500.00);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
