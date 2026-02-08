package day62;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class GetPageText_InnerText 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{	
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));		
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		bu.launchURL("https://www.amazon.com/");
		JavaScriptExecutorUtility jsu = new JavaScriptExecutorUtility(driver);
		
		String innterText = jsu.getInnerTextJsScript();
		System.out.println(innterText);
		
	}

}
