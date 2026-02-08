package assignment_51_20_11_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pagination_datatables 
{
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://datatables.net/examples/basic_init/zero_configuration.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(5000);
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By empName = By.xpath("//td[text()='New York']/preceding-sibling::td[@class='sorting_1']");
		By nextButton = By.xpath("//button[@aria-label='Next']");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		boolean lastpage=false;
		
		while(!lastpage)
		{
			if(eu.getElements(empName).size() > 0)
			{
				List <WebElement> empN = eu.getElements(empName);
				for(WebElement en : empN)
				{
					System.out.println("Name of employee where country is New York: " + en.getText());
				}
			}
			if(!(wait.until(ExpectedConditions.visibilityOfElementLocated(nextButton)).getAttribute("class").contains("disabled")))
			{
				wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
			}
			else
			{
				System.out.println("Searched All the pages");
				lastpage = true;
			}
 			
		}
		
	}

}
