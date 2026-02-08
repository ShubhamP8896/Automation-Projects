package assignment_34_10_11_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFrames 
{
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://www.tutorialspoint.com/selenium/practice/frames.php");
		
		ElementsUtility eu = new ElementsUtility(driver);

		By text = By.xpath("//h1[text() = 'Selenium - Automation Practice Form']");
		By link = By.cssSelector(".external-link");	
		
		By frame1 = By.xpath("(//iframe)[1]");
		By frame2 = By.xpath("(//iframe)[2]");
		
		WebElement f1 = driver.findElement(frame1);
		WebElement f2 = driver.findElement(frame2);
		
		eu.SwithToFrameByWebElement(f1);
		System.out.println(eu.getElementText(text));
		
		driver.switchTo().defaultContent();
		
		eu.SwithToFrameByWebElement(f2);
		System.out.println(eu.getElementText(text));
				
		driver.switchTo().defaultContent();
		
		driver.quit();
	}


}
