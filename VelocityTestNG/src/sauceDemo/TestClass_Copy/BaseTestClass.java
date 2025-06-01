package sauceDemo.TestClass_Copy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.saucedemo.POMClasses_Copy.LoginPage_Copy;

public class BaseTestClass
{
	WebDriver driver;

	@BeforeMethod
	public void SetUpMethod()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\Installation Files\\chromedriver-win64\\chromedriver.exe");
		System.out.println("Set Properties Successfully");
		
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		System.out.println("Chrome Browser is opened and Maximised");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		LoginPage_Copy LP = new LoginPage_Copy(driver);
		
		LP.SendUsername();
		System.out.println("Send Username");
		
		LP.SendPassword();
		System.out.println("Send Password");
		
		LP.LoginButtonClick();
		System.out.println("Click on Login Button");
	}

//	For now we are using this only just for this programs/concept
	
	
	@AfterMethod
	public void TearDownMethod()
	{
		driver.quit();
		System.out.println("End Of Program");
	}	
	
}
