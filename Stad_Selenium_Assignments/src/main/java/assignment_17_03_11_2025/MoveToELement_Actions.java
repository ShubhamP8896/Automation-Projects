package assignment_17_03_11_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoveToELement_Actions
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("Chrome");
		bu.launchURL("https://www.bigbasket.com/");
		bu.MaximizeWindow();
		Thread.sleep(2000);
		
		By mainMenu = By.id("headlessui-menu-button-:Ramkj6:");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		eu.doClick(mainMenu);
		Thread.sleep(3000);
		
		eu.MouseAction("a", "Fashion", "Fashion Essentials", "Belts");
		Thread.sleep(2000);
		System.out.println(bu.getCurrentPageURL());
		if(bu.getCurrentPageURL().contains("/fashion/fashion-essentials/belts/"))
		{
			System.out.println("Test case is Passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		
		bu.quitBrowser();
	}

}
