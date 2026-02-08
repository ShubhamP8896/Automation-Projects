package day56;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators

//above() , below(), toLeftOf(), toRightOf(), near()

{
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.launchURL("https://selectorshub.com/xpath-practice-page/");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By admin = By.xpath("//td[text()='Admin']");
		WebElement admin_ele = eu.getElement(admin);
		
		WebElement userName = driver.findElement(with(By.xpath("//a[text()='John.Smith']")).toLeftOf(admin));
		System.out.println(userName.getText());
		System.out.println("----------------");
		
		WebElement EmpName = driver.findElement(with(By.tagName("td")).toRightOf(admin));
		System.out.println(EmpName.getText());
		System.out.println("----------------");
		
		WebElement above = driver.findElement(with(By.tagName("td")).above(admin));
		System.out.println(above.getText());
		System.out.println("----------------");
		
		WebElement below = driver.findElement(with(By.tagName("td")).below(admin));
		System.out.println(below.getText());
		System.out.println("----------------");
		
	}

}
