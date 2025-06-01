package sauceDemo.TestClass_Copy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.saucedemo.POMClasses_Copy.HomePage_Copy;
import com.saucedemo.POMClasses_Copy.LoginPage_Copy;

public class BaseTestClass2_Copy_CrossBrowserTesting                      // session 56
{
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeMethod
	public void SetUpMethod(String browserName)
	{
		if (browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\Installation Files\\chromedriver-win64\\chromedriver.exe");
		System.out.println("Set Properties Successfully for Chrome Driver");
		driver = new ChromeDriver();	
		}
		else if (browserName.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.friver", "C:\\Users\\Shubz008\\Downloads\\Installation Files\\GeckoDriver Mozilla\\geckodriver.exe" );	
		System.out.println("Set Properties Successfully for Firefox Driver");
		driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		System.out.println("Chrome Browser is opened and Maximised");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
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
