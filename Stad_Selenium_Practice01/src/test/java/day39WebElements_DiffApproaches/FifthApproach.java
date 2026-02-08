package day39WebElements_DiffApproaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FifthApproach 
{
	/**
	 * The 5th approach tells that we have created to generic method like getElement() which working like findElement() and 
	 * written the WebElement and another method is doSendKeys() which working line the sendKeys() and not writing any values.
	 * 
	 * Both methods are static in nature so we need not to create the object of class to use it and here in this approach we also 
	 * created the driver as static variable so it can be used in main() as well as other two methods.
	 */
	
	static WebDriver driver; 
	public static WebElement GetElement(By locator)
	{
		return driver.findElement(locator);
	}
	static public void AddInput(String Value, By locator)
	{
		GetElement(locator).sendKeys(Value);
	}
	static public void doClick(By locator)
	{
		GetElement(locator).click();
	}
	
	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		
		By email = By.id("input-email");
		By Pass = By.id("input-password");
		By loginButton = By.xpath("//input[@value=\"Login\"]");
		
//		WebElement username = Elements(email);  >> No need to use this in this approach
		
		AddInput("shubham@test.com" , email);
		AddInput("shubham@123", Pass);
		
		doClick(loginButton);
		
	}

}
