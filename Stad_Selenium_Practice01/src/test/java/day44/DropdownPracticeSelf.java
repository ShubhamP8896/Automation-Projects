package day44;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownPracticeSelf 
{
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		bu.launchURL("https://www.jqueryscript.net/demo/Multilevel-Dependent-Dropdown-Plugin-With-jQuery-Dependent-Dropdowns/");
		bu.MaximizeWindow();
		
		ElementsUtility eu = new ElementsUtility(driver);
		By dropd = By.xpath("//select[@id='second']");
		boolean result = eu.is_Enabled(dropd);
		System.out.println(result);
	}

}
