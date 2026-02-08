package day44;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultiSelectDropdown 
{
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		bu.launchURL("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		bu.MaximizeWindow();
		
		By dropdown = By.id("justAnInputBox");
		By dropdownOptions = By.xpath("//span[@class='comboTreeItemTitle']");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
//		1} For the Single Selection
		
		eu.doClick(dropdown);	
//		eu.doGetTextList(dropdownOptions);
//		eu.doClickListElement(dropdownOptions, "choice 3");
		
//		2} For the Multiple Selection
//		String multipleOptions [] = {"choice 2", "choice 2 2", "choice 3", "choice 5", "choice 6 2 2"};
//		String multipleOptions = "choice 2";
//		Used this below generic method
		
		eu.doClickListElements(dropdownOptions, "choice 2");
		
//		List <WebElement> drOptions = driver.findElements(dropdownOptions);
//		for(WebElement elements : drOptions)
//		{
//			if(!elements.getText().equals(""))
//			{
//				for(int i=0; i<multipleOptions.length;i++)
//				{
//					if(elements.getText().equals(multipleOptions[i]))
//					{
//						elements.click();
//					}
//				}
//			}
//		3} If want to select all the options
//			elements.click();
//			
//		}
		
		
	}
}
