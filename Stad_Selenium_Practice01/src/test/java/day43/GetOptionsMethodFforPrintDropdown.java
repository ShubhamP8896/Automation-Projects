package day43;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetOptionsMethodFforPrintDropdown
{
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://www.orangehrm.com/en/contact-sales");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By country = By.xpath("//select[@id='Form_getForm_Country']");
//		WebElement countryDropdown = eu.getElement(country); 
//		Select s = new Select(countryDropdown);
//		List <WebElement> CountryList = s.getOptions();
//		System.out.println(CountryList.size());
//		for(WebElement element : CountryList)
//		{
//			System.out.println(element.getText());
//		}
				
//		Using the Generic Get Options method
		eu.doGetOptionsList(country);
		eu.doClickOptionsList(country, "India");
	}

}
