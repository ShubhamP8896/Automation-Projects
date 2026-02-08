package day_27Throws_Trhow_Finally_Keywords;

public class FinallyExample
{
	public static int Student(String name)
	{
		System.out.println("Marks :- " + name);           
		if (name.equals("Shubham"))                  // now check the use of finally block
		{
			
			try {
			int ans = 9/0;
			return 55;
			}
			catch(ArithmeticException e)
			{	            // if used multiple return then only one is used not all, so now finally block is first priority.
				System.out.println(e);
				return 88;
			}
			finally
			{
			System.out.println("Finally");
			return 98;       // first preferrence is this if exception is occurred or not, check with catch block then also this use first.
			}
		}
		else if(name.equals("Pawan"))
		{
			return 85;
		}
		else if(name.equals("Ajay"))
		{
			return 80;
		}
		else
		{
			System.out.println("Student is not found in the database");
			return 0;
		}
		
	}
	public static void main(String[] args)
	{
		System.out.println(FinallyExample.Student("Shubham"));
	}
}
