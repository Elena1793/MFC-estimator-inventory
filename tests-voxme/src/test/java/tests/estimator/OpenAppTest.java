package tests.estimator;

import org.testng.annotations.Test;
import configuration.Est_testCofig;

public class OpenAppTest implements Est_testCofig {

    @Test
    public void testAppOpened() {
        System.out.println("App opened");
        appEst.screenshot();
    }
}
