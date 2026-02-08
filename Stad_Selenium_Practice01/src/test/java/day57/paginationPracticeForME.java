package day57;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class paginationPracticeForME 
{
	 public static void main(String[] args) throws InterruptedException {
	        BrowserUtility bu = new BrowserUtility();
	        WebDriver driver = bu.launchBrowser("chrome");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        bu.launchURL("https://selectorshub.com/xpath-practice-page/");
	        
	        ElementsUtility eu = new ElementsUtility(driver);
	        
	        // Locator for the country name in the table
	        By country = By.xpath("//td[text()='Hong Kong']");
	        
	        // Locator for the checkbox corresponding to the 'Hong Kong' entry
	        By checkBox = By.xpath("//td[text()='Hong Kong']/preceding-sibling::td[@class='column-1']/input");
	        
	        // Locator for the 'Next' button
	        By nextButton = By.cssSelector("button.dt-paging-button.next");
	        
//	        We Used while loop if we don;t know the end of the loop
	        
	        boolean found = false;
	        
	        while(!found)
	        {
	        	if(eu.getElements(country).size()>0)
	        	{
	        		eu.doClick(checkBox);
	        		System.out.println("Country is found in the list and Checkbox is selected");
	        		found = true;
	        		break;
	        	}
	        	else
	        	{
	        		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        		if(!eu.getElement(nextButton).getAttribute("class").contains("disabled"))
	        		{
	        			wait.until(ExpectedConditions.presenceOfElementLocated(nextButton)).click();
	        		}
	        		else
	        		{
	        			System.out.println("Not found!");
	        			break;
	        		}
	        	}
	        	
	        }
	        
	 }

}
