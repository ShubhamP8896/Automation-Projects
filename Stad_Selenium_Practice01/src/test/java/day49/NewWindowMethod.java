package day49;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

/**
 * This method is used to Open the New Tab on the same Window and open the New Window and search for different URL
 */

public class NewWindowMethod
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String pw = driver.getWindowHandle();
//		Open the new Tab on the same browser and driver point on that new Opened Tab
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.google.com");
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
//		
//		driver.switchTo().window(pw);
//		System.out.println(driver.getCurrentUrl());
//		driver.quit();
		
//		Open the new Window and driver point on that New window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.com");
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(pw);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
