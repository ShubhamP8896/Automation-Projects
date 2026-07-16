package com.qa.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.qa.driverFactory.DriverFactory;

public class BrowserUtility 
{
	public WebDriver getDriver()
	{
		WebDriver driver = DriverFactory.getDriver();

	    if (driver == null) {
	        throw new ExceptionUtility(
	            "WebDriver is not initialized. Please launch the browser first."
	        );
	    }

	    return driver;
	}

	public void launchUrl(String url)
	{
		if(url == null || url.isEmpty() || !(url.startsWith("http://") || url.startsWith("https://")))
		{
			throw new ExceptionUtility("Url is Invalid: " + url + ", Please provide valid Url");
		}	
		getDriver().get(url);
		System.out.println("Url launched Successfully");
	}
	
	public String getTitle()
	{
		return getDriver().getTitle();
	}
	
	public String getUrl()
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
	
	public void minimizeWindow()
	{
		getDriver().manage().window().minimize();
	}
	
	public void implicitWait(int timeInterval)
	{
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(timeInterval));
	}
	
	public void navigateGo(String url)
	{
		if(url == null || url.isEmpty() || !(url.contains("http")))
		{
			throw new ExceptionUtility("Url is Invalid: " + url + ", Please provide valid Url");
		}	
		getDriver().navigate().to(url);
	}
	
	public void navigateForward()
	{
		getDriver().navigate().forward();
	}
	
	public void navigateBackward()
	{
		getDriver().navigate().back();
	}
	
	public void navigateRefresh()
	{
	    getDriver().navigate().refresh();
	}
	
}
