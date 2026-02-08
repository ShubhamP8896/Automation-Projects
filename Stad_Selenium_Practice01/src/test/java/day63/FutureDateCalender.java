package day63;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FutureDateCalender 
{
	static WebDriver driver;
	
	
	public static void selectDate(String day)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		By seleteDay = By.xpath("//a[text()='"+day+"']");
		wait.until(ExpectedConditions.elementToBeClickable(seleteDay)).click();
	}
	
	public static boolean leapYear(int y)
	{
		if ( (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0) )		
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void selectFutureOrPastDate(String monthYear, String day, By calenderTitle, By nextOrPreviousButton)
	{		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String month = monthYear.substring(0,monthYear.indexOf(" "));
		String year = monthYear.substring(monthYear.indexOf(" ")+1);
		int y = Integer.parseInt(year);
		int date = Integer.parseInt(day);	
		if(date <= 0 || date >31 )
		{
			System.out.println("InValid date [< 0 or >31], Please select the Valid date");
			return;
		}
		else if(month.equals("April") || month.equals("June") || month.equals("September") || month.equals("November") && date > 30)
		{
			System.out.println("InValid date[< 0 or > 30] , Please select the Valid date");
			return;
		}
		else if(month.equals("February") && leapYear(y) && date > 29 )
		{
			System.out.println("InValid date[< 0 or > 29] , Please select the Valid date");
			return;
		}
		else if(month.equals("February") && !leapYear(y) && date > 28 )
		{
			System.out.println("InValid date[< 0 or > 28] , Please select the Valid date");
			return;
		}
		else
		{
			while(true)
			{
				if(!(wait.until(ExpectedConditions.visibilityOfElementLocated(calenderTitle))).getText().equals(monthYear))
				{
					wait.until(ExpectedConditions.elementToBeClickable(nextOrPreviousButton)).click();
				}
				else
				{
					selectDate(day);
					System.out.println("Selected the Date : " + monthYear + " " + day );
					break;
				}
				
			}
		}
		
		
	}
	
	public static void main(String[] args)
	{		
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By firstCalender = By.id("datepicker");
		eu.doClick(firstCalender);
		
		By calTitle = By.xpath("//div[@class='ui-datepicker-title']");
		By nxtButton = By.xpath("//span[text()='Next']");
		By prevButton = By.xpath("//span[text()='Prev']");
		
//		Generic method :
		CalenderUtility cal = new CalenderUtility(driver);
		cal.selectFutureOrPastDate("December 2025" , "8", calTitle, nxtButton);
		
		
	}

}
