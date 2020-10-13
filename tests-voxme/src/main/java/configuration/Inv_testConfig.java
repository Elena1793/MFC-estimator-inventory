package configuration;

import invTestManager.ApplicationManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;
import java.lang.reflect.Method;
import java.net.MalformedURLException;


/**
 * Created by Lena on 21.06.2020.
 */
public interface Inv_testConfig {
    Logger logger = LoggerFactory.getLogger(Inv_testConfig.class);

     ApplicationManager appInv = new ApplicationManager();

    @BeforeSuite
    default void setUp() throws MalformedURLException {
        appInv.start();
    }

    @BeforeMethod
    default void logTestStart(Method m) {
        logger.info("Start test " + m.getName());
    }

    @AfterMethod
    default void logTestStop(Method m) {
        logger.info("Stop test " + m.getName());
    }

    @AfterSuite
    default void tearDown() {
        appInv.stop();
    }
}
