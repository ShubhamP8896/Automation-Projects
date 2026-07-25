package day35_1stProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyOwnProgram_Practice 
{
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeMethod
	public void SetUp(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");
		
		driver.get("https://www.google.com");
		System.out.println("Browser Opened Successfully");
	}
	
	@Test
	public void TestCase()
	{
		String ActualTitle = driver.getTitle();
		System.out.println("Actual Title : " + ActualTitle);
		
		String ExpectedTitle = "Google";
		
		if(ActualTitle.equalsIgnoreCase(ExpectedTitle))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	

}
