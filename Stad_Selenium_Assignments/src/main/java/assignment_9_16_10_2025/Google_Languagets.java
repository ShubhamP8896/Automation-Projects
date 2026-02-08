package assignment_9_16_10_2025;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Google_Languagets
{
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		bu.launchURL("https:/www.google.co.in");
		bu.MaximizeWindow();
		
		ElementsUtility eu = new ElementsUtility(driver);
		By languages = By.xpath("//div[@id='SIvCob']/a");  
		
		eu.doGetLinksList(languages, "href");
 		eu.doGetTextList(languages);
		
		bu.quitBrowser();
	}

}
