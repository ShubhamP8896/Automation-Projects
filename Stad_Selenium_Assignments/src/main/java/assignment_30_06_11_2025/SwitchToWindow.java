package assignment_30_06_11_2025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToWindow 
{
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		bu.launchURL("https://www.techrover.us/");
		bu.MaximizeWindow();
		Thread.sleep(3000);
		
		By socialMedia = By.xpath("//p[@class='footer-details']/a");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		List<WebElement> icons = driver.findElements(socialMedia);
		
		for(WebElement sicons : icons)
		{
			eu.multipleWindo(sicons);
		}
		
	}

}
