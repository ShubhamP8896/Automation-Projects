package assignment_32_10_11_2025;

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
		By textnavbar = By.xpath("//h3[text()='Navigation']");
		By textBottom = By.xpath("//code[text()='(bot.html)']");
		By frameMain = By.xpath("//frame[contains(@name,'main')]");
		
		
		WebElement mainFrame = eu.getElement(frameMain);
		
		WebElement BottomFrame = driver.findElement(By.xpath("//frame[@name='bot']"));
		
//		Frame by index
		driver.switchTo().frame(2);
		System.out.println(eu.getElementText(textMain));
		
//		for switch to main frame
		driver.switchTo().defaultContent();
		
//		Frame by Name / ID
		driver.switchTo().frame("navbar");
		System.out.println(eu.getElementText(textnavbar));
		
//		for switch to main frame
		driver.switchTo().defaultContent();
		
//		Frame By webElement
		driver.switchTo().frame(BottomFrame);
		System.out.println(eu.getElementText(textBottom));
		
//		for switch to main frame
		driver.switchTo().defaultContent();
		
	}


}
