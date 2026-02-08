package day41;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElements_1 
{
	static WebDriver driver;
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.launchURL("https://www.amazon.com/");
		bu.MaximizeWindow();
		
		ElementsUtility eu = new ElementsUtility(driver);	
		By Links = By.tagName("a"); 
		
		
//		List <WebElement> amLinks = eu.getElements(Links);
//		
////		Count of list of web elements
//		System.out.println(amLinks.size());
//		
////		--------It will print the Elements only ------------------
//		
////		Direct print the list of webElements
//		System.out.println(amLinks);
//		
////		Print with For Loop
//		for(int i = 0; i < amLinks.size(); i++)
//		{
//			System.out.println(amLinks.get(i));
//		}
//		
////		Print with for each loop
//		for (WebElement val : amLinks )
//		{
//			System.out.println(val);
//		}
//		
////		------------- For Print the Element Text name --------------
//		
////		Print with For Loop
//		for(int i = 0; i < amLinks.size(); i++)
//		{
//			System.out.println(amLinks.get(i).getText());
//		}
//		
////		Print with for each loop
//		for (WebElement val : amLinks )
//		{
//			System.out.println(val.getText());
//		}
//		
////		---------------- to avoid the blank or empty WebElements name---------
////		Same we are able to use with the for loop also. 
////		1st Code
//		for (WebElement val : amLinks )
//		{
//			if(val.getText().equals(""))
//			{
//				continue;
//			}
//			else
//			{
//			System.out.println(val.getText());
//			}
//		}
//		
////		2nd Code
//		for (WebElement val : amLinks )
//		{
//			if(val.getText().isBlank())
//			{
//				continue;
//			}
//			else
//			{
//			System.out.println(val.getText());
//			}
//		}
//		
////		3rd Code
//		for (WebElement val : amLinks )
//		{
//			if(!val.getText().equals(""))
//			{
//				System.out.println(val.getText());
//			}
//		}
////		
////		4th Code
//		for (WebElement val : amLinks )
//		{
//			if(val.getText() != "" )
//			{
//				System.out.println(val.getText());
//			}
//		}	
		
////		with using the Generic method
		eu.doGetTextList(Links);
		
		
		
		bu.quitBrowser();
	}

}