package assignment_29_06_11_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToWindow 
{
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		bu.launchURL("https://rahulshettyacademy.com/AutomationPractice/");
		bu.MaximizeWindow();
		
		By newWindow = By.cssSelector("#openwindow");
		By newTab = By.cssSelector("#opentab");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		WebElement nw = eu.getElement(newWindow);
		WebElement nt = eu.getElement(newTab);
		
		eu.multipleWindo(nw);
		
		eu.multipleWindo(nt);
		

		
	}

}
