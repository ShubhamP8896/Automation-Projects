package tecnicalRound090226;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles
{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,1250)");
		
		driver.findElement(By.xpath("//input[@id='singleFileInput']")).sendKeys("C:\\Users\\ADMIN\\OneDrive\\Desktop\\How to Install Eclipse and Java for automation.docx");
		driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();
		
	}
}


