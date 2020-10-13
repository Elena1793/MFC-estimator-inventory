package site.Data.WebElements;

import org.openqa.selenium.By;


/**
 * Created by user on 22.05.2018.
 */
public interface JobMenu_WebElements {

    By Job_Summary_button = By.xpath("//a[@key='JobSummary']");//By.linkText("Summary");
    By Job_Tasks_button = By.xpath("//a[@key='ClientFileMenu_Task_CFGrid_GET_Menu.ClientFile.JobTasks_']");//By.linkText("Job Tasks");
    By Job_Documents_button = By.xpath("//a[@key='ClientFileMenu_Document_CFGrid_GET_Menu.ClientFile.Documents_']");//By.linkText("Documents");
    By Job_CommunicationHistory_button = By.xpath("//a[@key='ClientFileMenu_Communication_CFGrid_GET_Menu.ClientFile.CommunicationHistory_']");//By.linkText("Communication History");
    By Job_Surveys_button = By.xpath("//a[@key='ClientFileMenu_Survey_ClientFileGrid_GET_Menu.ClientFile.Surveys_']");//By.linkText("Surveys");
    By Job_Quotations_button = By.xpath("//a[@key='ClientFileMenu_Quotation_ClientFileGrid_GET_Menu.ClientFile.Quotations_']");//By.linkText("Quotations");
    By Job_Shipments_button = By.xpath("//a[@key='ClientFileMenu_Shipment_ClientFileGrid_GET_Menu.Shipments_']");//By.linkText("Shipments");
    By Job_Operations_button = By.xpath("//a[@key='ClientFileMenu_Transaction_ClientFileGrid_GET_Menu.ClientFile.Operations_']");//By.linkText("Operations");
    By Job_Inventory_button = By.xpath("//a[@key='ClientFileMenu_PackingInventory_Inventory_GET_Menu.ClientFile.Inventory_']");//By.linkText("Inventory");
    By Job_Expenses_button = By.xpath("//a[@key='ClientFileMenu_Expense_ClientFileGrid_GET_Menu.ClientFile.Expenses_']");//By.linkText("Expenses");
    By Job_Invoices_button = By.xpath("//a[@key='ClientFileMenu_Invoice_ClientFileGrid_GET_Menu.ClientFile.Invoices_']");//By.linkText("Invoices");
    By Job_Warehouse_button = By.xpath("//a[@key='ClientFileMenu_Warehouse_CFGrid_GET_Menu.ClientFile.Warehouse_']");//By.linkText("Warehouse");
    By Job_SatisfactionSurvey_button = By.xpath("//a[@key='ClientFileMenu_SatisfactionSurvey_SatisfactionSurvey_GET_Menu.ClientFile.SatisfactionSurvey_']");//By.linkText("Satisfaction survey");
    By Job_Home_button = By.xpath("//a[@href='/Job/Grid']");//By.linkText("Home"); //a[@class='job-menu__item small-font']

    By Job_Menu_list = By.xpath("//*[@id='left-section']");//By.xpath("//*[@class='job-layout__menu']");


//ul[@id='newOperation']
}
