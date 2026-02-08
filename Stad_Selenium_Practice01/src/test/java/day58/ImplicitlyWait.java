package day58;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitlyWait 
{
	static WebDriver driver;
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		
		/**
		 * Implicit wait is the global wait which is applied for all the web elements from this programs
		 * Implicit wait is for only Web Elements not for Non web Elements like alerts, Page title and URLs
		 * Generally we didn't use this\
		 * Add this after URL open
		 */
//		It will wait for 10 seconds for the Web Elements, if found then action is completed on that Web Element if not then it search for 10 sec
//		then show timeOut exception
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By button = By.xpath("(//button[text()='Click Me'])[1]");
		
		eu.doClick(button);
		
//		Example of the Explicit wait for the non webElement
		
//		Generic method
		Alert alt = waitForAlertPresent(10);
		System.out.println(alt.getText());
		alt.accept();
		
		
	}

	public static Alert waitForAlertPresent(int duration)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 return wait.until(ExpectedConditions.alertIsPresent());
	}

}
