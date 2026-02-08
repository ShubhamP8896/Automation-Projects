package assignment_5_16_10_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NaveenLinksPrint
{
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		bu.MaximizeWindow();
		
		ElementsUtility eu = new ElementsUtility(driver);
		By links = By.tagName("a");
		
//		Used Generic Method to print all the links
		eu.doGetLinksList(links, "href");
		
//		Used Generic method to print the Links text names
//		eu.doGetTextList(links);
		
		bu.quitBrowser();
	}

}
