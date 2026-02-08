package day57;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pagination2MultipleSelection2_ForPractice 
{
	public static void main(String[] args) throws InterruptedException
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By country = By.xpath("//td[text()='Indiav']");
		By checkBox = By.xpath("//td[text()='India']/preceding-sibling::td[@class='column-1']/input");
		By nextButton = By.cssSelector("button.dt-paging-button.next");
		
		boolean lastPage = false;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		while(!lastPage)
		{
			if(eu.getElements(country).size()>0)
			{
				List<WebElement> cBoxes = eu.getElements(checkBox);
				
				for(WebElement cb : cBoxes )
				{
					wait.until(ExpectedConditions.elementToBeClickable(cb)).click();
				}
				if(!eu.getElement(nextButton).getAttribute("class").contains("disabled"))
				{
					eu.doClick(nextButton);
				}
				else
				{
					System.out.println("Pages are End");
					lastPage = true;
				}
				
			}
			else
			{
				// India not found → go to next page
		        if (!eu.getElement(nextButton).getAttribute("class").contains("disabled")) 
		        {
		            eu.doClick(nextButton);
		        } 
		        else 
		        {
		            System.out.println("India not found in any page.");
		            break;
		        }
			}
		}
		
	}
	
}



