package assignment_52_20_11_2025;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class CaledarA3 
{
	static WebDriver driver;
	
	public static void selectDate(String day)
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class)
				.ignoring(ElementNotInteractableException.class)
				.withMessage("Element is not found or not clickable");
		
		By date = By.xpath("(//span [@class='flatpickr-day' and text()='"+day+"'])[1]");
		wait.until(ExpectedConditions.elementToBeClickable(date)).click();
		System.out.println("Date Selected from the calender, Date = " + date);
	}
	public static boolean isLeapyear(int y)
	{
		if((y%4 == 0 && y%100 !=0) || (y%400 == 0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	public static void main(String[] args)
	{
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By startDateCalenter = By.cssSelector("input#datetimepicker1");
		By enDateCalender = By.cssSelector("input#datetimepicker2");
		
		eu.doClick(startDateCalenter);
		selectDate("22");
		
		
		
	}
	

}
