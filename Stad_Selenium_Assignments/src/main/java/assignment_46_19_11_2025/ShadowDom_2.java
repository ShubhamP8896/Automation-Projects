package assignment_46_19_11_2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ShadowDom_2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.MaximizeWindow();
		bu.launchURL("https://dev.automationtesting.in/shadow-dom");
		
		ElementsUtility eu = new ElementsUtility(driver);
			
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement shadowElement = (WebElement) js.executeScript("return document.querySelector('#shadow-root').shadowRoot.querySelector('#shadow-element')");
		WebElement nestedShadowElement = (WebElement) js.executeScript("return document.querySelector('#shadow-root').shadowRoot.querySelector('#inner-shadow-dom').shadowRoot.querySelector('#nested-shadow-element')");
		WebElement multiNSElement = (WebElement) js.executeScript("return document.querySelector('#shadow-root').shadowRoot.querySelector('#inner-shadow-dom').shadowRoot.querySelector('#nested-shadow-dom').shadowRoot.querySelector('#multi-nested-shadow-element')");
		
		String elementName = shadowElement.getText();
		System.out.println(elementName);
		
		System.out.println(nestedShadowElement.getText());
		
		System.out.println(multiNSElement.getText());
//	
		
//		Using Search context
		
		SearchContext sc = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		WebElement sElement =sc.findElement(By.cssSelector("#shadow-element"));
		System.out.println(sElement.getText());
		
		SearchContext sc1 = sc.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		System.out.println(sc1.findElement(By.cssSelector("#nested-shadow-element")).getText());
		
		SearchContext sc2 = sc1.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		System.out.println(sc2.findElement(By.cssSelector("#multi-nested-shadow-element")).getText());
		
	}
	
}

