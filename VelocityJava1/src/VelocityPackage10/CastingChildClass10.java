package VelocityPackage10;

public class CastingChildClass10 extends CastingParentClass9           //Session 29
{
	public void method3()
	{
		System.out.println("ChildClassMethod3");
	}
	
	public void method4()
	{
		System.out.println("ChildClassMethod4");
	}

	public static void main(String[] args)
	{
//		Normal Object create and method calling----------------Without nheritance
//		CastingParentClass9 x = new CastingParentClass9();
//		x.method1();
//		x.method2();
//		
//		CastingChildClass10 y = new CastingChildClass10();
//		y.method3();
//		y.method4();
		
//		Inheritance with extends keyword and parent class name;-----------------
		
//		CastingChildClass10 z = new CastingChildClass10();
//		z.method1();
//		z.method2();
//		z.method3();
//		z.method4();
		
//		Upcasting -------------Inherit subclss into superclass---------
		
		CastingParentClass9 a = new CastingChildClass10();
		a.method1();
		a.method2();
		
//		a.method3();   //  this is not possible cuz these are not inherit
//		a.method4();
		
				
		
	}
}
