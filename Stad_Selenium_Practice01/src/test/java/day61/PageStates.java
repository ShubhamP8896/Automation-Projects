package day61;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PageStates 
{
	static WebDriver driver;
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		
//		It will wait for page load up to the given time and if page is not loaded the throws an exception
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		bu.launchURL("https://classic.crmpro.com/index.html");
		waitForPageState(10);
		
		
//		Using the java script we are able to check the page state : 1) Loading 2) Interactive 3) Complete
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String pageState=js.executeScript("return document.readyState").toString();		
	}
	
	public static void waitForPageState(int timeOut)
	{
		long endTime = System.currentTimeMillis()+timeOut;
		System.out.println(endTime);
		while(System.currentTimeMillis()<endTime)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String pageState=js.executeScript("return document.readyState").toString();		
			if(pageState.equals("complete"))
			{
				System.out.println("Page is fully loaded in a given time");
				break;
			}
		}
	}

}
