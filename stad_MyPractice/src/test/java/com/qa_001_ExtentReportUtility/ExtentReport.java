package com.qa_001_ExtentReportUtility;

import org.testng.ITestListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport implements ITestListener
{

	private static ExtentSparkReporter sparkReporter;
	private static ExtentReports extentReport;
	
	public static ExtentReports getExtentReport()
	{
		String reportName = "AutomationNaveen_" + System.currentTimeMillis() + ".html";
		
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+ "/Reports/" + reportName );
		sparkReporter.config().setDocumentTitle("NaveenAutomation");
		sparkReporter.config().setReportName("Automation_Test_Report");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extentReport = new ExtentReports();
		extentReport.attachReporter(sparkReporter);
		extentReport.setSystemInfo("QA Name", "Shubham Pawar");
		extentReport.setSystemInfo("Browser Name", "Chrome");
		extentReport.setSystemInfo("OS", "Windows");
		extentReport.setSystemInfo("Environment", "Preprod");
		extentReport.setSystemInfo("Test Suite", "Regression");
		
		return extentReport;
	}
	
	

}
