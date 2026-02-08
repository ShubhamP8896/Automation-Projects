package assignment_4_15_10_2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyLoginURL_OrangeHRM 
{
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility butil = new BrowserUtility();
		WebDriver driver = butil.launchBrowser("Chrome");
		butil.launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		butil.MaximizeWindow();
		Thread.sleep(3000);
		
		By username = By.xpath("//input[@placeholder='Username']");
		By password = By.xpath("//input[@placeholder='Password']");
		By LoginButton = By.xpath("//button[@type='submit']");

		
		ElementsUtility Eutil = new ElementsUtility(driver);
		Eutil.addInput(username, "Admin");
		Eutil.addInput(password, "admin123");
		Eutil.doClick(LoginButton);
		
		String CurrentPageURL = butil.getCurrentPageURL();
		System.out.println("Current Page URL = " + CurrentPageURL);
		
		if(CurrentPageURL.toLowerCase().contains("orange"))
		{
			System.out.println("Test case passed, User Logged In Successfully");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		
//		butil.quitBrowser();
	}

}
