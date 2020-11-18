package suitea;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reports.ExtentManager;
import testbase.TestBase;

public class TestA extends TestBase {

    @Test
    public void testA() throws InterruptedException {
        System.out.println("Starting A");
        test.log(Status.INFO,"Starting A");
        Thread.sleep(3000);
        System.out.println("Ending A");
        test.log(Status.INFO,"Ending A");
    }

}
