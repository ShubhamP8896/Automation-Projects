package assignment_43_17_11_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeSvg
{
public static void main(String[] args) {
	
	BrowserUtility bu = new BrowserUtility();
	WebDriver driver = bu.launchBrowser("Chrome");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	bu.MaximizeWindow();
	bu.launchURL("https://petdiseasealerts.org/forecast-map#/");
	
	ElementsUtility eu = new ElementsUtility(driver);
	
	WebElement frame = driver.findElement(By.cssSelector("iframe[id*='map-instance']"));
	
	driver.switchTo().frame(frame);
	
	List<WebElement> regionsList = driver.findElements(By.xpath("//*[local-name() = 'svg' and @id ='map-svg']//*[name()='g' and @class='region']"));
	
	System.out.println("Number of Regions : " + regionsList.size());
	
	System.out.println("Following is the List : ");
	
	for(WebElement rl : regionsList)
	{
		if(!rl.getAttribute("id").isBlank())
		{
			System.out.println(rl.getAttribute("id"));
		}
	}
	
	driver.findElement(By.xpath("//*[local-name()='svg']//*[name() = 'g' and @id ='colorado']")).click();
}

}
