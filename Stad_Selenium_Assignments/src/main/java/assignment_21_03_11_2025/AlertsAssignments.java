package assignment_21_03_11_2025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsAssignments 
{
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		bu.launchURL("https://www.hyrtutorials.com/p/alertsdemo.html");
		bu.MaximizeWindow();
		
		By click1 = By.xpath("(//button[text()='Click me'])[1]");
		By click2 = By.xpath("(//button[text()='Click me'])[2]");
		By click3 = By.xpath("(//button[text()='Click me'])[3]");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		eu.doClick(click1);
		Thread.sleep(3000);
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
		Thread.sleep(2000);
		alt3.sendKeys("Shubham");
		System.out.println(alt3.getText());
		Thread.sleep(2000);
		alt3.accept();
		
//		Generic Methods
		eu.acceptAlert(click1);
		eu.dismissAlert(click2);
		eu.promptAlert(click3, "Shubham");
	}
}
