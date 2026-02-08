package assignment_38_12_11_2025;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath_relationsTables3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.MaximizeWindow();
		bu.launchURL("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		ElementsUtility eu = new ElementsUtility(driver);
	
		By tableData = By.xpath("//table[@id='customers']//tr//td//span");
			
		System.out.println("data size : " + eu.getElements(tableData).size());
		System.out.println("Following are the data : ");
		for (WebElement td : eu.getElements(tableData))
		{
			if(!td.getText().isBlank())
			{
				System.out.println(td.getText());
			}
		}
		
//		Print the country,city,height, built and rank where the structure is Burj Khalifa
		
		By str = By.xpath("(//span[text()='Burj Khalifa']/ancestor::tr/child::td/span)");
		List <WebElement> strct = eu.getElements(str);
		
		System.out.println("Following is the data where Structure is Burj Khalifa : ");
		
		for (WebElement td1 : strct)
		{
			if(!td1.getText().isBlank())
			{
				System.out.println(td1.getText());
			}
		}
		
		
	}
	
}

