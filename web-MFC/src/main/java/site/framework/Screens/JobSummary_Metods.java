package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.Data.Resources.GlobalResources.ScreensURL;
import site.Data.WebElements.JobSummary_WebElements;
import site.Data.WebElements.MainMenu_WebElements;
import site.framework.ApplicationManager.BasisMetods;

/**
 * Created by user on 27.05.2018.
 */
public class JobSummary_Metods extends BasisMetods {
    public static String addressSection_From = "From";
    public static String addressSection_To = "To";

    public JobSummary_Metods(WebDriver wd) {
        super(wd);
    }

    public String getClientFileNum() {
        String JobRefFull = getExistText(JobSummary_WebElements.JobRef_field);
        String[] JobReF = JobRefFull.split("-");
        return JobReF[0];
    }

    public String getClientFileNum1byClientName(String ClientName) {

        String JobRefFull = getJobRefNum1byClientName(ClientName);
        String[] JobReF = JobRefFull.split("-");
        return JobReF[0];
    }

    public String getJobRefNum1byClientName(String ClientName) {
        OpenPage(MainMenu_WebElements.Jobs_button, ScreensURL.Job_Grid);
        allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        click(By.xpath("//span[@class='k-input'][contains(text(),'10')]"));
        dropdownSelectElement("20", By.xpath("//div[@class='k-animation-container']//ul//li"));//div[@class='k-animation-container']//ul//li
        String JobRefFull = getExistText(By.xpath("//td[contains(text(),'" + ClientName + "')]//..//a"));//td[contains(text(),'test1558444103840 CHECK speed102')]//..//a
        return JobRefFull;
    }

    public void openJobByClientName(String client) {

    }

    public boolean CheckDataInField(By locator, String data) {
        return data.equalsIgnoreCase(getExistText(locator));
    }


    public void click_TasksGeneration() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//div[@class='generate-task__icon']"));
    }
}

//span[@class='k-input'][contains(text(),'10')]
//tr[1]//td[contains(text(),'testEn1808 check')]

//a[contains(text(),'1887-8')]