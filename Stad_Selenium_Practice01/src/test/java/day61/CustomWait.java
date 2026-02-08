package day61;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day60.BrowserUtility;
import day60.ElementsUtility;

///		Custom wait, without using the Implicit and Explicit wait.
///Q] We are able to use waits features without Implicit and Explicit?
///Ans: Yes, Below is the code

public class CustomWait 
{
	static WebDriver driver;
	
	public static WebElement WaitForElementCustomWait(By locator, int timeOut, int pollingIntervel) 
	{
		int attempts = 0;
		WebElement element = null;
		while(attempts<timeOut)
		{
			try
			{
				element = driver.findElement(locator);
				System.out.println("Element is found and Action is performed on the Element");
				break;
			}
			catch(Exception e)
			{
				System.out.println("Trying to Find the Element");
				try 
				{
					Thread.sleep(pollingIntervel);
				} 
				catch (InterruptedException e1) 
				{
					e1.printStackTrace();
				}
			}
			attempts++;
		}
		 
		if(element == null)
		{
			throw new ExceptionsUtility("Trying to Search element But Element is not found");
		}			
		return element;
	}
	
	public static void main(String[] args) throws InterruptedException
	{		
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://api.cogmento.com/register/?lang=en-gb");
		
		ElementsUtility eu = new ElementsUtility(driver);
		By button = By.cssSelector("input#email-inputs");
		
//		Custom Wait
		WaitForElementCustomWait(button, 10, 1000)
		.sendKeys("Hello");	
	}

}
