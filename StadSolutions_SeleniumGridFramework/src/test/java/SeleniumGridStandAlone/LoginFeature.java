package SeleniumGridStandAlone;

import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.qa.util.BrowserUtility;

public class LoginFeature extends BaseTestClass
{
	private String title;
	private String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	BrowserUtility bu = new BrowserUtility();
	LoginPage login = new LoginPage();

	@Test
	public void loginFeatureTest()
	{
		bu.launchURL(url);
		
		title = bu.getPageTitle();
		System.out.println("User is on the login page : " + title);
		
		login.enterUserName("Admin");
	    System.out.println("username is added");
	    
	    login.enterPassword("admin123");
		System.out.println("password is added");
		
		login.clickOnLogin();
	    System.out.println("clicked on the login button");
	    
	    title = bu.getPageTitle();
		System.out.println("User is on the login page : " + title);
	    
	    System.out.println("User is logged in successfully");
	}
}
