package design.sniperai.com_utility_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Design_Take_Screenshot_UtilityClass 
{
	    public static void takeScreenshot(WebDriver driver, String screenshotName) 
	    {
	    	 if (driver == null) 
	    	 {
	             System.out.println("WebDriver is null. Cannot take screenshot.");
	             return;	    	
	    	 }
	        // Convert WebDriver object to TakeScreenshot (Casting)
	        TakesScreenshot ts = (TakesScreenshot) driver;

	        // Capture screenshot as File object
	        File screenshotFile = ts.getScreenshotAs(OutputType.FILE);

	        // Define the destination file path with proper file separator
	        String destinationFilePath = "C:\\Users\\Shubz008\\Desktop\\Dev_Preprod_Sanity_Automation Data\\Sanity_Testing_Screenshots\\1.design.sniperai.com_Sanity_SS\\" + screenshotName + ".png";

	        // Copy file to destination
	        try
	        {
	            FileUtils.copyFile(screenshotFile, new File(destinationFilePath));
	        } catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	    }
}
	    

