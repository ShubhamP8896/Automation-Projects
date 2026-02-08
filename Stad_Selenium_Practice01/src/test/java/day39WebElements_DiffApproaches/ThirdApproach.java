package day39WebElements_DiffApproaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdApproach 
{
	public static void main(String[] args) 
	{	
		/**
		 * So here in this approach we are creating the ByLocator for every webelement then we are using the getElement() 
		 * method which written the object of WebElement as shown below and finaly performing the action based on web element by sendKeys().
		 * 
		 * Here the advantage of 3rd approach over 2nd approach is that in 3rd approach after creating the ByLocator for the password 
		 * if I do not want to use it now then it is not necessary to create the web element for that. We can create web element of 
		 * password as and when required. But in 2nd approach it is creating web element compulsory for either it is of use or not in current time.
		 */
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		
		By email = By.id("input-email");
		By Pass = By.id("input-password");
		
		
		WebElement Username = driver.findElement(email);
		Username.sendKeys("shubham@test.com");
		
		WebElement Password = driver.findElement(Pass);
		Password.sendKeys("shubham@123");
		
//		driver.quit();
	}
}
