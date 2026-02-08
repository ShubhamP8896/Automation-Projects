package AutimationTesting4;


import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization1                                      // Session 43
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		System.out.println("Set Properties successfully");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://design.sniperai.com/");
		
//		Synchronizations Types
//		1) Implicit wait :- Always user after URL open. It's for all the program. 
//		https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver : Website for use
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //in class showing diff but now that not supported
		
		System.out.println("URL Opened successfully");
		
		WebElement Username = driver.findElement(By.id("user_email"));
		
		
//		2) Explicit wait :- Used for specific element we are able to use for any element after found that element
//		 https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver :- WebSite for use
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.visibilityOf(Username));
//		After that we use action for that element, Like Username.sendkeys("Username")
		Username.sendKeys("shubham.pawar@recruitmentsmart.com");
		
		
		WebElement Password = driver.findElement(By.id("user_password"));
		Password.sendKeys("123456");
		
		WebElement Usertype = driver.findElement(By.xpath("//input[@value='1']"));
		Usertype.click();
		
		WebElement Login = driver.findElement(By.id("login"));
		Login.click();
		
		String ExpectedUrl = "https://design.sniperai.com/candidate/index";
		
		String ActualUrl = driver.getCurrentUrl();
		
		System.out.println("Actual Url is" +ActualUrl);
		
		if (ActualUrl.equals(ExpectedUrl))
		{
			System.out.println("Logged in Successfully : Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		WebElement Sidebar = driver.findElement(By.xpath("//a [@id='manu-icn-exp-col']"));
		Sidebar.click();
		
		WebElement SignOut = driver.findElement(By.xpath("//span [text()='Sign out']"));
		SignOut.click();
		
		String ExpUrl = "https://design.sniperai.com/index";
		
		String ActUrl = driver.getCurrentUrl();
		
		if(ExpUrl.equals(ActUrl))
		{
			System.out.println("User Log Out successfully :- Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed for logout");
		}
		
		driver.close();
		
		
		
	}

}
