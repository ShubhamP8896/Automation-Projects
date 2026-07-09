package com.qa_001_listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qa.utilities.TakeScreenshotUtility;
import com.qa_001_ExtentReportUtility.ExtentReportUtil;

public class TestLisners implements ITestListener
{
	
	private static ExtentReports extentReport = ExtentReportUtil.getExtent();
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
	private static String screenShotPath = System.getProperty("user.dir") + "\\reports\\" ;
	
	@Override
	public void onTestStart(ITestResult result) 
	{
	    ExtentTest extest = extentReport.createTest(result.getMethod().getMethodName());
	    test.set(extest);
	    System.out.println("Test execution is started");
	}
	
	@Override
	 public void onTestSuccess(ITestResult result)
    { 	
		 test.get().log(Status.PASS, "Test Passed");
		 TakeScreenshotUtility ts = new TakeScreenshotUtility();
		 ts.takeScreenshot(screenShotPath, result.getName());
	}
	
	@Override
	 public void onTestFailure(ITestResult result)
   { 	
		 test.get().log(Status.FAIL, "Test Failed");
	}
	
	@Override
	 public void onTestSkipped(ITestResult result)
   { 	
		 test.get().log(Status.SKIP, "Test Skipped");
	}
	
	@Override
	 public void onFinish(ITestContext context)
	{
		if(extentReport != null)
		{
			extentReport.flush();
			System.out.println("Execution Completed");
		}
	}

}
