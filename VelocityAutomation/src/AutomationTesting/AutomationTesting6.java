package AutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting6     // session 36
{
	public static void main(String[] args) 
	{
//		This is the example of test script.
//		Following are the scenarios
//		1) Open the Url
//		2) Maximize the window
//		3) Compare the URL which we get is true or not
//		4) Get the URL
//		5) Get the title	
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");    
		System.out.println("1. Set the Properties");
			
		WebDriver driver = new ChromeDriver();   
		System.out.println("2. Open the Browser");
			 		
		driver.get("https://www.facebook.com"); 
		System.out.println("3. Search the Url");
		
		driver.manage().window().maximize();
		System.out.println("4. Maximize the window");
		
		String ActualUrl = "https://www.facebook.com/";
		
		String expectedurl = driver.getCurrentUrl();
		System.out.println("5." + expectedurl);
		
		if(expectedurl.equals(ActualUrl))
		{
			System.out.println("6. test case is passed");
		}
		else
		{
			System.out.println("7. Test case is failed");
		}
		
		String ActualTitle = "Facebook – log in or sign up";
		
		String ExpectedTitle = driver.getTitle();
		System.out.println("8." + ExpectedTitle);
		
		if(ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("9. Test case is passed");
		}
		else
		{
			System.out.println("10 Test case is failed");
		}
		
		driver.close();
		System.out.println("11. Window closed please check results on console.");
		
		
	}

}
