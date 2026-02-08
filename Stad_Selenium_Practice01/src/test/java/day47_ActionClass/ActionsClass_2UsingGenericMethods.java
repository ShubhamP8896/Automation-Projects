package day47_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionsClass_2UsingGenericMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		bu.launchURL("https://vinothqaacademy.com/mouse-event/");
		bu.MaximizeWindow();
		Thread.sleep(2000);
	
		By dragElement = By.id("draggableElement");
		By dropElement = By.id("droppableElement");
		By doubleClick = By.id("dblclick");
		By rightClick = By.id("rightclick");
		By mouseEvent = By.xpath("(//a[text()='Mouse Event'])[3]");
		By input = By.id("textbox");
		
		ElementsUtility eu = new ElementsUtility(driver);
//		drag and drop
		eu.dragAndDrom(dragElement, dropElement);
		Thread.sleep(3000);
		
//		Send Keys
		eu.addInputActions(input, "Shubham Pawar");
		Thread.sleep(3000);
		
//		Double click
		eu.doubleClick(doubleClick);
		Thread.sleep(3000);
		
//		Right Click
		eu.rightClick(rightClick);
		Thread.sleep(3000);
		
//		Single left Click
		eu.doClickActions(mouseEvent);
		
		
	}
}
