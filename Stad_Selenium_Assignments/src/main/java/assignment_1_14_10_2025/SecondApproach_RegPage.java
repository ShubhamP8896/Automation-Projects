package assignment_1_14_10_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecondApproach_RegPage
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

		WebElement firstName = driver.findElement(By.id("input-firstname"));
		firstName.sendKeys("Shubham");
		WebElement lastName = driver.findElement(By.id("input-lastname"));
		lastName.sendKeys("Pawar");
		WebElement emailID = driver.findElement(By.id("input-email"));
		emailID.sendKeys("Shubham@test.com");
		WebElement phoneNo = driver.findElement(By.id("input-telephone"));
		phoneNo.sendKeys("12568574");
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("Shubham@123");
		WebElement confPass = driver.findElement(By.id("input-confirm"));
		confPass.sendKeys("Shubham@123");
		
		System.out.println("All the Values are added successfully");
		
//		butil.quitBrowser();
		
		
		
	}

}
