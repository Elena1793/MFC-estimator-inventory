package tests.inventory;
import org.testng.annotations.*;
import configuration.Inv_testConfig;


public class OpenAppTest implements Inv_testConfig {

    @Test
    public void testAppOpened() {
        System.out.println("App opened");
        appInv.screenshot();
    }
}
