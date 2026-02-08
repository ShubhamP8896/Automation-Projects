package Assignment_2_14_10_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SecondApproach_login 
{
	static WebDriver driver = null;
	public void LaunchBrowser(String browser) throws Exception
	{		
		switch(browser.toLowerCase())
		{
		case "chrome" :
			driver = new ChromeDriver();
			System.out.println("Chrome browser Launched Successfully");
			break;
		case "firefox" :
			driver = new FirefoxDriver();
			System.out.println("Firefox browser Launched Successfully");
			break;
		case "Edge" :
			driver = new EdgeDriver();
			System.out.println("Edge browser Launched Successfully");
			break;
		case "Safari" :
			driver = new SafariDriver();
			System.out.println("Safari browser Launched Successfully");
			break;
		default :
			throw new Exception("Browser is not valid");
		}
	}
	public static void main(String[] args) throws Exception
	{
		SecondApproach_login lg =  new SecondApproach_login();
		lg.LaunchBrowser("CHROME");
		driver.manage().window().maximize();		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");	
		System.out.println("Url Opened Successfully");
		WebElement EmailID = driver.findElement(By.id("input-email"));
		EmailID.sendKeys("test_user@test.com");
		System.out.println("UserName Added");
		WebElement Password = driver.findElement(By.id("input-password"));
		Password.sendKeys("Test@123");
		System.out.println("Password Added");	
		WebElement Login = driver.findElement(By.xpath("//input[@value=\"Login\"]"));
		Login.click();
		System.out.println("Clicked On the Login Button");
		driver.quit();	
	}
	

}
