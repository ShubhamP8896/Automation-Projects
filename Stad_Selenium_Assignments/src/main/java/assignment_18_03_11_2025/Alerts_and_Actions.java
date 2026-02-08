package assignment_18_03_11_2025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alerts_and_Actions 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://artoftesting.com/samplesiteforselenium");
		
		By textBox = By.id("fname");
		By doubliClick = By.id("dblClkBtn");
		By radioButton = By.id("male");
		By checkBoxA = By.xpath("//input[@value='Automation']");
		By checkBoxP = By.xpath("//input[@value='Performance']");
		By dropDown = By.id("testingDropdown");
		By alert1 = By.xpath("//button[text()='Generate Alert Box']");
		By confirmAlert = By.xpath("//button[text()='Generate Confirm Box']");
		By drag = By.xpath("//img[@id='myImage']");
		By drop = By.id("targetDiv");
		
		ElementsUtility eu = new ElementsUtility(driver);
		eu.addInput(textBox, "Shubham");
		Thread.sleep(2000);
		System.out.println("Added text");
		
		eu.doubleClick(doubliClick);
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		System.out.println("Perform double click");
		
		eu.doClick(radioButton);
		Thread.sleep(1000);
		System.out.println("Clicked on the radio Buttom");
		
		eu.doClick(checkBoxA);
		eu.doClick(checkBoxP);
		Thread.sleep(2000);
		System.out.println("Selected  both checkboxes");
		
		eu.selectByVisibleText(dropDown, "Performance Testing");
		Thread.sleep(2000);
		System.out.println("Selected option from the dropdown");
		
		eu.acceptAlert(alert1);
		Thread.sleep(2000);
		System.out.println("Aler accept");
		
		eu.acceptAlert(confirmAlert);
		System.out.println("Accepth Confirmation alert");
		
		eu.dragAndDrom(drag, drop);
		System.out.println("drag and drop done");

		
		
	}

}
