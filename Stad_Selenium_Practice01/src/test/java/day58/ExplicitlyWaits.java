package day58;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaits 
{
	static WebDriver driver;
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20_27");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By mac = By.xpath("//a[text()='iMac']");
		
///		Wait for presence of the Element, it not ensure the element is visible.
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		/// >>>> this return Web Element so we need to store that as WebElement
//		WebElement mc = wait.until(ExpectedConditions.presenceOfElementLocated(mac));
//		mc.click();
//		
/////		This method also return WebElement so we used webElement to store that, Also it will ensure that element is present and visible
//		WebElement mc1 = wait.until(ExpectedConditions.visibilityOfElementLocated(mac));
//		mc1.click();
		waitForElementPresent(mac, 10).click();
		
	}
//	Generic Methods:
	public static WebElement waitForElementPresent(By locator, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static WebElement waitForElementVisible(By locator, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
}
