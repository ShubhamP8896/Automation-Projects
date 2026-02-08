package assignment_44_17_11_2025;

import java.time.Duration;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


public class Svg 
{
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.MaximizeWindow();
		bu.launchURL("https://www.flipkart.com/");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
//		By searchIcon = By.xpath("//*[local-name()='svg']//*[name()='path' and @d='M16 16L21 21']");     // this is not working
		
		By searchIcon = By.cssSelector("[type='submit']");
		By searchField = By.cssSelector("input[title^='Search for Products']");
		
		eu.addInput(searchField, "Shirts for men");
		
		Thread.sleep(3000);
		
		eu.doClick(searchIcon);
		
		
	}
	
}

