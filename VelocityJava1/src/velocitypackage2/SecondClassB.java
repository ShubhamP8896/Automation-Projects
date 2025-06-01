package velocitypackage2;      //Session 16

public class SecondClassB 
{

	public static void main(String[] args) 
	{
//		Static variable call from class A--------------
		
		System.out.println(FirstClassA.b);
		
//		Static method call from Class A-------------
		
		FirstClassA.method2();             // We need call method with class name (Class A)
				
//		Non - Static variable call from class A-------------- (We need create object)
		
		FirstClassA A1 = new FirstClassA();
		System.out.println(A1.a);
		
//		Non - Static method call from Class A------------- (We need to create Object)
		
		A1.method1();
		
//		OR------------------------------
		
		FirstClassA B1 = new FirstClassA();
		B1.method1();
		
		
	}
	
}
