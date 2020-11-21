package testbase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import reports.ExtentManager;

public class TestBase {
    public ExtentReports rep;
    public ExtentTest test;
    public SoftAssert softAssert;

    @BeforeMethod
    public void init(ITestResult result) {
        System.out.println(result.getMethod().getMethodName().toUpperCase());
        rep = ExtentManager.getReports();

        test = rep.createTest(result.getMethod().getMethodName().toUpperCase());
        //result.getTestContext().setAttribute("fruit", "Mango");

        softAssert = new SoftAssert();

    }

    @AfterMethod
    public void quit() {
        rep.flush();
        System.out.println("After method");
    }

    public void log(String msg) {
        test.log(Status.INFO, msg);
    }

    public void logFailure(String msg)
    {
        System.out.println(msg);
        test.log(Status.FAIL, msg);
    }

    public void setSoftAssert(String msg)
    {
        logFailure(msg);
        softAssert.fail(msg);
    }




}
