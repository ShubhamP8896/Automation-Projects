package day62;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorMethods 
{
	static WebDriver driver;
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));		
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		Get the page title using the JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String pageTitle = js.executeScript("return document.title").toString();
		System.out.println(pageTitle);
		
//		Get the Element using the JavascriptExecutor
		WebElement ele = (WebElement) js.executeScript("return document.getElementById('input-firstname')");
//		ele.sendKeys("shubham");
		
//		OR add the value='Value' >> after the Getting element
		
		js.executeScript("document.getElementById('input-firstname').value='shubham'");
	}
//	Generic methods to get the page title using java script executor
	
	public static String getTitleJsScript()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return js.executeScript("return document.title").toString();
	}
//	Get the Element using the JavascriptExecutor and send the value  >> There multiple mehtods for using classname.. tagname.. and the name attributs
	public static void addInputByIDUsingJsScript(String id, String value)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('"+id+"').value='"+value+"'");
	}	
	}
