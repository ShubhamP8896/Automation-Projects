package velocitypackage1;

public class TwelthClassProgram      // Session 12 & 13
{
	int a;    //Declaration  (Int a = 50; << this is declaration and initialization)
	int b;
	int c;
	
//	Create Constructor :: Constructor we used with public at start or without public
//	Also Constructor name is same as class name
	
	TwelthClassProgram() 
	{
		a = 50;
		b = 60;
		c = a + b;
		System.out.println(c);
		
	}
	TwelthClassProgram(int a) 
	{
		a = 100;
		b = 200;
		c = a + b;
		System.out.println(c);
		
	}
	TwelthClassProgram(int a, int b) 
	{
		a = 1000;
		b = 2000;
		c = a + b;
		System.out.println(c);
		
	}
	public static void main(String[] args)
	{
//		int a = 50;
//		int b = 60;
//		int c = a + b;
//		System.out.println(c);
//		
//		int a1 = 100;
//		int b1 = 200;
//		int c1 = a1 + b1;
//		System.out.println(c1);
//		
//		int a2 = 2000;
//		int b2 = 3000;
//		int c2 = a2 + b2;
//		System.out.println(c2);
		
//		Above used is not Good practice need to use constructor
//		If we want to Reduce space of programs (like in the above program we used multiple lines)
//		Now by using constructor we write this in min lines
//		While using constructors we don't need to declare Nine different variables as shown above
		
		
		
	}

}
