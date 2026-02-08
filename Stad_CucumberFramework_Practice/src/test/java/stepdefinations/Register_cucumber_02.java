package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_cucumber_02 
{
	@Given("the user is on the registration page")
	public void the_user_is_on_the_registration_page() {
	    System.out.println("user opened registration page");
	}

	@When("the user enters a valid first name")
	public void the_user_enters_a_valid_first_name() {
	    System.out.println("user_enters_a_valid_first_name");
	}

	@And("the user enters a valid last name")
	public void the_user_enters_a_valid_last_name() {
		System.out.println("user_enters_a_valid_last_name");
	}

	@And("the user enters a valid email")
	public void the_user_enters_a_valid_email() {
		System.out.println("user_enters_a_valid_email");
	}

	@And("the user enters a valid telephone")
	public void the_user_enters_a_valid_telephone() {
		System.out.println("user_enters_a_valid_telephone");
	}

	@And("the user enters a valid password")
	public void the_user_enters_a_valid_password() {
		System.out.println("user_enters_a_valid_password");
	}

	@And("the user enters a valid confirm password")
	public void the_user_enters_a_valid_confirm_password() {
		System.out.println("user_enters_a_valid_confirm_password");
	}

	@And("the user clicks the terms conditions check box")
	public void the_user_clicks_the_terms_conditions_check_box() {
		System.out.println("user_clicks_the_terms_conditions_check_box");
	}

	@And("the user clicks on the continue button")
	public void the_user_clicks_on_the_continue_button() {
		System.out.println("user_clicks_on_the_continue_butto");
	}

	@Then("the user should be registered successfully")
	public void the_user_should_be_registered_successfully() {
		System.out.println("user_registered_successfully");
	}

}
