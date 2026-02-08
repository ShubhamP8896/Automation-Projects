package day65;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPractice1
{
	static WebDriver driver;
	String ExpectedUrl = "https://www.google.com/";

	BrowserUtility bu = new BrowserUtility();	
	
	@BeforeMethod
	public void setUp()
	{
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.launchURL(ExpectedUrl);
	}
	
	@Test
	public void compareUrl()
	{
		String actualURL = bu.getCurrentPageURL();
		if(actualURL.equals(ExpectedUrl))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Falied");
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		bu.quitBrowser();
	}

}
