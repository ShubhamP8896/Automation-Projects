package com.qa_0001_BaseTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.driverFactory.DriverFactory;
import com.qa.pages.P0001_LoginPage;
import com.qa.pages.P0008_RecJobList;
import com.qa.utilities.BrowserUtility;
import com.qa.utilities.ConfigReader;

public class A002_BaseTestRecruiterModule 
{
	String browserName = ConfigReader.getProperty("browser");
	String ExcelFilePath = ConfigReader.getProperty("excelFilePath");
	String serverUrl = ConfigReader.getProperty("serverUrl");
	BrowserUtility bu = new BrowserUtility();
	P0001_LoginPage lp = new P0001_LoginPage();
	P0008_RecJobList recJobList = new P0008_RecJobList();
	
//	Now we are Getting the Test data from the Config.properties file Not from the Excel Sheet
	private static String recruiterUsername = ConfigReader.getProperty("recValidUsername");
	private static String recruiterPassword = ConfigReader.getProperty("recValidPassword");
	
//	Method for load the test data from the Excel File /:> For now not using this
//	private void loadTestData()
//	{
//	    recruiterUsername = ExcelUtility.getCellData(ExcelFilePath, "Test_Data", 1, 4);
//	    recruiterPassword = ExcelUtility.getCellData(ExcelFilePath, "Test_Data", 1, 5);
//	}
	
//	Method for initialize the Browser
	private void launchBrowser_initDriver()
	{
	    DriverFactory.launchBrowser_initDriver(browserName);
	    bu.MaximizeWindow();
	    bu.launchURL(serverUrl);
	}
	
//	Method for perform the login operation
	private void loginToServer()
	{
		lp.addUsername(recruiterUsername);
		lp.addPassword(recruiterPassword);
		lp.selectUserTypeRecruiter();
		lp.clickRememberMe();
		lp.clickloginButton();
	}
	
	/**
	 * 
	 * We used different methods and calling them in to the setUp method
	 * Because it's the standard practice to create the different methods and call them in to the setUp method.
	 * Do not write to much code in the setUp method
	 */
	
	@BeforeMethod
	public void setUp() throws IOException
	{
//		loadTestData();  For now not using this method because we are fetching the credentials from the Config.properties file
		launchBrowser_initDriver();
		loginToServer();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
	    try 
	    {
	        if (recJobList != null)
	        {
	            recJobList.clickLogout();
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
