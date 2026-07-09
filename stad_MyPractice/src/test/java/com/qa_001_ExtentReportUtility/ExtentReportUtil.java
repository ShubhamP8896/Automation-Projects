package com.qa_001_ExtentReportUtility;

import java.time.LocalDateTime;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUtil
{

	private static ExtentSparkReporter sparkReporter;
	private static ExtentReports extentReports;
	
	public static ExtentReports getExtent()
	{
		if(extentReports == null)
		{
			String timeStamp = LocalDateTime.now().toString().replace(":", "_");
			String reportName = "Automation_TestReport-" + timeStamp + ".html";
			
			sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "\\reports\\" + reportName);
			sparkReporter.config().setDocumentTitle("Functionality Testing Report");
			sparkReporter.config().setReportName("Automation Testing Report");
			sparkReporter.config().setTheme(Theme.STANDARD);
			
			extentReports =  new ExtentReports();
			extentReports.attachReporter(sparkReporter);
			extentReports.setSystemInfo("QA Name", "Shubham Pawar");
			extentReports.setSystemInfo("Computer Name", "Localhost");
			extentReports.setSystemInfo("Environment", "QA-UAT");
			extentReports.setSystemInfo("Tester", "Shubham Pawar");
			extentReports.setSystemInfo("OS", "Windows 11");
			extentReports.setSystemInfo("Browser", "Chrome");
		}
		
		return extentReports;
	}
	

}
