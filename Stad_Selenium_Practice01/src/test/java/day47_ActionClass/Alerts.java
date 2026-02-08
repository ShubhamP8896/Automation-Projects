package day47_ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alerts
{
	static WebDriver driver;
//	Generic methods to handle the window alerts / popups
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
//	To accept the Alert
	public static void acceptAlert(By locator)
	{
		getElement(locator).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}
//	To Dismiss the alert
	public static void dismissAlert(By locator)
	{
		getElement(locator).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
	}
//	Prompt Alert with Send Keys
	public static void promptAlert(By locator, String text)
	{
		getElement(locator).click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys(text);
		System.out.println(alt.getText());
		alt.accept();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("Chrome");
		bu.launchURL("https://vinothqaacademy.com/alert-and-popup/");
		bu.MaximizeWindow();
		Thread.sleep(2000);
		
		By alertBox = By.xpath("//button[text()='Alert Box']");
		By confirmAlert = By.xpath("//button[text()='Confirm Alert Box']");
		By promptAlert = By.xpath("//button[text()='Prompt Alert Box']");
		
		
		ElementsUtility eu = new ElementsUtility(driver);
		
//		Generic Methods >> Added in the Element Utility also
		acceptAlert(alertBox);
		dismissAlert(confirmAlert);
		promptAlert(promptAlert, "No");
		
//		1) alert Box
//		To accept the alert
//		eu.doClick(alertBox);
//		Alert alt = driver.switchTo().alert();
//		System.out.println(alt.getText());
//		Thread.sleep(2000);
//		alt.accept();
//		Thread.sleep(2000);
////		to Dismiss the alert (same like press escape button)
//		eu.doClick(alertBox);
//		Alert alt1 = driver.switchTo().alert();
//		Thread.sleep(2000);
//		System.out.println(alt1.getText());
//		alt1.dismiss();
//		
////		2) Confirm alert
////		To accept the alert
//		eu.doClick(confirmAlert);
//		Alert alt2 = driver.switchTo().alert();
//		System.out.println(alt2.getText());
//		Thread.sleep(2000);
//		alt2.accept();
////		to Dismiss the alert (same like press escape button)
//		eu.doClick(confirmAlert);
//		Alert alt3 = driver.switchTo().alert();
//		System.out.println(alt3.getText());
//		Thread.sleep(2000);
//		alt3.dismiss();
//		
////		3) prompt alert box : we need to send keys
//		eu.doClick(promptAlert);
//		Alert alt4 = driver.switchTo().alert();
//		alt4.sendKeys("Yes");
//		System.out.println(alt4.getText());
//		Thread.sleep(2000);
//		alt4.accept();
//		
//		Thread.sleep(2000);
//		
//		eu.doClick(promptAlert);
//		Alert alt5 = driver.switchTo().alert();
//		alt5.sendKeys("No");
//		System.out.println(alt5.getText());
//		Thread.sleep(2000);
//		alt5.accept();
//		
//		Thread.sleep(2000);
//		
//		eu.doClick(promptAlert);
//		Alert alt6 = driver.switchTo().alert();
//		System.out.println(alt6.getText());
//		Thread.sleep(2000);
//		alt6.dismiss();
	}

}
