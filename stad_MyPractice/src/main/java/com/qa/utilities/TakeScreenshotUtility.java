package com.qa.utilities;

import java.io.File;
import java.io.IOException;

import org.joda.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.qa.driverFactory.DriverFactory;

public class TakeScreenshotUtility 
{
	private static String timeStamp = LocalDateTime.now().toString().replace(":","_");
	
	public void takeScreenshot(String path , String screenshotName)
	{
		TakesScreenshot ts = (TakesScreenshot) DriverFactory.getDriver();
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path+screenshotName+ Thread.currentThread().getId() +timeStamp+".png");
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void takeWebElementScreenshot(String path , String screenshotName, WebElement eleName)
	{
		File source = eleName.getScreenshotAs(OutputType.FILE);
		File dest = new File(path+screenshotName+ Thread.currentThread().getId() +timeStamp+".png");
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
