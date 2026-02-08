package Assignment_2_14_10_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FourthApproch_Login 
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
	
	public static void main(String[] args) throws Exception 
	{
		FourthApproch_Login lg = new FourthApproch_Login();
		lg.LaunchBrowser("Chrome");
		driver.manage().window().maximize();	
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");	
		System.out.println("Url Opened Successfully");	
		
		By Email = By.id("input-email");
		By Pass = By.id("input-password");
		By Lgn = By.xpath("//input[@value=\"Login\"]");
		
		WebElement EmailID = GetElement(Email);
		WebElement Password = GetElement(Pass);
		WebElement LoginButton = GetElement(Lgn);
		
		EmailID.sendKeys("test@test.com");
		Password.sendKeys("test@123");
		
		LoginButton.click();
		
		System.out.println("Clicked On the Login Button");
		driver.quit();
	}
	
	
}
