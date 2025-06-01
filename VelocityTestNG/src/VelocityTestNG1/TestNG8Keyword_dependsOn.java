package VelocityTestNG1;

import org.testng.annotations.Test;

public class TestNG8Keyword_dependsOn                   //session 55
{

	@Test (priority = 2 )           // First Run this case becasue on this testD is dependant
	public void TestC()
	{
		System.out.println("TestC Case");
	}
	
//	If the Method 1/ test1 is failed then automatically Method2/test 2 is skipped.
	
	@Test  (priority = 1, dependsOnMethods ={"TestC"})     //Aftr testC run then TestD run, becasue we used dependsOn keyword
	public void TestD()
	{
		System.out.println("TestD Case");               // dependsOn keyword override priority keyword
	}

}
