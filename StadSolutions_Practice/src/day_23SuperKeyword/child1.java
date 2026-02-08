package day_23SuperKeyword;

public class child1 extends parent1
{

	String color = "Black";
	
	
	
	
	public void veriable()
	{
		System.out.println(color);         // this will call the child class variable
		System.out.println(super.color);      // used super keyword with variable then this call the immediate parent variable
	}
	
	public void method()
	{
		System.out.println("Child class method");  // this will call the override method >> child class method
		
		super.method();      // used super keyword with the method name then call the immediate parent methods
	}
	
	public static void main(String[] args)
	{
		child1 obj = new child1();
		obj.veriable();   // this call child class variable
		obj.method();  // this call child class method
		
		// Now use super key word with variable and method to invoke/call the immediate parent variable and method
		
	}

}
