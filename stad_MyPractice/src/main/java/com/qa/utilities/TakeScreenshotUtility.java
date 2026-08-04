package com.qa.utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.qa.driverFactory.DriverFactory;
import com.qa.exceptions.FrameworkException;

public final class TakeScreenshotUtility 
{
	private static final Logger logger = LogManager.getLogger(TakeScreenshotUtility.class);
	
/**
 * Restrict users to create an object, Because here for this class all the methods are static, So no need to create an Object
 */
	private TakeScreenshotUtility()
	{
		throw new AssertionError("TakeScreenshotUtility class cannot be instantiated.");
	}
	
//	To get the Webdriver instance
	private static WebDriver getDriver()
	{
		return DriverFactory.getDriver();
	}
//	Get the current date and time
	public static String getCurrentDateTime()
	{
		String dateTime = LocalDateTime.now().toString().replace(":", "_");
		return dateTime;
	}
//	Take full screenshot it will return the screenshot folder path it will helpful for the Extent Report
	public static String takeFullScreenshot(String screenshotPath, String screenshotName)
	{
	    try
	    {
	        TakesScreenshot ts = (TakesScreenshot) getDriver();
	        File source = ts.getScreenshotAs(OutputType.FILE);

	        String filePath = screenshotPath + screenshotName + "_"
	                + Thread.currentThread().getId() + "_"
	                + getCurrentDateTime() + ".png";

	        File dest = new File(filePath);
	        FileHandler.copy(source, dest);

	        logger.info("Screenshot taken and stored in the given path");

	        return dest.getAbsolutePath();   // Return the path
	    }
	    catch (IOException e)
	    {
	        logger.error("Unable to take screenshot");
	        throw new FrameworkException("Unable to take screenshot", e);
	    }
	}
//	Take webElement screenshot using webelement
	public static void takeWebElementScreenshot(String screenshotPath, String screenshotName, WebElement elementName)
	{
		try 
		{
			File source = elementName.getScreenshotAs(OutputType.FILE);
			File dest = new File(screenshotPath+screenshotName+"_"+Thread.currentThread().getId()+"_"+getCurrentDateTime()+".png"); 
			FileHandler.copy(source, dest);
		}
		catch(IOException e)
		{
			logger.error("Unable to take screenshot, please check the source and destination");
			throw new FrameworkException("Unable to take screenshot", e);
		}
	}
//	Take screenshot passing locater
	public static void takeWebElementScreenshot(String screenshotPath, String screenshotName, By locator)
	{
		try 
		{
			WebElement element = getDriver().findElement(locator);
			File source = element.getScreenshotAs(OutputType.FILE);
			File dest = new File(screenshotPath+screenshotName+"_"+Thread.currentThread().getId()+"_"+getCurrentDateTime()+".png"); 
			FileHandler.copy(source, dest);
		}
		catch(IOException e)
		{
			logger.error("Unable to take screenshot, please check the source and destination");
			throw new FrameworkException("Unable to take screenshot", e);
		}
	}
}
