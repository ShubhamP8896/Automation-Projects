package assignment_7_16_10_2025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonFooterLinks
{
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		bu.launchURL("https://www.amazon.com/");
		bu.MaximizeWindow();
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By presentaionLinks = By.xpath("//div[@role='presentation']//a");  
		By navigationLinks = By.xpath("(//div[@role='navigation'])[2]//a");
		
		eu.doGetLinksList(presentaionLinks, "href");
		eu.doGetLinksList(navigationLinks, "href");
		
 		eu.doGetTextList(presentaionLinks);
 		eu.doGetTextList(navigationLinks);
		
		bu.quitBrowser();
	}

}
