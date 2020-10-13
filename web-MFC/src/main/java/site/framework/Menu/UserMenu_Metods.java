package site.framework.Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.Data.WebElements.MainMenu_WebElements;
import site.Data.WebElements.UserMenu_WebElements;
import site.framework.ApplicationManager.BasisMetods;

/**
 * Created by user on 29.05.2018.
 */
public class UserMenu_Metods extends BasisMetods implements UserMenu_WebElements {
    By locator;
    public UserMenu_Metods (WebDriver wd){
        super(wd);
    }

    public UserMenu_Metods(WebDriver wd, By language) {
        super(wd);
        this.locator=language;
    }
    public void changeLanguage_byApp(){
        OpenUserMenu();
        click(Change_language);
        waitForElementByVisibility(By.xpath("//*[@class=\"language-popup\"]"));
        wd.switchTo().parentFrame().findElement(locator);
        ClickElementOnListByPoint(By.xpath("//*[@class=\"language-popup\"]"),locator);
        waitForElementByClickable_Locator(locator);
        click(locator);




    }


    public void changeLanguage(By locator){
        OpenUserMenu();
        click(Change_language);
        waitForElementByVisibility(By.xpath("//*[@class=\"language-popup\"]"));
        wd.switchTo().parentFrame().findElement(locator);
        ClickElementOnListByPoint(By.xpath("//*[@class=\"language-popup\"]"),locator);
        waitForElementByClickable_Locator(locator);
        click(locator);




    }

   /* public void ChangeLanguageOnTheCVMenu(By locator){
        OpenUserMenu();
        click(Change_language);
        waitForElementByVisibility(By.xpath("/*//*[@class=\"language-popup\"]"));
        wd.switchTo().parentFrame().findElement(locator);
        ClickElementOnListByPoint(By.xpath("/*//*[@class=\"language-popup\"]"),locator);
        waitForElementByClickable_Locator(locator);
        click(locator);




    }*/

    public void Close(By language){
        OpenUserMenu();
        click(Change_language);
        waitUntilIsLoadedCustomTime(wd.findElement(language),45);
        click(language);
        //click(Change_language);//data-user-action="change"
        //*[@class='language-popup'][@id='languagePopupClose']
       /*wd.switchTo().frame(wd.findElement(By.xpath("/*//*[@class='language-popup']")));
        waitForElementByClickable_Locator(wd.findElement(By.xpath("[@id='languagePopupClose']")));
        click(By.xpath("[@id='languagePopupClose']"));*/
        // wd.switchTo().parentFrame().findElement(locatorLanguage).click();
        //[@id='languageWindow'];

    }



    private void OpenUserMenu() {
        click(UserMenu_WebElements.UserMenu_button);
    }





    public boolean Check_changeLanguage(By language, By locatorListForCheck) {
        String checkString = concatListToString(locatorListForCheck);
        return CheckLanguage(checkString, language);
    }

    public String Check_LanguageOnMainMenu() {
        return concatListToString (MainMenu_WebElements.MainMenu_List);



    }


}
