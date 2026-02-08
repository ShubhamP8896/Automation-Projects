package day60;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaits 
{
	static WebDriver driver;
	public static void main(String[] args) {
		
	BrowserUtility bu = new BrowserUtility();
	driver = bu.launchBrowser("chrome");
	bu.MaximizeWindow();
	bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	ElementsUtility eu = new ElementsUtility(driver);
	By button = By.xpath("//a[text()='s SelectorsHub Youtube Channel  ']");
	
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofMillis(2000))
			.ignoring(NoSuchElementException.class)
			.ignoring(ElementNotInteractableException.class)
			.withMessage("Element is not found, Please check the xpath");
	
//	wait.until(ExpectedConditions.elementToBeClickable(button));
	
//	Same WebDriverWait we are able to use.
	
	WebDriverWait wWait=new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(2000));
		wWait.ignoring(NoSuchElementException.class);
		wWait.ignoring(ElementNotInteractableException.class);
		wWait.withMessage("Element is not found, Please check the xpath");
	
		wWait.until(ExpectedConditions.elementToBeClickable(button));
	
	}
//	Generic Method
	public static WebElement waitForVisibilityFluentWiat(By locator, int TimeOut, int pollingInterval, String message)
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(TimeOut))
				.pollingEvery(Duration.ofMillis(pollingInterval))
				.ignoring(NoSuchElementException.class)
				.ignoring(ElementNotInteractableException.class)
				.withMessage(message);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	

}
