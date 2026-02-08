package day36_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Methods_webDriver
{
	static WebDriver driver;
	public void LaunchBrowser(String browser) throws Exception
	{
		switch(browser.toLowerCase().trim())
		{
		case "chrome" :
			driver = new ChromeDriver();
			System.out.println("Chrome Browser Launched Successflly");
			break;
		case "edge" :
			driver = new EdgeDriver();
			System.out.println("edge Browser Launched Successflly");
			break;
		case "firefox" :
			driver = new FirefoxDriver();
			System.out.println("firefox Browser Launched Successflly");
			break;
		case "safari" :
			driver = new SafariDriver();
			System.out.println("safari Browser Launched Successflly");
			break;
			default :
				throw new Exception("Browser is not valid");
		}
	}
	
	
	public static void main(String[] args) throws Exception
	{
		Methods_webDriver lb = new Methods_webDriver();
		lb.LaunchBrowser("Chrome");
		driver.get("https://www.google.com");
		System.out.println("URL opened");
		driver.manage().window().fullscreen();               //--> full screen not showing then tool bars
		System.out.println("FullScreen");
		driver.manage().window().minimize();                 //--> Minimize the window
		System.out.println("minimize");
		driver.manage().window().maximize();				//--> Maximize the window
		System.out.println("Maximize");
		
		driver.manage().deleteAllCookies();                 //--> it used to delete all the cookies
		
		System.out.println(driver.manage().window().getPosition());    // --> Position of the window
		System.out.println(driver.manage().window().getSize());       // --> current size of the windwo		
		
		String Actual_Title = driver.getTitle();                       // to fetch the title of that opned page 
		String Expected_Title = "Google";
		System.out.println("Result based on the Title");
		
		if(Actual_Title.equalsIgnoreCase(Expected_Title))
		{
			System.out.println("Titles are same: Test case Passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
		String Excepted_URL = driver.getCurrentUrl();              //-->  for fetch the URL of opened page
		System.out.println(Excepted_URL);
		if(Excepted_URL.contains("google"))
		{
			System.out.println("URL is valid: Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed, URL not contains the google");
		}
		
		String page_Source = driver.getPageSource();               //--> for page source
		System.out.println("Result based on the page source");
		
		if(page_Source.contains("google"))
		{
			System.out.println("Test case passed based on the page source");
		}
		else
		{
			System.out.println("not found");
		}
		
//		All the results in one codes
		System.out.println("----All the results----");
		if(Actual_Title.equalsIgnoreCase(Expected_Title) && Excepted_URL.contains("google") && page_Source.contains("google"))
		{
			System.out.println("All the things are same : test case is passed");
		}
		else
		{
			System.out.println("Page Title or URL or Page source is invalid");
		}
		
		driver.quit();              //--> To close all the open window of the current browser
	}

}
