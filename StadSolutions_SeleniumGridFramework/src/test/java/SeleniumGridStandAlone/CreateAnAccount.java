package SeleniumGridStandAlone;

import org.testng.annotations.Test;

import com.pages.CreateAccountPage;
import com.qa.util.BrowserUtility;

public class CreateAnAccount extends BaseTestClass
{
	CreateAccountPage cp = new CreateAccountPage();
	BrowserUtility bu = new BrowserUtility();
	private String url = "https://naveenautomationlabs.com/opencart/index.php?route=account/register";
	
	@Test
	public void createAccountfeature()
	{
		bu.launchURL(url);
		System.out.println("URL Opened successfully");
		
		cp.addFirstName("Shubham");
		System.out.println(" Added successfully");

		cp.addLastName("Pawar");
		System.out.println(" Added successfully");

		cp.emailID("shubhamp11@test.com");
		System.out.println(" Added successfully");

		cp.telePhone("123456");
		System.out.println(" Added successfully");

		cp.password("shub@123");
		System.out.println(" Added successfully");

		cp.cnfPassword("shub@123");
		System.out.println(" Added successfully");

		cp.clickCheckbox();
		System.out.println("Clicked on checkbox successfully");

		cp.clickContinue();
		System.out.println("Clicked on continue successfully");

		System.out.println("Account is created successfully");

	}
}
