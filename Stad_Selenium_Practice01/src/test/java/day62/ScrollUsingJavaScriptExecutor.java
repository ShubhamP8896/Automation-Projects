package day62;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollUsingJavaScriptExecutor 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.launchURL("https://selectorshub.com/xpath-practice-page/");
		
		WebElement username = driver.findElement(By.xpath("//a[text()='Kevin.Mathews']"));
		
//		Scroll using scrollto() method
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0,500)");
//		Thread.sleep(2500);

		scrollToMethod(0,1000);
//		Thread.sleep(3000);
		
//		Scroll Using scrollBy() method
//		js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(2500);
		
//		Scroll up to Bottom of the page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		Thread.sleep(2500);
		
//		Scroll up to top of the page
//		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
//		Thread.sleep(2500);
				
//		Scroll up to Specific Element
//		js.executeScript("arguments[0].scrollIntoView(true);" , username );
//		Thread.sleep(2500);	
		
//		Using the Generic Methods
		scrollToMethod(0,500);
		Thread.sleep(2500);
		scrollByMethod(0,500);
		Thread.sleep(2500);
		scrollUpToBottom(0);
		Thread.sleep(2500);
		scrollBottomToUp(0);
		Thread.sleep(2500);
		scrollUpTOSpecificElement(username);
		Thread.sleep(2500);
		
	}
//	ScrollTO
	public static void scrollToMethod(int xPixel , int yPixel)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+xPixel+"," +yPixel+")");
	}
//	scrollBy
	public static void scrollByMethod(int xPixel , int yPixel)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+xPixel+"," +yPixel+")");
	}
//	up tp botton
	public static void scrollUpToBottom(int xPixel)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+xPixel+",document.body.scrollHeight)");
	}
// bottom to Up
	public static void scrollBottomToUp(int yPixel)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight ,"+yPixel+")");
	}
//	Up to specific elemen
	public static void scrollUpTOSpecificElement(WebElement elementName)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)" , elementName);
	}
	
}
