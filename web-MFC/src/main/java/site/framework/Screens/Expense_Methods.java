package site.framework.Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import site.framework.ApplicationManager.BasisMetods;

/**
 * Created by Lena on 30.08.2020.
 */
public class Expense_Methods extends BasisMetods {

    public Expense_Methods(WebDriver wd) {
        super(wd);
    }

    public void click_QuotationRef(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        click(By.xpath("//a[starts-with(@href, '/Quotation/Details/')]"));
    }
}
