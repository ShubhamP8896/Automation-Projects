package AutomationTesting;

import org.openqa.selenium.WebDriver;           //Selenium packages imported
import org.openqa.selenium.chrome.ChromeDriver;  // from selenium libraries

public class AutomationTesting1                           //session 33
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users" // method of java 
				+ "\\Shubz008\\Downloads\\chromedriver-win64\\"  // used to set the properties
				+ "chromedriver-win64\\chromedriver.exe");    
		
		
		WebDriver driver = new ChromeDriver();   // Upcasting used to open the browser
		
		driver.get("https://www.google.com");  // get is the method of WebDriver used to open the URL
		
		driver.close();                    // to close the browser
		
		
		
		
	}

}
