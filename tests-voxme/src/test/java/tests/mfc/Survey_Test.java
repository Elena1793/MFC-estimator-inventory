package tests.mfc;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import configuration.DataProviders;
import configuration.MFC_testConfig;

import static site.Data.Resources.Source.Google;


public class Survey_Test implements MFC_testConfig {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "createFileForNewClient")
    //dependsOnMethods - if methods failed current Test wouldn't run

    public void CreateSurvey_ForExistClientFile(By locatorlanguage, String bookingType,String source, String jobType,
                                                String mode, String serviceType, String serviceLevel,
                                                String firstName, String lastName, String email, String phone,
                                                String country1, String country2, String city1, String city2,
                                                String street1, String street2, String zip1, String zip2) {

        appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        String client = firstName + " " + lastName;
        String ClientFileNum = appMFC.getJobSummary_Metods().getClientFileNum1byClientName(client);
        appMFC.getMainMenu_Metods().ClickOn_Surveys_button();
        appMFC.getSurvey_Metods().ClickOn_CreateSurveySA_button();

        appMFC.getSurvey_Metods().select_source(source);
       // appMFC.getBookingSection_Metods().Select_Source(source);
        appMFC.getSurvey_Metods().ClickOn_Client_Field_new();
        appMFC.getSurvey_Metods().Select_Client_new(client);
        appMFC.getSurvey_Metods().ClickOn_ClientFile_Field();
        appMFC.getSurvey_Metods().Select_ClientFile(ClientFileNum);
        appMFC.getSurvey_Metods().ClickOn_JobRef_Field_new();
        appMFC.getSurvey_Metods().ClickOn_DeselectAll_JobRef_new();
        appMFC.getSurvey_Metods().ClickOn_confirmToStandalone_button_new();
        appMFC.getSurvey_Metods().ClickON_EditServices_From();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        appMFC.getSurvey_Metods().click(By.xpath("(//*[@title='0.0000'])[1]/ancestor::tr/td[3]"));
      //  appMFC.getSurvey_Metods().click1309(By.xpath("(//*[@title='0.0000'])[1]/ancestor::tr//*[@*='checkbox']"));
       // (//*[@title='0.0000'])[1]/../../../../../td[3]
            //    (//*[@title='0.0000'])[1]/ancestor::tr/td[3]
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*appMFC.getSurvey_Metods().click(By.xpath("(/*//*[@title='0.0000'])[1]"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        appMFC.getSurvey_Metods().click(By.xpath("(//*[@title='0.0000'])[1]"));
        appMFC.getSurvey_Metods().type(By.xpath("(//*[@value='0.0000'])[1]"),"99");

        appMFC.getSurvey_Metods().click1309(By.xpath("//button[@id='js-services-fromSave']"));
        //appMFC.getSurvey_Metods().ClickON_EditServices_From();
        appMFC.getSurvey_Metods().ReturnToJob_Grid();
    }

    // @Test(dependsOnMethods = "CreateSurvey_ForExistClientFile")

    public void CreateSurveySA_FromSurveyOfClientFile() {

        appMFC.getSurvey_Metods().ClickOn_JobRef_Field();
        appMFC.getSurvey_Metods().ClickOn_DeselectAll_JobRef();
        appMFC.getSurvey_Metods().ClickOn_confirmToStandalone_button();
        appMFC.getSurvey_Metods().ReturnToJob_Grid();
    }

    //  @Test

    public void CreateSurveySA_NewClient() {

        appMFC.getMainMenu_Metods().ClickOn_Surveys_button();
        appMFC.getSurvey_Metods().ClickOn_CreateSurveySA_button();
        appMFC.getBookingSection_Metods().Select_Source(Google);
        appMFC.getSurvey_Metods().waitForElementByLeavingDOM(By.id("spinner-js-header"));
        appMFC.getSurvey_Metods().click(By.xpath("//button[@id='clientPlus']"));
        appMFC.getSurvey_Metods().click(By.xpath("//input[@id='newPartyName']"));
        appMFC.getSurvey_Metods().type(By.xpath("//input[@id='newPartyName']"), "test");
        appMFC.getSurvey_Metods().type(By.xpath("//input[@id='newPersonFirstName']"), "first");
        appMFC.getSurvey_Metods().type(By.xpath("//input[@id='newPersonLastName']"), "last");
        appMFC.getSurvey_Metods().type(By.xpath("//input[@id='newPersonEmail']"), "email@eee.net");
        appMFC.getSurvey_Metods().type(By.xpath("//input[@id='newPersonPhone']"), "3535353");
        appMFC.getSurvey_Metods().click(By.xpath("//button[@id='saveNewParty']"));
    }
}