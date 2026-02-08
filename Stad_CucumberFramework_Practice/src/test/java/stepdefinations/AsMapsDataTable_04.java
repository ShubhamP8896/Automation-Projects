package stepdefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AsMapsDataTable_04 
{
	@Given("multiple Columns multiple rows")
	public void multiple_columns_multiple_rows()
	{
	    System.out.println("Open the URL");
	}

	@When("multer users enter data following")
	public void multer_users_enter_data_following(DataTable dataTable)
	{
		List<Map<String, String>> mData = dataTable.asMaps(String.class, String.class);
		
		for (Map<String, String> data : mData)
		{
			System.out.println("First Name : " + data.get("firstName"));
			System.out.println("Last Name : " + data.get("lastName"));
			System.out.println("Email ID : " + data.get("email"));
			System.out.println("contact : " + data.get("contact"));
			System.out.println("City Name : " + data.get("city"));
		}
	}

	@Then("multiple users are registered")
	public void multiple_users_are_registered() 
	{
		System.out.println("Close the URL");	  
	}

}
