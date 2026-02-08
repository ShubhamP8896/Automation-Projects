package assignment_51_20_11_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PaginationMdBootstrap 
{	
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.MaximizeWindow();
		bu.launchURL("https://mdbootstrap.com/docs/standard/data/datatables");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By empName = By.xpath("//table[@id='exampleTable']//td[text()='San Francisco']/preceding-sibling::td[@data-mdb-field='field_0']");
		By nextButton = By.xpath("(//button[contains(@class,'table-pagination-right')])[1]");
		WebElement nxb = eu.getElement(nextButton);
		
		boolean lastpage=false;
		
		while(!lastpage)
		{
			if(eu.getElements(empName).size() > 0)
			{
				List <WebElement> empN = eu.getElements(empName);
				for(WebElement en : empN)
				{
					System.out.println("Name of employee where country is San Francisco: " + en.getText());
				}
			}
			if(nxb.isEnabled())
			{
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
				wait.until(ExpectedConditions.elementToBeClickable(nxb)).click();
			}
			else
			{
				System.out.println("Searched All the pages");
				lastpage = true;
			}
 			
		}
		
	}
	
}


		