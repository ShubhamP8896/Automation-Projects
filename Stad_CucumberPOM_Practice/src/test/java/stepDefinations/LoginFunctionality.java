package stepDefinations;

import static org.testng.Assert.assertEquals;

import com.pages.LoginPage;
import com.qa.util.BrowserUtility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionality
{
	private String title;	
	private String url = "https://naveenautomationlabs.com/opencart/index.php?route=account/login";
	BrowserUtility bu = new BrowserUtility();
	LoginPage login = new LoginPage();
	
	@Given("the user is open URL")
	public void the_user_is_open_url() 
	{
		bu.launchURL(url);
	}

	@When("the user is on login page")
	public void the_user_is_on_login_page() 
	{
		title = bu.getPageTitle();
		System.out.println("User is on the login page : " + title);
	}

	@Then("the user get login page title {string}")
	public void the_user_get_login_page_title(String expectedTitle) 
	{
		title = bu.getPageTitle();
		assertEquals(title, expectedTitle, "Passed");
		System.out.println("Page title : "+ title);
	}

	@When("the user enter valid username {string}")
	public void the_user_enter_valid_username(String username) 
	{
	    login.enterUserName(username);
	    System.out.println("username is added : " + username);
	}

	@And("the user enter valid password {string}")
	public void the_user_enter_valid_password(String password) 
	{
		login.enterPassword(password);
		System.out.println("password is added : " + password);
	}

	@And("the user click on login button")
	public void the_user_click_on_login_button() throws InterruptedException
	{
	    login.clickOnLogin();
	    System.out.println("clicked on the login button");
	    Thread.sleep(3000);
	}

	@And("the user logged in successfully")
	public void the_user_logged_in_successfully() 
	{
	    System.out.println("User is logged in successfully");
	}

	@Then("then user get Dashboard page title {string}")
	public void then_user_get_dashboard_page_title(String expectedTitle) 
	{
		title = bu.getPageTitle();
		assertEquals(title, expectedTitle, "Passed");
		System.out.println("Page title : " + title);
	}

}
