package day_17_Constructors;

public class A002 
{
	int id;
	String name;
	boolean isPer;
	double salary;
	
	A002()
	{
		System.out.print("Default Constructor");
		id = 8;
		name = "Shubham Pawar";
	}
	A002(String name)
	{
		System.out.println();
		System.out.print("Single Parameter");	
		this.name = name;
	}
	A002(int id, String name)
	{
		System.out.println();
		System.out.print("double Parameter");
		this.id = id;
		this.name = name;
	}
	A002(String name, int id)
	{
		System.out.println();
		System.out.print("double Parameter");
		this.name = name;
		this.id = id;
	}
	A002(int id, String name, boolean isPer, double salary)
	{
		System.out.println();
		System.out.print("All Parameters");
		this.id = id;
		this.name = name;
		this.isPer = isPer;
		this.salary = salary;
	}
	
	void method()
	{
		System.out.println();
		System.out.println("Emp Info: ID= " + id + "; Name= " + name + "; is Permanant= " + isPer + "; Salary = " + salary );
	}
	


	public static void main(String[] args) 
	{
		A002 obj = new A002();
		obj.method();
		
		A002 obj1 = new A002("Shubham");
		obj1.method();
		
		A002 obj2 = new A002(1, "SP");
		obj2.method();
		
		A002 obj3 = new A002("Shubham", 5);
		obj3.method();
		
		A002 obj4 = new A002();
		obj4.method();
		
	}
}
