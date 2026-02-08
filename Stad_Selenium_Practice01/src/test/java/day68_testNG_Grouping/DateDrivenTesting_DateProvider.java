package day68_testNG_Grouping;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DateDrivenTesting_DateProvider 
{
	WebDriver driver;
	
	BrowserUtility bu = new BrowserUtility();
	ElementsUtility eu;
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{	
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		used here because we need to use the same driver for run the script
		eu = new ElementsUtility(driver);
	}
	
	@Test(dataProvider = "loginData")
	public void login(String userN , String Pass) throws InterruptedException
	{
		By username = By.cssSelector("input#input-email");
		By password = By.cssSelector("input#input-password");
		By loginButton = By.cssSelector("input[value='Login']");
		
		eu.addInput(username, userN);
		eu.addInput(password, Pass);
		eu.doClick(loginButton);
		Thread.sleep(2000);
		String actualUrl = bu.getCurrentPageURL();
		String expectedUrl = "https://naveenautomationlabs.com/opencart/index.php?route=account/account";
		Thread.sleep(2000);
		Assert.assertEquals(actualUrl, expectedUrl);
		
		By logOut = By.xpath("(//a[text() = 'Logout'])[2]");
		eu.doClick(logOut);
	}
	
	@DataProvider(indices = {1,2})
	public String[][] loginData()
	{
		String data [][] = 
			{
				{"shubhamP1@test.com","shub@123"},
				{"shubhamP3@test.com","shub@123"},
				{"shubhamP2@test.com","shub@123"}
			};
		return data;
	}
	
	@AfterMethod
	public void tearDown()
	{
		bu.quitBrowser();		
	}

}
