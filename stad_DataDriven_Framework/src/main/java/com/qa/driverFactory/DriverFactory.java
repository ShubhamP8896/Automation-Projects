package com.qa.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utilities.MyExceptions;

public class DriverFactory 
{
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static WebDriver initDriver_launchBrowser(String browserName)
	{
		if(driver == null || driver.equals(""))
		{
			throw new MyExceptions("Driver is Null");
		}
		
		switch(browserName.trim().toLowerCase())
		{
		case "chrome" : driver.set(new ChromeDriver());break;
		case "edge" : driver.set(new ChromeDriver());break;
		case "firefox" : driver.set(new ChromeDriver());break;
		default : throw new MyExceptions("Invalid browser name, Please provde the valid browser name");		
		}	
		System.out.println(browserName + "Browser launched successfully");
		return driver.get();
	}
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
	public static void closeBrowser()
	{
		if(driver.get()!=null)
		{
			getDriver().close();
		}
	}
	
	public static  void quiteBrowser()
	{
		if(driver.get()!=null)
		{
			getDriver().close();
			driver.remove();
		}
	}
}
