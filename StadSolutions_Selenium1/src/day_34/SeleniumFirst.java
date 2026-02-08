package day_34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirst 
{	
	static WebDriver driver = null;
	
	public void LaunchBrowser(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
			System.out.println(browser + " is Launched Successfully");
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
			System.out.println(browser + " is Launched Successfully");
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
			System.out.println(browser + " is Launched Successfully");
		}
		else
		{
			throw new Exception("Browser is Invalid/Browser is not found");
		}
	}
	
	
	public static void main(String[] args) throws Exception 
	{
		SeleniumFirst sf = new SeleniumFirst();
		
		sf.LaunchBrowser("FIREFOX");
		driver.manage().window().maximize();
		
		System.out.println("Browser is maximized");
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Google";
		
//		Result
		if(ActualTitle.equalsIgnoreCase(ExpectedTitle))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		driver.quit();
		
	}

}
