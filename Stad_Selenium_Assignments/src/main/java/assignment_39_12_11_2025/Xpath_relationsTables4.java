package assignment_39_12_11_2025;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath_relationsTables4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.MaximizeWindow();
		bu.launchURL("https://vinothqaacademy.com/webTable/");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By name = By.cssSelector("input#nameInput");
		By role = By.cssSelector("input#roleInput");
		By email = By.cssSelector("input#emailInput");
		By location = By.cssSelector("input#locationInput");
		By department = By.cssSelector("input#departmentInput");
		By add = By.cssSelector("button#addBtn");
		
		eu.addInput(name, "Shubham");
		eu.addInput(role, "QA");
		eu.addInput(email, "shubham@test.com");
		eu.addInput(location, "Ahmedabad");
		eu.addInput(department, "RST");
		eu.doClick(add);
		
		Thread.sleep(5000);
		
		By cbox = By.xpath("//td[text()='Shubham']/preceding-sibling::td/input");
		eu.doClick(cbox);
		
		Thread.sleep(5000);
		
		By delete = By.cssSelector("button#deleteBtn");
		eu.doClick(delete);
	}
	
}

