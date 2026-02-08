package AutimationTesting4;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionMethod2 
{
	public static void main(String[] args)                    //Session 44
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Mouse action methods 
//		1) act.click(WebElementName); :- Form single left click
		
		WebElement ClickMe = driver.findElement(By.xpath("(//button[contains (@type, 'button')])[4]"));
		
		Actions act = new Actions(driver);
		
		act.click(ClickMe).perform();
		
//		2) act.doubleClick(WebElementName); : For Double Click (Left)
		
		WebElement DoubleClickMe = driver.findElement(By.xpath("//button [@id='doubleClickBtn']"));
		
		act.doubleClick(DoubleClickMe).perform();
		
//		3) Act.context();  :: For Righ Click (Single click)
		
		WebElement RightClick = driver.findElement(By.xpath("(//button[contains (@type, 'button')])[3]"));

		act.contextClick(RightClick).perform();
		
		
		
	}

}
