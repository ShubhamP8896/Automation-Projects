package com.qa.testClasses;

import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.configReader.ConfigReader;
import com.qa.driverFactory.DriverFactory;
import com.qa.pages.P0001_LoginPage;
import com.qa.utilities.BrowserUtility;
import com.qa.utilities.TakeScreenshotUtility;

public class TC0001_VerifyLogin 
{	
	P0001_LoginPage lp = new P0001_LoginPage();
	BrowserUtility bu = new BrowserUtility();
	TakeScreenshotUtility ts = new TakeScreenshotUtility();
	private String screenshotPath = ConfigReader.getProperties("screenshotPath");
	
	@Parameters({"browserName"})
	@BeforeMethod()
	public void setUp(String browserName)
	{
		DriverFactory.initDriver_launchBrowser(browserName);
		bu.maximizeWindow();
		bu.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		bu.implycitWait(10);
	}
	
	@Test
	public void verifyLoginPage()
	{
		lp.addUserName("shubham");
		lp.addPassword("test@123");
		bu.getCurrentPageUrl();
		
		if(bu.getCurrentPageUrl().contains("opencart"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		ts.getScreenShot("l", screenshotPath);
	}
	
}
