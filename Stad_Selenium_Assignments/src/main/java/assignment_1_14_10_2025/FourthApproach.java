package assignment_1_14_10_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FourthApproach 
{
//	By Locator + Generic function of getElement for find webElement
	static WebDriver driver;
	
	public static WebElement GetElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void main(String[] args) 
	{
BrowserUtility butil = new BrowserUtility();
		
		/**
		 * butil.launchBrowser("chrome") returns a WebDriver instance.
		 * You must store that in your "driver" variable if you plan to use driver.findElement(...) directly.
		 * Otherwise, driver remains null, causing:
		 */
		
		driver = butil.launchBrowser("Firefox");
		butil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		butil.MaximizeWindow();
		
		By fn = By.id("input-firstname");
		By ln = By.id("input-lastname");
		By Em = By.id("input-email");
		By cn = By.id("input-telephone");
		By ps = By.id("input-password");
		By cps = By.id("input-confirm");
		
		WebElement firstName = GetElement(fn);
		firstName.sendKeys("Shubham");
		
		WebElement lastName = GetElement(ln);
		lastName.sendKeys("Pawar");
		
		WebElement emailID = GetElement(Em);
		emailID.sendKeys("Shubham@test.com");
		
		WebElement phoneNo = GetElement(cn);
		phoneNo.sendKeys("12568574");
		
		WebElement password = GetElement(ps);
		password.sendKeys("Shubham@123");
		
		WebElement confPass = GetElement(cps);
		confPass.sendKeys("Shubham@123");
		
		System.out.println("All the Values are added successfully");
		
//		butil.quitBrowser();
	}

}
