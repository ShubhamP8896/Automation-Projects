package assignment_52_20_11_2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calenderA1 
{
	static WebDriver driver;
	
	public static void selectDate(String date)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		By selecteDateLocator = By.xpath("//a[text()='"+date+"']");
		wait.until(ExpectedConditions.elementToBeClickable(selecteDateLocator)).click();
	}
	
	public static boolean leapYear(int year)
	{
		if((year%4 == 0 && year%100 != 0) || (year%400 == 0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void selectFutureOrPastDates(String monthYear, String date,By datePickerTitle, By nextOrPreviousButton)
	{
		String month = monthYear.substring(0, monthYear.indexOf(" "));
		String year = monthYear.substring(monthYear.indexOf(" ")+1);
		int y = Integer.parseInt(year);
		int day = Integer.parseInt(date);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		if(month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || 
				month.equalsIgnoreCase("May") || month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") || 
				month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November") || month.equalsIgnoreCase("December"))
		{
			if(day <= 0 || day > 31 || y < 2000 || y > 2050 )
			{
				System.out.println("Invalid date : " +day+ " or year : " +y+  " please add valid date and year");
				return;
			}
			else if(month.equalsIgnoreCase("April") || month.equalsIgnoreCase("June") || month.equalsIgnoreCase("September") || 
					month.equalsIgnoreCase("November") && (day > 30 || ( y < 2000 || y > 2050 )))
			{
				System.out.println("Invalid date : " +day+ " or year : " +y+  " please add valid date and year");
				return;
			}
			else if(month.equalsIgnoreCase("February") && leapYear(y) &&  (day > 29 || (y < 2000 || y > 2050 )))
			{
				System.out.println("Invalid date : " +day+ " or year : " +y+  " please add valid date and year");
				return;
			}
			else if(month.equalsIgnoreCase("February") && !leapYear(y) && (day > 28 || (y < 2000 || y > 2050 )))
			{
				System.out.println("Invalid date : " +day+ " or year : " +y+  " please add valid date and year");
				return;
			}
			else
			{
				while(true)
				{
					if(!wait.until(ExpectedConditions.elementToBeClickable(datePickerTitle)).getText().equalsIgnoreCase(monthYear))
					{
						wait.until(ExpectedConditions.elementToBeClickable(nextOrPreviousButton)).click();
					}
					else
					{
						selectDate(date);
						System.out.println("Selected the date : " + monthYear + ", Day: " + date);
						break;
					}
				}
			}
			
		
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.launchURL("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		bu.MaximizeWindow();
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		By Calender = By.cssSelector("input#datepicker");
		wait.until(ExpectedConditions.elementToBeClickable(Calender)).click();
//		selectDate("22");
		
		By dpickTitle = By.xpath("//div[@class='ui-datepicker-title']");
		By nextButton = By.xpath("//span[text()='Next']");
		By previousButton = By.xpath("//span[text()='Prev']");
		
		selectFutureOrPastDates("February 2050", "28" , dpickTitle, nextButton);
		
	}

}
