package day70_ListenersTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass_2 
{
	 @Test(priority = 1)
	    public void test1() {
	        System.out.println("Executing Test 1");
	        Assert.assertTrue(true); // This will pass
	    }

	    @Test(priority = 2)
	    public void test2() {
	        System.out.println("Executing Test 2");
	        Assert.fail("Intentional Failure"); // This will fail
	    }

	    @Test(dependsOnMethods = "test2", priority = 3)
	    public void test3() {
	        System.out.println("Executing Test 3");
	        // This will be skipped because test2 fails
	    }

	    @Test(successPercentage = 50, invocationCount = 2, priority = 4)
	    public void test4() {
	        System.out.println("Executing Test 4");
	        Assert.assertTrue(false); // Fails but within success percentage
	    }

}
