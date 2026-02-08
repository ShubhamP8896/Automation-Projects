package day45;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoreListOfElements_andVerifyResult
{	static WebDriver driver;
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.launchURL("https://www.freshworks.com/");
		bu.MaximizeWindow();
		
		By bottomLinks = By.xpath("//ul[@class='sc-ace17a57-0 sc-63e0c791-1 kTjuIu dRHBZS']/li");
//		
//		List <WebElement> footerLinks = driver.findElements(bottomLinks);
//		
////		We Need to create a dynamic array to store these links text
//		List <String> LinksText = new ArrayList <String>();
//		
////		for loop to add all the text names in the above array
//		
//		for(WebElement list : footerLinks)
//		{
//			LinksText.add(list.getText());
//		}
//		System.out.println(LinksText);
//		
////		Verify that results
//		if((LinksText.contains("Leadership")) && (LinksText.contains("Partners")) && (LinksText.contains("Newsroom")) && (LinksText.contains("Services")))
//		{
//			System.out.println("Test case is Passed");
//		}
//		else
//		{
//			System.out.println("Test case is failed");
//		}
		
		doStoreLinksText(bottomLinks);
	}
	
//	Below is the generic method >> Added in the Element Utility

	public static List <WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public static void doStoreLinksText(By locator)
	{
		List <WebElement> footerLinks = getElements(locator);
		List <String> LinksText = new ArrayList <String>();
		for(WebElement list : footerLinks)
		{
			String s = list.getText();
			LinksText.add(s);
			System.out.println(s);
		}
		System.out.println(LinksText.size());
		System.out.println(LinksText);
	}
}

