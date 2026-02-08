package stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber_Practice01.BrowserUtility;
import cucumber_Practice01.ElementsUtility;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_cucumber_01 
{
	WebDriver driver;
	BrowserUtility bu = new BrowserUtility();
	ElementsUtility eu;	
	By uNmae = By.cssSelector("#input-email");
	By pass = By.cssSelector("#input-password");
	By loginButton = By.xpath("//input[@value='Login']");
	By logOut = By.xpath("(//a[text()='Logout'])[2]");
	By loginOption = By.xpath("(//a[text()='Login'])[2]");
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() 
	{
		driver = bu.launchBrowser("chrome");
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		bu.MaximizeWindow();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		eu = new ElementsUtility(driver);
	   System.out.println("User is on the Login Page");
	}

	@When("the user enters a valid username {string}")
	public void the_user_enters_a_valid_username(String userName) 
	{
		eu.addInput(uNmae, userName);
		System.out.println("User enters valid username");
	}

	@When("the user enters a valid password {string}")
	public void the_user_enters_a_valid_password(String passWord) 
	{
		eu.addInput(pass, passWord);
		System.out.println("User enters valid Password");
	}

	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() 
	{
		eu.doClick(loginButton);
		System.out.println("User clicks on the Login button");
	}

	@Then("the user should be logged in successfully")
	public void the_user_should_be_logged_in_successfully() 
	{
		if(bu.getCurrentPageURL().contains("opencart"))
		{
			System.out.println("User Logged in successfully: Pass");	
		}
		else
		{
			System.out.println("User Not able to login: Fail");	
		}	   
	}

	@When("the user enters an invalid username {string}")
	public void the_user_enters_an_invalid_username(String invalidUsername) 
	{
		eu.addInput(uNmae, invalidUsername);
		System.out.println("User enters invalid username");
	}

	@Then("the user should not be logged in")
	public void the_user_should_not_be_logged_in() 
	{
		if(bu.getCurrentPageURL().contains("account/login"))
		{
			System.out.println("User Not able to login : Pass");	
		}
		else
		{
			System.out.println("User able to login : Fail");	
		}	   
	}

	@When("the user enters an invalid password {string}")
	public void the_user_enters_an_invalid_password(String invalidPassword) 
	{
		eu.addInput(pass, invalidPassword);
		System.out.println("User enters Invalid Password");
	}
	
	@After
	public void tearDown()
	{
		if(driver!=null)
			driver.quit();
	}

}
