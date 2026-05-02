package myPractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class A001_MyFirstProgram 
{
	static WebDriver driver;
	
	public static void launchBrowser(String BrowserName)
	{
		String Browser = BrowserName.trim().toLowerCase();
		switch (Browser)
		{
			case "chrome" : driver = new ChromeDriver();
			break;
			case "firefox" : driver = new FirefoxDriver();
			break;
			case "edge" : driver = new EdgeDriver();
			break;
			case "safari" : driver = new SafariDriver();
			break;
			default:
				System.out.println("Browser name is inavlid");
		}
	}
	
	public static void main(String[] args) 
	{
		A001_MyFirstProgram.launchBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchField = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchField.sendKeys("Flipkart");
		
		WebElement searchButton = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		searchButton.click();
	}
	

}
