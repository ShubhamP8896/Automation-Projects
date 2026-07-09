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
	
	public void launchUrl(String url)
	{
		if(url == null || url.equals("") || !url.contains("http"))
		{
			throw new MyExceptions("Invalid URL, Need to provide valid URL");
		}
		getDriver().get(url);
		System.out.println("Url launched successfully");
	}
	
	public String getPageTitle()
	{
		return getDriver().getTitle();
	}
	
	public String getCurrentPageUrl()
	{
		return getDriver().getCurrentUrl();
	}
	
	public String getPageSource()
	{
		return getDriver().getPageSource();
	}
	
	public void maximizeWindow()
	{
		getDriver().manage().window().maximize();
	}
	
	public void implycitWait(int time)
	{
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	
}
