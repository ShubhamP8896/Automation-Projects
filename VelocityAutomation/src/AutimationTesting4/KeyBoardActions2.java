package AutimationTesting4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement TextBox = driver.findElement(By.xpath("//input[@id='target']"));
		
		Actions action = new Actions(driver);
		
//		For Type in the input boxes using Keyboard Action.
		
		action.sendKeys(TextBox, "My Name is Shubham Pawar, I am from Nanded, Maharashtra1").perform();
		Thread.sleep(2000);
		
		TextBox.click();
		
//		For remove any text uing back space
		
		TextBox.sendKeys(Keys.BACK_SPACE);
		
//		For using COmbinition of both keys like control + a, ctrl+c ..etc
		
//		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
//		Use any one syntax, up or below
		
		TextBox.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		
		TextBox.sendKeys(Keys.CONTROL+"X");
		Thread.sleep(2000);
		
		TextBox.sendKeys(Keys.CONTROL+"V");
		Thread.sleep(2000);
		

		
		
		
	}

}
