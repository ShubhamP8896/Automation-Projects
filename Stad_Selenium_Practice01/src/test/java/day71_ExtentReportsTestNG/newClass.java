package day71_ExtentReportsTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class newClass
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		Thread.sleep(2000);
		
		By logintButton = By.xpath("//input[@value='Login']");

		driver.findElement(logintButton).click();
		
		Thread.sleep(2000);
		
		WebElement field = driver.findElement(By.id("email"));

		String css = field.getCssValue("border-color");
		String cls = field.getAttribute("aria-invalid");
		System.out.println(cls);
		Assert.assertTrue(css.contains("255,0,0") || cls.contains("true") );
	}

}
