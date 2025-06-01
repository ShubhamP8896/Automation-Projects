package VelocityTestNG1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1                                                 // session -53  
{
	
//	Example of annotation we need to use     (I used this in POM Test class of logout test case > VelocityPOM1 >> Testclass >> LogoutFunctionality)
	
	@BeforeMethod
	public void SetUpMethod()
	{
		System.out.println("Browser Opened >> Url Opened >> Login");     // ->  Preconditions
	}
	
	
	
	@Test
	public void VerifyLoginFunctionality()
	{
		System.out.println("Login Successfully : Test case Passed");               //   -- Scenario - 1 
	}
	
	
	@AfterMethod
	public void TearDownMethod()
	{
		System.out.println("LogOuy >> Browser Closed");     // ->  Postconditions
	}
	
	
	
	
	

}
