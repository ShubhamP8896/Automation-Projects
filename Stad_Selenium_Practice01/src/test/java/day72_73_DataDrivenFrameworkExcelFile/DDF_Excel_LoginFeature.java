package day72_73_DataDrivenFrameworkExcelFile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DDF_Excel_LoginFeature 
{
	WebDriver driver;
	BrowserUtility bu = new BrowserUtility();
	ElementsUtility eu;
	TakeScreenshotUtility ts;
	
	@BeforeMethod
	public void setUp()
	{
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		eu = new ElementsUtility(driver);
		ts = new TakeScreenshotUtility(driver);	
	}
	
	@Test
	public void loginWithMultipleUsers()
	{
		By uNmae = By.cssSelector("#input-email");
		By pass = By.cssSelector("#input-password");
		By loginButton = By.xpath("//input[@value='Login']");
		By logOut = By.xpath("(//a[text()='Logout'])[2]");
		By loginOption = By.xpath("(//a[text()='Login'])[2]");
		
		for(int i = 1; i<=ExcelUtility.getRowCount("C:\\Users\\ADMIN\\OneDrive\\Desktop\\StadAutomation\\Automation.xlsx", "NaveenCred"); i++)
		{
			String userName = ExcelUtility.getCellData("C:\\Users\\ADMIN\\OneDrive\\Desktop\\StadAutomation\\Automation.xlsx", "NaveenCred", i, 1);
			String passWord = ExcelUtility.getCellData("C:\\Users\\ADMIN\\OneDrive\\Desktop\\StadAutomation\\Automation.xlsx", "NaveenCred", i, 2);
			System.out.println("Username : "+ i + " " +userName);
			System.out.println("Password : "+ i + " " +passWord);
//			Add User-name
			eu.doClear(uNmae);
			eu.addInput(uNmae, userName);
//			Add Password
			eu.doClear(pass);
			eu.addInput(pass, passWord);
//			Click on the Login button
			eu.doClick(loginButton);
			
//			Check result
			if(bu.getCurrentPageURL().contains("account/account"))
			{
				System.out.println("Passed");
				ExcelUtility.setCellData("C:\\Users\\ADMIN\\OneDrive\\Desktop\\StadAutomation\\Automation.xlsx", "NaveenCred", i, 3, "Passed");
				ExcelUtility.fillGreenColor("C:\\Users\\ADMIN\\OneDrive\\Desktop\\StadAutomation\\Automation.xlsx", "NaveenCred", i, 3);
				ts.takeScreenshots("C:\\Users\\ADMIN\\OneDrive\\Desktop\\StadAutomation\\" , "Passed");
//				Logout and click on the Login option
				eu.doClick(logOut);
				eu.doClick(loginOption);
			}
			else
			{
				System.out.println("Failed");
				ExcelUtility.setCellData("C:\\Users\\ADMIN\\OneDrive\\Desktop\\StadAutomation\\Automation.xlsx", "NaveenCred", i, 3, "Failed");
				ExcelUtility.fillRedColor("C:\\Users\\ADMIN\\OneDrive\\Desktop\\StadAutomation\\Automation.xlsx", "NaveenCred", i, 3);
				ts.takeScreenshots("C:\\Users\\ADMIN\\OneDrive\\Desktop\\StadAutomation\\" , "Failed");
			}
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		bu.quitBrowser();
		System.out.println("Browser Quite : End of Program");
	}
	

}
