package day50;

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
		bu.launchURL("https://www.londonfreelance.org/courses/frames/index.html");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		List <WebElement> frames = driver.findElements(By.xpath("//frame"));
		System.out.println("Total frames available = " + frames.size());
		
		By textMain = By.xpath("//h2[contains(text(),'Title bar')]");
		By frameMain = By.xpath("//frame[contains(@name,'main')]");
		WebElement mainFrame = eu.getElement(frameMain);
		
//		Frame by index
		driver.switchTo().frame(2);
		System.out.println(eu.getElementText(textMain));
		
//		for switch to main frame
		driver.switchTo().defaultContent();
		
//		Frame by Name / ID
		driver.switchTo().frame("main");
		System.out.println(eu.getElementText(textMain));
		
//		for switch to main frame
		driver.switchTo().defaultContent();
		
//		Frame By webElement
		driver.switchTo().frame(mainFrame);
		System.out.println(eu.getElementText(textMain));
		
	}

}
