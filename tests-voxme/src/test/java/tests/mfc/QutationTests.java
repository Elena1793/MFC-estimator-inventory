package tests.mfc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import configuration.DataProviders;
import configuration.MFC_testConfig;
import site.Data.Resources.BookingType;
import site.Data.Resources.QuotationStatus;

import java.util.List;

/**
 * Created by user on 23.05.2019.
 */
public class QutationTests implements MFC_testConfig {

   // @BeforeTest
    public void Precondition(){
        appMFC.getLoginScreen_Metods().login("testuser4","testuser4");

    }
    @Test(dataProviderClass = DataProviders.class, dataProvider = "createFileForNewClient")

  //  @Test(dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_gblinerstest")
    public void CreateQutation_forExisted_ClientFile(By locatorlanguage, String bookingType,String source, String jobType,String mode, String serviceType, String serviceLevel,
                                                     String firstName, String lastName, String email, String phone, String country1, String country2,
                                                     String city1, String city2,String street1, String street2,String zip1, String zip2)
            throws Exception {


        appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        appMFC.getUserMenu_Metods(). waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-mask']"));

        String client = firstName + " " + lastName;
        String ClientFileNum = appMFC.getJobSummary_Metods().getClientFileNum1byClientName(client);
        appMFC.getMainMenu_Metods().ClickOn_Quotation_button();
        appMFC.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));

        appMFC.Quotation_metods().ClickOn_CreateQutationSA_button();
        appMFC.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));

        appMFC.getBookingSection_Metods().Select_BookingType(bookingType);
        appMFC.Quotation_metods().Select_source(source);

        appMFC.Quotation_metods().ClickOn_Client_Field();
        appMFC.Quotation_metods().Select_Client(client);
        appMFC.Quotation_metods().ClickOn_ClientFile_Field();
        appMFC.Quotation_metods().Select_ClientFile(ClientFileNum);

        appMFC.Quotation_metods().ClickOn_JobRef_Field();
        appMFC.Quotation_metods().ClickOn_DeselectAll_JobRef();
        appMFC.Quotation_metods().ClickOn_confirmToStandalone_button();


        appMFC.Quotation_metods().click_InitializeQuotation();
        appMFC.Quotation_metods().selectQuotTypeFromInitializeQuotation();

        appMFC.Quotation_metods().createCost();
        appMFC.Quotation_metods().fillTextArea_Description();
        appMFC.Quotation_metods().fillTextArea_ClientFeedback();

        appMFC.Quotation_metods().click_Volume_And_Weight();
        appMFC.Quotation_metods().fill_Shipment_Totals_Popup();

        appMFC.Quotation_metods().click_ExpenseREF();
        appMFC.getExpense_Methods().click_QuotationRef();

        appMFC.Quotation_metods().click_TasksGeneration();
        appMFC.Quotation_metods().ckick_generateReport();

        appMFC.Quotation_metods().markCheckboxinDocumentSection();
        appMFC.Quotation_metods().click_ShareButton();
        appMFC.Quotation_metods().click_Share_Email();

        appMFC.Quotation_metods().click_contactTo_SendEmail();
        appMFC.Quotation_metods().select_contactTo_SendEmail("Shipper");
        appMFC.Quotation_metods().click_sendTemplate_SendEmail();
        appMFC.Quotation_metods().select_sendTemplate_SendEmail();
        appMFC.Quotation_metods().click_OK_SendEmail();
        appMFC.Quotation_metods().click_sendSubmit_SendPopup();
        appMFC.Quotation_metods().click_emailSuccessSendClose();

        appMFC.Quotation_metods().click_CreateSurveyFromQuot();
        appMFC.getSurvey_Metods().click_QuotREF();

        appMFC.Quotation_metods().click_CreateCF_FromQuot();
        appMFC.getJobMenu_Metods().Job_QuotationsScreen_Open();
        appMFC.getJobMenu_Metods().click(By.xpath("//a[starts-with(@href, '/Quotation/Details')]"));

        appMFC.Quotation_metods().ClickOn_JobRef_Field();
        appMFC.Quotation_metods().ClickOn_DeselectAll_JobRef();
        appMFC.Quotation_metods().ClickOn_confirmToStandalone_button();


        appMFC.Quotation_metods().ClickOn_ClientFile_Field();
        appMFC.Quotation_metods().Select_ClientFile(ClientFileNum);

        appMFC.Quotation_metods().click_QuotStatus();

        QuotationStatus qs=new QuotationStatus(locatorlanguage);
        String status = qs.QuotationApproved;
        appMFC.Quotation_metods().setStatus(status);

        appMFC.Quotation_metods().click_CreateInvoice();

        appMFC.Quotation_metods().waitForElementByVisibility(By.xpath("//a[starts-with(@href, '/Quotation/Details')]"));
        appMFC.Quotation_metods().click(By.xpath("//a[starts-with(@href, '/Quotation/Details')]"));

        appMFC.Quotation_metods().ReturnToJob_Grid();

    }



    //@Test
    public void createNewTransfery(){
   /* appMFC.Quotation_metods().OpenPageByUrl("https://mfcdev.voxme.com/Quotation/Details?id=3219&back=0");
    appMFC.getJobMenu_Metods().allElemetsInvisibility(By.xpath("/*//*[@class='k-loading-image']"));
    int i=0;
            while(i<100) {

                appMFC.Quotation_metods().click(By.xpath("//button[@id='clientPlus']"));
                try {
                    Thread.sleep((long) 2500.00);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                appMFC.Quotation_metods().click(By.xpath("//input[@id='newPersonFirstName']"));
                appMFC.Quotation_metods().type(By.xpath("//input[@id='newPersonFirstName']"), "sea");
                appMFC.Quotation_metods().click(By.xpath("//input[@id='newPersonLastName']"));
                appMFC.Quotation_metods().type(By.xpath("//input[@id='newPersonLastName']"), "air");
                appMFC.Quotation_metods().click(By.xpath("//input[@id='newPersonEmail']"));
                appMFC.Quotation_metods().type(By.xpath("//input[@id='newPersonEmail']"), "air@air.com");
                appMFC.Quotation_metods().click(By.xpath("//input[@id='newPersonPhone']"));
                appMFC.Quotation_metods().type(By.xpath("//input[@id='newPersonPhone']"), "111");
                appMFC.Quotation_metods().click(By.xpath("//form[@id='newParty']//div[@class='popup__footer']"));
                appMFC.Quotation_metods().click(By.xpath("//button[@id='saveNewParty']"));
                i++;
            }
*/
/*    appMFC.Quotation_metods().OpenPageByUrl("https://mfcdev.voxme.com/PartyConfig/Clients?back=0");
    int i=0;
    while(i<100) {

        appMFC.getJobMenu_Metods().allElemetsInvisibility(By.xpath("/*//*[@class='k-loading-image']"));
        appMFC.Quotation_metods().click(By.xpath("//button[@id='partyAdd']"));
        try {
            Thread.sleep((long) 10000.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        appMFC.Quotation_metods().click(By.xpath("//span[contains(text(),'Account')]"));
        appMFC.Quotation_metods().dropdownSelectElement1("Transferee", By.xpath("//ul[@id='PartyType_listbox']//li"));
        try {
            Thread.sleep((long) 1000.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        appMFC.Quotation_metods().click(By.xpath("//input[@id='Name']"));
        appMFC.Quotation_metods().type(By.xpath("//input[@id='Name']"), "sea air");

        appMFC.Quotation_metods().click(By.xpath("//input[@id='FirstName']"));
        appMFC.Quotation_metods().type(By.xpath("//input[@id='FirstName']"), "sea");

        appMFC.Quotation_metods().click(By.xpath("//input[@id='LastName']"));
        appMFC.Quotation_metods().type(By.xpath("//input[@id='LastName']"), "air");

        appMFC.Quotation_metods().click(By.xpath("//input[@id='Email']"));
        appMFC.Quotation_metods().type(By.xpath("//input[@id='Email']"), "air@air.com");

        appMFC.Quotation_metods().click(By.xpath("//input[@id='Phone']"));
        appMFC.Quotation_metods().type(By.xpath("//input[@id='Phone']"), "111");

        appMFC.Quotation_metods().click(By.xpath("//h3[contains(text(),'New Party')]"));

        appMFC.Quotation_metods().click(By.xpath("//button[@id='saveNewParty']"));

        appMFC.getJobMenu_Metods().allElemetsInvisibility(By.xpath("/*//*[@class='k-loading-image']"));
        appMFC.Quotation_metods().OpenPageByUrl("https://mfcdev.voxme.com/PartyConfig/Clients?back=0");

        i++;

    }*/


}

}





