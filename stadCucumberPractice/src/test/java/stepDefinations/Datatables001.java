package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datatables001 
{
	@Given("URL is Opened successfully")
	public void url_is_opened_successfully() 
	{
	   System.out.println("Url oepend Successfully");
	}

	@When("user added following data")
	public void user_added_following_data(DataTable dataTable) {
		List<List<String>> asMps = dataTable.asLists(String.class);
		
		System.out.println("Name : " + asMps.get(1));
		System.out.println("Name : " + asMps.get(2));
		System.out.println("Name : " + asMps.get(3));
		
	}

	@Then("user completed regestration process")
	public void user_completed_regestration_process() {
	   System.out.println("Registration Completed");
	}

}
