package assignment_1_14_10_2025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtility 
{
	WebDriver driver;
//	Created constructor for using this same driver in the test class

	/**
	 * This is the launch browser method
	 * @param browserName  : We need to pass that in the test class. Which browser we want to use
	 * @return : It return the driver because we used the return type as WebDriver
	 */
	
	public WebDriver launchBrowser(String browserName)
	{
		if(browserName == null)
		{
			throw new MyExceptions("Browser Name is Null, Please provide the valid broser name");
		}
		switch (browserName.toLowerCase().trim()) 
		{
		case "chrome" :
			driver = new ChromeDriver();
			System.out.println("Chrome browser Launched Successfully");
			break;
		case "edge" :
			driver = new EdgeDriver();
			System.out.println("Edge browser Launched Successfully");
			break;
		case "firefox" :
			driver = new FirefoxDriver();
			System.out.println("Firefox browser Launched Successfully");
			break;
		case "safari" :
			driver = new SafariDriver();
			System.out.println("Safari browser Launched Successfully");
			break;
		default:
			throw new MyExceptions("Browser is not valid / not found");	
		}	
		return driver;
	}
	
	public void launchURL(String url)
	{
//		I handled this as per my code we are able to use differently also
		if((url==null) || url.equals("") || !url.contains("http") || !url.contains("https"))
		{
			throw new MyExceptions("URL is not Valid : Please re-check your URL");
		}
		driver.get(url);
		System.out.println("URL is valid and Opened");
	}
	
	public void MaximizeWindow()
	{
		driver.manage().window().maximize();
		System.out.println("Window is maximized");
	}
	
	public void minimizeWindow()
	{
		driver.manage().window().minimize();
		System.out.println("Window is minimized");
	}
	
	public void navigateURL(String urlName)
	{
		driver.navigate().to(urlName);
	}
	
	public void back()
	{
		driver.navigate().back();
	}
	
	public void forward()
	{
		driver.navigate().forward();
	}
	
	public void refresh()
	{
		driver.navigate().refresh();
	}
	
	/**
	 * it is return the page title in the string so we used the string as return type
	 * @return
	 */
	
	public String getPageTitle()               
	{
		return driver.getTitle();
	}
	
	public String getCurrentPageURL()
	{
		return driver.getCurrentUrl();
	}
	
//	quite the browser
	public void quitBrowser()
	{
		driver.quit();
	}

}
