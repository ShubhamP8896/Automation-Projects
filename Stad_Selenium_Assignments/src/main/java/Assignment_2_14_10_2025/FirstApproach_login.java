package Assignment_2_14_10_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstApproach_login 
{
	static WebDriver driver = null;
	public void LaunchBrowser(String browser) throws Exception
	{
		switch (browser.toLowerCase())
		{
		case "chrome" :
			driver = new ChromeDriver();
			System.out.println("Chrome Browser Successfully Launched");
			break;
		case "firefox" :
			driver = new FirefoxDriver();
			System.out.println("Firefox Browser Successfully Launched");
			break;
		case "edge" :
			driver = new EdgeDriver();
			System.out.println("Edge Browser Successfully Launched");
			break;
		case "safari" :
			driver = new SafariDriver();
			System.out.println("Safari Browser Successfully Launched");
			break;
		default :
			throw new Exception("Browser is not valid");	
		}
		
	}
	
	public static void main(String[] args) throws Exception
	{	
		FirstApproach_login lg = new FirstApproach_login();
		lg.LaunchBrowser("Chrome");
		driver.manage().window().maximize();		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");	
		System.out.println("Url Opened Successfully");
		driver.findElement(By.id("input-email")).sendKeys("test_user@test.com");
		System.out.println("UserName Added");
		driver.findElement(By.id("input-password")).sendKeys("Test@123");
		System.out.println("Password Added");	
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		System.out.println("Clicked On the Login Button");
		driver.quit();
	}

}
