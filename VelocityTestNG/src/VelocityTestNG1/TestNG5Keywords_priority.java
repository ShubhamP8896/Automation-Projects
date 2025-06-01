package VelocityTestNG1;

import org.testng.annotations.Test;

public class TestNG5Keywords_priority
{
	
	@Test (priority = 4 )             //6TH
	public void TestA()
	{
		System.out.println("TestA Case");
	}
	
	@Test  (priority = 3)               //5TH
	public void TestB()
	{
		System.out.println("TestB Case");
	}
	
	@Test (priority = 2 )           // 4TH
	public void TestC()
	{
		System.out.println("TestC Case");
	}
	
	@Test  (priority = 1 )          // tHIRD RUN THIS TEST CASE
	public void TestD()
	{
		System.out.println("TestD Case");
	}
	
	@Test (priority = 0 )          // sECOND RUN THIS TEST CASE
	public void TestE()
	{
		System.out.println("TestE Case");
	}
	
	@Test (priority = -1 )          // FIRST RUN THIS TEST CASE
	public void TestF()
	{
		System.out.println("TestF Case");
	}
	
	
}
