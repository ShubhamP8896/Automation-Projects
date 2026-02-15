package tecnicalRound090226;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesProgram 
{
	static WebDriver driver;
	
	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,2500)");
		
		driver.findElement(By.xpath("//a[text() = '1']")).click();
		driver.findElement(By.xpath("//a[text() = '2']")).click();
		driver.findElement(By.xpath("//a[text() = '3']")).click();
		driver.findElement(By.xpath("//a[text() = '4']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='productTable']//tr/td"));
		System.out.println("Following is the List:- ");
		System.out.println("Count of list:- " + list.size());
		for(WebElement data :  list)
		{
			if(!(data.getText().isEmpty()))
			{
				System.out.println(data.getText());
			}
			else
			{
				continue;
			}
		}
		
	}

}
