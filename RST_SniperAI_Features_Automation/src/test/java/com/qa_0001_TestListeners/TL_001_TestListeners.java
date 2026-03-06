package com.qa_0001_TestListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qa.annotaions.TestCaseId;
import com.qa.utilities.ConfigReader;
import com.qa.utilities.ExcelUtility;
import com.qa.utilities.TakeScreenshotUtility;
import com.qa_0001_ExtentReportUtility.ExtentReportsUtility;

public class TL_001_TestListeners implements ITestListener
{
    private static ExtentReports extent = ExtentReportsUtility.getExtentReport();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    private static String screenshotPath = ConfigReader.getProperty("screenshotPath");
    private static String ExcelFilePath = ConfigReader.getProperty("excelFilePath");
    private static String excelSheetName;   // we are fetching the sheet name from the testNG xml file

    TakeScreenshotUtility screenshotUtil = new TakeScreenshotUtility();

/**
 * Once the test is start then we get the sheet name it will execute only single time after the test is started.
 */
    @Override
    public void onStart(ITestContext context)
    {
    	excelSheetName = context.getCurrentXmlTest().getParameter("sheetName");    
    	System.out.println("Excel Sheet Name: " + excelSheetName);
    }
    
/**
 * On the testStart the report is started to gerate.    
 */
    @Override
    public void onTestStart(ITestResult result)
    {
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
        System.out.println("Test execution is started");
    }

    /**
     * On the test success the we get the result and write the results in the excel sheet and fill the colour
     */
    @Override
    public void onTestSuccess(ITestResult result)
    {
    	/**
    	 * Here we get the status of the result 
    	 */
    	
        test.get().log(Status.PASS, "Test Passed");

        
        /**
         * For now we are not capturing the screenshot after the success
         */
//        try
//        {
//        	screenshotUtil.takeScreenshots(screenshotPath, result.getMethod().getMethodName());
//        	System.out.println("Success Screenshot Added in the Folder");
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
    
        
///     TO read the test case ID from the test class for write the results
        TestCaseId TC = result.getMethod()
        						.getConstructorOrMethod()
        							.getMethod()
        								.getAnnotation(TestCaseId.class);
        
        String testCaseId = TC.value();   // we stored that in the string
        
        System.out.println("Test Case Id: " + testCaseId);
        
//      This is the static method we used to get the row number according to the test case ID.
        
        int rowNum = ExcelUtility.getRowNumberByTestCaseID(ExcelFilePath, "LoginPage_Validation", testCaseId);
        
        ExcelUtility.setCellData(ExcelFilePath, excelSheetName, rowNum, 3, testCaseId + ": Passed");
        ExcelUtility.fillGreenColor(ExcelFilePath, excelSheetName, rowNum, 3);
        
        System.out.println("Success result added in the sheet");
    }

    /**
     * On the test failure this method is used, in this we capturing the screenshot and Added the test results in the 
     * Excel sheet as per the passed test case ID and Excel sheet name
     */

    @Override
    public void onTestFailure(ITestResult result)
    {
    	/**
    	 * Here we get the status of the result 
    	 */
        test.get().log(Status.FAIL, result.getThrowable());
/**
 * Capture the screenshot
 */
        try
        {
        	screenshotUtil.takeScreenshots(screenshotPath, result.getMethod().getMethodName());
        	System.out.println("Failure Screenshot Added in the Folder");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        /**
    	 * Here we get the Test case ID and we stored that in the string and using the static methods we get the row number
    	 * and added the status in the sheet
    	 */        
        
        TestCaseId TC = result.getMethod()
				.getConstructorOrMethod()
					.getMethod()
						.getAnnotation(TestCaseId.class);

        String testCaseId = TC.value();

        System.out.println("Test Case Id: " + testCaseId);
        
        int rowNum = ExcelUtility.getRowNumberByTestCaseID(ExcelFilePath, "LoginPage_Validation", testCaseId);

        ExcelUtility.setCellData(ExcelFilePath, excelSheetName, rowNum, 3, testCaseId + ": Failed");
        ExcelUtility.fillRedColor(ExcelFilePath, excelSheetName, rowNum, 3);
        
        System.out.println("Failere result added in the sheet");
    }


    @Override
    public void onTestSkipped(ITestResult result)
    {
        test.get().log(Status.SKIP, "Test Skipped");
        
        
        TestCaseId TC = result.getMethod()
				.getConstructorOrMethod()
					.getMethod()
						.getAnnotation(TestCaseId.class);

        String testCaseId = TC.value();
        
        System.out.println("Test Case Id: " + testCaseId);

        int rowNum = ExcelUtility.getRowNumberByTestCaseID(ExcelFilePath, "LoginPage_Validation", testCaseId);

        ExcelUtility.setCellData(ExcelFilePath, excelSheetName, rowNum, 3, testCaseId + ": SKIPPED");
        ExcelUtility.fillRedColor(ExcelFilePath, excelSheetName, rowNum, 3);
        
        System.out.println("Skipped result added in the sheet");
    }


    @Override
    public void onFinish(ITestContext context)
    {
        extent.flush();
        System.out.println("Test executions is completed");
    }

}