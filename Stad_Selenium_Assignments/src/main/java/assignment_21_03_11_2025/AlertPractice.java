package assignment_21_03_11_2025;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPractice 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		
		driver.manage().window().maximize();
		
		WebElement singleAlert = driver.findElement(By.xpath("//button[text()='Alert']"));
		WebElement clickAndWait = driver.findElement(By.xpath("(//button[text()='Click Me'])[1]"));
		WebElement clickAndcnfOrDismiss = driver.findElement(By.xpath("(//button[text()='Click Me'])[2]"));
		WebElement promptAlert = driver.findElement(By.xpath("(//button[text()='Click Me'])[3]"));
		
		Actions act = new Actions(driver);
		act.click(singleAlert).build().perform();
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(2000);
		
		act.click(clickAndWait).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alt1 = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alt1.getText());
		alt1.accept();
		
		act.click(clickAndcnfOrDismiss).build().perform();
		Thread.sleep(2000);
		Alert alt2 = driver.switchTo().alert();
		System.out.println(alt2.getText());
		alt2.dismiss();
		Thread.sleep(2000);
		
		act.click(promptAlert).build().perform();
		
		Alert alt3 = driver.switchTo().alert();
		System.out.println(alt3.getText());
		
		alt3.sendKeys("Shubham Pawar");
		alt3.accept();
		
	}

}
