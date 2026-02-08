package assignment_51_20_11_2025;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlayGroundEcommerce2 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://ecommerce-playground.lambdatest.io/index.php?route=product/category&path=57");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavaScriptExecutorUtility jsu = new JavaScriptExecutorUtility(driver);
		jsu.scrollByMethod(0, 300);
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By allproducts = By.xpath("//div/h4/a");
		By ipodClassic = By.xpath("(//a[text()='iPod Classic'])[2]");
		By nextButton = By.xpath("//li/a[text()='>']");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		boolean found = false;
		String actualURL = "";
		String expectedURL = "https://ecommerce-playground.lambdatest.io/index.php?route=product/product&path=57&product_id=48";
		while(!found)
		{
			if(eu.getElements(allproducts).size() > 0)
			{
				List <WebElement> itemList = eu.getElements(allproducts);
				for(WebElement ele : itemList )
				{
					if(ele.getText().equals("iPod Classics"))
					{
						wait.until(ExpectedConditions.elementToBeClickable(ipodClassic)).click();
						actualURL = bu.getCurrentPageURL();
						found = true;
						break;
					}
				}
			}
			if (eu.getElements(nextButton).size()>0)
			{
				wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
				System.out.println("Searching the next page");
			}
			else
			{
				System.out.println("Searched all the pages");
				break;
			}
		}
		
		if(actualURL.equals(expectedURL))
		{
			System.out.println("Product is found and Test case is passed");
		}
		else
		{
			System.out.println("Product is not found on the page");
		}
		
	}

}
