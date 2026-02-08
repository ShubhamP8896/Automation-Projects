package day45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IsDisplayed_with_Without_Method 
{
	public static void main(String[] args) 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		bu.launchURL("https://www.google.com/");
		bu.MaximizeWindow();
		
		ElementsUtility eu = new ElementsUtility(driver);
		By search = By.id("APjFqb");
		
//		WebElement searchBar = eu.getElement(search);
		
//		boolean result = searchBar.isDisplayed();
//		System.out.println(result);
//		System.out.println("---------------------------------");
//		if(result == true)
//		{
//			eu.addInput(search, "java");
//		}
		
//		Generic method for check 
//		boolean result1 = eu.is_Displayed(search);
//		System.out.println(result1);
//		System.out.println("---------------------------------");
//		if(result1 == true)
//		{
//			eu.addInput(search, "java");
//		}
//		Without using the is Displayed Method >> We need to compare the size >> We need to use the FindElements method to get size
		
//		if(driver.findElements(By.id("APjFqb")).size() == 1)
//		{
//			System.out.println("Element is Displayed");
//		}
//		else
//		{
//			System.out.println("Element is not found");
//		}
//		----------------------------We are able to call our generic method : GetElements
//		if(eu.getElements(search).size() == 1)
//		{
//			System.out.println("Element is Displayed");
//		}
//		else
//		{
//			System.out.println("Element is not found");
//		}
		
//		Generic methods to check how many elements are present and verify the count
		boolean result = eu.isMultipleElementsExist(search);
		System.out.println(result+"-------------");
		boolean result1 = eu.isMultipleElementsExist(search, 1);
		System.out.println(result1+"------------");
		boolean result2 = eu.isDisplayedGeneric(search);
		System.out.println(result2);
	}

}
