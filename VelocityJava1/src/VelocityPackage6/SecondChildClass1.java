package VelocityPackage6;

public class SecondChildClass1 extends FirstParentClass
{
	int b = 100;
	
	public void methodB()
	{
		System.out.println("ChildClass1-MethodB-Non-Static");
	}
	
	public static void main(String[] args) 
	{
//		Child Class :----------------
		
		SecondChildClass1 X1 = new SecondChildClass1();
		System.out.println(X1.a);
		X1.methodA();
		
//		Parent Class:----------------
		
		System.out.println(X1.b);
		X1.methodB();
		
		
	}

}
