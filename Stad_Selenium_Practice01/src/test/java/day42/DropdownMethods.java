package day42;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownMethods 
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
		
//		these are the drop downs
		
		ElementsUtility eu = new ElementsUtility(driver);
		eu.addInput(email, "shubham5@test.com");
		eu.addInput(password, "Shubham@123");
		eu.doClick(login);
		Thread.sleep(2000);
		eu.doClick(tablet);
		eu.doClick(addtoCart);
		eu.doClick(checkOut);
		eu.doClick(estimate);
		
		By country = By.id("input-country");
		By region = By.id("input-zone");
		
		WebElement countryDropdown = driver.findElement(country);
		WebElement regionDropdown = driver.findElement(region);
		
//		Perform action on the drop down
		eu.doClick(country);
		Select sc = new Select(countryDropdown);
		sc.selectByIndex(2);
//		sc.selectByValue("99");
//		sc.selectByVisibleText("India");
		
		Thread.sleep(2000);
		
		eu.doClick(region);
		Select sr = new Select(regionDropdown);
		sr.selectByIndex(1);
//		sr.selectByValue("1493");
//		sr.selectByVisibleText("Maharashtra");	
		
		System.out.println("Country and region is selected and Program end");
		
		butil.quitBrowser();
		
	}

}
