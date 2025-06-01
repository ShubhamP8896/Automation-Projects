package VelocityPack7;

public class ThirdClassBMethodOverloading                               // Session 19
{
	public void method2()
	{
		System.out.println("Non Static Method2 With no Arguments");
	}
	
	public void method2(int a)
	{
		System.out.println("Non Static Method2 With one Arguments");
	}
	
	public void method2(int a, char b)
	{
		System.out.println("Non Static Method2 With two Arguments");
	}
	
	public void method2(int a, String b, int c)
	{
		System.out.println("Non Static Method2 With three Arguments");
	}
	
	public static void main(String[] args) 
	{
		ThirdClassBMethodOverloading X1 = new ThirdClassBMethodOverloading(); 
//		Need to create object first for Noon static methods
		
		X1.method2();
		
		X1.method2(5);
		
		X1.method2(5, 'a');
		
		X1.method2(5, "b", 5);
		
	}
	
	
	
}

