package VelocityPack7;

public class SecondClassBMethodOverloading                               // Session 19
{
	public static void method1()
	{
		System.out.println("Static-Method1- with no arguments");
	}
	
	public static void method1(int a)
	{
		System.out.println("Static-Method1-with one Argument");
	}
	
	public static void method1(int a, int b)
	{
		System.out.println("Static-Method1-with two Argument");
	}
	
	public static void method1(int a, int b, int c)
	{
		System.out.println("Static-Method1-with three Argument");
	}
	
	public static void main(String[] args) 
	{
		SecondClassBMethodOverloading.method1();
		SecondClassBMethodOverloading.method1(5);
		SecondClassBMethodOverloading.method1(5,5);
		SecondClassBMethodOverloading.method1(5,5,5);
		
	}
	
	
	
	
	
	
	
	
}
