package assignment_11_27_10_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dropdown_Genericmethods 
{
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility butil = new BrowserUtility();
		WebDriver driver = butil.launchBrowser("Chrome");
		butil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		butil.MaximizeWindow();
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		By login = By.xpath("//input[@value='Login']");
		By tablet = By.linkText("Tablets");
		By addtoCart = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[7]");
		By checkOut = By.linkText("Checkout");
		By estimate = By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a");
		By country = By.id("input-country");
		By region = By.id("input-zone");
		By postcode = By.id("input-postcode");
		
		ElementsUtility eu = new ElementsUtility(driver);
		eu.addInput(email, "shubham5@test.com");
		eu.addInput(password, "Shubham@123");
		eu.doClick(login);
		Thread.sleep(2000);
		eu.doClick(tablet);
		eu.doClick(addtoCart);
		eu.doClick(checkOut);
		eu.doClick(estimate);
		
//		Drop down
		eu.doClick(country);
//		eu.selectByIndex(country, 2);
//		eu.selectByValue(country, "99");
		eu.selectByVisibleText(country, "India");
		
		eu.doClick(region);
//		eu.selectByIndex(region, 1);
//		eu.selectByValue(region, "1493");
		eu.selectByVisibleText(region, "Maharashtra");
		
		eu.addInput(postcode, "431605");
		
		System.out.println("Program End");
		
//		butil.quitBrowser();
		
		
	}
}
