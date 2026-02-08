package day39WebElements_DiffApproaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondApproach 
{
	public static void main(String[] args) 
	{	
		/**
		 * The better approach is 2nd one as here we can reusable the code means for first time I enter test@gmail.com 
		 * and then after in same variable after logout I send testing@gmail.com 
		 * 
		 * The 2nd approach the selenium server hits only one means once we create the WebElement first time with test@gmail.com 
		 * then after logout for the second it is not hitting selenium server 2nd time for the value testing@gmail.com as WebElement is already created.
		 */
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		
		WebElement Username = driver.findElement(By.id("input-email"));
		Username.sendKeys("shubham@test.com");
		
		WebElement Password = driver.findElement(By.id("input-password"));
		Password.sendKeys("shubham@123");
		
//		We are able to use same reference variable for adding new users as well with this approach no need add again that find element line code.
		Username.clear();
		Username.sendKeys("shubham");
		Password.clear();
		Password.sendKeys("123");
		
//		driver.quit();
	}
}
