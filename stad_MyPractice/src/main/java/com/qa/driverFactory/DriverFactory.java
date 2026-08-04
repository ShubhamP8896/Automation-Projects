package com.qa.driverFactory;


import org.openqa.selenium.WebDriver;

import com.qa.exceptions.FrameworkException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class DriverFactory 
{
	private static final Logger logger = LogManager.getLogger(DriverFactory.class);
	
	/**
	 * Stores the WebDriver instance separately for each thread.
	 */
	private static final ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();
	
	/**
	 * Private constructor to prevent instantiation.
	 */
	private DriverFactory() 
	{
	    throw new AssertionError("DriverFactory class cannot be instantiated.");
	}
	
	/**
	 * Stores the WebDriver instance for the current thread.
	 *
	 * @param driver WebDriver instance to be associated with the current thread
	 */
	public static void setDriver(WebDriver driver)
	{
	    logger.info("WebDriver initialized for thread: {}", Thread.currentThread().getName());
		DRIVER.set(driver);
	}
	
	
	/**
	 * Returns the current thread's WebDriver instance.
	 *
	 * @return WebDriver associated with the current thread
	 */
	
	public static WebDriver getDriver()
	{
	    if (DRIVER.get() == null) 
	    {
	    	logger.error("Attempted to access WebDriver before initialization.");
	        throw new FrameworkException("WebDriver has not been initialized. Call initDriver() first.");
	    }
	    
	    logger.debug("Returning WebDriver for thread: {}", Thread.currentThread().getName());
		return DRIVER.get();
	}
	
	/**
	 * Close the single window
	 */
	public static void closeBrowser()
	{
		if(DRIVER.get() != null)
		{
			logger.info("Closing current browser window.");
			getDriver().close();
		}
	}
	
/**
 * Quit the browser, Close all open windows
 */
	public static void quitBrowser()
	{
		if(DRIVER.get() != null)
		{
			logger.info("Quitting browser session.");
			getDriver().quit();
			DRIVER.remove();
			logger.info("WebDriver removed from ThreadLocal.");
		}
	}	

}
