package ExpentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

    private static ExtentReports extent;

    private static ExtentTest extentTest;

    public void onTestStart(ITestResult result){
        extentTest = extent.createTest(result.getMethod().getMethodName());

    }

    public void onTestFailure(ITestResult result){
        extentTest.log(Status.FAIL, "Test Case" + result.getMethod().getMethodName() + "Has Failed");

    }

    public void onTestSuccess(ITestResult result){

    }

    public void onTestSkipped(ITestResult result){

    }

    public void onFinish(ITestContext result){

    }

    public void onStart(ITestContext result){

    }


}
