package VelocityTestNG1;

import org.testng.annotations.Test;

public class TestG6Keyword_invocationCount                              // session 55
{		
		@Test
		public void TestA() 
		{
			System.out.println("TestA Case");
		}
		
		@Test (invocationCount = 5)                 // THIS TEST CASE RUN 5 TIMES
		public void TestB()
		{
			System.out.println("TestB Case");
		}
		
		@Test 
		public void TestC()
		{
			System.out.println("TestC Case");
		}
		
		@Test (invocationCount = 5)                 // THIS TEST CASE RUN 5 TIMES
		public void TestD()
		{
			System.out.println("TestD Case");
		}
		
		
}
