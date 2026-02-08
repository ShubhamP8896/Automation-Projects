package stepDefinations;

import com.pages.CreateAccountPage;
import com.qa.util.BrowserUtility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountFunctionality 
{
	CreateAccountPage cp = new CreateAccountPage();
	BrowserUtility bu = new BrowserUtility();
	private String url = "https://naveenautomationlabs.com/opencart/index.php?route=account/register";
	@Given("the user is on the registration page")
	public void the_user_is_on_the_registration_page() 
	{
		bu.launchURL(url);
		System.out.println("URL Opened successfully");
	}

	@When("the user added First Name {string}")
	public void the_user_added_first_name(String string) 
	{
		cp.addFirstName(string);
		System.out.println(string + " Added successfully");
	}

	@And("the user added Last Name {string}")
	public void the_user_added_last_name(String string) 
	{
		cp.addLastName(string);
		System.out.println(string + " Added successfully");
	}

	@And("user added Email {string}")
	public void user_added_email(String string) 
	{
		cp.emailID(string);
		System.out.println(string + " Added successfully");
	}

	@And("user added Telephone {string}")
	public void user_added_telephone(String string) 
	{
		cp.telePhone(string);
		System.out.println(string + " Added successfully");
	}

	@And("user added Password {string}")
	public void user_added_password(String string) 
	{
		cp.password(string);
		System.out.println(string + " Added successfully");
	}

	@And("user added Password Confirm {string}")
	public void user_added_password_confirm(String string) 
	{
		cp.cnfPassword(string);
		System.out.println(string + " Added successfully");
	}

	@And("user confirm privacy policy")
	public void user_confirm_privacy_policy() 
	{
		cp.clickCheckbox();
		System.out.println("Clicked on checkbox successfully");
	}
	@And("user click on continue button")
	public void user_click_on_continue_button() 
	{
		cp.clickContinue();
		System.out.println("Clicked on continue successfully");
	}

	@Then("the user is regestered successfully")
	public void the_user_is_regestered_successfully() 
	{
		System.out.println("Account is created successfully");
	}

}
