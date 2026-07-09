package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionality 
{
	@Given("Login page is opened")
	public void login_page_is_opened() {
	    System.out.println("Login Page is Opened");
	}

	@When("added valid userName {string}")
	public void added_valid_user_name(String userName) {
		 System.out.println(userName + " : username is added");
	}

	@When("added valid passowrd {string}")
	public void added_valid_passowrd(String string) {
		 System.out.println(string + " : password is added");
	}

	@When("clicked on the login button")
	public void clicked_on_the_login_button() {
		 System.out.println("clicked on the login button");
	}

	@Then("Dashboard is showing")
	public void dashboard_is_showing() {
		 System.out.println("Dashboard is showing");
	}

	@When("added invalid username {string}")
	public void added_invalid_username(String string) {
		 System.out.println(string+ " added invalid username");
	}

	@When("added invalid password {string}")
	public void added_invalid_password(String string) {
		 System.out.println( string + " added invalid password");
	}

	@Then("User not able to login")
	public void user_not_able_to_login() {
		 System.out.println("User not able to login");
	}
}
