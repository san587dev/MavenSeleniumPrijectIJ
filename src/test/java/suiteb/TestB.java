package suiteb;

import org.testng.annotations.Test;
import testDataProvider.TestDataProvider;
import testbase.TestBase;

public class TestB extends TestBase {

    @Test(dataProviderClass = TestDataProvider.class,dataProvider = "dataSuiteB")
    public void testB(String userName, String password) throws InterruptedException {
        log("Starting B");
        log(userName+"  "+password);
        Thread.sleep(3000);
        log("Ending B");
    }
}
