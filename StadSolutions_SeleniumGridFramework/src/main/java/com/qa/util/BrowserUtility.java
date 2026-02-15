package com.qa.util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;

public class BrowserUtility 
{

	/**
	 * This is the launch browser method
	 * @param browserName  : We need to pass that in the test class. Which browser we want to use
	 * @return : It return the driver because we used the return type as WebDriver and we have to use that same driver in the test class also that's why
	 * we return the driver here and use that same in the test class with launchURL method
	 * 
	 * 1) In the Browser utility class return the driver with launchURL method and use WebDriver as return type of this method
	 * 2) In the Element Utility create the constructor and pass the WebDriver driver in argument.
	 * 3) In the test class captured the return driver from Browser utility class :: webDriver driver = butil.launchbrowser("chrome");
	 * 4) Create object of the Element utility class and pass the driver in the Argument
	 * 
	 */
	 
//	it initialize the driver : Always first we need to initialize the wbeDriver else it shows driver = null 
///	-> we didn't use this now, we initialize the dirver and launch the browser from the driver factory
//	public static WebDriver launchBrowser(String browserName)
//	{
//		if(browserName == null)
//		{
//			throw new ExceptionsUtility("Browser Name is Null, Please provide the valid broser name");
//		}
//		switch (browserName.toLowerCase().trim()) 
//		{
//		case "chrome" :
//			driver = new ChromeDriver();
//			System.out.println("Chrome browser Launched Successfully");
//			break;
//		case "edge" :
//			driver = new EdgeDriver();
//			System.out.println("Edge browser Launched Successfully");
//			break;
//		case "firefox" :
//			driver = new FirefoxDriver();
//			System.out.println("Firefox browser Launched Successfully");
//			break;
//		case "safari" :
//			driver = new SafariDriver();
//			System.out.println("Safari browser Launched Successfully");
//			break;
//		default:
//			throw new ExceptionsUtility("Browser is not valid / not found");	
//		}	
//		return driver;
//	}
//	it is return driver : We need to use this everywhere 
//	public static WebDriver getDriver()
//	{
//		return driver;
//	}
	
	private WebDriver getDriver() 
	{
        return DriverFactory.getDriver();
    }
	
	public void launchURL(String url)
	{
//		I handled this as per my code we are able to use differently also
		if((url==null) || url.equals("") || !url.contains("http") || !url.contains("https"))
		{
			throw new ExceptionsUtility("URL is not Valid : Please re-check your URL");
		}
		getDriver().get(url);
		System.out.println("URL is valid and Opened");
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void MaximizeWindow()
	{
		getDriver().manage().window().maximize();
		System.out.println("Window is maximized");
	}
	
	public void minimizeWindow()
	{
		getDriver().manage().window().minimize();
		System.out.println("Window is minimized");
	}
	
	public void navigateURL(String urlName)
	{
//		I handled this as per my code we are able to use differently also
		if((urlName==null) || urlName.equals("") || !urlName.contains("http") || !urlName.contains("https"))
		{
			throw new ExceptionsUtility("URL is not Valid : Please re-check your URL");
		}
		getDriver().navigate().to(urlName);
	}
	
	public void back()
	{
		getDriver().navigate().back();
	}
	
	public void forward()
	{
		getDriver().navigate().forward();
	}
	
	public void refresh()
	{
		getDriver().navigate().refresh();
	}
	
	/**
	 * it is return the page title in the string so we used the string as return type
	 * @return
	 */
	
	public String getPageTitle()               
	{
		return getDriver().getTitle();
	}
	
	public String getCurrentPageURL()
	{
		return getDriver().getCurrentUrl();
	}
	
//	quite the browser
	/// this also we not using becasue we call quite method from the driverfacoty class directly
	public void quitBrowser()
	{
		getDriver().quit();
	}

}
