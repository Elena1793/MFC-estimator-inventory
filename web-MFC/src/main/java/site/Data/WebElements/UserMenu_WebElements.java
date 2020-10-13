package site.Data.WebElements;

import org.openqa.selenium.By;

/**
 * Created by user on 29.05.2018.
 */
public interface UserMenu_WebElements {
    By UserMenu_button = By.xpath("//*[@id=\"AccountMenu\"]");
    By Change_language = By.xpath("//ul[@id='AccountMenu']//*[@data-user-action=\"change\"]");//By.xpath("//*[@data-user-action='change']");
    By English_language = By.xpath("//*[@class='languages__item js-language'][@id='en-US']");  /*By.xpath("/*//*[@id='languageWindow']/*//*[@id='en-US']");*/
    By Franch_language = By.xpath("//*[@class='languages__item js-language'][@id='fr-FR']");   /*By.xpath("/*//*[@id='languageWindow']/*//*[@id='fr-FR']");*/ //*[@id='languageWindow']//*[@id='fr-FR'] By.xpath("//div[@id='fr-FR']");
    By German_language = By.xpath("//*[@class='languages__item js-language'][@id='de-DE']");  /*By.xpath("/*//*[@id='languageWindow']/*//*[@id='de-DE']");*/
    By Spanish_language = By.xpath("//*[@class='languages__item js-language'][@id='es-ES']");  /* By.xpath("/*//*[@id='languageWindow']/*//*[@id='es-ES']");*/
    By Russian_language = By.xpath("//*[@class='languages__item js-language'][@id='ru-RU']");  /*By.xpath("/*//*[@id='languageWindow']/*//*[@id='ru-RU']");*/
    By Portugal_language = By.xpath("//*[@class='languages__item js-language'][@id='pt-PT']");  /*By.xpath("/*//*[@id='languageWindow']/*//*[@id='pt-PT']");*/
    By Greek_language = /*By.xpath("/[@id='el-GR']");*/ By.xpath("//*[@class='languages__item js-language'][@id='el-GR']");//*[@id='languageWindow']//*[@id='el-GR']
    By English_UK_language = By.xpath("//*[@class='languages__item js-language'][@id='en-GB']");
    By Italian_Language = By.xpath("//*[@class='languages__item js-language'][@id='it-IT']");
    By Dutch_Language = By.xpath("//*[@class='languages__item js-language'][@id='nl-BE']");
    By Polish_Language = By.xpath("//*[@class='languages__item js-language'][@id='pl-PL']");
    By Romanian_Language = By.xpath("//*[@class='languages__item js-language'][@id='ro-RO']");

    //*[@class='account_menu']//span[contains(text(),'Change language')]
    //ul[@id='AccountMenu']/li[contains(text(),'Change language')]
    //ul[@id='AccountMenu']//*[contains(text(),'Change language')]

}
