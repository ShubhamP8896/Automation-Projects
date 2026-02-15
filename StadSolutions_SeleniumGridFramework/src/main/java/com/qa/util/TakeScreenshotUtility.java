package com.qa.util;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.qa.factory.DriverFactory;

public class TakeScreenshotUtility
{
//	private WebDriver driver;
///	This is the constructor we used and passed webDriver into the argument because we need to use that same in the main test class
//	public TakeScreenshotUtility(WebDriver driver)
//	{
//		this.driver = driver;
//	}
	
	private WebDriver getDriver() 
	{
        return DriverFactory.getDriver();
    }
	
	/**
	 * @param screenshotName : We need to pass the name which we are giving to the screenshot in the string
	 * 1) For the full page screenshot 
	 */
	public void takeScreenshots(String path, String screenshotName)
	{
		try 
		{
		String dateAndTime = LocalDateTime.now().toString().replace(":", "_");
		TakesScreenshot ts = (TakesScreenshot) getDriver();
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File (path+screenshotName+"_"+dateAndTime+".png");
		FileHandler.copy(source, destination);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void takeWebElementScreenshot(String path, WebElement elementName, String screenshotName)
	{
		try 
		{
		String dateAndTime = LocalDateTime.now().toString().replace(":", "_");
		File source = elementName.getScreenshotAs(OutputType.FILE);
		File destination = new File (path+screenshotName+"_"+dateAndTime+".png");
		FileHandler.copy(source, destination);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
