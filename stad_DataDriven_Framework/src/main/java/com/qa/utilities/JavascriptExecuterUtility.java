package com.qa.utilities;

import org.openqa.selenium.WebDriver;

import com.qa.driverFactory.DriverFactory;

public class JavascriptExecuterUtility 
{
	public WebDriver getDriver()
	{
		return DriverFactory.getDriver();
	}
	
	

}
