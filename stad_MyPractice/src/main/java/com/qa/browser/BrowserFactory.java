package com.qa.browser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.exceptions.FrameworkException;

public class BrowserFactory 
{
	private static final Logger logger = LogManager.getLogger(BrowserFactory.class);
	
	/**
	 * Private constructor to prevent object creation.
	 */
	private BrowserFactory() 
	{
	    throw new AssertionError("BrowserFactory cannot be instantiated.");
	}
	
	/**
	 * Creates and returns a browser instance based on the
	 * specified browser type and execution options.
	 *
	 * @param browserType Browser to be launched
	 * @param headless    Enables headless execution
	 * @param incognito   Enables private/incognito mode
	 * @return Configured WebDriver instance
	 */
	public static WebDriver launchBrowser(BrowserType browserType, boolean headless, boolean incognito)
	{
		if(browserType == null)
		{
		    throw new FrameworkException("BrowserType cannot be null.");
		}
		
		logger.info("Launching browser: {}", browserType);
	    logger.info("Headless Mode : {}", headless);
	    logger.info("Incognito Mode: {}", incognito);
	    
	    switch(browserType)
	    {
	    case CHROME: 
	    	logger.debug("Creating Chrome browser instance.");
	    	return createChromeDriver(headless, incognito); 
	    case FIREFOX:
            logger.debug("Creating Firefox browser instance.");
            return createFirefoxDriver(headless, incognito);

        case EDGE:
            logger.debug("Creating Edge browser instance.");
            return createEdgeDriver(headless, incognito);

        case SAFARI:
            logger.debug("Creating Safari browser instance.");
            if (headless || incognito) {
                logger.warn("Safari does not support the requested execution options.");
            }
            return new SafariDriver();

        default:
            logger.error("Unsupported browser requested: {}", browserType);
            throw new FrameworkException("Unsupported Browser : " + browserType);
	    }
	    
	}
	
	
	/**
	 * Creates a Chrome WebDriver with the required options.
	 *
	 * @param headless  enables headless mode
	 * @param incognito enables incognito mode
	 * @return configured ChromeDriver
	 */
	private static WebDriver createChromeDriver(boolean headless, boolean incognito)
	{
		logger.info("Configuring Chrome browser options.");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		if(headless)
		{
			options.addArguments("--headless=new");
			logger.debug("Enabling Chrome headless mode.");
		}
		if(incognito)
		{
			options.addArguments("--incognito");
			logger.debug("Enabling Chrome incognito mode.");
		}
		return new ChromeDriver(options);
	}
	
	/**
	 * Creates a Firefox WebDriver with the required options.
	 *
	 * @param headless  enables headless mode
	 * @param incognito enables private browsing mode
	 * @return configured FirefoxDriver
	 */
	private static WebDriver createFirefoxDriver(boolean headless, boolean incognito)
	{
		logger.info("Configuring Firefox browser options.");
		
		FirefoxOptions options = new FirefoxOptions();
		if(headless)
		{
			options.addArguments("--headless");
			logger.debug("Enabling Firefox headless mode.");
		}
		if(incognito)
		{
			options.addArguments("--incognito");
			logger.debug("Enabling Firefox incognito mode.");
		}
		return new FirefoxDriver(options);
	}
	
	/**
	 * Creates an Edge WebDriver with the required options.
	 *
	 * @param headless  enables headless mode
	 * @param incognito enables InPrivate browsing mode
	 * @return configured EdgeDriver
	 */
	private static WebDriver createEdgeDriver(boolean headless, boolean incognito)
	{
		logger.info("Configuring Edge browser options.");
		EdgeOptions options = new EdgeOptions();
		
		if(headless)
		{
			options.addArguments("--headless=new");
			logger.debug("Enabling Edge headless mode.");
		}
		if(incognito)
		{
			options.addArguments("--incognito");
			logger.debug("Enabling Edge incognito mode.");
		}
		return new EdgeDriver(options);
	}
	
	
}
