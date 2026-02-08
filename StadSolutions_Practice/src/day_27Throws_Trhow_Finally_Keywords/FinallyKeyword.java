package day_27Throws_Trhow_Finally_Keywords;

public class FinallyKeyword 
{
	public static void main(String[] args) 
	{
		try
		{
			int ans = 9/3;
			System.out.println("try block");
		}
		finally
		{
			System.out.println("Finally block");  // here finally block is always executes if exception is occurred or for finally block try block is mandatory
		}	
		
		// If the exception is not handled here, so after the finally block code is not execute, so we need to handle the exception with catch block
//		if we want to execute remaining program.
		
//		We are able to use finally block after the try block [its necessary to use finally or catch block or both blocks also we are able to use]
//		If exception is occurred or not then also finally block is executes
		
		
//	try: If the exception is occurred then try block is not execute and the code below that exception (9/0) is not execute and if exception is 
//        is not occurred then that below of that (9/3) code is executes
//	Catch: this block only executes if exception is occurred and all the code is executes but if exception is not occurred then this block is 
//			is not executes, any code is not executes.
//	Finally: this block is executes any time if exception is occurred or not, it is always after catch block, It's most important block 
//		JVM always gives first priority to this block then other, if we take any with return example then this works : CHeck Day 27 notes and video
		
//		IMP: we are not able to write any code in between try and catch block same in between catch and finally block.
		
		int a [] = new int [2];
		
		try
		{
			a[1] = 5;
			System.out.println("Try");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Catch - Array Out of bound");
		}
		finally          // finally block always after the catch block  and we are not able to write any code in between catch and finally block
		{
			System.out.println("Finally after Array exception");
		}
		
		
	}

}
