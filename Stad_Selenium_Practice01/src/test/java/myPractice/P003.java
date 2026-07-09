package myPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P003 
{
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static WebDriver initDriver_launchBrowser(String browserName) throws Exception
	{
		if(driver.get() == null) 
		{
			if(browserName == null || browserName.equals(""))
			{
				throw new Exception("Invalid BorwserName");
			}
			switch(browserName.trim().toLowerCase())
			{
				case "chrome" : driver.set(new ChromeDriver()); break;
				case "edge" : driver.set(new ChromeDriver()); break;
				case "firefox" : driver.set(new ChromeDriver()); break;
			}
		}
		
		return driver.get();
	}
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
	
	public static void main(String[] args) throws Exception 
	{
		P003.initDriver_launchBrowser("chrome");
		
		getDriver().get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollTo(0,500)");
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}

}
