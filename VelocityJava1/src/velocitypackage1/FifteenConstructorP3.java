package velocitypackage1;

public class FifteenConstructorP3 
{
//	Static Maethod ---------------
	public static void method1()
	{
		System.out.println("Method 1 - Static method");
	}
	
//	Non - Static Method
	public void method2()
	{
		System.out.println("Method 2 - Non static");
	}

	public static void main(String[] args) 
	{
//		Static Method calling 
		method1();
//		OR
		FifteenConstructorP3.method1();
		
//		Non-Static Method calling :--- We cannot call static method directly----------
//		We need to create Object for Non static methods		
//		method2();   --- Not Possible--------------
		
		FifteenConstructorP3 X = new FifteenConstructorP3();
				X.method2();
				X.method2(); //----------- We are able to call multiple times also.
				
				
		
		
		
	}
	
	
}
