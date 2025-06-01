package VelocityTestNG1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG4                         //session 54
{
//	We are using all the testng annotations
//	All are run sequentially
	
	@BeforeSuite                                           // Run only single Time
	public void BeforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest                                           // Run only single Time
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass                                           // Run only single Time
	public void BeforeClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod                                           // Run Multiple times before test > Depends on how much test added
	public void BeforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("Main Test - 1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Main Test - 2");
	}
	
	@AfterMethod                                           // Run Multiple times After test > Depends on how much test added
	public void AfterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass                                           // Run only single Time
	public void AfterClass()
	{
		System.out.println("After Class");
	}
	
	@AfterTest                                           // Run only single Time
	public void AfterTest()
	{
		System.out.println("After Test");
	}
	
	@AfterSuite                                           // Run only single Time
	public void AfterSuite()
	{
		System.out.println("After Suite");
	}
	
}
