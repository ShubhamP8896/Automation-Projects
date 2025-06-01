package AutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod4          // session 35
{
	public static void main(String[] args) 

		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");    
			
			WebDriver driver = new ChromeDriver();   
				 		
			driver.get("https://www.google.com"); 
			
			Options o = driver.manage();
			Window w = o.window();
			w.maximize();
			
//			Instead of that above mentioned syntax we used all of these theree 
//			Methods with single reference variable and call them at singel time.
//			Same like below.
			
			driver.manage().window().maximize();  // It's called method chaining
			
//			Both functions same.
			
			
			

			
			
			
			
		}

}
