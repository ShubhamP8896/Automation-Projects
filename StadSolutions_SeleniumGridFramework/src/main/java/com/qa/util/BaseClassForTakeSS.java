package com.qa.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class BaseClassForTakeSS 
{
	  public static WebDriver driver;

	    public String captureScreen(String testName) throws IOException
	    {

	        String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH-mm-ss").format(new Date());

	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);

	        String screenshotsDir = System.getProperty("user.dir") + File.separator + "screenshots";
	        File dir = new File(screenshotsDir);

	        if (!dir.exists()) 
	        {
	            dir.mkdirs();   // 🔥 THIS LINE FIXES YOUR ERROR
	        }

	        String targetPath = screenshotsDir + File.separator
	                + testName + "_" + timeStamp + ".png";

	        FileHandler.copy(source, new File(targetPath));

	        return targetPath;
	    }
	    
}

