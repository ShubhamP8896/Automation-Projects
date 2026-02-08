package assignment_35_10_11_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFrames 
{
	public static void main(String[] args) 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.MaximizeWindow();
		bu.launchURL("https://scriptng.com/practise-site/selenium-iframe-automation-practice/");
		
		ElementsUtility eu = new ElementsUtility(driver);

		By iFrame = By.cssSelector("#elementor-tab-title-1683");
		eu.doClick(iFrame);
		System.out.println("Clicked on I frame button");
		
		eu.switchToFrameNameId("simple-iframe");
		
		By button = By.cssSelector("button#iframe-button");
		eu.doClick(button);
		
		By text = By.xpath("//div[text()='Button clicked!']");
		System.out.println(eu.getElementText(text));
		
		driver.switchTo().defaultContent();
		
		By button1 = By.xpath("//button[text()='Load Nested Content']");
		eu.doClick(button1);
		eu.switchToFrameNameId("parent-iframe");
		
		eu.switchToFrameNameId("nested-iframe");
		
		By inputBox = By.cssSelector("#nested-input");
		eu.addInput(inputBox, "Hello Java");
		
		driver.switchTo().defaultContent();
		
		By createIF = By.xpath("//button[text()='Create IFrame']");
		By removeIF = By.xpath("//button[text()='Remove IFrame']");
		
		eu.doClick(createIF);
		
		eu.switchToFrameNameId("dynamic-iframe");
		
		By dropdown = By.cssSelector("#dynamic-select");
		eu.selectByVisibleText(dropdown, "Option 2");
		
		driver.switchTo().defaultContent();
		
		By toggleIF = By.xpath("//button[text()='Toggle Visibility']");
		eu.doClick(toggleIF);
		
		eu.switchToFrameNameId("hidden-iframe");
		
		By checkBox = By.id("hidden-checkbox");
		eu.doClick(checkBox);
		
		System.out.println("Done");
		
		
		
		
		
		
	}


}
