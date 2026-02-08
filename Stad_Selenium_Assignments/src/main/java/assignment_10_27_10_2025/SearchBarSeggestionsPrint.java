package assignment_10_27_10_2025;


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
		bu.launchURL("https://www.amazon.com/");
	
		ElementsUtility eu = new ElementsUtility(driver);
		
		By searchBar = By.xpath("//input[@id='twotabsearchtextbox']");
		eu.addInput(searchBar, "Home");
		
		By suggestValues = By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']");
		Thread.sleep(3000);   // we need to add this because it is not getting text before load that search suggestions
		eu.doGetTextList(suggestValues);
		
//		If we want to click on any of the option from the search
		
//		List <WebElement> searchOptions = eu.getElements(suggestValues);
//		for(WebElement ss : searchOptions)
//		{
//			if(ss.getText().equals("home gym"))
//			{
//				ss.click();
//				break;
//			}
//		}
		
//		Generic methods are used for print the suggested values and second is click on given value
		eu.doGetTextList(suggestValues);
		
//		to click on the given value
		eu.doClickListElement(suggestValues, "home gym");
		
		String actualURL = bu.getCurrentPageURL();
		if(actualURL.contains("home+gym"))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
//		bu.quitBrowser();
	}
	

	

}
