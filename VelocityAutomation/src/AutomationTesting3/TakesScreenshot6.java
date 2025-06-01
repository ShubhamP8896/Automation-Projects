package AutomationTesting3;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshot6                    //Session 42
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
//		How To Take Screenshot:--------------------------
			
		TakesScreenshot t = (TakesScreenshot)driver;        // Casting    
		
//		TakesScreenshot -> Interface of selenium, t -> Ref Var, 
		
		File source = t.getScreenshotAs(OutputType.FILE);
		
//		File-> Class of selenium need to import,  getScreenshotAs:-> Method of take screenshot
		
		File destination = new File("C:\\Users\\Shubz008\\Pictures\\Camera Roll\\LoginPage.jpg");
		
		FileHandler.copy(source, destination);
		
//		FileHandler :-> Class of Java need through IOException for this (with right click same like import)
//		Copy:- It's method of FileHandler which returns Void
		
//		If we want to take more screenshots :- We taking Home Page SS
		
		WebElement Username = driver.findElement(By.xpath("//input[contains(@id, 'user-name')]"));
		Username.sendKeys("visual_user");
		      	
		WebElement Password = driver.findElement(By.xpath("//input[@id = 'password']"));
		Password.sendKeys("secret_sauce");
				
		WebElement Login = driver.findElement(By.xpath("//input[contains(@id, 'login-button')]"));
		Login.click();
		
//		Home Page Screenshot--------------------------------------------
		
//		TakesScreenshot t = (TakesScreenshot)driver;        //No need to do Casting again 
				
		File source1 = t.getScreenshotAs(OutputType.FILE);
		
//		Just need to change Red Variables name--------- like source1, destination1
		
		File destination1 = new File("C:\\Users\\Shubz008\\Pictures\\Camera Roll\\HomePage.jpg");
		
//		Need to change File name in location at last after double slash (HomePage.jpg)
		 
		FileHandler.copy(source1, destination1);
		
//		If we are not changed those names then Old screenshots will be replaced by New SS.
		
		
		
		
		
	}

}
