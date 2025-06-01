package AutomationTesting2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1       // Session 37
{
	public static void main(String[] args) 
	
//	Scenario:- User is able to login with corrent username and Passowrd
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		System.out.println("Set the properties Successfully");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser Opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser Maximize");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Url opened Successfully");
		
//		Find webelement of Username text box :------
		
		driver.findElement(By.id("user-name"));  // No need to use this seperately
		System.out.println("Web Element found for UserName");
		
		WebElement userName = driver.findElement(By.id("user-name")); //use this.
		userName.sendKeys("standard_user");
		
//		Find webelement of Password text box :------
				
		driver.findElement(By.id("password"));   // No need to use this seperately
		System.out.println("Web element found for Password"); 
		
		WebElement Password = driver.findElement(By.id("password")); //use this.
		Password.sendKeys("secret_sauce");
		
		
//		Find web element of Login button :------
		
		WebElement LoginButton = driver.findElement(By.id("login-button")); //use this.
		LoginButton.click();
		System.out.println("User Logged In Successfully");
		
		String ExpectedHomePageUrl = "https://www.saucedemo.com/inventory.html";
		
		String ActualHomePageUrl = driver.getCurrentUrl();
		System.out.println(ActualHomePageUrl);
		
		if(ExpectedHomePageUrl.equals(ActualHomePageUrl))
		{
			System.out.println("Login successfully :- Test case is Passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
//		Find web element of BurgerMenu button :------
		
		WebElement BurgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
		BurgerMenu.click();
		
//		Find web element of LogOut button :------
		
		WebElement LogOut = driver.findElement(By.id("logout_sidebar_link"));
		LogOut.click();
		System.out.println("User Log Out Successfully");
		
		
		
				
	}

}
