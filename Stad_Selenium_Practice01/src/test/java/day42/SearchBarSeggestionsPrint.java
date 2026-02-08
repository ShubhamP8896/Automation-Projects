package day42;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBarSeggestionsPrint 
{
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://www.google.com");
	
		ElementsUtility eu = new ElementsUtility(driver);
		
		By searchBar = By.xpath("//textarea[@id='APjFqb']");
		eu.addInput(searchBar, "java selenium");
		
		By suggestValues = By.xpath("//div[@class='wM6W7d']/span");
		Thread.sleep(3000);   // we need to add this because it is not getting text before load that search suggestions
		
	
//		If we want to click on any of the option from the search
		
//		List <WebElement> searchOptions = eu.getElements(suggestValues);
//		for(WebElement ss : searchOptions)
//		{
//			if(ss.getText().equals("java selenium course"))
//			{
//				ss.click();
//				break;
//			}
//		}
		
//		String actualURL = bu.getCurrentPageURL();
//		if(actualURL.contains("java+selenium+course"))
//		{
//			System.out.println("Test case is passed");
//		}
//		else
//		{
//			System.out.println("Test case is failed");
//		}
		
//		Below are the Generic Methods created 1) For Print the Suggested values
//		2) Click on the given value
		
		eu.doGetTextList(suggestValues);
		eu.doClickListElement(suggestValues, "java selenium course");
		
	}

}
