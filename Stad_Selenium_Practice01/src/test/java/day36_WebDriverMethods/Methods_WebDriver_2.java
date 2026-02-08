package day36_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_WebDriver_2 
{
	static WebDriver driver;
	
	public void LaunchBrowser(String browser) throws Exception
	{
		switch(browser.toLowerCase().trim())
		{
		case "chrome" :
			driver = new ChromeDriver();
			System.out.println("Chrome browser opened Successfully");
			break;
		case "firefox" :
			driver = new ChromeDriver();
			System.out.println("Firefox browser opened Successfully");
			break;
		case "edge" :
			driver = new ChromeDriver();
			System.out.println("Edge browser opened Successfully");
			break;
		case "safari" :
			driver = new ChromeDriver();
			System.out.println("Safari browser opened Successfully");
			break;
		default :
			throw new Exception("Browser is not found / Not valid");	
		}
	}
	
	public static void main(String[] args) throws Exception {
		Methods_WebDriver_2 lb = new Methods_WebDriver_2();
		lb.LaunchBrowser("Chrome");
		System.out.println("Browser launched successfully");
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("Website opened");
		
	/**
	 * 	System.out.println("Below is the page source code");
		System.out.println(driver.getPageSource());
		Used to get the source code of the page
	 */
		
		String actualTitle = "Google";
		String ExpectedTitle = driver.getTitle();
		
		if(actualTitle.equalsIgnoreCase(ExpectedTitle))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("failed");
		}

		driver.quit();
		
	
	}

}
