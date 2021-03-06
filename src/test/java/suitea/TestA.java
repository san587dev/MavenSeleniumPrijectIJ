package suitea;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reports.ExtentManager;
import testDataProvider.TestDataProvider;
import testbase.TestBase;

public class TestA extends TestBase {

    @Test(dataProviderClass = TestDataProvider.class, dataProvider = "dataSuiteA")
    public void testA(String userName, String password) throws InterruptedException {

        log("Starting A");
        log(userName+"   "+ password);
        Thread.sleep(3000);
        log("Ending A");
    }



}
