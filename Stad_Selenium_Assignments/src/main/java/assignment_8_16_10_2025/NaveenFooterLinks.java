package assignment_8_16_10_2025;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NaveenFooterLinks
{
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		bu.MaximizeWindow();
		
		ElementsUtility eu = new ElementsUtility(driver);
		By footerLinks = By.xpath("/html/body/footer/div/div//a");  
		
		eu.doGetLinksList(footerLinks, "href");
 		eu.doGetTextList(footerLinks);
		
		bu.quitBrowser();
	}

}
