package day48;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Auth_Alerts 
{
	static WebDriver driver;
	
//	Generic method >> Added in the Element Utility
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static void authAlert(String URL)
	{
		driver.get(URL);
	}
	
	
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("Chrome");
		bu.MaximizeWindow();
//		bu.launchURL("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		authAlert("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		By text = By.xpath("//div[@id='content']/div/p");
		
		ElementsUtility eu = new ElementsUtility(driver);
		String Actualresult = eu.getElementText(text).trim();
		System.out.println(Actualresult);
		String ExpectedResult =  "Congratulations! You must have the proper credentials.";
		
		if(Actualresult.equalsIgnoreCase(ExpectedResult))
		{
			System.out.println("Test case is Passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
	}

}
