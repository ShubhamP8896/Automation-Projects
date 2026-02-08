package assignment_19_03_11_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsAssignments
{
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By click = By.xpath("//button[text()='Click Me']");
		By rightClick = By.xpath("//button[text()='Right Click Me']");
		By doubleClick = By.xpath("//button[text()='Double Click Me']");
		
		Actions act = new Actions(driver);
		WebElement cl = eu.getElement(click);
		act.click(cl).perform();
		
		WebElement rcl = eu.getElement(rightClick);
		act.contextClick(rcl).perform();
		
		WebElement dcl = eu.getElement(doubleClick);
		act.doubleClick(dcl).perform();
		
////		Genetic Methods
//		eu.doClickActions(click);
//		eu.rightClick(rightClick);
//		eu.doubleClick(doubleClick);
		
	}

}
