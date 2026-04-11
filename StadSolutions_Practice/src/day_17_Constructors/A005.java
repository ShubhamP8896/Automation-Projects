package day_17_Constructors;

public class A005 
{
	int age;
	String name;
	
	// Parameterized constructor
	A005(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	// Copy constructor used class name and other as variable
	A005(A005 copyConst)
	{
		this.age=copyConst.age;
		this.name=copyConst.name;
	}
	
	// Method to display person details
	void method()
	{
		System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
	}

	public static void main(String[] args)
	{
		A005 obj = new A005(28, "Shubham");
		obj.method();
		
		System.out.println("Copy Const");
		
		A005 obj1 = new A005(obj);
		obj1.method();
	}
}
