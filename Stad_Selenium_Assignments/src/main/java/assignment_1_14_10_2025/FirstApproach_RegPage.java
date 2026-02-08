package assignment_1_14_10_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstApproach_RegPage 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		BrowserUtility butil = new BrowserUtility();
		
		/**
		 * butil.launchBrowser("chrome") returns a WebDriver instance.
		 * You must store that in your "driver" variable if you plan to use driver.findElement(...) directly.
		 * Otherwise, driver remains null, causing:
		 */
		
		driver = butil.launchBrowser("Chrome");
		butil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		butil.MaximizeWindow();

		driver.findElement(By.id("input-firstname")).sendKeys("Shubham");
		driver.findElement(By.id("input-lastname")).sendKeys("Pawar");
		driver.findElement(By.id("input-email")).sendKeys("Shubham@test.com");
		driver.findElement(By.id("input-telephone")).sendKeys("12568574");
		driver.findElement(By.id("input-password")).sendKeys("Shubham@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Shubham@123");
		
		System.out.println("All the Values are added successfully");
		
//		butil.quitBrowser();
		
		
		
	}

}
