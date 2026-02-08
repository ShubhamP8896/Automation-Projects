package stepdefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTables_AsList_AsLists05 
{
	@Given("User is on the login page")
	public void user_is_on_the_login_page()
	{
	    System.out.println("user_is_on_the_login_page");
	}

	@When("User enters the following details")
	public void user_enters_the_following_details(DataTable dataTable1) 
	{
		List<String> listData = dataTable1.asList();      // here we used aslist
		for(String list : listData )
		{
			System.out.println(list);
		}
		
	    /**
	     * Use this below code for real scenario for sending the data into the respective fields
	     *   String username = data.get(0).get(0);
        String password = data.get(1).get(0);

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginBtn")).click();
	     */	
	}

	@Then("User Should be able to login successfully")
	public void user_should_be_able_to_login_successfully() 
	{
		System.out.println("login_successfully");
	}

	@Given("User go to registration page")
	public void user_go_to_registration_page() 
	{
		System.out.println("registration_page");
	}

	@When("Enter registration details")
	public void enter_registration_details(DataTable dataTable2)
	{
	    List<List<String>> regListdata = dataTable2.asLists(String.class);     // here we used aslists and we need to add String.class in the argument
	    for(List<String> regL: regListdata)
	    {
	    	System.out.println(regL);
	    }
/**
 *  for (Map<String, String> user : users) {

            driver.findElement(By.id("name")).clear();
            driver.findElement(By.id("mobile")).clear();
            driver.findElement(By.id("city")).clear();

            driver.findElement(By.id("name")).sendKeys(user.get("Name"));
            driver.findElement(By.id("mobile")).sendKeys(user.get("Mobile"));
            driver.findElement(By.id("city")).sendKeys(user.get("City"));

            driver.findElement(By.id("submitBtn")).click();
 * 	    
 */    
	}

	@Then("click submit button")
	public void click_submit_button() 
	{
		System.out.println("click_submit");
	}

}
