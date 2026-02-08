package day40WebElements_RemainingApproaches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SixthApproach_withUtilitycls 
{
//	By Locator + Generic function of getElement for find webElement + SendKeys Generic function + Element Utility Class (Up to this 6th approach)
//	+ Browser Utility  (Up to this 7th Approach)
	/**
	 * 1) In the Browser utility class return the driver with launchURL method and use WebDriver as return type of this method
	 * 2) In the Element Utility create the constructor and pass the WebDriver driver in argument.
	 * 3) In the test class captured the return driver from Browser utility class :: webDriver driver = butil.launchbrowser("chrome");
	 * 4) Create object of the Element utility class and pass the driver in the Argument
	*/
	
	public static void main(String[] args) 
	{
		BrowserUtility butil = new BrowserUtility();
		WebDriver driver = butil.launchBrowser("chrome");         // ✅ Capture returned driver from the Browser Utility Class
		butil.MaximizeWindow();
		butil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		By Pass = By.id("input-password");
		
		 // ✅ Pass driver to ElementsUtility
		ElementsUtility eutil = new ElementsUtility(driver);
		eutil.addInput(email, "Shubham@test.com");
		eutil.addInput(Pass, "Shubham@123");
		
		System.out.println("Execution is completed");
		
		System.out.println(butil.getPageTitle());
		
//		butil.quitBrowser();
		
		
	}

}
