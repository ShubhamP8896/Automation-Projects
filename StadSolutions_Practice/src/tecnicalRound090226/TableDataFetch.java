package tecnicalRound090226;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDataFetch 
{
	static WebDriver driver;
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public static void getTextData(By locator)
	{
		List<WebElement> list = driver.findElements(locator);
		System.out.println("Following is the table Data: - ");
		for(WebElement data : list)
		{
			System.out.println(data.getText());
		}
	}
	
	public static void main(String[] args) 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		List<WebElement> list = driver.findElements(By.xpath("//table[@name='BookTable']//tr/td"));
//		System.out.println("Following is the table Data: - ");
//		for(WebElement data : list)
//		{
//			System.out.println(data.getText());
//		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,1500)");
		
		By datalist = By.xpath("//table[@name='BookTable']//tr/td");
		getTextData(datalist);
		
	}
	
}
