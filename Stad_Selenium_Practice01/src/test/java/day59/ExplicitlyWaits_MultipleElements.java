package day59;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaits_MultipleElements 
{
	static WebDriver driver;
	
//	Generic Methods
	
	public static List<WebElement> waitPresenceOfElementLocated(By locator, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
	public static List<WebElement> waitVisibilityOfElementLocated(By locator, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public static List<WebElement> waitVisibilityOfElements(List <WebElement> list, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElements(list));
	}
	
	public static void main(String[] args) 
	{
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20_27");
			
		ElementsUtility eu = new ElementsUtility(driver);
		
		By footer = By.xpath("//footer//ul//li//a");
		List<WebElement> flinks = eu.getElements(footer);
//		1.
		List <WebElement> list1 = waitPresenceOfElementLocated(footer, 5);
		System.out.println(list1.size());
		for(WebElement fl : list1)
		{
			System.out.println(fl.getText());
		}
		
//		2.
		List <WebElement> list2 =waitVisibilityOfElementLocated(footer, 5);
		System.out.println(list2.size());
		for(WebElement fl : list2)
		{
			System.out.println(fl.getText());
		}
		
//		3.
		List <WebElement> list3 =waitVisibilityOfElements(flinks, 5);
		System.out.println(list3.size());
		for(WebElement fl : list3)
		{
			System.out.println(fl.getText());
		}
				
//		Generic Methods
		
		
//		Wait until one webElement is present
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		List<WebElement> footerlLinks = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footer));
//		System.out.println(footerlLinks.size());
//		for(WebElement fl : footerlLinks)
//		{
//			System.out.println(fl.getText());
//		}
////		Wait until all the webElements are present
//		List<WebElement> footerlLinks1 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footer));
//		System.out.println(footerlLinks1.size());
//		for(WebElement fl : footerlLinks1)
//		{
//			System.out.println(fl.getText());
//		}
		
		
	}
	
	
	
}
