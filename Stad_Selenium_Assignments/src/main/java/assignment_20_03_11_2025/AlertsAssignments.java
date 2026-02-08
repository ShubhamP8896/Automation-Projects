package assignment_20_03_11_2025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsAssignments 
{
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		bu.launchURL("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		bu.MaximizeWindow();
		
		By alert = By.xpath("//button[text()='Alert']");
		By click1 = By.xpath("(//button[text()='Click Me'])[1]");
		By click2 = By.xpath("(//button[text()='Click Me'])[2]");
		By click3 = By.xpath("(//button[text()='Click Me'])[3]");
		
		ElementsUtility eu = new ElementsUtility(driver);
		eu.doClick(alert);
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		eu.doClick(click1);
		Thread.sleep(6000);
		Alert alt1 = driver.switchTo().alert();
		System.out.println(alt1.getText());
		alt1.accept();
		
		eu.doClick(click2);
		Thread.sleep(2000);
		Alert alt2 = driver.switchTo().alert();
		System.out.println(alt2.getText());
		alt2.accept();
		
		eu.doClick(click3);
		Thread.sleep(2000);
		Alert alt3 = driver.switchTo().alert();
		System.out.println(alt3.getText());
		alt3.sendKeys("Shubham");
		Thread.sleep(3000);
		alt.accept();
		
//		Generic Methods
		eu.acceptAlert(alert);
		eu.acceptAlert(click1);
		eu.dismissAlert(click2);
		eu.promptAlert(click3, "Shubham");
	}
}
