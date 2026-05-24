package practiceForInterview.stad_MyPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BottomPageLinks 
{
	static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	private static By list = By.xpath("//div[@class='col-sm-3']//ul[@class='list-unstyled']/li/a");
	
	public static WebDriver launchBrowser_initDriver(String browser)
	{
		switch(browser.trim().toLowerCase())
		{
		case "chrome": driver.set(new ChromeDriver());
		break;
		case "firefox": driver.set(new FirefoxDriver());
		break;
		default:
			System.out.println("Invalid Browser name");
		}
		return driver.get();
	}
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
	public static WebElement getElement(By locator)
	{
		return getDriver().findElement(locator);
	}
	
	public static List<WebElement> getElements(By locator)
	{
		return getDriver().findElements(locator);
	}
	
	public static void getLinks()
	{
		List<WebElement> footerLinks = getElements(list);
		
		for(WebElement fl : footerLinks)
		{
			System.out.println(fl.getText() + " : " +fl.getAttribute("href"));
		}
	}
	
	
	public static void main(String[] args) 
	{
		BottomPageLinks.launchBrowser_initDriver("chrome");
		getDriver().get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		getDriver().manage().window().maximize();
		
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		getLinks();
		
		
	}

}
