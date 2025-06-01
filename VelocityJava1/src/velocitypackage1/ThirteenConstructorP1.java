package velocitypackage1;

public class ThirteenConstructorP1
{
	int a;
	int b;
	int c;
	
//	ThirteenConstructorP1 ()  //By default constructor :: Not Visible :: We can't see 
//	{
//		
//	}
//	
//	OR 
//	User Defined Constructor     :: Compiler need any constructor for run the program
//	If we defined or defulat constructor used by compiler while compilation.

	ThirteenConstructorP1 ()     // 1 User defined const without argument
	{
		a = 50;
		b = 60;
		c = a + b;
		System.out.println(c);
	}
	
	ThirteenConstructorP1 (int a)     // 2 User defined const with argument
	{
		a = 150;
		b = 160;
		c = a + b;
		System.out.println(c);
	}
	
	ThirteenConstructorP1 (int a, int b)     // 3 User defined const with argument
	{
		a = 250;
		b = 260;
		c = a + b;
		System.out.println(c);
	}
	
	ThirteenConstructorP1 (int a, int b, int c)     // 4 User defined const with argument
	{
		a = 450;
		b = 360;
		c = a + b;
		System.out.println(c);
	}
	
	ThirteenConstructorP1 (char x, String y, int z)     // 5 User defined const with argument
	{
		a = 1450;
		b = 1360;
		c = a + b;
		System.out.println(c);
	}
	
	ThirteenConstructorP1 (int x, String y, int z)     // 6 User defined const with argument
	{
		a = 4450;
		b = 3560;
		c = a + b;
		System.out.println(c);
	}
	
//	We are able to use multiple const with diff arguments called as Constructor overloading.
	
	
	public static void main(String[] args)
	{
//		How to create an Object :---->
//		ClassName ReferenceVariable = New Constructor Of class
//		1.-----------------------------
		ThirteenConstructorP1 A1 = new ThirteenConstructorP1();
		
//		2.-----------------------------
		ThirteenConstructorP1 B1 = new ThirteenConstructorP1 (5);     
		// We need to add here in argument any integer cuz we used in constructor (int a)
	
//		3.----------------------------
		ThirteenConstructorP1 C1 = new ThirteenConstructorP1 (5, 6); 
		// We need to add here in argument any two integers cuz we used in constructor (int a, int b)		
		
//		4.----------------------------
		ThirteenConstructorP1 D1 = new ThirteenConstructorP1 (1, 2, 1);
		// We need to add here in argument any three integers cuz we used in constructor (int a, int b, Int c)		
		
//		5.-----------------------------
		ThirteenConstructorP1 E1 = new ThirteenConstructorP1 ('S',"S", 8);
		// We need to add here in argument any one integer, One char and one string cuz we used in constructor
		
//		6.----------------------------
		ThirteenConstructorP1 F1 = new ThirteenConstructorP1 (1, "S", 1);
			
		
		
	}

}
