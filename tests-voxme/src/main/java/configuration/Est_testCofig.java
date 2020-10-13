package configuration;

import estTestManager.ApplicationManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

/**
 * Created by Lena on 21.06.2020.
 */
public interface Est_testCofig {

        Logger logger = LoggerFactory.getLogger(Est_testCofig.class);

         ApplicationManager appEst = new ApplicationManager();

        @BeforeSuite
        default void setUp() throws MalformedURLException { appEst.start(); }

        @BeforeMethod
        default void logTestStart(Method m){
            logger.info("Start test " + m.getName());
        }

        @AfterMethod
        default void logTestStop(Method m){
            logger.info("Stop test " + m.getName());
        }

//    @AfterSuite
//    public void tearDown() {
//        app.stop();
//    }
    }


