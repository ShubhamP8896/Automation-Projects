package com.qa.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.qa.driverFactory.DriverFactory;
import com.qa.exceptions.FrameworkException;

public final class BrowserUtility 
{
	private static final Logger logger = LogManager.getLogger(BrowserUtility.class);
//	To get the Webdriver instance
	private WebDriver getDriver()
	{
		return DriverFactory.getDriver();
	}
	
//	Launch the url
	public void launchUrl(String url)
	{
		if(url == null || url.trim().isEmpty() || (!url.startsWith("http")))
		{
			logger.error("Provided url is not valid");
			throw new FrameworkException("Invalid URL: " + url + " | Please check and provide valid url");
		}
		logger.info("Launching URL: {}", url);
		getDriver().get(url);
	}
	
//	Delete cookies
	public void deleteCookies()
	{
		getDriver().manage().deleteAllCookies();
	}
	
//	Maximize the screen
	public void maximizeWindow()
	{	
		logger.info("Maximizing the window");
		getDriver().manage().window().maximize();
	}
	
//	Minimize the Screen
	public void minimizeWindow()
	{
		logger.info("Minimizing the window");
		getDriver().manage().window().minimize();
	}
	
//	to get page title
	public String getPageTitle()
	{
		return getDriver().getTitle();
	}
	
//	to get current page url
	public String getCurrentUrl()
	{
		return getDriver().getCurrentUrl();
	}
	
//	to get page Source
	public String getPageSource()
	{
		return getDriver().getPageSource();
	}
	
/**
 * Navigate to methods : 1} naviagte().to() : Redirected to new url
 * 2} Refresh the page 3} Forward 4} Backward 
 */
	public void navigateTo(String url)
	{
		if(url == null || url.trim().isEmpty() || (!url.startsWith("http")))
		{
			logger.error("Provided url is not valid");
			throw new FrameworkException("Invalid URL: " + url + " | Please check and provide valid url");
		}
		
		logger.info("Navigating to given url: " + url);
		getDriver().navigate().to(url);
	}
	public void navigateRefresh()
	{
		logger.info("Refreshing the page");
		getDriver().navigate().refresh();
	}
	public void navigateForward()
	{
		logger.info("Navigating to forward");
		getDriver().navigate().forward();
	}
	public void navigateBackward()
	{
		logger.info("Navigating to backward");
		getDriver().navigate().back();
	}

}
