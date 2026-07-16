package com.qa.utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.qa.driverFactory.DriverFactory;

public class TakeScreenshotUtility 
{	
	public static WebDriver getDriver()
	{
		WebDriver driver = DriverFactory.getDriver();
		
		if(driver == null)
		{
			throw new ExceptionUtility("WebDriver is not initialized, Please initialize the webDriver");
		}
		
		return driver;
	}
	
	public static String getCurrentDateTime()
	{
		String dateTime = LocalDateTime.now().toString().replace(":", "_");	
		return dateTime;
	}
	
	public static void takeScreenshot(String path, String screenshotName)
	{	
		TakesScreenshot ts = (TakesScreenshot) getDriver();
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path + screenshotName+"_"+ Thread.currentThread().getId() + "_" + getCurrentDateTime()+".png");
		try 
		{
			FileHandler.copy(source, dest);
		} catch (IOException e) 
		{
			throw new ExceptionUtility("Failed to save screenshot.");
		}
	}
	
	public static void takeWebElementScreenshot(String path, String screenshotName, WebElement element)
	{
		File source = element.getScreenshotAs(OutputType.FILE);
		File dest = new File(path + screenshotName+"_"+ Thread.currentThread().getId() + "_" + getCurrentDateTime()+".png");
		
		try
		{
			FileHandler.copy(source, dest);
		}
		catch(IOException e)
		{
			throw new ExceptionUtility("Failed to save screenshot.");
		}
	}

}
