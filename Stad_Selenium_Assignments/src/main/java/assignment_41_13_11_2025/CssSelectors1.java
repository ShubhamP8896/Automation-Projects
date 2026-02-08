package assignment_41_13_11_2025;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssSelectors1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.MaximizeWindow();
		bu.launchURL("https://proleed.academy/exercises/selenium/online-job-application-form.php");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By name = By.cssSelector("#name");
		By email = By.cssSelector("#email");
		By phone = By.cssSelector("#phone");
		By cBox = By.cssSelector("input#employed");
		By submit = By.cssSelector("#add");
		By cFile = By.cssSelector("#resume");
		
		eu.addInput(name, "Shubham");
		eu.doClear(email);
		eu.addInput(email, "Pawar@test.com");
		eu.addInput(phone, "895654564");
		eu.doClick(cBox);
		
		eu.addInput(cFile, "C:\\Users\\ADMIN\\Downloads\\David-Warner-Resume.pdf");

		By d1 = By.cssSelector("[name='position']");
		eu.selectByVisibleText(d1, "Quality Analyst");
		
		By d2 = By.cssSelector("[name='platform']");
		eu.selectByVisibleText(d2, "Friend Recommendation");
		Thread.sleep(3000);
		eu.doClick(submit);
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}
	
}

