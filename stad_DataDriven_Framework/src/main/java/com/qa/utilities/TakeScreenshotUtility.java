package com.qa.utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.qa.driverFactory.DriverFactory;

public class TakeScreenshotUtility 
{
	private static String currentTime = LocalDateTime.now().toString().replace(":","_");	
	
	public WebDriver getDriver()
	{
		return DriverFactory.getDriver();
	}
	
	public void getScreenShot(String Screenshotname, String path)
	{
		try
		{
			TakesScreenshot ts = (TakesScreenshot) getDriver();
			File source = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(path+Screenshotname+"_"+ Thread.currentThread().getId() + "_" + currentTime+".png");
			FileHandler.copy(source, dest);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void getScreenshot_WebElement(String ScreenshotName, String path, WebElement ElementName)
	{
		try
		{
			File source = ElementName.getScreenshotAs(OutputType.FILE);
			File dest = new File(path+ScreenshotName+"_"+currentTime+Thread.currentThread().getId()+"_"+".png");
			FileHandler.copy(source, dest);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	

}