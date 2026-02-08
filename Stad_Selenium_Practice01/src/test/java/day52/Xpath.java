package day52;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Q} Fetch the runs balls fours and sixes with strike rate of the Harry Tactor player in first Innings
 * 
 * We used the xpath axis/relations to find that xpath
 * 
 *parent, child, sibling, preceding-sibling, following-sibling
 */

public class Xpath 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.launchURL("https://www.cricbuzz.com/live-cricket-scorecard/135041/ban-vs-ire-1st-test-ireland-tour-of-bangladesh-2025");
		bu.MaximizeWindow();
		Thread.sleep(3000);
		
		ElementsUtility eu = new ElementsUtility(driver);
		
//		By score = By.xpath("(//div[@id='scard-team-27-innings-1']//a[contains(text(),'Harry Tector')]/parent::div/following-sibling::div[contains(@class,'flex justify-center items-center')])[position()>5]");
//		
//		List<WebElement> summary = driver.findElements(score);
//		
//		for (WebElement e : summary)
//		{
//			System.out.println(e.getText());
//		}
		
		getSocreSummary("Harry Tector");
		getSocreSummary("Cade Carmichael");
		getSocreSummary("Stirling");
		getSocreSummary("Lorcan Tucker (wk)");
		
		
	}
	
//	Generic Method : Xpath is same we just pass the Name of the player for whose we want the data
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static void getSocreSummary(String name)
	{
By score = By.xpath("(//div[@id='scard-team-27-innings-1']//a[contains(text(),'"+name+"')]/parent::div/following-sibling::div[contains(@class,'flex justify-center items-center')])[position()>5]");
		
		List<WebElement> summary = driver.findElements(score);
		System.out.println(name);
		for (WebElement e : summary)
		{
			if(!e.getText().isBlank())
			{
				System.out.println(e.getText());
			}
			
		}
	}
	
	
	
}
