package com.qa_001_baseTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.driverFactory.DriverFactory;
import com.qa.utilities.BrowserUtility;

public class B0001_BeforeLoginBaseTest 
{
	
	BrowserUtility bu = new BrowserUtility();
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String BrowserName)
	{
		DriverFactory.launchBrowser_initDriver(BrowserName);
		bu.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		DriverFactory.quitBrowser();
	}

}
