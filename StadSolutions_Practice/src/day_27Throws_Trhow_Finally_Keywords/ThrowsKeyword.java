package day_27Throws_Trhow_Finally_Keywords;

public class ThrowsKeyword 
{
	void m1()
	{
		System.out.println("m1");
		try {
		m2();
		}
		catch (ArithmeticException e) 
		{
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	void m2() throws ArithmeticException
	{
		System.out.println("m2"); 
		m3();
	}
	void m3() throws ArithmeticException            // now the responsibility of m2 method to handle the exception
	{
		System.out.println("m3"); 
		int ans = 9/0;	
	}
	
//	We are able to add throws for m2 and m1 method also but then responsibility to handle the exception is main method
//	but this is not standard way>> Max to max we need to write throws for M3 and M2 and then handle exception in M1
//	if any method don't want to handle exception then we use this throws keyword

	
//	This below response we get when we run the code, so as per the code the following lines are culprit for giving exception so need to handle that 
//	in the any of the line:-----------------
//	at day_27ThrowsKeyword.ThrowsKeyword.m3(ThrowsKeyword.java:19)
//	at day_27ThrowsKeyword.ThrowsKeyword.m2(ThrowsKeyword.java:13)
//	at day_27ThrowsKeyword.ThrowsKeyword.m1(ThrowsKeyword.java:8)
//	at day_27ThrowsKeyword.ThrowsKeyword.main(ThrowsKeyword.java:26)
	
	
//	Why m2() should handle the exception as it is generated from m3() for that think about an example there are 2 systems e-commerce application 
//	has contact with bank server and payment of e-commerce should be done using bank server so payment method is defined in bank server
//	system now suppose bank server payment method has exception then it should be handle by them or the calling system which is the e-commerce 
//	system right.
//	But suppose if e-commerce system is also not handling the exception, then it is not user responsibility to handle the exception. 
//	Means main method should not handle the exception as it is user like system which is calling the e-commerce and e-commerce calling the 
//	payment from bank server system.

	public static void main(String[] args) 
	{
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();                                         // if we want to handle exception here then also we are able to do that.
		
		System.out.println("End Of Program");

	}

}
