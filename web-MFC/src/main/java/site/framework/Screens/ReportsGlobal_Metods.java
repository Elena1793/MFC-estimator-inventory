package site.framework.Screens;

import org.openqa.selenium.WebDriver;
import site.Data.WebElements.ReportsGlobalScreen_WebElements;
import site.Data.Resources.GlobalResources.ScreensURL;
import site.framework.ApplicationManager.BasisMetods;

/**
 * Created by user on 21.05.2018.
 */
public class ReportsGlobal_Metods extends BasisMetods implements ReportsGlobalScreen_WebElements {

    public ReportsGlobal_Metods(WebDriver wd){super(wd);}

    public void IteratorsScreen_Open(){
        OpenPage(Iterators_button, ScreensURL.Iterators);
    }
    public void VariablesScreen_Open(){
        OpenPage(Variables_button, ScreensURL.Variables);
    }
    public void TablesScreen_Open(){
        OpenPage(Tables_button, ScreensURL.Tables);
    }
    public void EnvelopesScreen_Open(){
        OpenPage(Envelopes_button, ScreensURL.Envelopes);
    }
}
