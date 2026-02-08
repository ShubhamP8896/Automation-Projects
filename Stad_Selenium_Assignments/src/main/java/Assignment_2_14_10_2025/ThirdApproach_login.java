package Assignment_2_14_10_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ThirdApproach_login 
{
	static WebDriver driver;
	public void LaunchBrowser(String browser) throws Exception
	{
		switch(browser.toLowerCase())
		{
		case "chrome" :
			driver = new ChromeDriver();
			System.out.println("Chrome Browser Launched");
			break;
		case "firefox" :
			driver = new FirefoxDriver();
			System.out.println("Firefox Browser Launched");
			break;
		case "edge" :
			driver = new EdgeDriver();
			System.out.println("Edge Browser Launched");
			break;
		case "safari" :
			driver = new SafariDriver();
			System.out.println("Safari Browser Launched");
			break;
		default :
			throw new Exception("Browser is not found");
		}
	}
	
	public static void main(String[] args) throws Exception {
		ThirdApproach_login lg = new ThirdApproach_login();
		lg.LaunchBrowser("FIREFOX");
		
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By Eml = By.id("input-email");
		By Pass = By.id("input-password");
		By Lgn = By.xpath("//input[@value=\"Login\"]");
		
		WebElement EmailID = driver.findElement(Eml);
		WebElement Password = driver.findElement(Pass);
		WebElement Login = driver.findElement(Lgn);
		
		EmailID.sendKeys("testuser@test.com");
		Password.sendKeys("test@123");	
		Login.click();
		System.out.println("Clicked on the Login button");
		driver.quit();
	}
	
	

}
