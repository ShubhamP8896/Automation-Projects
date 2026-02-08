package stepdefinations;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AsMap_dataTables03 
{
	@Given("two Columns opn url")
	public void two_columns_opn_url() {
	   System.out.println("Opened URL");
	}

	@When("two user enter data")
	public void two_user_enter_data(DataTable dataTable)
	{
		Map<String, String> mData = dataTable.asMap(String.class , String.class);
		
		System.out.println("username : " + mData.get("username"));
		System.out.println("passowrd : " + mData.get("password"));
		
	}

	@Then("two user registered")
	public void two_user_registered() {
System.out.println("Logged in" );
	}

}
