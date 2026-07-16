package com.qa_001_listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qa.annotaion.TestCaseId;
import com.qa.utilities.ConfigReader;
import com.qa.utilities.ExcelUtility;
import com.qa.utilities.TakeScreenshotUtility;
import com.qa_001_ExtentReportUtility.ExtentReport;

public class MyListeners implements ITestListener
{
	private static final ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
	private static ExtentReports extentReports = ExtentReport.getExtentReport();
	private static String screenshotPath = ConfigReader.getConfigValue("screenshot_Folder_Path");
	private static String ExcelFilePath = ConfigReader.getConfigValue("excel_File_path");
	private static String excelSheetName;
	
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
	 * On the testStart the report is started to generate.    
	 */
	@Override
    public void onTestStart(ITestResult result)
    {
        ExtentTest extentTest = extentReports.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
        System.out.println("Test execution is started");
    }
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		test.get().log(Status.PASS, "Test Passed");
		
///     TO read the test case ID from the test class for write the results
		TestCaseId TC = result.getMethod()
				.getConstructorOrMethod()
					.getMethod()
						.getAnnotation(TestCaseId.class);
		
		String testCaseId = TC.value();   // we stored that in the string
		System.out.println("Test Case Id: " + testCaseId);
		
		int rowNum = ExcelUtility.getRowNumberByTestCaseID(ExcelFilePath, excelSheetName, testCaseId);
		ExcelUtility.setDataIntoCell(ExcelFilePath, excelSheetName, rowNum, 3, testCaseId + " :Passed");	
		ExcelUtility.fillGreenColor(ExcelFilePath, excelSheetName, rowNum, 3);
		
		System.out.println("Passed result added in the sheet");
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		test.get().log(Status.FAIL, "Test Failed");
		TakeScreenshotUtility.takeScreenshot(screenshotPath, result.getMethod().getMethodName());
		System.out.println("Failure Screenshot Added in the Folder");
		
		///     TO read the test case ID from the test class for write the results
				TestCaseId TC = result.getMethod()
						.getConstructorOrMethod()
							.getMethod()
								.getAnnotation(TestCaseId.class);
				
				String testCaseId = TC.value();   // we stored that in the string
				System.out.println("Test Case Id: " + testCaseId);
				
				int rowNum = ExcelUtility.getRowNumberByTestCaseID(ExcelFilePath, excelSheetName, testCaseId);
				ExcelUtility.setDataIntoCell(ExcelFilePath, excelSheetName, rowNum, 3, testCaseId + " :Failed");	
				ExcelUtility.fillRedColor(ExcelFilePath, excelSheetName, rowNum, 3);
				
				System.out.println("Failere result added in the sheet");
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
		test.get().log(Status.SKIP, "Test Skipped");
		
///     TO read the test case ID from the test class for write the results
				TestCaseId TC = result.getMethod()
						.getConstructorOrMethod()
							.getMethod()
								.getAnnotation(TestCaseId.class);
				
				String testCaseId = TC.value();   // we stored that in the string
				System.out.println("Test Case Id: " + testCaseId);
				
				int rowNum = ExcelUtility.getRowNumberByTestCaseID(ExcelFilePath, excelSheetName, testCaseId);
				ExcelUtility.setDataIntoCell(ExcelFilePath, excelSheetName, rowNum, 3, testCaseId +  " : Skipped");	
				ExcelUtility.fillRedColor(ExcelFilePath, excelSheetName, rowNum, 3);
				
				System.out.println("Skipped result added in the sheet");
	}
		
	@Override
	public void onFinish(ITestContext context)
    {
        extentReports.flush();
        System.out.println("Test executions is completed");
    }	
}
