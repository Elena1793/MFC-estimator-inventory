package tests.mfc;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import site.Data.WebElements.JobSummary_WebElements;
import site.Data.WebElements.MainMenu_WebElements;
import site.Data.WebElements.UserMenu_WebElements;
import configuration.DataProviders;
import configuration.MFC_testConfig;


/**
 * Created by user on 13.05.2018.
 */
public class CreateFileTests implements MFC_testConfig, UserMenu_WebElements, MainMenu_WebElements {




   @Test(dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient")
  //  @Test(dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_gblinerstest")

         public void createFile (By locatorlanguage, String bookingType,String source, String jobType, String mode, String serviceType,
                                 String serviceLevel,String firstName, String lastName, String email, String phone,
                                 String country1, String country2, String city1, String city2, String street1, String street2,
                                 String zip1, String zip2){

            appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
       appMFC.getUserMenu_Metods(). waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-mask']"));


                Assert.assertTrue(appMFC.getUserMenu_Metods().Check_changeLanguage(locatorlanguage, MainMenu_List));
            appMFC.getMetodsCreateFile().CreateFile_NewClient(source, jobType, mode, serviceType, serviceLevel,
                        firstName, lastName, email, phone);
                Assert.assertEquals(appMFC.getMetodsCreateFile().getExistText(JobSummary_WebElements.Mode_field),mode,"Mode_field: ");
                Assert.assertEquals(appMFC.getMetodsCreateFile().getExistText(JobSummary_WebElements.JobType_field),jobType,"JobType_field: ");
                Assert.assertEquals(appMFC.getMetodsCreateFile().getExistText(JobSummary_WebElements.ServiceType_field),serviceType,"ServiceType_field: ");
                Assert.assertEquals(appMFC.getMetodsCreateFile().getExistText(JobSummary_WebElements.ServiceLevel_field),serviceLevel,"ServiceLevel_field: ");
                Assert.assertEquals(appMFC.getMetodsCreateFile().getExistText(JobSummary_WebElements.Shipper_Field_FromSection),firstName+" "+lastName,"Shipper_Field: ");
                Assert.assertEquals(appMFC.getMetodsCreateFile().getExistText(JobSummary_WebElements.ShipperEmail_DetailsSection),email,"ShipperEmail: ");
                Assert.assertEquals(appMFC.getMetodsCreateFile().getExistText(JobSummary_WebElements.ShipperMobilePhone_DetailsSection),phone,"ShipperHomePhone: ");
                appMFC.getAddressDetails_Metods().waitForElementByNOTvisibility(By.xpath("//[@class=\"popup-wrapper properties-wrapper\"]"));
                appMFC.getAddressForm_Metods().createNewAddtess("from",country1, city1, street1, zip1);
                appMFC.getJobSummary_Metods().click_TasksGeneration();
                appMFC.getJobMenu_Metods().ReturnToJob_Grid();
           // appMFC.getJobSummary_Metods().createNewAddtess();

        //  appMFC.getAddressForm_Metods().createNewAddtess("to",country2, city2, street2, zip2);


         }




    }



