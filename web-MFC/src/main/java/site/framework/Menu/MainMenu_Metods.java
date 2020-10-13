package site.framework.Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.Data.WebElements.MainMenu_WebElements;
import site.Data.Resources.GlobalResources.ScreensURL;
import site.framework.ApplicationManager.BasisMetods;


public class MainMenu_Metods extends BasisMetods implements MainMenu_WebElements{

    public MainMenu_Metods(WebDriver wd){
        super(wd);

    }
    public void OpenPage1(By locator) {

        String page=null;
        if (locator == MainMenu_WebElements.CRM_button){
            page = ScreensURL.Opportunity_Grid;
        }
        if (locator==MainMenu_WebElements.Daily_Agenda_button){
            page = ScreensURL.DailyAgenda;
        }

        super.OpenPage(locator, page);
    }


    @Override
    public void OpenPage(By locator) {
        String page =null;
        if (locator == MainMenu_WebElements.CRM_button){
            page = ScreensURL.Opportunity_Grid;
        }
        if (locator==MainMenu_WebElements.Daily_Agenda_button){
            page = ScreensURL.DailyAgenda;
        }
        super.OpenPage(locator, page);
    }

    public void ManagementScreen_Open(){
        OpenPage(Management_button, ScreensURL.Management);

    }
    public void Job_GridScreen_Open(){
        OpenPage(Jobs_button, ScreensURL.Job_Grid);
    }
    public void DailyAgendaScreen_Open(){
        OpenPage(Daily_Agenda_button, ScreensURL.DailyAgenda);
    }
    public void Tasks_GridScreen_Open(){
        OpenPage(TasksJob_button, ScreensURL.Task_Grid);

    }

    public void Shipments_GridScreen_Open(){

        OpenPage(Shipments_button, ScreensURL.Shipment_Grid);
    }

    public void ClickOn_Quotation_button(){
        OpenPage(Quotations_button, ScreensURL.Quotation_Grid);

    }
    public void Transactions_GridScreen_Open(){
        OpenPage(Operations_button, ScreensURL.Transaction_Grid);

    }
    public void Warehouse_GridScreen_Open(){

        OpenPage(Warehouse_button, ScreensURL.Warehouse_Grid);
    }
    public void Opportunity_GridScreen_Open(){
        OpenPage(CRM_button, ScreensURL.Opportunity_Grid);

    }
    public void FinancialsScreen_Open(){

        OpenPage(Financials_button, ScreensURL.Financials);
    }
    public void ClickOn_Surveys_button(){
        OpenPage(Surveys_button, ScreensURL.Survey_Grid);

    }
    /*public void Job_GridScreen_JobSummary_Open(){
        Job_GridScreen_Open();
        click(By.linkText("738-1"));
        //String a = getExistText(By.xpath("//div[@class='col form__group form__group_lg']//span[@class='k-input']"));
        //String a = getExistText(By.xpath("/*//*[@aria-owns='mode_listbox']/*//*[@class='k-input']"));
        //String a = getExistText(By.xpath("/*//*[@id='type']//../*//*[@class='k-input']"));
       // String a = getAtributExistText(By.xpath("//ul[@id='booker_listbox']//li[@aria-selected='true']"));
        String a = getExistText(By.xpath("//ul[@id='booker_listbox']//li[@aria-selected='true']"));
        String b = getExistText(By.xpath("/*//*[@id='bookedContact']//../*//*[@class='k-input']"));
        System.out.println(a);
        System.out.println(b);
    }*/

}
