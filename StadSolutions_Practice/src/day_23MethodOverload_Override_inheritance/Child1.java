package day_23MethodOverload_Override_inheritance;

public class Child1 extends Parent1
{	
	int z = 100;
	
	@Override
	public void m1(int a)
	{
		System.out.println("Child m1 " + a*a);
	}
	
	// Overload
	public void m2(int a, int b)
	{
		System.out.println("Child m2 " + a*b);
	}
	
	public static void main(String[] args) 
	{
		Child1 obj = new Child1();
		obj.m1(50);                // child class override
		obj.m2(100);				// parent class
		obj.m2(10, 20);				// child class overload with parent class method
		
		System.out.println(obj.z);   // this print the child class variabe becasue we are used child class object
		
	// Overload and overrride is not possible with the veriables : below I created the top casting object for checking this concept
		
		Parent1 p = new Child1();	
		System.out.println(p.z);             // this print the parent class variable but for method overloading is possible so it will use
		p.m1(10);															// child class method
		
	}

}
