package VelocityPackage4;

public class SecondChildCLass extends FirstParentClass            // Session 17
{
	int b = 60;
	public void method2()
	{
		System.out.println("ChildClass-Method2-Non-Static");
	}
		
	public static void main(String[] args) 
	{
		SecondChildCLass X2 = new SecondChildCLass();
		
//		Child Class Properties
		
		System.out.println(X2.b);
		X2.method2();
		
//		Parents Class Properties
		
		System.out.println(X2.a);
		X2.method1();
		
		
	}
	
}
