package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.Data.WebElements.LoginScreen_Webelements;
import site.framework.ApplicationManager.ApplicationManager;
import site.framework.ApplicationManager.BasisMetods;


public class LoginScreen_Metods extends BasisMetods implements LoginScreen_Webelements{




    public LoginScreen_Metods(WebDriver wd) {

        super(wd);


    }

    public void login(String user, String password) {
        waitForElementByNOTvisibility(By.id("page-preloader"));
        type(username_field, user);
        type(password_field, password);
        click(loginSubmit_button);
        isPageOpened(ApplicationManager.main_Page);

    }







}
