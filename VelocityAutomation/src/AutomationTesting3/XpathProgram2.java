package AutomationTesting3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathProgram2                     //session 39
{
	public static void main(String[] args) throws InterruptedException   // this is showing when we used Thread.sleep() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);                                     // this used to pause script.
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.get("https://www.saucedemo.com/");
		
//		Used xpath by index-------------------------------------
		WebElement UserName = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
		UserName.sendKeys("standard_user");
		Thread.sleep(5000);
		
		WebElement Password = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
		Password.sendKeys("secret_sauce");
		Thread.sleep(5000);
		
//		Used Xpath by Contains by attribute
		WebElement Login = driver.findElement(By.xpath("//input [contains(@class, 'submit-button btn_action')]"));
		Login.click();
		
		System.out.println("Login Successfully");
		
		
	}

}
