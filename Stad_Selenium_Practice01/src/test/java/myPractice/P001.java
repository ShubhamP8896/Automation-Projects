package myPractice;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P001 
{
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	public static String dateTime = LocalDateTime.now().toString().replace(":", "_");
	
	public static WebDriver launchBrowser_initDriver(String browserName)
	{
		if(browserName.isEmpty() || browserName == null)
		{
			System.out.println("Please add valid Browser Name");
		}
		else
		{
			switch(browserName.trim().toLowerCase())
			{
			case "chrome" : driver.set(new ChromeDriver()); break; 
			case "firefox" : driver.set(new FirefoxDriver()); break; 
			case "safari" : driver.set(new SafariDriver()); break; 
			case "edge" : driver.set(new EdgeDriver()); break; 
			default : System.out.println("Browser is not valid, Please provide valid browser name");
			}
		}
		
		return driver.get();
	}
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
	public static void launchURL(String url) throws Exception
	{
		if(url.isEmpty() || url == null || !url.contains("http"))
		{
			System.out.println("URL is not valid");
		}
		else 
		{
			getDriver().get(url);
		}
		
	}
	
	public static void main(String[] args) throws Exception 
	{
		P001.launchBrowser_initDriver("chrome");
		getDriver().manage().window().maximize();
		
		P001.launchURL("https://selectorshub.com/xpath-practice-page/");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollTo(0, 500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, -500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		Thread.sleep(2000);
		
		WebElement tb = getDriver().findElement(By.xpath("//div[@data-id='33c37eb']"));
		
		TakesScreenshot ts = (TakesScreenshot) getDriver();
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ADMIN\\OneDrive\\Desktop\\ScreenshotsP\\Screenshot" + dateTime +".png");
		FileHandler.copy(source, dest);
 		
		js.executeScript("arguments[0].scrollIntoView(true);" , tb);
		File source1 = tb.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Users\\ADMIN\\OneDrive\\Desktop\\ScreenshotsP\\WebElement" + dateTime +".png");
		FileHandler.copy(source1, dest1);
		
		
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10), Duration.ofSeconds(2));
		wait.ignoring(NoSuchElementException.class);
		wait.withMessage("Practice");
		
		wait.until(ExpectedConditions.visibilityOf(tb));
		
		Wait<WebDriver> fw = new FluentWait<WebDriver>(getDriver())
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class)
				.withMessage("Practice");
		
		fw.until(ExpectedConditions.presenceOfAllElementsLocatedBy(null));
		
		
		
		
		
	}

}
