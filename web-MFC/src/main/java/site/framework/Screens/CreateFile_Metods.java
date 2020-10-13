package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.Data.WebElements.CreateFile_WebElements;
import site.Data.WebElements.JobSummary_WebElements;
import site.Data.WebElements.MainMenu_WebElements;
import site.framework.ApplicationManager.BasisMetods;

import static site.Data.WebElements.JobGrid_WebElements.CreateNewContactButton;

/**
 * Created by user on 06.05.2018.
 */
public class CreateFile_Metods extends BasisMetods implements CreateFile_WebElements, JobSummary_WebElements,MainMenu_WebElements{


    public CreateFile_Metods(WebDriver wd) {
        super(wd);
    }

    public void CreateFile_NewClient(String source, String jobType, String mode, String serviceType, String serviceLevel,
                                     String firstName, String lastName,String email, String phone) {

        waitForElementByNOTvisibility(By.id("page-preloader"));
        OpenPage(MainMenu_WebElements.Jobs_button);
       // waitForElementByVisibility(By.xpath("//div[@id='jobsGridAndFilters']//*[@class='js-filter']"));
        //[@class='k-loading-mask']
        waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-mask']"));
        click(CreateNewContactButton);
        click(Private_button);
        click(Source_dropdown_button);
        dropdownSelectElement(source, Source_dropdown_List);
        click(JobType_dropdown);
        dropdownSelectElement(jobType, JobType_dropdown_List);
        type(FirstName_field,firstName);
        type(LastName_field, lastName);
        type(Email, email);
        type(Phone, phone);
        click(Create_button);
        allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        click(Mode_dropdown_button);
        dropdownSelectElement(mode,Mode_dropdown_List);
        click(ServiceType_dropdown_button);
        dropdownSelectElement(serviceType, ServiceType_dropdown_List);
        click(ServiceLevel_dropdown_button);
        dropdownSelectElement(serviceLevel, ServiceLevel_dropdown_List);

//        waitForElementByNOTvisibility(Popup_wrapper);

    }

}
