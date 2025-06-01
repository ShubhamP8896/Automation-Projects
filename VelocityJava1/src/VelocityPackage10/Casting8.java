package VelocityPackage10;

public class Casting8                          //Session 29
{
	public static void main(String[] args) 
	{
//		Implicit Casting --> Directly, No need to add data type. 
//		We are able to add data type but no need to add in implicit casting.
		
		int a = 25;
		double b = (double) a;       // OR double b = a; (It's consider that automatically)
		System.out.println(b);
		
		
		
	
//		Explicit Casting------------------------ Need to add datatype
//		We need to add lower data type in bracket.
		
		double m = 20.9;
		int n = (int)m;
		
		System.out.println(m);
		System.out.println(n);
		
		
		
	}

}
