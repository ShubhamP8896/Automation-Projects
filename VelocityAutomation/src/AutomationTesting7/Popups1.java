package AutomationTesting7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups1 
{
	public static void main(String[] args) throws InterruptedException                   //Session 48
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement ClickMe = driver.findElement(By.xpath("//button[@id='alertButton']"));
		ClickMe.click();
		
//		How to Handle Alert popup :------------ --------------
		
//		1. Need to create Alert Object 
		Alert Alt = driver.switchTo().alert();
		
		Thread.sleep(2000);
		Alt.accept();         // For accepting that alert
		
		WebElement ClickMe3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		ClickMe3.click();
		
		Thread.sleep(2000);
		Alt.accept();         // For accepting that alert
		 
		ClickMe3.click();
		
		Thread.sleep(2000);
		Alt.dismiss();         // For Rejecting that alert (when there are two options Ok/cancel)
		
		
//		For Sending Input in the Alert popup.
		WebElement ClickMe4 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		ClickMe4.click();
		
		Thread.sleep(2000);
		Alt.sendKeys("Shubham Pawar");              // We send an input in the alert box and accept
		Alt.accept();
		
		
		
//		3) Authentication Popup:--------------- WHen we open website then it's showing
//		We need to pass username and password in the URL.
//		URL:- https://the-internet.herokuapp.com/basic_auth
//		Username : Admin , Password : Admin
//		Username:Password@URL
		
//>>    https://admin:admin@the-internet.herokuapp.com/basic_auth
		
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		
		
		
		
		
		
		
		
		
	}

}
