package assignment_15_31_10_2025;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreStringIntoArray_Practice 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		List<WebElement> listLinks = driver.findElements(By.xpath("(//div[@class='sc-ace17a57-0 fTLQUd'])[1]//li/a"));
		
		List<String> linksList = new ArrayList<String>();
		
		for(WebElement links: listLinks)
		{
			String value = links.getAttribute("href");
			linksList.add(value);
		}
		
		System.out.println(linksList.size());
		System.out.println(linksList);
		
		
	}

}
