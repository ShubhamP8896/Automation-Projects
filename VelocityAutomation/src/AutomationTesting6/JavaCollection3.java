package AutomationTesting6;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaCollection3 
{
	public static void main(String[] args)                  // Session 48
	
//	If we want to select multiple web elements >> Use findElements> web Driver method
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement UserName = driver.findElement(By.xpath("//input [@id='user-name']"));
		WebElement Password = driver.findElement(By.xpath("//input [@id='password']"));
		
		UserName.sendKeys("standard_user");
		Password.sendKeys("secret_sauce");
		
		WebElement Login = driver.findElement(By.xpath("//input [@id='login-button']"));
		Login.click();
		
//		Find Elements:----------------------- Able to find >>List<< of multiple elements
//		List <Integer> L = new Arraylist <Integer> ();
		
//		On that page there are total 6 elements so index > 0,1,2,3,4,5 so we are able to add all or any one 
		
		
		List <WebElement> AddtoCartButton = driver.findElements(By.xpath("//button [text()='Add to cart']"));

//		For Adding Single elements:--------  (nEED TO PASS INDEX NUMBER)
//		AddtoCartButton.get(1).click();
		
//		For Loop  >> For adding all the elements one by one.
//		For know the size or total Index numbers
		System.out.println(AddtoCartButton.size());
		
		for (int i = 0; i <= 5; i++)
		{
			AddtoCartButton.get(i).click();
		}
		
		
	}

}
