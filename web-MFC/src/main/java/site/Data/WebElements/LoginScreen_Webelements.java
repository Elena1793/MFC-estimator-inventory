package site.Data.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 15.05.2018.
 */
public interface LoginScreen_Webelements {


    By username_field = By.cssSelector("input#username");
    By password_field = By.cssSelector("input#password");
    By loginSubmit_button = By.cssSelector("button#loginSubmit");

}
