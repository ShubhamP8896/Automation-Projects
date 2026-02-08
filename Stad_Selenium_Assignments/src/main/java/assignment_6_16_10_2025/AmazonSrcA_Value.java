package assignment_6_16_10_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSrcA_Value
{
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		bu.launchURL("https://www.amazon.com/");
		bu.MaximizeWindow();
		
		ElementsUtility eu = new ElementsUtility(driver);
		By imagetag = By.tagName("img");
		
//		Used Generic Method to print all the links of Images
		System.out.println("src attribute values : ");
		eu.doGetLinksList(imagetag, "src");
		
		System.out.println("alt attribute values : ");
		eu.doGetLinksList(imagetag, "alt");		
		
		bu.quitBrowser();
	}

}
