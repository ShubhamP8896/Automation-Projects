package day39WebElements_DiffApproaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthApproach 
{
	/**
	 * See the 4th approach here we have written findElement() only once as we have created one generic function by which web elements are created.
	 * in this we created generic method for Find Web Elements 
	 */	
	// in this approach we make one method for find the web Elements, this mehtod we are able to use for any of the webelement for find.
	
//	We are used static for web driver and Method because we added that in same class and we can access that without class name of object reference
//	Basically in real time we added this in the different class (POM), and we not use static there. It's for practice only
	
	static WebDriver driver;
	// generic function and this we are able to use any time for any webElement, So our repetitive work is saved.
	public static WebElement Elements(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		
		By email = By.id("input-email");
		By Pass = By.id("input-password");
		
		WebElement username = Elements(email);
		username.sendKeys("shubham@test.com");
		
		WebElement password = Elements(Pass);
		password.sendKeys("shubham@123");
	}

}
