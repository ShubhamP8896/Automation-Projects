package day60;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaits_clickable_and_selected_Methods 
{
	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By register = By.xpath("(//a[text()='Register'])[2]");
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
/// wait for element is clickable
///a] By locator :: It return the WebElement : An expectation for checking an element is visible and enabled such that you can click it.
		WebElement ra = wait.until(ExpectedConditions.elementToBeClickable(register));
		ra.click();
		
///b] By WebElement :: It return the WebElement  : An expectation for checking an element is visible and enabled such that you can click it.
		WebElement login = driver.findElement(By.xpath("(//a[text()='Login'])[2]"));
		WebElement lg = wait.until(ExpectedConditions.elementToBeClickable(login));
		lg.click();
	
/// wait for Element is selected
///a] By locator :: return Boolean >> true if selected else false
		 wait.until(ExpectedConditions.elementToBeSelected(register));
		 
///a] By WebElement :: return Boolean >> true if selected else false
		 wait.until(ExpectedConditions.elementToBeSelected(login));		
	}
//	Generic Methods for wait for element clickable
	public static WebElement wiatElementClickableByLocator(By locator, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static WebElement wiatElementClickableByWebElement(WebElement ElementName, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.elementToBeClickable(ElementName));
	}
	
//	Wait for Element is Selected or not :: It will check if the Element is selected or not
	public static boolean wiatElementIsSelectedByLocator(By locator, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.elementToBeSelected(locator));
	}
	
	public static boolean wiatElementIsSelectedByWebElement(WebElement ElementName, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.elementToBeSelected(ElementName));
	}
}
