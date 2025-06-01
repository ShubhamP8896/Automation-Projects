package VelocityPackage4;

public class FirstParentClass 
{
	int a = 50;
	
	public void method1()
	{
		System.out.println("ParentClass-Method1-Non-Static");
	}
	
	public static void main(String[] args) 
	{
		FirstParentClass X1 = new FirstParentClass();
		System.out.println(X1.a);	
		X1.method1();	
	}
	
	
	
	
}
