package listener;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener
{
    public void onTestFailure(ITestResult result)
    {
        System.out.println("*********************************Test Failed");
        System.out.println(" Faild test name is: "+result.getName());
        System.out.println(result.getStatus());
        System.out.println(result.getThrowable().getMessage());

        ExtentTest test =(ExtentTest) result.getAttribute("reporter");
        System.out.println("Result "+ result);
        System.out.println("Result "+ result.getThrowable());

    }

    public void onTestSuccess(ITestResult result)
    {
        System.out.println("Test Passed#################################");
        System.out.println(result.getName());

        ExtentTest test =(ExtentTest) result.getAttribute("reporter");
        test.log(Status.PASS,"Test Passed "+ result.getName());

    }

    public void onTestSkipped(ITestResult result)
    {
        ExtentTest test = (ExtentTest) result.getAttribute("reporter");
        test.log(Status.SKIP, "Test Skipped"+ result.getName());
    }


}
