package assignment_16_03_11_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoveToELement_Actions
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("Chrome");
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		bu.MaximizeWindow();
		Thread.sleep(2000);
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By components = By.xpath("//a[text()='Components']");
		eu.MouseAction(components);
		Thread.sleep(2000);
		
		By moniters = By.xpath("//a[text()='Monitors (2)']");
		eu.doClickActions(moniters);
		
		By cText = By.xpath("//h2[text()='Monitors']");
		
		String actualResult = eu.getElementText(cText).trim();
		System.out.println(actualResult);
		
		String expectedResult = "Monitors";
		
		if(actualResult.equalsIgnoreCase(expectedResult))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		bu.quitBrowser();
	}

}
