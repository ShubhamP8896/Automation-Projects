package assignment_43_17_11_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SvgFlipkart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.MaximizeWindow();
		bu.launchURL("https://petdiseasealerts.org/forecast-map#/");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		WebElement frame = driver.findElement(By.cssSelector("iframe[id*='map-instance']"));
		
		driver.switchTo().frame(frame);
		
		By regions = By.xpath("//*[local-name()='svg' and @ id='map-svg']//*[name()='g' and @class='region']");
		
		List <WebElement> regionList = driver.findElements(regions);
		
		System.out.println("Number of Regions : " + regionList.size());
		
		System.out.println("Following is the List : ");
		
		for(WebElement rl : regionList)
		{
			if(!rl.getAttribute("id").isBlank())
			{
				System.out.println(rl.getAttribute("id"));
			}
		}
		
		System.out.println("-------------------------------------");
		
//		Generic method
//		eu.doGetAttributesList(regions, "id");
		
		By colarodo = By.xpath("//*[local-name()='svg']//*[name()='g']//*[name()='path' and @name='Colorado']");
		eu.doClick(colarodo);
		System.out.println("Clicked on the Colorado region");
		
		By subRegions = By.xpath("//*[local-name()='svg']//*[name()='g' and @id='colorado']//*[name()='g' and @class='subregion']//*[name()='path']");
		
		eu.doGetAttributesList(subRegions, "name");
		
	}
	
}

