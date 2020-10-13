package site.Data.WebElements;

import org.openqa.selenium.By;

/**
 * Created by user on 23.05.2019.
 */
public interface SurveyDetails_WebElements {
    By Client_Field =By.xpath("//*[@id='client']");
    By Client_dropdown_List =By.xpath("//ul[@id='client_listbox']/li");
    By ClientFile_dropdown_list = By.xpath("//ul[@id='clientFile_listbox']/li");
    By JobRef_field = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
    By ClientFile_Field = By.xpath("//*[@aria-owns='clientFile_listbox']");
    By KeyboardDriven_ClientFile=By.xpath("//*[@class='k-animation-container']//*[@class='k-textbox']");
    By DeselectALL_JobRef=By.xpath("//div[@class='k-animation-container']//button[@id='filterClearBtn']");
    By ConfirmToStandalone_button = By.xpath("//button[@id='confirmToStandalone']");
    By ToStandaloneWindowClose = By.xpath("//a[@id='toStandaloneWindowClose']");
}
