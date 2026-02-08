package day55;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShadowDom
{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.launchURL("https://selectorshub.com/xpath-practice-page/");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
//		1} Using the Java script Executor Interface
//		Its type conversion
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
////		Explicit casting
//		WebElement userName = (WebElement) js.executeScript("return document.querySelector('#userName').shadowRoot.querySelector('#kils')");
//		userName.sendKeys("Hello Java");
//		
////		for nested shadow dom
//		WebElement pizzaType = (WebElement) js.executeScript("return document.querySelector('#userName').shadowRoot.querySelector('#app2').shadowRoot.querySelector('#pizza')");
//		pizzaType.sendKeys("corn Pizza");
//		
////		2} Using the css selectors with search context interface
////		a. first find the shadow host using CSS  
////		Shadow returns the searchContext so we need to store that with Object
//		SearchContext sc = driver.findElement(By.cssSelector("#userName.jackPart")).getShadowRoot();
//		
////		b.Then user the reference variable find the css path of the web element  >> driver is not work here
//		sc.findElement(By.id("kils")).sendKeys("Hello");
//		
////		for nested shadow dom
//		SearchContext sc1 = sc.findElement(By.cssSelector("div#app2")).getShadowRoot();
//		sc1.findElement(By.id("pizza")).sendKeys("Margherita");
		
		javaScriptExecutorM("#userName", "#kils").sendKeys("Hello Java");
		
	}
	
	public static WebElement javaScriptExecutorM(String hostCss, String elementCss)
	{
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    return (WebElement) js.executeScript(
	        "return document.querySelector(arguments[0]).shadowRoot.querySelector(arguments[1]);",
	        hostCss, elementCss
	    );
	}
}
