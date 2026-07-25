package p001_Practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P001_VerifyBrokenLinks 
{
	private static final ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static WebDriver initDriver_launchBrowser(String browserName)
	{
		try 
		{
		
			if(driver.get() == null)
			{
				if(browserName == null || browserName.trim().isEmpty())
				{
					throw new IllegalArgumentException("Browser name cannot be null");
				}
				
				switch(browserName.toLowerCase().trim())
				{
				case "chrome": driver.set(new ChromeDriver()); break;
				case "firefox": driver.set(new FirefoxDriver()); break;
				case "edge": driver.set(new EdgeDriver()); break;
				default:
				    throw new IllegalArgumentException("Unsupported browser: " + browserName);
				}
			}
		}
		catch(Exception e)
		{
			throw new RuntimeException("Unable to initialize browser : " + browserName, e);
		}
		return driver.get();
	}
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
	public static void closeBrowser()
	{
	    if(getDriver()!=null)
	    {
	        getDriver().close();
	    }
	}
	
	public static void quitBrowser()
	{
		if(driver.get() != null)
		{
			getDriver().quit();
			driver.remove();
		}
	}
	
	@BeforeMethod
	public void setUp()
	{
		initDriver_launchBrowser("chrome");
		getDriver().manage().window().maximize();
		getDriver().get("https://design.sniperai.com/");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void verifyBrokenLinks()
	{		
		List<WebElement> links  = getDriver().findElements(By.xpath("//div[contains(@class, 'text-center social-footer')]/a"));
		
		for (WebElement link : links) {

            String url = link.getAttribute("href");

            if (url == null || url.trim().isEmpty()) {
                continue;
            }

            try {

                URL linkUrl = new URL(url);

                HttpURLConnection connection =
                        (HttpURLConnection) linkUrl.openConnection();

                connection.setConnectTimeout(5000);

                connection.connect();

                int responseCode = connection.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println(url + " --> Broken Link (" + responseCode + ")");
                } else {
                    System.out.println(url + " --> Valid Link (" + responseCode + ")");
                }

                connection.disconnect();

            } catch (Exception e) {
                System.out.println(url + " --> Invalid URL");
            }
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
//		quitBrowser();
	}
	
	

}
