package day59;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaits_Urls 
{
	static boolean result;
	static boolean result1;
	static WebDriver driver;
	
	/// Wait for URL contains 
	public static void waitForUrlContains(String urlContains, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try
		{
			result = wait.until(ExpectedConditions.urlContains(urlContains));
			
//			wait.until(ExpectedConditions.urlToBe("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20_27"));
		}
		catch(Exception e)
		{
			System.out.println("Time Out");
		}
			System.out.println(result);
			if(result == true)
			{
				System.out.println("Url is contains opencart: Test case passed");
			}
			else
			{
					System.out.println("Url is not contains opencart: Test case is failed");
			}
	}
	
	///Wait for URL Match
	public static void waitForUrlMatch(String fullURL, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try
		{
			result1 = wait.until(ExpectedConditions.urlToBe(fullURL));
		}
		catch(Exception e)
		{
			System.out.println("Time Out");
		}
			System.out.println(result1);
			if(result1 == true)
			{
				System.out.println("Url is Matched: Test case passed");
			}
			else
			{
					System.out.println("Url is not Matched: Test case is failed");
			}
	}	
	
	public static void main(String[] args) 
	{
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20_27");
			
		ElementsUtility eu = new ElementsUtility(driver);
		
		/// Generic Method
		eu.waitForUrlContains("opencart", 1);
		eu.waitForUrlMatch("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20_27", 1);	
	}
	
}
