package tecnicalRound090226;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts
{
	static WebDriver driver;
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	
	public static void acceptAert(By locator)
	{
		getElement(locator).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}
	public static void dismissAlert(By locator)
	{
		getElement(locator).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
	}
	public static void promptAlert(By locator, String text)
	{
		getElement(locator).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys(text);
		alt.accept();
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500)");
	
		By simpleAlert = By.xpath("//button[@id='alertBtn']");
		By confmAlert = By.xpath("//button[@id='confirmBtn']");
		By promptAlert = By.xpath("//button[@id='promptBtn']");
		
		acceptAert(simpleAlert);
		acceptAert(confmAlert);
		dismissAlert(confmAlert);
		promptAlert(promptAlert, "Hello Java");
		
	}

}
