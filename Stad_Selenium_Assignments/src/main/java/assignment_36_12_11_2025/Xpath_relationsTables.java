package assignment_36_12_11_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath_relationsTables 
{
	public static void main(String[] args) 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.MaximizeWindow();
		bu.launchURL("https://cosmocode.io/automation-practice-webtable/");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
//		Print the Capital, Currency and Primary language of the India country
		
		By country = By.xpath("//strong[text()='India']/parent::td/following-sibling::td"); 
//		Generic Method
//		eu.doGetTextList(country);	
		
//		Code
		
		List<WebElement> list = driver.findElements(country);
		
		for(WebElement l : list)
		{
			if(!l.getText().isBlank())
			{
				System.out.println(l.getText());
			}
		}	
		
//		Select the Check box where country is India
		By checkbox = By.xpath("//strong[text()='India']/parent::td/preceding-sibling::td/input");
		eu.doClick(checkbox);
		System.out.println("Clicked on the Checkbox");
		
		
		
	}


}
