package velocitypackage1;

public class FourteenConstructorP2 
{
//	3. Third Approach :: 
	static int a = 500;
	static int b = 600;
	static int c = a + b;     // If we use print method for answer in Main method then that showing us errer without "Static" word.
	
//	2. Second Approach
//	int a;
//	int b;
//	int c;
//	
//	FourteenConstructorP2()
//	{
//		a = 50;
//		b = 60;
//		c = a + b;
//		System.out.println(c);
//	}
	
	
	public static void main(String[] args) 
	{
//		2. Second Approach :: Object create for constructor
//		FourteenConstructorP2 A1 = new FourteenConstructorP2();
		
//		1. First Approach 
//		int a = 5;
//		int b = 6;
//		int c = a+b;
//		System.out.println(c);
		
		System.out.println(c);  // this is for 3rd approach :: We need to use "static' word. CHeck above
//		We need to use any Method as per the application/Software requirement
	}

	
}
