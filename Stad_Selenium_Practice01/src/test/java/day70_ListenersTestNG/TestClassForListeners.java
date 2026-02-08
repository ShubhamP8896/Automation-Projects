package day70_ListenersTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClassForListeners 
{
	static WebDriver driver;
	
	@Test (priority = 1)
	public void openURL() throws InterruptedException
	{
		  driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  System.out.println("URL Opened Successfully");
		  Thread.sleep(3000);
	}
	
	@Test (priority = 2)
	public void findLogo() throws InterruptedException
	{
		boolean status= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		if(status)
		{
			System.out.println("logo found");
		}
		else
		{
			System.out.println("logo not found");
		}
		Thread.sleep(3000);
	}
	
	@Test (priority = 3) 
	public void login() throws InterruptedException
	{
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  System.out.println("Loggedin Successfully");
		  Thread.sleep(3000);
	}
	
	@Test (priority = 4)
	public void logOut() throws InterruptedException
	{
		  driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']")).click();
		  driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']//li/a[text()='Logout']")).click();
		  System.out.println("LoggedOut Successfully");
		  Thread.sleep(3000);
	}

}
