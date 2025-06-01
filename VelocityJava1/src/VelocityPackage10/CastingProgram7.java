package VelocityPackage10;

public class CastingProgram7                        //Session 28
{
	public static void main(String[] args)
	{
		byte a = 75;
		byte b = 25;
//		byte c = a + b;            //Showing Error we are not able to do addition with same data type "byte"
		int c = a+b;
		System.out.println(c);
		
		
//		byte   short   int   long
//		 1		2		4	   8
		
		
//		Implicit Casting------------------ Example
//		byte >  short >  int >  long
//		 1		2		4	   8
//		Program-1---------------------
		
		byte d = 75;                     // 1 byte
		int e=d;                           // 4 byte
		
		System.out.println(e);
		
//		Program-2--------------------
//		int ----> 4 byte
//		Double----> 8 byte
		
		int x = 20;
		double y = x;
		
		System.out.println(y);
		
	}
	

}
