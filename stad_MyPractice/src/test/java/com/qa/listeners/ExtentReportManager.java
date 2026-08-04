package com.qa.listeners;

import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.qa.configReader.ConfigReader;

public final class ExtentReportManager 
{
	private static ExtentReports extentReports;
	private static ExtentSparkReporter sparkReporter;
	private static final String extentReportPath = ConfigReader.getProperty("extentReportPath");
    private static final Logger logger = LogManager.getLogger(ExtentReportManager.class);
	
	public synchronized static String getCurrentDateTime()
	{
		return LocalDateTime.now().toString().replace(":","_");
	}
	
	public synchronized static ExtentReports getExtentReport()
	{
		if(extentReports == null)
		{
			logger.info("Initializing Extent Report...");
			sparkReporter = new ExtentSparkReporter(extentReportPath+"_"+"Automation_Test_Execution"+getCurrentDateTime()+".html");
			sparkReporter.config().setDocumentTitle("Automation Test Report");
			sparkReporter.config().setReportName("Regression Test Report");
			sparkReporter.config().setTheme(Theme.DARK);
			
			extentReports = new ExtentReports();
			extentReports.attachReporter(sparkReporter);
			extentReports.setSystemInfo("Computer Name", "Localhost");
            extentReports.setSystemInfo("Environment", "QA-UAT");
            extentReports.setSystemInfo("Tester", "Shubham Pawar");
            extentReports.setSystemInfo("OS", "Windows 11");
            extentReports.setSystemInfo("Browser", "Chrome");
		}
		return extentReports;
	}

}
