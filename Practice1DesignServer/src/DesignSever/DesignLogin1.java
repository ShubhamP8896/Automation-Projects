package DesignSever;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesignLogin1 
{
//	Test case:- User is able to login or not
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		System.out.println("Set the Properties");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Opened Successfully");
	
		driver.manage().window().maximize();
		
		driver.get("https://design.sniperai.com/index");
		System.out.println("Url opened successfully");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Username = driver.findElement(By.id("user_email"));
		Username.sendKeys("Shubham.pawars@recruitmentsmart.com");
		
		WebElement Password = driver.findElement(By.id("user_password"));
		Password.sendKeys("123456");
		
		WebElement Login = driver.findElement(By.id("login"));
		Login.click();
		
		String ExpectedHomePageUrl = "https://design.sniperai.com/recruiter/live-jobs";
		
		String ActualHomePageUrl = driver.getCurrentUrl();
		System.out.println(ActualHomePageUrl);
		
		if (ActualHomePageUrl.equals(ExpectedHomePageUrl))
		{
			System.out.println("Login Successfully: Test case is passed");
		}
		else
		{
			System.out.println("Login test case is failed");
		}
		
		WebElement Sidebar = driver.findElement(By.id("manu-icn-exp-col"));
		Sidebar.click();
		
		WebElement LogOut = driver.findElement(By.linkText("Sign out"));
		LogOut.click();
		
		String ExpectedIndexUrl = "https://design.sniperai.com/index";
		
		String ActualIndexUrl = driver.getCurrentUrl();
		System.out.println(ActualIndexUrl);
		
		if (ActualIndexUrl.equals(ExpectedIndexUrl))
		{
			System.out.println("Logout Successfully: Test case is passed");
		}
		else
		{
			System.out.println("Logout test case is failed");
		}
		
		
		
	}

}
