package day_26ExceptionHandeling;

public class ExceptionHandeling_1 
{
	
	String Name;
	
	public static void main(String[] args) 
	{
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		
		int a = 9;
		
		int c[]= new int [1];
		
		try
		{	
		c[4] = 10;	   // we are able to use many catch blocks for singel try block for handle the exceptions
		
		int ans = a/0;        // because of this exception is occurred and below code is not execute so we need to add here exception block
		System.out.println("Hi");    // this is not execute if exception is occurred
		}
		catch (ArithmeticException e) 
		{
			System.out.println("AE Is comming");    // print the given msg
			System.out.println(e);     // print the exception and reason
			System.out.println(e.getMessage());   // showing the reason of exception
			e.printStackTrace(); 		// Print exception reason and line number
			
			System.out.println("is this print");  // Yes only exception is occurred < if exception is not occurred then this is not execute
		}
		catch(ArrayIndexOutOfBoundsException e)  // 2nd catch block we are able to use many catch blocks
		{
			System.out.println("Array out of bound");
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Finally Block");  // this is always execute if exception is occurred or not
		}

		
		int b [] = new int [2];
		try
		{
		b[3] = 50;
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e.getMessage());     // showing the reason of exception
			System.out.println(e);
			e.printStackTrace();
		}
		
		
		ExceptionHandeling_1 obj = new ExceptionHandeling_1();
		
		obj = null;
		
		try
		{
		obj.Name = "Shubham";        // Null pointer exception occurred here
		
		System.out.println(obj.Name);   // here also null pointer exception occurred
		}
		catch (Exception e) // this is also possible but this is not standerd practice so always use Exception name here
		{
			e.printStackTrace();  
			System.out.println("Null Pointer Exception Handelled");
		}		
		
		System.out.println("Hello");
		
		System.out.println("End of code");
		
	}

}
