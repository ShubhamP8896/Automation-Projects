package assignment_51_20_11_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrapingCourseEcommerce 
{
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://www.scrapingcourse.com/ecommerce/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavaScriptExecutorUtility jsu = new JavaScriptExecutorUtility(driver);
		jsu.scrollByMethod(0, 300);
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By productList = By.xpath("//li/a//h2");
		By nextButton = By.xpath("(//a[@class='next page-numbers'])[1]");
		By clickAddToCart = By.xpath("(//h2[text()='Sprite Stasis Ball 75 cm'])[3]/parent::a/following-sibling::a[text()='Add to cart']");
		By viewCart = By.xpath("(//h2[text()='Sprite Stasis Ball 75 cm'])[3]/parent::a/following-sibling::a[@title='View cart']");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		String actualUrl = "";
		
		boolean found=false;
		
		while(!found)
		{
			if(eu.getElements(productList).size()>0)
			{
				List <WebElement> list = eu.getElements(productList);
				for(WebElement plist : list )
				{
					if(plist.getText().equals("Sprite Stasis Ball 75 cm"))
					{
						wait.until(ExpectedConditions.elementToBeClickable(clickAddToCart)).click();
						wait.until(ExpectedConditions.elementToBeClickable(viewCart)).click();
						actualUrl = bu.getCurrentPageURL();
						System.out.println(actualUrl);
						found = true;
						break;
					}
				}
			}
			if(eu.getElements(nextButton).size()>0)
			{
				wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
			}
			else
			{
				System.out.println("Searched All the Pages and the result is not found");
				break;
			}
		}
		
		if(actualUrl.contains("ecommerce/cart/"))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		
		
	}

}
