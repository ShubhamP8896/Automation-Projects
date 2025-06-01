package AutimationTesting4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseActionsMethods5 
{
	public static void main(String[] args) throws InterruptedException                    // Session 45.
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);                     // we are not using this in our original script we are just using for checking our script
		
		driver.get("http://dhtmlgoodies.com/index.html?page=dragDrop");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0, 2000)");                              // For Scroll Up
//						In this X -> 0 and Y -> 2000
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0, -2000)");                             // For Scroll Down
		
//		If we want to scroll right/left then we need to add x coordinates value.

		 
		
		
		
	}

}
