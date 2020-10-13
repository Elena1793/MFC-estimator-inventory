package tests.inventory;
import org.testng.annotations.*;
import configuration.Inv_testConfig;


public class DownloadInventoryTest implements Inv_testConfig {

    @Test
    public void downloadInventoryFromMFC() throws InterruptedException {
      appInv.clickOnDownloadButton();
      appInv.clickOnTheSearchInventory("2357-1-1");
      appInv.selectFoundedInventory();
      appInv.downloadFoundedInventory();
      appInv.clickOnTheEditInventoryButton();
      appInv.selectAnItemFromInventory();
      appInv.showParametersOfTheItem();
      appInv.showAttachedPhoto();
      appInv.downloadAttachedPhoto();
      appInv.clickToTheReturnUpButton();
      appInv.clickToTheReturnUpButton();
      appInv.clickOnTheInfoButton();
      //appInv.clickOnTheSchedulesButton();
      //appInv.clickToTheReturnUpButton();
      appInv.swipeScreenDown();
      appInv.clickOnTheOriginButton();
      appInv.clickToTheReturnUpButton();
      appInv.swipeScreenDown();
      appInv.clickOnTheDestinationButton();
      appInv.clickToTheReturnUpButton();
      appInv.clickOnTheRoomsButtonOnTheInventoryScreen();
      appInv.selectRoomWithItem();
      appInv.clickOnTheShowRoomButtonOnTheRoomsScreen();
      appInv.showAttachedPhoto();
      appInv.downloadAttachedPhoto();
      appInv.clickOnPropertyConditionsFieldAfterPacking();
      appInv.showAttachedPhoto();
      appInv.downloadAttachedPhoto();
      appInv.clickToTheReturnUpButton();
      appInv.clickOnTheInventoryList();
      appInv.clickOnTheAppliances();
      appInv.clickOnTheAdditionalListButton();
      appInv.clickOnThePackers();
      appInv.clickOnTheAdditionalListButton();
      appInv.clickOnTheLoader();
      appInv.clickToTheReturnUpButton();
      appInv.clickOnTheAdditionalListButton();
      appInv.clickOnTheCartonsSummary();
      appInv.clickOnTheAdditionalListButton();
      appInv.clickOnTheAdditionalMaterials();
      appInv.clickToTheReturnUpButton();
      appInv.clickOnTheAdditionalListButton();
      appInv.clickOnTheServices();
      appInv.clickToTheReturnUpButton();
      appInv.clickOnTheAdditionalListButton();
      appInv.clickOnTheAdditionalInfo();
      appInv.clickToTheReturnUpButton();
      appInv.clickOnTheAdditionalListButton();
      appInv.clickOnTheDocuments();
      appInv.returnToTheDiscoveryPage();
    }
}
