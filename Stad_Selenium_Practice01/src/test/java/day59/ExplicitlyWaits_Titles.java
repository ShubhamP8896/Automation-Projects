package day59;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaits_Titles 
{
	static boolean result;
	static boolean result1;
	static WebDriver driver;
	
//	Generic methods
///  for Partial title
	public static void waitForTitleContains(String partialTitle, int TimeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeOut));
		try 
		{
//			Wait for the Title
			result = wait.until(ExpectedConditions.titleContains(partialTitle));
		}
		catch(Exception e)
		{
			System.out.println("Title is not matched, Time is over");
		}
		finally 
		{
			System.out.println(result);
			if(result == true)
			{
				System.out.println("Test case passed");
			}
			else
			{
				System.out.println("Failed");
			}
				
		}
	}

///	 For Exact Title
	
	public static void waitForTitleIs(String fullTitle, int TimeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeOut));
		try 
		{
//			Wait for the Title
			result = wait.until(ExpectedConditions.titleContains(fullTitle));
		}
		catch(Exception e)
		{
			System.out.println("Title is not matched, Time is over");
		}
		finally 
		{
			System.out.println(result);
			if(result == true)
			{
				System.out.println("Test case passed");
			}
			else
			{
				System.out.println("Failed");
			}
				
		}
	}	
	
	
	public static void main(String[] args) 
	{
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20_27");
		
		ElementsUtility eu = new ElementsUtility(driver);
	
		WebElement laptop = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(laptop).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		WebElement all = driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"));
		wait.until(ExpectedConditions.visibilityOf(all)).click();
		
///		call with Generic methods
		eu.waitForTitleContains("Laptops", 3);
		eu.waitForTitleIs("Laptops & Notebooks", 3);
		
		
//		try 
//		{
////			Wait for the Title
//			result = wait.until(ExpectedConditions.titleContains("Laptops"));
//			result1 = wait.until(ExpectedConditions.titleIs("Laptops & Notebooks"));
//		}
//		catch(Exception e)
//		{
//			System.out.println("Title is not matched, Time is over");
//		}
//		finally 
//		{
//			System.out.println(result);
//			if(result == true)
//			{
//				System.out.println("Test case passed");
//			}
//			else
//			{
//				System.out.println("Failed");
//			}
//				System.out.println(result1);
//			if(result1 == true)
//			{
//				System.out.println("Test case passed");
//			}
//			else
//			{
//				System.out.println("Failed");
//			}
//		
//		}
	}
	
}
