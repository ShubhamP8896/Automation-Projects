package assignment_31_06_11_2025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToWindow 
{
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		bu.launchURL("https://www.pinterest.com/");
		bu.MaximizeWindow();
		Thread.sleep(3000);
		
		By socialMedia = By.xpath("//div[@class='ADXRXN LbyOQL']//a");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		List<WebElement> icons = driver.findElements(socialMedia);
		
		for(WebElement sicons : icons)
		{
			eu.multipleWindo(sicons);
		}
		
		System.out.println(bu.getCurrentPageURL());
		
	}

}
