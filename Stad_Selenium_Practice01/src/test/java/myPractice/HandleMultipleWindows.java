package myPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import day56.ExceptionsUtility;

public class HandleMultipleWindows
{
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static WebDriver launchBrowser_initDriver(String browser) throws Exception
	{
		String browserName = browser.trim().toLowerCase();
		
		if(browserName == null || browserName.trim().isEmpty())
		{
			throw new Exception("Browser Name is Null, Please add valid browser");
		}
		else
		{
			switch(browserName) 
			{
			case "chrome": driver.set(new ChromeDriver());
			System.out.println(browserName + " Launched successfully");
			break;
			case "firefox" : driver.set(new FirefoxDriver());
			System.out.println(browserName + " Launched successfully");
			break;
			case "safari" : driver.set(new SafariDriver());
			System.out.println(browserName + " Launched successfully");
			break;
			case "edge" : driver.set(new EdgeDriver());
			System.out.println(browserName + " Launched successfully");
			break;
			default : throw new Exception("Browser name is Invalid, please add valid browser name");
			}
		}
		return driver.get();
	}
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
	public static void launchUrl(String url)
	{
		if(url==null || url.isEmpty() || (!(url.contains("http")) || !(url.contains("https"))))
		{
			throw new ExceptionsUtility("Invalid URL: Please check the url and add valid URL");
		}
		else
		{
			getDriver().get(url);
			System.out.println("Url launched successfully");
		}
	}
	

	@BeforeMethod 
	@Parameters("bN")
	public void setUp(String bN) throws Exception
	{
		launchBrowser_initDriver(bN);
		launchUrl("https://design.sniperai.com/");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void testMultipleWindows()
	{
		List<WebElement> socialMediaIcons = getDriver().findElements(By.xpath("//div[@class='col-xs-12 col-sm-4 text-center social-footer']/a"));
		
		String pw = getDriver().getWindowHandle();
		
		for(WebElement sm : socialMediaIcons)
		{
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
			sm.click();
			List<String> ind = new ArrayList<String>(getDriver().getWindowHandles());
			getDriver().switchTo().window(ind.get(1));
			wait.until(ExpectedConditions.urlContains("https://"));
			System.out.println(getDriver().getCurrentUrl());
			getDriver().close();
			getDriver().switchTo().window(pw);
			System.out.println(getDriver().getCurrentUrl());
		}		
	}
	
	@AfterMethod
	public void tearDown()
	{
		getDriver().quit();
		driver.remove();
	}

}
