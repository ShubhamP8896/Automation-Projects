package day47_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass1 
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
			
		ElementsUtility eu = new ElementsUtility(driver);
		WebElement drag = eu.getElement(dragElement);
		WebElement drop = eu.getElement(dropElement);
		WebElement dclick = eu.getElement(doubleClick);
		WebElement rclick = eu.getElement(rightClick);
		WebElement mouse = eu.getElement(mouseEvent);
		
		Actions act = new Actions(driver);
//		act.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		
//		Direct Drag and drop Method
		act.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2000);
		
//		Double Click
		act.doubleClick(dclick).build().perform();
		Thread.sleep(2000);
		
//		Right Click
		act.contextClick(rclick).build().perform();
		Thread.sleep(2000);
		
//		Click method of action class
		act.click(mouse).build().perform();
		
		Thread.sleep(3000);
//		SendKeys method of action class
		By input = By.id("textbox");
		WebElement ip = eu.getElement(input);
		act.click(ip).build().perform();
		act.sendKeys(ip, "Shubham").build().perform();
		
	}

}
