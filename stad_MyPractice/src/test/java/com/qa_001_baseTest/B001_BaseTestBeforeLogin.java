package com.qa_001_baseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;

import com.qa.driverFactory.DriverFactory;
import com.qa.utilities.BrowserUtility;
import com.qa.utilities.ConfigReader;

public class B001_BaseTestBeforeLogin 
{
	BrowserUtility bu = new BrowserUtility();
	private final String url = ConfigReader.getConfigValue("practiceServerUrl");
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser)
	{
		DriverFactory.initDriver_launchBrowser(browser);
		bu.launchUrl(url);
	}
	
	@AfterClass
	public void tearDown()
	{
		DriverFactory.quitBrowser();
	}

}
