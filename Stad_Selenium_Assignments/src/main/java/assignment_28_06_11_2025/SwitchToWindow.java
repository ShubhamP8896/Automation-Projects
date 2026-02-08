package assignment_28_06_11_2025;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToWindow 
{
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		bu.launchURL("https://demoqa.com/browser-windows");
		bu.MaximizeWindow();
		
		By newWindow = By.cssSelector("#windowButton");
		By newTab = By.cssSelector("#tabButton");
		By newMsgWindow = By.cssSelector("#messageWindowButton");
		By text = By.xpath("//body[contains(text(), 'Knowledge increases ')]");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		WebElement nw = eu.getElement(newWindow);
		WebElement nt = eu.getElement(newTab);
		WebElement nmw = eu.getElement(newMsgWindow);
		
		eu.multipleWindo(nw);
		eu.multipleWindo(nt);
		
		
		eu.doClick(newMsgWindow);		
		Set <String> handles = driver.getWindowHandles();
		Iterator <String> it = handles.iterator();
		
		String mw = it.next();
		String nmwindow = it.next();
		
		driver.switchTo().window(nmwindow);
//		System.out.println(bu.getCurrentPageURL());
//		System.out.println(eu.getElementText(text));
		driver.close();
		
		driver.switchTo().window(mw);
		System.out.println(bu.getCurrentPageURL());		
		
	}

}
