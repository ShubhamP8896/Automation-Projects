package myPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collections_1 
{
	static By webElementsList = By.xpath("//div[@class='col-xs-12 col-sm-4 text-center social-footer']//a");
	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://design.sniperai.com/");
		
		String parentWindow = driver.getWindowHandle();
		
		List<WebElement> list = driver.findElements((webElementsList));
		for(WebElement slist : list)
		{
			slist.click();
			List<String> childWindows = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(childWindows.get(1));
			System.out.println(driver.getCurrentUrl());
			driver.close();
			driver.switchTo().window(parentWindow);
		}
		
	}

}
