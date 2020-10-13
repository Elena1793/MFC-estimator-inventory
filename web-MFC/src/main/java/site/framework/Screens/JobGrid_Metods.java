package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.Data.Resources.GlobalResources.ScreensURL;
import site.Data.WebElements.MainMenu_WebElements;
import site.framework.ApplicationManager.BasisMetods;

/**
 * Created by user on 23.05.2019.
 */
public class JobGrid_Metods  extends BasisMetods {

    public JobGrid_Metods(WebDriver wd){
        super(wd);
    }

    public void clickOnRowInGrid(String row){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        click(By.xpath("//tr["+row+"]/td[1]/a[1]"));
    }

    public String getClientFileNum1byClientName(String ClientName) {

        String JobRefFull=getJobRefNum1byClientName(ClientName);
        String[] JobReF = JobRefFull.split("-");
        return JobReF[0];
    }

    public String getJobRefNum1byClientName(String ClientName){
        OpenPage(MainMenu_WebElements.Jobs_button, ScreensURL.Job_Grid);
        click(By.xpath("//span[@class='k-input'][contains(text(),'10')]"));
        dropdownSelectElement("20",By.xpath("//div[@class='k-animation-container']//ul//li"));//div[@class='k-animation-container']//ul//li
        String JobRefFull=getExistText(By.xpath("//td[contains(text(),'"+ClientName+"')]//..//a"));//td[contains(text(),'test1558444103840 CHECK speed102')]//..//a
        return JobRefFull;
    }

    public void openJobByClientName(String ClientName){
        OpenPage(MainMenu_WebElements.Jobs_button, ScreensURL.Job_Grid);
        waitForElementByLeavingDOM(By.xpath("//div[@class='k-loading-image']"));
        click(By.xpath("//span[@class='k-input'][contains(text(),'10')]"));
        dropdownSelectElement("20",By.xpath("//div[@class='k-animation-container']//ul//li"));//div[@class='k-animation-container']//ul//li
        waitForElementByLeavingDOM(By.xpath("//div[@class='k-loading-image']"));
        click(By.xpath("//td[contains(text(),'"+ClientName+"')]//..//a"));

    }
}
