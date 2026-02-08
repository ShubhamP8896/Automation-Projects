package day54;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SvgPrograms
{
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.launchURL("https://petdiseasealerts.org/forecast-map#/");
		
		ElementsUtility eu = new ElementsUtility(driver);
		eu.switchToFrameIndex(0);
		
		By regions = By.xpath("//*[local-name()='svg']//*[name()='g' and @class='region']//*[name()='path']");
		
//		Get th List and count of the regions
		
//		eu.doGetAttributesList(regions, "name");
		
//		Now we have to click on the Texas region and then get the List and count in the Texas region
		
		By texasRegiosn = By.xpath("//*[local-name()='svg']//*[name()='g' and @class='region']//*[name()='path' and @name='Texas']");
		eu.doClick(texasRegiosn);
		
		By subregions = By.xpath("//*[local-name()='svg']//*[name()='g' and @class='rpath']//*[name()='g' and @class='subregion']//*[name()='path']");
		
		eu.doGetAttributesList(subregions, "name");
		
		
		
	}

}
