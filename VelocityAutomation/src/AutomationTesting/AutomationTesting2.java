package AutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationTesting2         // Session 34 For Open Mozilla browser
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shubz008\\Downloads\\geckodriver-v0.33.0-win64 (1)\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println("Mozilla Opened Successfully and Searched google site");
		
		driver.close();
		
		System.out.println("Mozilla Browser Closed successfully");
		
		
		
	}

}
