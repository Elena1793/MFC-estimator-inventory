package tests.inventory;
import org.testng.annotations.*;
import configuration.Inv_testConfig;


public class SignAndSendTest implements Inv_testConfig {

    @Test
    public void signAndSendInventoryToMFC() throws InterruptedException {
        appInv.selectClientFromTheDiscovery();
        appInv.clickOnTheReportInventoryButton();
        appInv.swipeScreenDown();
        appInv.clickOnTheClientShipperButton();
        appInv.createSignatureInTheInventory();
        appInv.clickToTheReturnUpButton();
        appInv.clickOnTheForemanDriverButton();
        appInv.createSignatureInTheInventory();
        appInv.clickToTheReturnUpButton();
        appInv.swipeScreenUp();
        appInv.clickOnTheUploadButton();
        appInv.clickOnTheOKButtonOnThePopUp();
    }
}
