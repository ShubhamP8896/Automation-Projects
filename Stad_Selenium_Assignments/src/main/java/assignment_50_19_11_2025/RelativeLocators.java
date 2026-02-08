package assignment_50_19_11_2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class RelativeLocators 
{	
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.MaximizeWindow();
		bu.launchURL("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By email = By.xpath("(//tr//td[text()='kierra@example.com'])[1]");
		WebElement eml = eu.getElement(email);
		
		WebElement above = driver.findElement(with(By.tagName("td")).above(eml));
		System.out.println(above.getText());
		
		WebElement below = driver.findElement(with(By.tagName("td")).below(eml));
		System.out.println(below.getText());
		
		WebElement right = driver.findElement(with(By.tagName("td")).toRightOf(eml));
		System.out.println(right.getText());
		
		WebElement left = driver.findElement(with(By.tagName("td")).toLeftOf(eml));
		System.out.println(left.getText());
		
	}
	
}


		