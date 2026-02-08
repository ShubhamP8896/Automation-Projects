package day37FrameWorkExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day38NavitaionMethods 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");           // to open the URL
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.com/");   // we are able to use this also for open url but basically this is used for navigation
		Thread.sleep(2000);
		driver.navigate().back();         // backward 
		Thread.sleep(2000);
		driver.navigate().forward();       // forward
		Thread.sleep(2000);
		driver.navigate().refresh();		// refresh the page
	}

}
