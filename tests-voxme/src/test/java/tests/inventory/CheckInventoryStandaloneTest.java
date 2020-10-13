package tests.inventory;

import org.testng.annotations.*;
import configuration.Inv_testConfig;

public class CheckInventoryStandaloneTest implements Inv_testConfig {

    @Test
        public void checkingAndScanningInProcess() throws InterruptedException {
        //For import jobs that don’t have any inventory
            appInv.clickOnTheCreateNewInventoryButton();
            appInv.typeClientLastNameInTheNameField("AddLabels Manually");
            appInv.hideKeyboard();
            appInv.clickOnTheCreateButton();
            appInv.touchOnTheCreatedInventoryOnDiscovery();
            appInv.clickOnTheAddLabelsField();
            appInv.typeQuantityOnTheAddField();
            appInv.clickToTheReturnUpButton();
            appInv.clickOnTheCheckButtonOnTheDiscovery();
            appInv.clickOnTheBoxIconToCreateLU();
            appInv.clickOnTheAddSkidButton();
            appInv.clickOnTheSelectSkidDropDown();
            appInv.clickToTheReturnUpButton();
            appInv.clickToTheReturnUpButton();
            appInv.typeNewBarcodeNumber("1000336-001");
            appInv.clickOnTheCheckButton();
            appInv.selectLUFromDropDown();
            appInv.clickOnTheSelectedSkidInTheDropDown();
            appInv.clickOnTheOKLabelButton();
            appInv.clickOnTheOKButtonOnThePopUp();
    }
}
