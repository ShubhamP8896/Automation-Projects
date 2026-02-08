package day56;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PseudoElement
{
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String symbol = js.executeScript("return window.getComputedStyle(document.querySelector('[for=\"input-firstname\"]'), '::before').getPropertyValue('content')").toString();
		System.out.println(symbol);
		
		By userName = By.cssSelector("#input-firstname");
		WebElement uName = eu.getElement(userName);
		eu.addInput(userName, "");
//		We are able to use this same for validation: like if the field is mandatory and that field is contains value or not
		
		if(symbol.contains("*"))
		{
			System.out.println("Found symbol : " + symbol);
			if(uName.getAttribute("value").equals(""))
			{
				System.out.println("Field is mandatory Need to add the Value");
			}
			else
			{
				System.out.println("Value is present in the Mandatory field");
			}
		}
				

	}

}
