package assignment_49_19_11_2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class PseudoElement 
{
	static WebDriver driver;
	static String fName;
	static String lName;
	static String Email;
	static String telephone;
	static String password;
	static String cmfPassword;
	
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.MaximizeWindow();
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		fName = pseudoElement("input-firstname");
		System.out.println(fName);	
		WebElement firstName = driver.findElement(By.cssSelector("#input-firstname"));
		
		lName = pseudoElement("input-lastname");
		System.out.println(lName);
		WebElement lastName = driver.findElement(By.cssSelector("#input-lastname"));
		
		Email = pseudoElement("input-email");
		System.out.println(Email);
		WebElement email = driver.findElement(By.cssSelector("#input-email"));
		
		telephone = pseudoElement("input-telephone");
		System.out.println(telephone);
		WebElement telePhone = driver.findElement(By.cssSelector("#input-telephone"));
		
		password = pseudoElement("input-password");
		System.out.println(password);
		WebElement pass = driver.findElement(By.cssSelector("#input-password"));
		
		cmfPassword = pseudoElement("input-confirm");
		System.out.println(cmfPassword);
		WebElement cmfPass = driver.findElement(By.cssSelector("#input-confirm"));	
		
		firstName.sendKeys("shubham");
		
		checkMandatoryField(fName, firstName, "Shubham");
		checkMandatoryField(lName, lastName, "Pawar");
		checkMandatoryField(telephone, telePhone, "123456");
		checkMandatoryField(password, pass, "test@123");
		checkMandatoryField(cmfPassword, cmfPass, "test@123");
		checkMandatoryField(Email, email, "shubham@test.com");
		
	}
	//Generic Method
	public static void checkMandatoryField(String mField, WebElement Name, String value )
	{
		System.out.println("this is mField : " + mField);
		if(mField.contains("*"))
		{
			if(Name.getAttribute("value").isBlank())
			{
				Name.sendKeys(value);
				System.out.println("Field Name : " + Name.getAttribute("name") +" Field is mandatory and value is added");
			}
			else
			{
				System.out.println("Field Name : " + Name.getAttribute("name") +" Field is mandatory and value is already added");
			}
		}
		else
		{
			System.out.println("Field Name : " + Name.getAttribute("name") +" Field is not mandatory");
		}
	}
	
	//Generic function
	public static String pseudoElement(String pathOfElement)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("return window.getComputedStyle(document.querySelector('[for="+pathOfElement+"]'), '::before').getPropertyValue('content')").toString();
	}
}


		