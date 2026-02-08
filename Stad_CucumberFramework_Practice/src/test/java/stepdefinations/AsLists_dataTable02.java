package stepdefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AsLists_dataTable02 
{
	@Given("multiple user open reg page")
	public void multiple_user_open_reg_page() {
	    System.out.println("user open URL");
	}

	@When("multiple user enter data")
	public void multiple_user_enter_data(DataTable dataTable) {
	 List<List<String>> listData = dataTable.asLists(String.class);
	 
	 for(List<String> data : listData)
	 {
		 System.out.println("First_Name : " + data.get(0));
		 System.out.println("Last_Name : " + data.get(1));;
		 System.out.println("City : " + data.get(2));;
	 }
	 
	 
	 
	}

	@Then("multiple user registered")
	public void multiple_user_registered() {
	    System.out.println("Regestered successfully");
	}

}
