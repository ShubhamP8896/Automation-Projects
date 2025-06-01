package AutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods3                 // Session 35
{
	public static void main(String[] args) 

	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");    
		
		
		WebDriver driver = new ChromeDriver();   
		
//		1) Method 1 :- Get() -> To Open URL
 		
		driver.get("https://www.google.com"); //in this case browser open and first search 
//		driver.get("https://www.facebook.com"); // google site then on that same tab facebook site
		
//		driver.close();   
		
//		2) Method 2 :: navigate().to() :- to open url
		
		driver.navigate().to("https://www.facebook.com");
		
//		3) navigate().forward() :- to navigate to forward (No need to pass the URL)
		
		driver.navigate().back();
		
//		4) navigate().back() :- to navigate backward 
		
		driver.navigate().forward();
		
//		5) navigate().refresh():- to refresh current page.
		
		driver.navigate().refresh();
		
//		6) manage().window().maximize(); :- To maximize the window
		
		driver.manage().window().maximize();
		
//		7) close() :- To close the single window which is open
		
		driver.close();
		
//		8) quit() :- to close the overall browser 
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
