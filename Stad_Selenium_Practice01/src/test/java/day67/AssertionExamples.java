package day67;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExamples 
{
//	There are two types of assertions
//	1) Hard (Assert) and 2) Soft (Object)
	
	String name = "shubham";
	String name1 = "shubham";
	
///  Compare both strings, integers, booleans, objects
	@Test
	public void compare()
	{
			Assert.assertEquals(name, name1, "Executed");
			Reporter.log("Test case result" , true);
	}
//	Checks if a given condition is true.
	@Test
	public void compare1()
	{
		if(name.equals(name1))
		{
			Assert.assertTrue(true, "Test case passsed");
		}
		else
		{
			Assert.assertTrue(false, "Test case passsed");
		}
	}
	@Test
	public void compare2()
	{
		SoftAssert sa = new SoftAssert();
		if(name.equals(name1))
		{	
			sa.assertEquals(name, name1);
			sa.assertAll();
		}
		else
		{
			sa.assertEquals(name, name1);
			sa.assertAll();
		}
	}
	

}
