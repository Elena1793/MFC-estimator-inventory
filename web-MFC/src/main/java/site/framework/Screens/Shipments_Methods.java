package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.framework.ApplicationManager.BasisMetods;

/**
 * Created by Lena on 08.03.2020.
 */
public class Shipments_Methods extends BasisMetods {
    public Shipments_Methods(WebDriver wd) {
        super(wd);
    }
    public void createJobShipment(){
        click(By.xpath("//ul[@id='createShipment']"));
        click(By.xpath("//li[@data-type='Enum.ShipmentType.JobShipment']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }
    public void createGroupage(){
        click(By.xpath("//ul[@id='createShipment']"));
        click(By.xpath("//li[@data-type='Enum.ShipmentType.Groupage']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }

    public void clickOnSaveButtonInLoadUnitsGrid() {
        click(By.xpath("//button[@id='shipmentUnitsTick']"));
    }

    public void setLocationInShipmentUnitsGrid() {
         click(By.xpath("//*[@data-container-for='Location']"));
        click(By.xpath("//ul[@id='Locationid_listbox']//li[@data-offset-index='1']"));
    }

    public void setGrossWeightInShipmentUnitsGrid(String GrossWeight) {
        click(By.xpath("//td[@data-container-for='GrossWeight']"));
        type(By.xpath("//td[@data-container-for='GrossWeight']"),GrossWeight);
    }

    public void setGrossVolumeInShipmentUnitsGrid(String GrossVolume) {
         click(By.xpath("//td[@data-container-for='GrossVolume']"));
        type(By.xpath("//td[@data-container-for='GrossVolume']"),GrossVolume);
    }

    public void selectLoadUniteInLoadingUnitType_dropdown(String  unit) {
         click(By.xpath("//span[@aria-owns='ShipmentUnitType_listbox']"));
        dropdownSelectElement( unit,By.xpath("//ul[@id='ShipmentUnitType_listbox']/li"));
    }

    public void addShipmentUniteButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        try {
            Thread.sleep((long) 4000.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//button[@id='shipmentUnitsAdd']"));
        try {
            Thread.sleep((long) 2000.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
