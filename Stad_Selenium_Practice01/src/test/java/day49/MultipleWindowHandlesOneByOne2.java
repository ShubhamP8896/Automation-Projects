package day49;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandlesOneByOne2 
{
	
	/**
	 * In this class we are click on the Web element one by one and fetch URL then close that window
	 * We used the Generic method for this function
	 */

	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.launchURL("https://design.sniperai.com/");
		bu.MaximizeWindow();
		
		By facebook = By.xpath("(//div[@class='col-xs-12 col-sm-4 text-center social-footer']/a)[1]");
		By twitter = By.xpath("(//div[@class='col-xs-12 col-sm-4 text-center social-footer']/a)[2]");
		By linkedIn = By.xpath("(//div[@class='col-xs-12 col-sm-4 text-center social-footer']/a)[3]");
		By youTube = By.xpath("(//div[@class='col-xs-12 col-sm-4 text-center social-footer']/a)[4]");
		
//		for click on 1st Link - facebook
		WebElement SocialMediaLink = driver.findElement(facebook);
		SocialMediaLink.click();		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String pw = it.next();
		String cw = it.next();
		
		driver.switchTo().window(cw);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(pw);
		System.out.println(driver.getCurrentUrl());
		
//		for click on 2nd Link - Twitter
		WebElement SocialMediaLink1 = driver.findElement(twitter);
		SocialMediaLink1.click();		
		Set<String> handles1 = driver.getWindowHandles();
		Iterator<String> it1 = handles1.iterator();
		
		String pw1 = it1.next();
		String cw1 = it1.next();
		
		driver.switchTo().window(cw1);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(pw1);
		System.out.println(driver.getCurrentUrl());
		
//		Instead of this we are able to create the Generic method and use that method for open links one by one and get the URL check 
//		in class MultipleWondo_generic3
	}
	
}
