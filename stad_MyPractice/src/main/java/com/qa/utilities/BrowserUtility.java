package com.qa.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.qa.driverFactory.DriverFactory;

public class BrowserUtility 
{
	public WebDriver getDriver()
	{
		return DriverFactory.getDriver();
	}
	
	public void launchUrl(String URL)
	{
		if(URL == null || URL.isEmpty() || !URL.startsWith("http"))
		{
			throw new MyExceptionUtility("URL is invalid, Please provide valid URL");
		}	
		getDriver().get(URL);
		System.out.println("URL Opened Successfully");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public String getTitle()
	{
		return getDriver().getTitle();
	}
	
	public String getCurrentPageURL()
	{
		return getDriver().getCurrentUrl();
	}
	
	
	
	
	
}
