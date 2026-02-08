package Assignment_2_14_10_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FifthApproach_login 
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
	
//	We make one function we no need to use findElement Any time 
	public static WebElement GetElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void addInput(By locator, String value)
	{
		GetElement(locator).sendKeys(value);
	}
	
	public static void main(String[] args) throws Exception 
	{
		FifthApproach_login lg = new FifthApproach_login();
		lg.LaunchBrowser("Chrome");
		driver.manage().window().maximize();		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");	
		System.out.println("Url Opened Successfully");	
		
		By Email = By.id("input-email");
		By Pass = By.id("input-password");
		By Lgn = By.xpath("//input[@value=\"Login\"]");

		WebElement LoginButton = GetElement(Lgn);
		
		addInput(Email , "test@test.com");
		addInput(Pass , "test@123");
		
		
		LoginButton.click();
		
	}

}
