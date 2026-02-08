package assignment_45_19_11_2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ShadowDom_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.MaximizeWindow();
		bu.launchURL("https://selectorshub.com/xpath-practice-page/");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement username = (WebElement) js.executeScript("return document.querySelector('#userName').shadowRoot.querySelector('#kils')");
		WebElement pizzaName = (WebElement) js.executeScript("return document.querySelector('#userName').shadowRoot.querySelector('#app2').shadowRoot.querySelector('#pizza')");
		
		Actions act = new Actions(driver);
		act.scrollToElement(pizzaName);
		
//		Using the JavascriptExecutor
			
		username.sendKeys("shubham");
	
		pizzaName.sendKeys("Margherita");
		
//		Using Search context
		
		SearchContext sc = driver.findElement(By.cssSelector("div#userName")).getShadowRoot();
		sc.findElement(By.cssSelector("#kils")).sendKeys("Shubham");
		
		SearchContext sc1 = sc.findElement(By.cssSelector("div#app2")).getShadowRoot();
		sc1.findElement(By.cssSelector("#pizza")).sendKeys("double cheese");
		
	}
	
}

