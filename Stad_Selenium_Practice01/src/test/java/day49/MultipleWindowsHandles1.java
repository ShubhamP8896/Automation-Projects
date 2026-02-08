package day49;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * In this class we are first clicked on all the links then we fetch the URL and close that window
 */

public class MultipleWindowsHandles1 
{
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.launchURL("https://design.sniperai.com/");
		bu.MaximizeWindow();
		
		By footerLinks = By.xpath("//div[@class='col-xs-12 col-sm-4 text-center social-footer']/a");
		
		List<WebElement> list = driver.findElements(footerLinks);
		for(WebElement sicons : list)
		{
			sicons.click();
		}
//		it will store the parent window/Main window address
		String pWindow = driver.getWindowHandle();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
//		it will close the parent window also but we dont want to close that so we used if condition
		while(it.hasNext())
		{
			String s = it.next();
			if(!s.equals(pWindow))       // if parent window address is not equals we used
			{
			driver.switchTo().window(s);
			System.out.println(driver.getCurrentUrl());
			driver.close();
			}
		}
		driver.switchTo().window(pWindow);
		
	}

}
