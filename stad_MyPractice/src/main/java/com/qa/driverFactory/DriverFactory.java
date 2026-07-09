package com.qa.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.utilities.MyExceptionUtility;

public class DriverFactory 
{
	static private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static WebDriver launchBrowser_initDriver(String browser)
	{
		if(browser == null || browser.isEmpty())
		{
			throw new MyExceptionUtility("Browser Name is Empty, Please provide valid browser Name");
		}
		
		switch(browser.trim().toLowerCase())
		{
		case "chrome": driver.set(new ChromeDriver()); break;
		case "firefox": driver.set(new FirefoxDriver()); break;
		case "edge" : driver.set(new EdgeDriver()); break;
		
		default: throw new MyExceptionUtility("Please provide the valid browser name");
		}
		return driver.get();
	}
	
	public static WebDriver getDriver()
	{
		if(driver.get() == null)
	    {
	        throw new RuntimeException("WebDriver is not initialized. Call launchBrowser_initDriver() first.");
	    }
		return driver.get();
	}
	
	public static void closeBrowser()
	{
		if(getDriver() != null)
		{
		    getDriver().close();
		}
	}
	
	public static void quitBrowser()
	{
		if(getDriver()!=null)
		{
			getDriver().quit();
			driver.remove();
		}
	}
}
