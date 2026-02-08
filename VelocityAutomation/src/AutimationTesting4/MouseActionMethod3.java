package AutimationTesting4;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionMethod3                                   //Session 45
{
	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='user-name']"));
		Username.sendKeys("standard_user");
		
		WebElement Password = driver.findElement(By.xpath("//input [contains (@id, 'password')]"));
		Password.sendKeys("secret_sauce");
		
		WebElement Login = driver.findElement(By.xpath("//input [contains(@value, 'Login')]"));
		
		Actions act = new Actions(driver);  
		act.click(Login).perform();	
		
//		Mouse Actions Method 4) act.moverToElement(Web Element Name); -> TO move mouse towards that element.
		
		WebElement Jacket = driver.findElement(By.xpath("//a [@id='item_5_img_link']"));
		act.moveToElement(Jacket).click().perform();
		
	}

}
