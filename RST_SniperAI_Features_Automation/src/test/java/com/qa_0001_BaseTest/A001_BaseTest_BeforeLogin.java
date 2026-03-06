package com.qa_0001_BaseTest;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.driverFactory.DriverFactory;
import com.qa.utilities.BrowserUtility;
import com.qa.utilities.ConfigReader;
import com.qa.utilities.ExcelUtility;
import com.qa.utilities.TakeScreenshotUtility;

public class A001_BaseTest_BeforeLogin 
{
	String broserName = ConfigReader.getProperty("browser");
	String serverUrl = ConfigReader.getProperty("serverUrl");
	BrowserUtility bu = new BrowserUtility();
	ExcelUtility excel = new ExcelUtility();
	TakeScreenshotUtility tss = new TakeScreenshotUtility();
	
	
	@BeforeMethod
	public void setUp()
	{
		DriverFactory.launchBrowser_initDriver(broserName);
		System.out.println("Browser Launched Successfully");
		
		bu.MaximizeWindow();
		bu.launchURL(serverUrl);
	}
	
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		DriverFactory.quitDriver();
	}
}
