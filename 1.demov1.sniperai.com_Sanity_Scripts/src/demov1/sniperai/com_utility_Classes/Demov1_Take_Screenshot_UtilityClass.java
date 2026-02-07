package demov1.sniperai.com_utility_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Demov1_Take_Screenshot_UtilityClass 
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
	        String destinationFilePath = "D:\\Automation Sanity Testing Data\\Live Serer data\\Sanity_Testing_Screenshots_Live\\1.demov1.sniperai.com_Sanity_Scripts\\" + screenshotName + ".png";

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
	    

