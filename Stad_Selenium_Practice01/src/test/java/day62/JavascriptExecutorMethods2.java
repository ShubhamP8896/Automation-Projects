package day62;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptExecutorMethods2
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{	
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));		
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		bu.launchURL("https://www.amazon.com/");
		ElementsUtility eu = new ElementsUtility(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
////		For go backword		
//		js.executeScript("history.go(-1)");
//		
////		for go Forward
//		js.executeScript("history.go(1)");
//		
////		For refresh the page
//		js.executeScript("history.go(0)");	
		
//		eu.forwardBackRelodeJsScript(-1);
//		eu.forwardBackRelodeJsScript(1);
//		eu.forwardBackRelodeJsScript(0);
		
		JavaScriptExecutorUtility jsu = new JavaScriptExecutorUtility(driver); 
		
//		Perform click using the JavascriptExecutor and Give border while your on that element We need the webElement for that > 
		WebElement Email = driver.findElement(By.id("input-email"));
		WebElement Passwprd = driver.findElement(By.id("input-password"));
		WebElement Submit = driver.findElement(By.cssSelector("[value='Login']"));
		
		drawBorderJsScript(Email);
		Thread.sleep(3000);
		jsu.addInputByIDUsingJsScript("input-email", "shubham@test.com");
		
		drawBorderJsScript(Passwprd);
		Thread.sleep(3000);
		jsu.addInputByIDUsingJsScript("input-password", "shubham@123");
		
		drawBorderJsScript(Submit);
		Thread.sleep(3000);
		doClickJsScript(Submit);
		
		
		
	}
//	Generic methods  : we are used this if there is no forward and backward for the browser level then we able to use this
//	1 : Forward, -1: Backward and 0 Refresh the page
	public static void forwardBackRelodeJsScript(int number)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go("+number+")");
	}
	
	public static void doClickJsScript(WebElement element_name)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",element_name);
	}
	public static void drawBorderJsScript(WebElement element_name)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element_name); 
	}
	
}
