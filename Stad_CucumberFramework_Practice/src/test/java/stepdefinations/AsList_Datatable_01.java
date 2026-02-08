package stepdefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AsList_Datatable_01 
{
	@Given("single user open reg page")
	public void single_user_open_reg_page() 
	{
		System.out.println("Url is opened successfully");	    
	}

	@When("single user enter data")
	public void single_user_enter_data(DataTable dataTable) 
	{
		List<String> listData = dataTable.asList();
		for(String data : listData)
		{
			System.out.println(data);
		}
	}

	@Then("single user registered")
	public void single_user_registered() {
	    System.out.println("user regestered");
	}


}
