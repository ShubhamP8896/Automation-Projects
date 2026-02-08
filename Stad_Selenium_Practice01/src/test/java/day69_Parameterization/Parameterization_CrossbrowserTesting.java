package day69_Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_CrossbrowserTesting 
{
	WebDriver driver;
	BrowserUtility bu = new BrowserUtility();
	ElementsUtility eu;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void setUp(String browserN)
	{
		String browserName = browserN.toLowerCase().trim();
		switch(browserName)
		{
			case "chrome" :
			case "firefox" :
			case "edge" :
				driver = bu.launchBrowser(browserName);
				bu.MaximizeWindow();
				bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
				break;
			default :
				throw new ExceptionsUtility("InValid browser please provide valid browser");	
		}
		eu = new ElementsUtility(driver);
	}
	
	@Test(dataProvider = "dp")
	public void login(String userN , String Pass) throws InterruptedException
	{
		By username = By.cssSelector("input#input-email");
		By password = By.cssSelector("input#input-password");
		By loginButton = By.cssSelector("input[value='Login']");
		
		eu.doClear(username);
		eu.doClear(password);
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
	
	@DataProvider(name = "dp", indices = {0,1,2})
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
