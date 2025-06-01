package velocitypackage1;

public class TenthMethodProgram2 
{
// We are Write Methods in only class body not in Main Body
//	Method Creation :----------------------------------------
	
//	public static void method1()
//	
//	{
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//	}
	
//	Also We are able to use for loop statements and got same result;--------------------
	
	public static void method1()
	{
		for(int i=1; i<=3; i++)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args)                //main method
	{
		method1();                            //code is always run from method only
		System.out.println("AA");
		
		method1();
		System.out.println("BB");
		
		method1();
		System.out.println("CC");
		
		method1();
		System.out.println("DD");
		
			
	}

}
