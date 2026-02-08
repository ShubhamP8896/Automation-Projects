package day59;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaits_Alerts 
{
	static boolean result;
	static WebDriver driver;
	public static void main(String[] args) 
	{
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		WebElement clickAlert = driver.findElement(By.xpath("(//button[text()='Click Me'])[1]"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(clickAlert)).click();
		
		Alert alt = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alt.getText());
		alt.accept();
		
	/// Generic Method
	
		Alert alt1 = eu.waitForAlertPresent(10);
		System.out.println(alt1.getText());
		alt1.accept();
	}
	
}
