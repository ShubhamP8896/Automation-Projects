package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewGen1 {

	public static void main(String[] args) {
		
		// This below program is for open URL and login
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://design.sniperai.com/");
		driver.findElement(By.id("user_email"));
		WebElement username=driver.findElement(By.id("user_email"));
		driver.findElement(By.id("user_password"));
		WebElement password=driver.findElement(By.id("user_password"));
		WebElement login=driver.findElement(By.name("login"));
		username.sendKeys("test@sniperai.com");
		password.sendKeys("test@123");
		login.click();
		
	}

}
