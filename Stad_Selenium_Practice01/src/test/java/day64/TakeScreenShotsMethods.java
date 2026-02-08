package day64;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotsMethods
{	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://www.google.com");
		
//		Type casting :
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File ("C:/Users/ADMIN/OneDrive/Desktop/screenshots/test.png");
//		try {
//			FileHandler.copy(source, destination);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		Also we are able to write the same in the two lines only
//		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(source, new File ("C:/Users/ADMIN/OneDrive/Desktop/screenshots/test.png"));
		
		
//		How to get the screenshot of the Specific WebElement 
//		We need webElement for that
		WebElement ele = driver.findElement(By.xpath("/html/body/div[2]/div[4]/form/div[1]/div[1]/div[3]/center/input[1]"));
//		File s1 = ele.getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(s1, new File ("C:/Users/ADMIN/OneDrive/Desktop/screenshots/test1.png"));
		
		
//		How to take screen shot with the current date and time
		
//		LocalDateTime is the class of the java and now() is the static method >> we convert the current time in to string and replace : to _ becasue : is not supported
		
//		String dateAndTime = LocalDateTime.now().toString().replace(":", "_");
//		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File ("C:/Users/ADMIN/OneDrive/Desktop/screenshots/test_"+dateAndTime+".png");
//		try {
//			FileHandler.copy(source, destination);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		Using Generic method : Using this we are able to take multiple screenshots
//		takeScreenshots("google.com");
		
//		Screenshot utility
//		Full Screenshot
		TakeScreenshotUtility ts = new TakeScreenshotUtility(driver);
		ts.takeScreenshots("google");
		
//		Specific WebElement Screenshot
		ts.takeWebElementScreenshot(ele, "googleSearch");
		
	}
//	Generic method for the take the full screenshots
		public static void takeScreenshots(String screenshotName)
		{
			try 
			{
			String dateAndTime = LocalDateTime.now().toString().replace(":", "_");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File ("C:/Users/ADMIN/OneDrive/Desktop/screenshots/"+screenshotName+"_"+dateAndTime+".png");
			FileHandler.copy(source, destination);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
//		Generic method for screenshot of the specific webElement
		public static void takeWebElementScreenshots(WebElement elementName, String screenshotName)
		{
			try 
			{
			String dateAndTime = LocalDateTime.now().toString().replace(":", "_");
			File source = elementName.getScreenshotAs(OutputType.FILE);
			File destination = new File ("C:/Users/ADMIN/OneDrive/Desktop/screenshots/"+screenshotName+"_"+dateAndTime+".png");
			FileHandler.copy(source, destination);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

}
