package com.qa_0001_BaseTest;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.qa.driverFactory.DriverFactory;
import com.qa.pages.P0001_LoginPage;
import com.qa.pages.P0004_CanDashboard;
import com.qa.utilities.BrowserUtility;
import com.qa.utilities.ConfigReader;

public class A003_BaseTestCandidateModule 
{
	private static String broserName = ConfigReader.getProperty("browser");	
	private static String serverUrl = ConfigReader.getProperty("serverUrl");
//	Fetching the credentials from the Config.properties File
	private static String candidateUsername = ConfigReader.getProperty("canValidUsername");
	private static String CandidatePassword = ConfigReader.getProperty("canValidPassword");

	BrowserUtility bu = new BrowserUtility();
	P0001_LoginPage lp = new P0001_LoginPage();
	P0004_CanDashboard canDash = new P0004_CanDashboard();
	
	public void launchBrowser_InitDriver()
	{
		DriverFactory.launchBrowser_initDriver(broserName);		
		bu.MaximizeWindow();
		bu.launchURL(serverUrl);
	}
	public void loginToServer()
	{
		lp.addUsername(candidateUsername);
		lp.addPassword(CandidatePassword);
		lp.selectUserTypeCandidate();
		lp.clickRememberMe();
		lp.clickloginButton();		
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		launchBrowser_InitDriver();
		loginToServer();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		try
		{
			if(canDash != null)
			{
				canDash.clickLogout();
			}
		}
		catch (Exception e) 
	    {
	        System.out.println("Logout button is not found: " + e.getMessage());
	    }
	    finally 
	    {
	        DriverFactory.quitDriver();
	    }
	}

}
