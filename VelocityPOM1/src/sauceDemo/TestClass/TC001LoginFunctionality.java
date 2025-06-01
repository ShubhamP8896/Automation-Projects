package sauceDemo.TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.POMClasses.HomePage;
import com.saucedemo.POMClasses.LoginPage;

public class TC001LoginFunctionality 
{
	WebDriver driver;
	@BeforeMethod
	public void SetUpMethod()                     // Session - 50
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\Installation Files\\chromedriver-win64\\chromedriver.exe");
		System.out.println("Set Properties Successfully");
		
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		System.out.println("Chrome Browser is opened and Maximised");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		LoginPage LP = new LoginPage(driver);
		
		LP.SendUsername();
		System.out.println("Send Username");
		
		LP.SendPassword();
		System.out.println("Send Password");
		
		LP.LoginButtonClick();
		System.out.println("Click on Login Button");
		
//		Need to create Login Page Object And export that loginpage class and pass "driver" as a argument
	}
	
	@Test	
	public void LoginFunctionality()
	{
		String AxtcualURLLogin = driver.getCurrentUrl();
		String ExpectedURLLogin = "https://www.saucedemo.com/inventory.html";
		
		if (AxtcualURLLogin.equals(ExpectedURLLogin))
		{
			System.out.println("Login Successfully: Test case Passed");
		}
		else
		{
			System.out.println("Login Test case failed");
		}
		
	}
	
	@AfterMethod
	public void TearDownMethod()
	{
		HomePage HP = new HomePage(driver);
		HP.BurgerMenu();
		HP.LogOut();
		
		driver.close();
	}	
	
	
	
}

