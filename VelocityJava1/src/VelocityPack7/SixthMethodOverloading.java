package VelocityPack7;

public class SixthMethodOverloading 
{
	public static void addition(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void addition(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void addition(int a, int b, int c, int d)
	{
		System.out.println(a+b+c+d);
	}
	
	public static void addition(int a, int b, int c, int d, int e)
	{
		System.out.println(a+b+c+d+e);
	}
	
	public static void main(String[] args) 
	{
		SixthMethodOverloading.addition(5, 5);
		SixthMethodOverloading.addition(8, 2, 10);
		SixthMethodOverloading.addition(10, 20, 30, 40);
		SixthMethodOverloading.addition(5, 10, 15, 20, 25);
	}
	
	
	
}
