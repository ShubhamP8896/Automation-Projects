package stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataDrivenRegisterAcc_04
{
	@Given("^the user is open Regestration page$")
	public void the_user_is_open_regestration_page() 
	{
	    System.out.println("open_regestration_page");
	}

	@When("^the user added fullname \"([^\"]*)\"$")
	public void the_user_added_fullname(String fullname) 
	{
		System.out.println("added_fullname " + fullname);
	}

	@And("^the user added email \"([^\"]*)\"$")
	public void the_user_added_email(String email) 
	{
		System.out.println("added_email " + email);
	}

	@And("^the user added contact \"([^\"]*)\"$")
	public void the_user_added_contact_number(String contactNo) 
	{
		System.out.println("added_contact_number " + contactNo);
	}

	@And("^user added password \"([^\"]*)\"$")
	public void user_added_password(String Cpassword) 
	{
		System.out.println("added_password " + Cpassword);
	}

	@Then("^the user should be registered$")
	public void the_user_should_be_registered() 
	{
		System.out.println("user is registered");
	}

}
