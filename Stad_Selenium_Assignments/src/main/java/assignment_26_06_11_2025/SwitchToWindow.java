package assignment_26_06_11_2025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwitchToWindow 
{
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		bu.launchURL("https://www.hyrtutorials.com/p/window-handles-practice.html");
		bu.MaximizeWindow();
		
		By newWindow = By.cssSelector("#newWindowBtn");
		By newTab = By.cssSelector("#newTabBtn");
		
		ElementsUtility eu = new ElementsUtility(driver);
		eu.doClick(newTab);
		Thread.sleep(2000);
		eu.doClick(newWindow);
		Thread.sleep(2000);
		
		
		List <String> list = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(list);
		
		driver.switchTo().window(list.get(1));
		System.out.println(bu.getCurrentPageURL());
		driver.close();
		Thread.sleep(2000);
		
		driver.switchTo().window(list.get(2));
		System.out.println(bu.getCurrentPageURL());
		driver.close();
		
		driver.switchTo().window(list.get(0));
		System.out.println(bu.getCurrentPageURL());		
		
	}

}
