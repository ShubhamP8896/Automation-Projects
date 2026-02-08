package day46_ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_1
{
	static WebDriver driver;
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
//	Generic Method for Actions Class Move to Element
	public static void MouseAction(By locator)
	{
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator)).build().perform();		
	}
	public static void MouseAction(String tagname, String GPMenu, String PMenue, String CMenu) throws InterruptedException
	{
//		We are able to add the variables in the Xpath as well
		By GP = By.xpath("(//"+tagname+"[text()='"+GPMenu+"'])[2]");
		By P = By.xpath("//"+tagname+"[text()='"+PMenue+"']");
		By C = By.xpath("//"+tagname+"[text()='"+CMenu+"']");
		
		Actions act = new Actions(driver);
		
		WebElement GPM = getElement(GP);
		act.moveToElement(GPM).build().perform();
		Thread.sleep(3000);
		WebElement PPM = getElement(P);
		act.moveToElement(PPM).build().perform();
		Thread.sleep(3000);
		WebElement CM = getElement(C);
		CM.click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("Chrome");
		bu.launchURL("https://www.bigbasket.com/");
		bu.MaximizeWindow();
		
		By mainMenu = By.id("headlessui-menu-button-:Ramkj6:");
//		By option1 = By.xpath("(//a[text()='Pharmacy & Wellness'])[2]");
//		By option2 = By.xpath("//a[text()='OTX Medicine']");
//		By option3 = By.xpath("//a[text()='Eye & Ear Care Meds']");
		
		ElementsUtility eu = new ElementsUtility(driver);
		eu.doClick(mainMenu);
		Thread.sleep(3000);
		
//		Actions act = new Actions(driver);
//		
////		WebElement O1 = eu.getElement(option1);
////		act.moveToElement(O1).build().perform();
//		MouseAction(option1);
//		Thread.sleep(3000);
////		WebElement O2 = eu.getElement(option2);
////		act.moveToElement(O2).build().perform();
//		MouseAction(option2);
//		Thread.sleep(3000);
//		eu.doClick(option3);
//		Thread.sleep(1000);
		
//		Most Generic Method
		
		MouseAction("a", "Fashion", "Fashion Essentials", "Belts");
		Thread.sleep(2000);
		System.out.println(bu.getCurrentPageURL());
		if(bu.getCurrentPageURL().contains("/fashion/fashion-essentials/belts/"))
		{
			System.out.println("Test case is Passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		bu.quitBrowser();
	}

}
