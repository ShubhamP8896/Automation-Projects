package assignment_19_03_11_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassPractice 
{
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		By doubleClick = By.cssSelector("#doubleBtn");
		
		By rightClick = By.id("rightBtn");
		
		By dragElement = By.id("dragItem");
		
		By dropZone = By.id("dropZone");
		
		By hoover = By.id("tooltipTarget");
		
		Actions act = new Actions(driver);
		
		WebElement doubleClicks = driver.findElement(doubleClick);
		WebElement rightClicks = driver.findElement(rightClick);
		WebElement dragElements = driver.findElement(dragElement);
		WebElement dropZones = driver.findElement(dropZone);
		WebElement hoovers = driver.findElement(hoover);

		act.doubleClick(doubleClicks).perform();
		Thread.sleep(3000);
		act.contextClick(rightClicks).perform();
		Thread.sleep(3000);
		act.dragAndDrop(dragElements, dropZones).perform();
		Thread.sleep(3000);
		act.moveToElement(hoovers).perform();
		Thread.sleep(3000);
		
		
		
		
	}

}
