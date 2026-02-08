package day43;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PrintDropdownOptions 
{
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://www.orangehrm.com/en/contact-sales");
	
		ElementsUtility eu = new ElementsUtility(driver);
		By country = By.xpath("//select[@id='Form_getForm_Country']/option");
		
//		This is our generic method already defined in the Element Utility class
//		eu.doGetTextList(country);  // give/print the list of countries and count of total number of countries present in the dropdown
		
		eu.doClickListElement(country, "test");   // Click on the given value
		
		
	}

}
