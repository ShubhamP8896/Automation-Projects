package myPractice_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory_Practice 
{
	static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static WebDriver launchBrowser_initDriver(String browser)
	{
		if(browser.isEmpty() || browser == null)
		{
			System.out.println(browser + ": Please add valid browser name");
		}
		else
		{
			switch(browser.trim().toLowerCase())
			{
				case "chrome": driver.set(new ChromeDriver());
				break;
				case "firefox": driver.set(new FirefoxDriver());
				break;
				case "edge": driver.set(new EdgeDriver());
				break;
				case "safari": driver.set(new SafariDriver());
				break;
				default: throw new MyExceptions_Practice("Invalid Browser: Please add valid browser name");
			}
		}
		return driver.get();
	}
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
	public static void removeDriver()
	{
		driver.remove();
	}

}
