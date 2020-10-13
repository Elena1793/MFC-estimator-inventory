package tests.estimator;

import org.testng.annotations.Test;
import configuration.Est_testCofig;

public class DownloadSurveyTest implements Est_testCofig {

    @Test
    public void downloadNewSurveyTest() throws InterruptedException {
        appEst.clickOnDownloadButton();
        appEst.clickOnTheSearchSurvey("11455");
        appEst.selectFoundedSurvey();
        appEst.downloadFoundedSurvey();
        appEst.clickOnTheEditSurveyButton();
        appEst.selectAnItemFromInventory();
        appEst.showAttachedPhoto();
        appEst.downloadAttachedPhoto();
        appEst.checkCommentField();
        appEst.clickToTheReturnUpButton();
        appEst.swipeScreenToTheLeft();
        appEst.clickOnTheRoomsWithItemsButton();
        appEst.selectRoomWithItem();
        appEst.clickToTheReturnUpButton();
        appEst.swipeScreenToTheLeft();
        appEst.clickToTheReturnUpButton();
        appEst.clickOnTheGeneralInfo();
        appEst.swipeScreenDown();
        appEst.swipeScreenToTheLeft();
        appEst.swipeScreenDown();
        appEst.swipeScreenToTheLeft();
        appEst.clickOnTheCheckMarkButton();
        appEst.clickToTheReturnUpButton();
        appEst.clickOnTheSurveySummary();
        appEst.clickToTheReturnUpButton();
        appEst.clickOnTheSummaries();
        appEst.clickOnTheCratesSummary();
        appEst.clickToTheReturnUpButton();
        appEst.clickToTheReturnUpButton();
        appEst.clickOnTheCartoonsSummary();
        appEst.clickToTheReturnUpButton();
        appEst.clickToTheReturnUpButton();
        appEst.clickOnTheCostsSummary();
        appEst.clickToTheReturnUpButton();
        appEst.clickToTheReturnUpButton();
        appEst.clickOnTheValuablesSummary();
        appEst.clickToTheReturnUpButton();
        appEst.clickToTheReturnUpButton();
        appEst.clickOnTheHandlingSummary();
        appEst.clickToTheReturnUpButton();
        appEst.clickToTheReturnUpButton();
        appEst.clickOnTheAuxiliaries();
        appEst.clickOnTheAdditionalMaterials();
        appEst.clickToTheReturnUpButton();
        appEst.clickToTheReturnUpButton();
        appEst.clickOnTheServices();
        appEst.clickToTheReturnUpButton();
        appEst.clickToTheReturnUpButton();
        appEst.clickOnTheAdditionalInfo();
        appEst.clickToTheReturnUpButton();
        appEst.clickToTheReturnUpButton();
        appEst.clickOnTheQuotation();
        appEst.clickToTheReturnUpButton();
        appEst.clickToTheReturnUpButton();
        appEst.clickOnTheDocuments();
        appEst.clickToTheReturnUpButton();
        appEst.clickToTheReturnUpButton();
        appEst.clickBackToSurveys();
        appEst.clickOnTheOKButtonOnThePopUp();
        //appEst.deselectSurveyFromDiscovery();

    }
}
