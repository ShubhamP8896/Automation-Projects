package assignment_48_19_11_2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ShadowDom_4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.MaximizeWindow();
		bu.launchURL("https://practice.expandtesting.com/shadowdom");
		
		ElementsUtility eu = new ElementsUtility(driver);
			
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement shadowElement = (WebElement) js.executeScript("return document.querySelector('#shadow-host').shadowRoot.querySelector('#my-btn')");
		
		System.out.println(shadowElement.getText());
		
//		Using Search context
		
		SearchContext sc = driver.findElement(By.cssSelector("#shadow-host")).getShadowRoot();
		System.out.println(sc.findElement(By.cssSelector("#my-btn")).getText());
		
		
	}
	
}

