package day59;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaits_Frames 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://www.londonfreelance.org/courses/frames/index.html");
			
		ElementsUtility eu = new ElementsUtility(driver);
		
		By frmae1 = By.xpath("//frame[@name='main']");
		WebElement mainFrame = eu.getElement(frmae1);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
//		Using generic methods
		eu.waitForFrameByIndex(2, 5);
		WebElement f1 = driver.findElement(By.xpath("//h2[text()='Title bar ']"));
		System.out.println(f1.getText());
		driver.switchTo().defaultContent();
		
		eu.waitForFrameByLocator(frmae1, 5);
		System.out.println(f1.getText());
		driver.switchTo().defaultContent();
		
		eu.waitForFrameByNameOrID("main", 5);
		System.out.println(f1.getText());
		driver.switchTo().defaultContent();
		
		eu.waitForFrameByWebElement(mainFrame, 5);
		System.out.println(f1.getText());
		driver.switchTo().defaultContent();
		
///		1. By Locator
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frmae1)); 
		System.out.println(f1.getText());
		driver.switchTo().defaultContent();
		
/// 	2. By passing Index in the argument
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
		System.out.println(f1.getText());
		driver.switchTo().defaultContent();
		
///		3. By passing WebElement in the argument
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(mainFrame));
		System.out.println(f1.getText());
		driver.switchTo().defaultContent();
		
///		4. By passing Name/ID in the argument
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("main"));
		System.out.println(f1.getText());
		driver.switchTo().defaultContent();
	}
///  Generic Methods : wait for	frame
///  	1. By Locator
		public static void waitForFrameByLocator(By locator, int timeOut)
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator)); 
		}
/// 	2. By passing Index in the argument
		public static void waitForFrameByIndex(int index, int timeOut)
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index)); 
		}
		
///		3. By passing WebElement in the argument
		public static void waitForFrameByWebElement(WebElement frameWebElement, int timeOut)
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameWebElement)); 
		}
		
///		4. By passing Name/ID in the argument
		public static void waitForFrameByNameOrID(String Name_ID, int timeOut)
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Name_ID)); 
		}
}
