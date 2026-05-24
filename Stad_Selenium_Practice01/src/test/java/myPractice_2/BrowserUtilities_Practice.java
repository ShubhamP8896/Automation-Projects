package myPractice_2;

import org.openqa.selenium.WebDriver;

public class BrowserUtilities_Practice 
{
	
	public static WebDriver getDriver()
	{
		return DriverFactory_Practice.getDriver();
	}
	
	public static void launchUrl(String url)
	{
		if(url.isEmpty() || url.equals("") || (!url.contains("http:") || !url.contains("https")))
		{
			System.out.println(url + ": url is invalid, Please add valid URL");
		}
		else
		{
			getDriver().get(url);
		}
	}
	
	public static String getTitle()
	{
		return getDriver().getTitle();
	}
	
	public static String getCurrentPageUrl()
	{
		return getDriver().getCurrentUrl();
	}
	
	public static void closeBrowser()
	{
		getDriver().close();
	}
	
	public static void quitBrowser()
	{
		getDriver().quit();
	}
	
}
