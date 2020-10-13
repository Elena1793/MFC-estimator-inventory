package configuration;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.*;
import site.Data.Resources.GlobalResources.*;
import site.framework.ApplicationManager.ApplicationManager;
import static site.Data.WebElements.UserMenu_WebElements.*;

/**
 * Created by Lena on 21.06.2020.
 */
public interface MFC_testConfig {
    By locatorlanguage = English_language;
    ApplicationManager appMFC =
            new ApplicationManager(BrowserType.CHROME, Version.development, MainPageType.Management,locatorlanguage);
    @BeforeClass
    default void setUp() throws Exception {
        appMFC.init();
        appMFC.getLoginScreen_Metods().login("testuser4", "");
        // appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
    }
  /* protected final ApplicationManager appMFC =
           new ApplicationManager(BrowserType.CHROME, Version.development, MainPageType.Job_Grid,locatorlanguage);
    @BeforeClass
    public void setUp() throws Exception {
        appMFC.init();
        appMFC.getLoginScreen_Metods().login("gblinerstest1", "Gblinerstest1");

    }*/

   //@AfterClass
    public default void tearDown() {
        appMFC.stop();
    }




}
