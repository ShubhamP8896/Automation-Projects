package day49;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleWondo_generic3 
{
	/**
	 * Here we used the Generic method for click on the WebElements one by one and get the URL and close that window
	 * added this method in the WebElement class
	 */
	
	
	static WebDriver driver;
	
	public static void multipleWindo(WebElement element)
	{
		element.click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String pw = it.next();
		String cw = it.next();
		
		driver.switchTo().window(cw);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(pw);
	}
	
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.launchURL("https://design.sniperai.com/");
		bu.MaximizeWindow();
		
		By footerLinks = By.xpath("//div[@class='col-xs-12 col-sm-4 text-center social-footer']/a");
		
		List<WebElement> list = driver.findElements(footerLinks);
		for(WebElement sicons : list)
		{
			multipleWindo(sicons);
		}
		System.out.println(driver.getCurrentUrl());
	}

}
