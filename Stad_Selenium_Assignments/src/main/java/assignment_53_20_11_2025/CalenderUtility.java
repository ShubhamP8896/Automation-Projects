package assignment_53_20_11_2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderUtility 
{
	private WebDriver driver;
//	Constructor : Because the driver is not null when we used this
	public CalenderUtility(WebDriver driver)
	{
		this.driver = driver;
	}
	/**
	 * This utility is created where we need to use the calendar and select the future and Past dates
	 * There are 3 methods 
	 */
//	This is for only select the date from current month, Click on the calendar and then click on the date
	public void selectDate(By calenderLocator, By dateLocator)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(calenderLocator)).click();
		wait.until(ExpectedConditions.elementToBeClickable(dateLocator)).click();
	}
	
/// Below I added the method for select the date which is used in the below function as well for selecting the date
///	Select the date
	public void selectDate(String day)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		By seleteDay = By.xpath("//a[text()='"+day+"']");
		wait.until(ExpectedConditions.elementToBeClickable(seleteDay)).click();
	}
//	Check the Year is leap year or not
	public boolean isLeapYear(int y)
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
//	This is for Select the Future or Past date, Need to provide the Month Year, day, and calendar Title By locator and Next/Previous button By locator
	public void selectFutureOrPastDate(String monthYear, String day, By calendarTitle, By nextOrPreviousButton)
	{
		String month = monthYear.substring(0, monthYear.indexOf(" "));
		String year = monthYear.substring(monthYear.indexOf(" ")+1);
		int y = Integer.parseInt(year);
		int date = Integer.parseInt(day);	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		if(month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") ||
				month.equalsIgnoreCase("May") || month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")
				|| month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")
				|| month.equalsIgnoreCase("December"))
		{
			if((date <= 0 || date > 31 ) || (y < 2000 || y > 2050))
			{
				System.out.println("Invalid date, Please add the valid date. : " + monthYear + ", Day : " +  day  );
				return;
			}
			else if((month.equalsIgnoreCase("April") || month.equalsIgnoreCase("June") || month.equalsIgnoreCase("September")
					|| month.equalsIgnoreCase("November")) && (date > 30 || (y < 2000 || y > 2050)))
			{
				System.out.println("Invalid date, Please add the valid date. : " + monthYear + ", Day : " +  day  );
				return;
			}
			else if((month.equalsIgnoreCase("February")) && (isLeapYear(y) && ( date > 29 || (y < 2000 || y > 2050))))
			{
				System.out.println("Invalid date, Please add the valid date. : " + monthYear + ", Day : " +  day  );
				return;
			}
			else if((month.equalsIgnoreCase("February")) && (!isLeapYear(y) && date > 28 || (y < 2000 || y > 2050)))
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
}
