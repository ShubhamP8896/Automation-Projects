package day60;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitObjects 
{
	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ElementsUtility eu = new ElementsUtility(driver);
		
//		WebDriver wait class has multiple overloaded constructores following is we using for try to check the Element for every given time
//		Default time is the 500 mili seconds.
//		Now we are added 1000 :> Here we are able to add mili seconds, seconds, minutes, hours, days ..etc
//		(tried for 10 second(s) with 1000 milliseconds interval)  >> Default is 500 milliseconds.  >> it's we called pooling interval
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(1000)); 
		
		By button = By.xpath("//a[text()='s SelectorsHub Youtube Channel  ']");
		
		wait.until(ExpectedConditions.elementToBeClickable(button));
		
	}

}
