package tests.mfc;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import site.Data.Resources.Units;
import configuration.DataProviders;
import configuration.MFC_testConfig;

import static site.Data.WebElements.JobMenu_WebElements.Job_Shipments_button;

/**
 * Created by Lena on 08.03.2020.
 */
public class ShipmentsTests implements MFC_testConfig{
    @Test(priority=1,dataProviderClass = DataProviders.class, dataProvider = "createFileForNewClient")
    public void init(By locatorlanguage, String bookingType, String source, String jobType,
                     String mode, String serviceType, String serviceLevel,
                     String firstName, String lastName, String email, String phone,
                     String country1, String country2, String city1, String city2,
                     String street1, String street2, String zip1, String zip2) {


        appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        String client = firstName + " " + lastName;
        appMFC.getJobGrid_Metods().openJobByClientName(client);
        appMFC.getJobGrid_Metods().OpenPage(Job_Shipments_button, "Shipment/ClientFileGrid");
        if(appMFC.getJobGrid_Metods().isElementPresent(By.xpath("//table//tbody/tr//a"))){
            ////table//tbody/tr //table[contains(@class,'k-selectable')]//tbody//tr
            ////a[contains(text(),'ID')]
            appMFC.getShipments_Methods().click(By.xpath("//table//tbody/tr//a"));
        }else{
            appMFC.getShipments_Methods().createJobShipment();
        }
      //  appMFC.getShipments_Methods().createJobShipment();
        appMFC.getShipments_Methods().addShipmentUniteButton();
        appMFC.getShipments_Methods().selectLoadUniteInLoadingUnitType_dropdown(new Units(locatorlanguage).getAirvan());
        appMFC.getShipments_Methods().setGrossVolumeInShipmentUnitsGrid("100");
        appMFC.getShipments_Methods().setGrossWeightInShipmentUnitsGrid("200");
        appMFC.getShipments_Methods().setLocationInShipmentUnitsGrid();
        appMFC.getShipments_Methods().clickOnSaveButtonInLoadUnitsGrid();
    //    clickOnCalendarIcon_ETD();
   //     setNextDay_ETD();
  //      clickOnCalendarIcon_ETD();
  //      setPrevDay_ETD();
       // clickOnCalendarIcon_ETD();
      //  setCurrentDay_ETD();
       /* clickOnCalendarIcon_ETA();
        setNextDay_ETA();*/
      //  String str = appMFC.getShipments_Methods().getExistText(By.xpath("//div[@id='eta_dateview']//td[@aria-selected='true']/a"));
      //  System.out.println("eta  " + str);
            clickOnCalendarIcon_ETD();
        appMFC.getShipments_Methods().click(By.xpath("//span[@class='k-icon k-i-arrow-60-left']"));
       // appMFC.getShipments_Methods().click(By.xpath("//a[@class='k-link k-nav-fast']"));
        appMFC.getShipments_Methods().  click(By.xpath("//a[@class='k-link k-nav-fast'][contains(text(),'April 2020')]"));
        appMFC.getShipments_Methods().  click(By.xpath("//a[contains(text(),'Apr')]"));
        appMFC.getShipments_Methods().  click(By.xpath("//table//tbody//tr//td//a[contains(text(),'10')]"));
      //  appMFC.getShipments_Methods().  click(By.xpath("//*[@class='k-today k-state-focused']//a[@data-value='2020/5/10']"));
        ////*[@class='k-today k-state-focused']//a[@data-value='2020/5/10']
     //       String st = appMFC.getShipments_Methods().getExistText(By.xpath("//td[@aria-selected='true']/a"));
     //       System.out.println("=============" + st);
     //   appMFC.getShipments_Methods().click(By.xpath("//td[@aria-selected='true']/a"));

      //  appMFC.getShipments_Methods().click(By.xpath("//*[@aria-controls='etd_timeview']"));
       // appMFC.getShipments_Methods(.getAtributExistTextByTitle()

      //  appMFC.getShipments_Methods().click(By.xpath("//*[@aria-controls='eta_dateview']"));
      //  appMFC.getShipments_Methods().click(By.xpath("//*[@aria-controls='eta_timeview']"));
    }

    private void setNextDay_ETA() {
        if(appMFC.getShipments_Methods().isElementPresent(By.xpath("//td[@aria-selected='true']/a"))){
            String st= appMFC.getShipments_Methods().getExistText(By.xpath("//td[@aria-selected='true']/a"));
            System.out.println("============="+st);
            int res=Integer.parseInt(st)+1;
            String newDate=String.valueOf(res);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            appMFC.getShipments_Methods().waitForElementByClickable_Locator(By.xpath("//a[@class='k-link'][contains(text(),'"+newDate+"')]"));
            appMFC.getShipments_Methods().click(By.xpath("//a[@class='k-link'][contains(text(),'"+newDate+"')]"));
        }else{


        }
    }

    private void clickOnCalendarIcon_ETA() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        appMFC.getShipments_Methods().click(By.xpath("//*[@aria-controls='eta_dateview']"));
    }

    private void setCurrentDay_ETD() {
        String str=appMFC.getShipments_Methods().getAtributExistTextByTitle(By.xpath("//a[contains(@class,'k-link k-nav-today')]"));
        String currentDate=str.split(" ")[2].split("\\,")[0];
        appMFC.getShipments_Methods().waitForElementByVisibility(By.xpath("//a[@class='k-link'][contains(text(),'"+currentDate+"')]"));
        appMFC.getShipments_Methods().click(By.xpath("//a[@class='k-link'][contains(text(),'"+currentDate+"')]"));
    }

    private void clickOnCalendarIcon_ETD() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        appMFC.getShipments_Methods().click(By.xpath("//*[@aria-controls='etd_dateview']"));
    }

    private void setPrevDay_ETD() {
        String str=appMFC.getShipments_Methods().getAtributExistTextByTitle(By.xpath("//a[contains(@class,'k-link k-nav-today')]"));
        String st=str.split(" ")[2].split("\\,")[0];
        int res=Integer.parseInt(st)-1;
        String newDate=String.valueOf(res);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        appMFC.getShipments_Methods().waitForElementByClickable_Locator(By.xpath("//a[@class='k-link'][contains(text(),'"+newDate+"')]"));
        appMFC.getShipments_Methods().click(By.xpath("//a[@class='k-link'][contains(text(),'"+st+"')]//../.././/a[@class='k-link'][contains(text(),'"+newDate+"')]"));
    }

    private void setNextDay_ETD() {
        String str=appMFC.getShipments_Methods().getAtributExistTextByTitle(By.xpath("//a[contains(@class,'k-link k-nav-today')]"));
        String st=str.split(" ")[2].split("\\,")[0];
        int res=Integer.parseInt(st)+1;
        String newDate=String.valueOf(res);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        appMFC.getShipments_Methods().waitForElementByClickable_Locator(By.xpath("//a[@class='k-link'][contains(text(),'"+newDate+"')]"));
        appMFC.getShipments_Methods().click(By.xpath("//a[@class='k-link'][contains(text(),'"+st+"')]//../.././/a[@class='k-link'][contains(text(),'"+newDate+"')]"));
    }


}
