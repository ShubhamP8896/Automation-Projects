package AutomationTesting;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod5             // Session 35   and Start of Session 36
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");    
		
		WebDriver driver = new ChromeDriver();   
			 		
		driver.get("https://www.facebook.com"); 
		
//		Method 9 :-> driver.GetCurrentUrl():- To get the current window URL which used.
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();     // this method returns string.
		
//		String>return type :: url> ref var > we need to use that in print statement
		
		System.out.println(url);
		
//		Method 10 :-> driver.GetTitle():- To get the current window title which showing for that window.
		
		String Title = driver.getTitle();
		
//		String>return type :: url> ref var > we need to use that in print statement
		
		System.out.println(Title);
		
//		11) driver.manage().window().setSize(); > to set the size of window.
//		for this we need to add dimension (selenium class) object and import
		
		Dimension d = new Dimension(300, 500);      // 
		
		driver.manage().window().setSize(d);
		
//		12) driver.manage().window().setPosition(p); > to set the position of window as per x,y coordinates in pixcels
//		for this we need to add point (selenium class) object and import
		
		Point p = new Point(200, 200);
//		                     x    y
		driver.manage().window().setPosition(p);
		
		
		
		
	}

}
