package assignment_14_30_10_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class drodown_Enable 
{
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		bu.launchURL("https://www.jqueryscript.net/demo/Multilevel-Dependent-Dropdown-Plugin-With-jQuery-Dependent-Dropdowns/#google_vignette");
		bu.MaximizeWindow();	
		
		ElementsUtility eu = new ElementsUtility(driver);
		By first = By.id("first");
		
		WebElement sd = eu.getElement(first);
		if(sd.isEnabled())
		{
			eu.doClick(first);
			By option = By.xpath("//option[text()='Option 1']");
			eu.doClick(option);
			System.out.println("Selected option from the First dropdown");
		}		
		
		Thread.sleep(2000);
		
		By second = By.id("second");
		WebElement sd1 = eu.getElement(second);
		if(sd1.isEnabled() == true)
		{
			eu.doClick(second);
			By option = By.xpath("//option[text()='Option 1-2']");
			eu.doClick(option);
			System.out.println("Selected option from the Second dropdown");
		}
		
		Thread.sleep(2000);
		By third = By.id("third");
		WebElement sd2 = eu.getElement(third);
		if(sd2.isEnabled() == true)
		{
			eu.doClick(third);
			By option = By.xpath("//option[text()='Option 1-2-4']");
			eu.doClick(option);
			System.out.println("Selected option from the Third dropdown");
		}
		
		
		
	}

}
