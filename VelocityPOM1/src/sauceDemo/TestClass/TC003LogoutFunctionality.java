package sauceDemo.TestClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.POMClasses.HomePage;
import com.saucedemo.POMClasses.LoginPage;

public class TC003LogoutFunctionality                         // Session-51 (28-4-24)
{
	WebDriver driver;
	
	@BeforeMethod
	public void SetUpMethod()                  
	{ 
//		Path of the chrom driver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\Installation Files\\chromedriver-win64\\chromedriver.exe");
//			Open the chrome browser
			
			driver = new ChromeDriver();
			System.out.println("Browser Opened Successfully");
			
			driver.manage().window().maximize();
			
			System.out.println("Browser Opened and Maximised");
			
//			Open URL
			driver.get("https://www.saucedemo.com/");
			
			System.out.println("URL Opened Successfully");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
//			Create LoginPage object : For calling login page methods
			LoginPage Login = new LoginPage(driver);
			
//			Actions for Login page
			LoginPage LP = new LoginPage(driver);
			LP.SendUsername();
			
			System.out.println("Send Username");
			
			LP.SendPassword();
			
			System.out.println("Send Password");
			
			LP.LoginButtonClick();
			
			System.out.println("Click on Login Button");
			
		}
				
		@Test
		public void LogOutTestScenario()
		{
			
//			Create HomePage object : For calling Home page methods
			HomePage Home = new HomePage(driver);
			
//			Actions For HomePage
			Home.BurgerMenu();
			
			System.out.println("Click on BurgerMenu");
			
			Home.LogOut();
			System.out.println("Click on LogOut Button");
	
//			LogOut Test Scenario
			
		
			String ExpectedURL = "https://www.saucedemo.com/";
			String ActualURl = driver.getCurrentUrl();
			
			if (ActualURl.equals(ExpectedURL))
			{
				System.out.println("Logout Successfully : Test case passed");
			}
			else
			{
				System.out.println("LogOut Failed : Test case failed");
			}
		}
				
			
		@AfterMethod
		public void TearDownMethod()
		{
			driver.quit();			
		}
			
	}

