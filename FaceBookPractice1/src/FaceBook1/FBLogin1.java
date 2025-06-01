package FaceBook1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		System.out.println("Set Properties Successfully");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Opened Successfully");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		System.out.println("URL opened");
		
		WebElement LoginID = driver.findElement(By.id("email"));
		LoginID.sendKeys("pawar.shubham8@gmail.com");
		
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("ShubzPawar@008");
		
		WebElement LoginButton = driver.findElement(By.name("login"));
		LoginButton.click();
		
		String ExpectedUrl = "https://www.facebook.com/";
		
		String ActualUrl = driver.getCurrentUrl();
		System.out.println(ActualUrl);
		
		if(ExpectedUrl.equals(ActualUrl))
		{
			System.out.println("Login Successfully:- Test case is passed");
		}
		else
		{
			System.out.println("Login Test case is Failed");
		}
		
		
		
		
		
	}

}
