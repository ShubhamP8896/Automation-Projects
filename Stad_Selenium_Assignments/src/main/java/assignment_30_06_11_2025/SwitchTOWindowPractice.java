package assignment_30_06_11_2025;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTOWindowPractice 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://design.sniperai.com/");
		
		String pw = driver.getWindowHandle();
		
		List<WebElement> sList=driver.findElements(By.xpath("//div[contains(@class , 'social-footer')]/a"));
		
		for(WebElement e : sList)
		{
			e.click();
		}
		
		System.out.println(driver.getCurrentUrl());
		
		Set<String> st = driver.getWindowHandles();
		Iterator<String> it = st.iterator();
		
		System.out.println(st);
		
		while(it.hasNext())
		{
				String cw = it.next();	
			if(!pw.equals(cw))
			{
				driver.switchTo().window(cw);
				System.out.println(driver.getCurrentUrl());
				driver.close();
				driver.switchTo().window(pw);
			}
		}
	}

}
