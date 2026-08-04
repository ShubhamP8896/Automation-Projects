package com.qa.baseTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.browser.BrowserFactory;
import com.qa.browser.BrowserType;
import com.qa.driverFactory.DriverFactory;
import com.qa.utilities.BrowserUtility;
import com.qa.utilities.WaitsUtility;

public class BaseTestClass 
{
	BrowserUtility bu = new BrowserUtility();
	WaitsUtility wt = new WaitsUtility();
	
//	@Parameters({"browserName"})  Enable this if you want to pass the browser from the TestNG XML File and add the String browserName in the setupMetho
	@BeforeMethod
	public void setUp()
	{
//		Use this if your using the parameters annotation and passing the browserName from the TestNG XML file
//		BrowserType browserType = BrowserType.valueOf(browserName.toUpperCase());
//		WebDriver driver = BrowserFactory.launchBrowser(browserType, false, false);
		
//		Comment Out below code if you have to pass the browser Name from the testNG XML file
		
		WebDriver driver = BrowserFactory.launchBrowser(BrowserType.CHROME, false, false);
		DriverFactory.setDriver(driver);
		bu.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		bu.maximizeWindow();
		wt.implicitWait(10);
	}
	
	@AfterMethod
	public void tearDown()
	{
		DriverFactory.quitBrowser();
	}

}
