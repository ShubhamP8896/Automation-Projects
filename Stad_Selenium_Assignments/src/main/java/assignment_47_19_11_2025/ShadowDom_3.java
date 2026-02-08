package assignment_47_19_11_2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ShadowDom_3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.MaximizeWindow();
		bu.launchURL("https://books-pwakit.appspot.com/");
		
		ElementsUtility eu = new ElementsUtility(driver);
			
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement shadowElement = (WebElement) js.executeScript("return document.querySelector('body > book-app').shadowRoot.querySelector('#input')");
		
		shadowElement.sendKeys("I read the books");	
		
		
//		Using Search context
		
		SearchContext sc = driver.findElement(By.cssSelector("body > book-app")).getShadowRoot();
		sc.findElement(By.cssSelector("#input")).sendKeys("I love to read books");
		
		
	}
	
}

