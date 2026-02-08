package day63;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender_PractiveForMe 
{
	static WebDriver driver;
	public static void selectDate(String day)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		By selectDay = By.xpath("//a[text()='"+day+"']");
		wait.until(ExpectedConditions.elementToBeClickable(selectDay)).click();
	}
	
	public static boolean isLeapYear(int y)
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
	
	public static void selectFutureOrPastDate(String monthYear, String day, By calendarTitle, By nextOrPreviousButton)
	{
		String month = monthYear.substring(0, monthYear.indexOf(" "));
		String year = monthYear.substring(monthYear.indexOf(" ")+1);
		int y = Integer.parseInt(year);
		int date = Integer.parseInt(day);	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		if(month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May") || month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") || month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November") || month.equalsIgnoreCase("December"))
		{
			if((date <= 0 || date > 31) || (y < 2000 || y > 2050))
			{
				System.out.println("Invalid date, Please add the valid date. : " + monthYear + ", Day : " +  day  );
				return;
			}
			else if(month.equalsIgnoreCase("April") || month.equalsIgnoreCase("June") || month.equalsIgnoreCase("September") || month.equalsIgnoreCase("November") && date > 30 || (y < 2000 || y > 2050))
			{
				System.out.println("Invalid date, Please add the valid date. : " + monthYear + ", Day : " +  day  );
				return;
			}
			else if(month.equalsIgnoreCase("February") && isLeapYear(y) && date > 29 || (y < 2000 || y > 2050))
			{
				System.out.println("Invalid date, Please add the valid date. : " + monthYear + ", Day : " +  day  );
				return;
			}
			else if(month.equalsIgnoreCase("February") && !isLeapYear(y) && date > 28 || (y < 2000 || y > 2050))
			{
				System.out.println("Invalid date, Please add the valid date. : " + monthYear + ", Day : " +  day  );
				return;
			}
			else
			{
				while(true)
				{
					if(!(wait.until(ExpectedConditions.visibilityOfElementLocated(calendarTitle))).getText().equalsIgnoreCase(monthYear))
					{
						wait.until(ExpectedConditions.elementToBeClickable(nextOrPreviousButton)).click();;
					}
					else
					{
						selectDate(day);
						System.out.println("Selected the date : " + monthYear + ", Day: " + day);
						break;
					}
				}
			}
		}
		else
		{
			System.out.println("Month is inValid : " + month);
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollTo(0,300)");
		
		By firstCalender = By.id("first_date_picker");
		eu.doClick(firstCalender);
		
		By calTitle = By.xpath("//div[@class='ui-datepicker-title']");
		By nxtButton = By.xpath("//span[text()='Next']");
		By prevButton = By.xpath("//span[text()='Prev']");
		
//		selectDate("25");
		selectFutureOrPastDate("february 2024" , "29" , calTitle, prevButton);
		
	}

}
