package tests.mfc;

import org.openqa.selenium.By;


import org.testng.annotations.*;
import java.io.File;
import configuration.DataProviders;
import configuration.MFC_testConfig;

import static site.Data.WebElements.Inventory_WebElements.*;

public class Inventory implements MFC_testConfig {


   @Test(dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient")


    public void CreateClientFile_PrivateBookingTypeNewClient(By locatorlanguage, String bookingType,String source, String jobType, String mode, String serviceType,
                                                             String serviceLevel,String firstName, String lastName, String email, String phone,
                                                             String country1, String country2, String city1, String city2, String street1, String street2,
                                                             String zip1, String zip2){
       String item ="Table";
       File attachFile = new File("src/test/resources/item.png");

       appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
       appMFC.getUserMenu_Metods(). waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-mask']"));
       appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        String client = firstName + " " + lastName;
       appMFC.getJobGrid_Metods().openJobByClientName(client);
       appMFC.getJobMenu_Metods().Job_InventoryScreen_Open();
       appMFC.getInventory_Methods().clickOninitializeInventoryButton();
       appMFC.getInventory_Methods().addPiece();
       appMFC.getInventory_Methods().selectAddedPieces();
       appMFC.getInventory_Methods().inputItem(item);
       appMFC.getInventory_Methods().createCommentForItem(item,"Item comment");
       appMFC.getInventory_Methods().attachPhotoForItem(item);



       appMFC.getInventory_Methods().selectRoomInTable_RoomConditionSection();
       appMFC.getInventory_Methods().clickOnCreateRommCondition();
       appMFC.getInventory_Methods().enterRoomNoteDetails("Room Details_1");
       appMFC.getInventory_Methods().enterConditionBeforeDescription("before_1");
       appMFC.getInventory_Methods().attachFileByPath(uploadButton_roomBefore,attachFile);
       appMFC.getInventory_Methods().addElementBeforeCondition("Walls");
       appMFC.getInventory_Methods().attachPhotoElementBefore("Walls",attachFile);
       appMFC.getInventory_Methods().enterConditionAfterDescription("conditionAfterDescription");
       appMFC.getInventory_Methods().attachFileByPath(By.xpath("//input[@id='roomAfterUpload']"),attachFile);
       appMFC.getInventory_Methods().attachPhotoElementAfter("Walls", attachFile);
       appMFC.getSurvey_Metods().ReturnToJob_Grid();

    }


}

// appMFC.getInventory_Methods().OpenPageByUrl("https://mfcdev.voxme.com/PackingInventory/Inventory?clientFileId=4388&jobId=5007");
// appMFC.getInventory_Methods().deleteAllPieces();



     /*  while(appMFC.getInventory_Methods().isElementPresent(By.xpath("//div[@id='roomElementBeforeGrid']//tbody//tr"))){
           appMFC.getInventory_Methods().click(By.xpath("//div[@id='roomElementBeforeGrid']//tbody//tr"));
           appMFC.getInventory_Methods().waitForElementByVisibility(By.xpath("//button[@id='deleteElementBefore']"));
           appMFC.getInventory_Methods().click(By.xpath("//button[@id='deleteElementBefore']"));
       }*/
