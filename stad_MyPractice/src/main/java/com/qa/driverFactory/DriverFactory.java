package com.qa.driverFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.utilities.ExceptionUtility;

public class DriverFactory 
{
	private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	
	public static WebDriver initDriver_launchBrowser(String browser)
	{
			if (browser == null || browser.trim().isEmpty())
			{
			    throw new ExceptionUtility("Browser name cannot be null or empty");
			}
			else if(driver.get() == null)
			{
				switch(browser.toLowerCase().trim())
				{
				case "chrome" : driver.set(new ChromeDriver()); break;
				case "firefox" : driver.set(new FirefoxDriver()); break;
				case "edge" : driver.set(new EdgeDriver()); break;
				case "safari" : driver.set(new SafariDriver()); break;
				default: throw new ExceptionUtility("Unsupported browser: " + browser +
					    ". Supported browsers are Chrome, Firefox, Edge and Safari."); 
				}
				
				System.out.println(browser + " : Browser launched Successfully");
				driver.get().manage().window().maximize();
	            driver.get().manage().deleteAllCookies();
	            driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}
		
		return driver.get();
	}
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
    public static void closeBrowser() {
        if (getDriver() != null) {
            getDriver().close();
            System.out.println("Browser Closed Successfully");
        }
    }
	
	public static void quitBrowser()
	{
		if(driver.get() != null)
		{
			getDriver().quit();
			driver.remove();
			System.out.println("Driver Quit successfully");
		}
	}

}
