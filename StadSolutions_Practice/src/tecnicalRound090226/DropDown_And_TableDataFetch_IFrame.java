package tecnicalRound090226;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_And_TableDataFetch_IFrame 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500)");
		
//		By dropdown = By.xpath("//select[@id='dropdown-class-example']/option");
		By tableData = By.xpath("(//table[@id='product'])[2]//tr//td");
		
		List<WebElement> linkList = driver.findElements(tableData);
		System.out.println("Count :" + linkList.size());
		System.out.println("Below is the List :");
		for(WebElement lists : linkList)
		{
			System.out.println(lists.getText());
		}
		
		
		js.executeScript("window.scrollTo(0,700)");
		
		driver.switchTo().frame("courses-iframe");
		By cources = By.xpath("(//a[text() = 'Courses'])[1]");
		driver.findElement(cources).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		js.executeScript("window.scrollTo(0, -1000)");
		driver.findElement(By.xpath("//button[text()='Home']")).click();

	}
	
	
	
}
