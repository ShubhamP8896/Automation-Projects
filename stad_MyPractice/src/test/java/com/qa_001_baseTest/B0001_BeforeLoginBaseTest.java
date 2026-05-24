package com.qa_001_baseTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.driverFactory.DriverFactory;
import com.qa.utilities.BrowserUtility;

public class B0001_BeforeLoginBaseTest 
{
	BrowserUtility bu = new BrowserUtility();
	
	@BeforeMethod
	public void setUp()
	{
		DriverFactory.launchBrowser_initDriver("chrome");
		bu.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		DriverFactory.quitBrowser();
	}

}
