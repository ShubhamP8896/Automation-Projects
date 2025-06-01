package VelocityTestNG1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2                                                 // session -54  
{
	
//	Example of annotation we need to use     (I used this in POM Test class of logout test case > VelocityPOM1 >> Testclass >> LogoutFunctionality)
	
	@BeforeMethod
	public void SetUpMethod()
	{
		System.out.println("Browser Opened >> Url Opened >> Login");     // ->  Preconditions
	}
	
//	In htis whenever we are used test method in that before and after method is run always
//	@BeforeMethod @testCase1 @AfterMethod >>> @BeforeMethod @testCase2 @AfterMethod ... Same like that
	
	@Test
	public void TestCase1()
	{
		System.out.println("Test case 1 Passed");               //   -- Scenario - 1 
	}
	
	@Test
	public void TestCase2()
	{
		System.out.println("Test case 2 Passed");               //   -- Scenario - 1 
	}
	
	@Test
	public void TestCase3()
	{
		System.out.println("Test case 3 Passed");               //   -- Scenario - 1 
	}
	
	@Test
	public void TestCase4()
	{
		System.out.println("Test case 4 Passed");               //   -- Scenario - 1 
	}
	
	@AfterMethod
	public void TearDownMethod()
	{
		System.out.println("LogOut >> Browser Closed");     // ->  Postconditions
	}
	
	
	
	
	

}
