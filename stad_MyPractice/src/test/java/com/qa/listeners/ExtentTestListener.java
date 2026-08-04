package com.qa.listeners;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qa.configReader.ConfigReader;
import com.qa.utilities.TakeScreenshotUtility;

public final class ExtentTestListener implements ITestListener
{
	private static ExtentReports extent = ExtentReportManager.getExtentReport();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    private static String screenshotPath = ConfigReader.getProperty("screenshots_FilePath");
    private static String ExcelFilePath = ConfigReader.getProperty("excelFilePath");
    private static final Logger logger = LogManager.getLogger(ExtentTestListener.class);
    
    public void onStart(ITestContext context)
    {
    	logger.info("Regression execution started");
    }
    
    public void onTestStart(ITestResult result) 
    {
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
        logger.info("Test Execution is started");
    }
    
    @Override
    public void onTestSuccess(ITestResult result)
    {
    	test.get().log(Status.PASS, "Test Passed");
    	logger.info(
    			"Test case passed: {}",
    			result.getMethod().getMethodName()
    			);
    	test.remove();
    }
    
    @Override
    public void onTestFailure(ITestResult result)
    {
    	test.get().log(Status.FAIL, "Test Failed");
    	test.get().fail(result.getThrowable());
    	logger.info("Test Case failed: {}", result.getMethod().getMethodName());
    	String path = TakeScreenshotUtility.takeFullScreenshot(
                screenshotPath,
                result.getMethod().getMethodName());
    	
    	test.get().addScreenCaptureFromPath(path); 
    	test.remove();
    }
    
    @Override
    public void onTestSkipped(ITestResult result)
    {
    	test.get().log(Status.SKIP, "Test Skipped");
    	logger.info("Test Case is skipped: " + result.getMethod().getMethodName());
    	TakeScreenshotUtility.takeFullScreenshot(screenshotPath, result.getMethod().getMethodName());
    	test.remove();
    }
    
    @Override
    public void onFinish(ITestContext context)
    {
        extent.flush();
        logger.info("Test execution is completed");
    }
    

}
