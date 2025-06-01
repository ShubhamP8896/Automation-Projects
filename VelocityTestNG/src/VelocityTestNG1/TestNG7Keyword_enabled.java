package VelocityTestNG1;

import org.testng.annotations.Test;

public class TestNG7Keyword_enabled 
{
	@Test (enabled = false)                 // this test case is not run IT IS AVOIDED
	public void TestA() 
	{
		System.out.println("TestA Case");
	}
	
	@Test (invocationCount = 5) 
	public void TestB()
	{
		System.out.println("TestB Case");
	}
	
	@Test (enabled = false)                 // this test case is not run IT IS AVOIDED
	public void TestC()
	{
		System.out.println("TestC Case");
	}
	
	@Test (invocationCount = 5)
	public void TestD()
	{
		System.out.println("TestD Case");
	}

}
