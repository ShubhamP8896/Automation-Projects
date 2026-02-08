package day63;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender 
{
	static WebDriver driver;	
	
	public static void selectDate(By calenderLocator, By dateLocator)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(calenderLocator)).click();
		wait.until(ExpectedConditions.elementToBeClickable(dateLocator)).click();
	}
	
	
	public static void main(String[] args) 
	{		
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		
//		-----------Direct click on the date and select--------------
		By first = By.id("first_date_picker");
		eu.doClick(first);		
		By date = By.xpath("//a[text()='25']");
//		eu.doClick(date);
		
//		Generic method for Select the current month date
//		selectDate(first, date);
		
//		For print all the dates of the the current month >> Also we are able to select date using the for loop
		
		System.out.println("Month : "+driver.findElement(By.xpath("(//div[@class='ui-datepicker-title']/span)[1]")).getText());
		List <WebElement> dates = driver.findElements(By.xpath("//td[@data-handler='selectDay']/a"));
		for(WebElement d : dates)
		{
			System.out.println(d.getText());
			if(d.getText().equals("25"))
			{
				d.click();
				System.out.println("Selected the date : " + d.getText());
			}
		}
		
	
		
		
		
		
		
		
		
	}
	

}
