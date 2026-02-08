package day_28CallByRef;

public class CallByReference 
{
	String name;
	double Salary;
	
	public void method (CallByReference m1)          // here we passed the class name and object ref
	{
		m1.name = "Shubham";       // these are the values we assigned
		m1.Salary = 850;
	}
	
	// Also we are able to use the static method but need to use the class name to call this
	
	public static void Static(CallByReference S1)
	{
		S1.name = "Pawar";
		S1.Salary = 150;
	}
	
	public static void main(String[] args) {
		CallByReference Obj =  new CallByReference();
		Obj.name = "SP";
		Obj.Salary = 500;
		
		System.out.println(Obj.name);        // here it will print the values which assigned in main method
		System.out.println(Obj.Salary);
		
		System.out.println("----------------------");
		
		Obj.method(Obj);          // here we called that method and passed the ref of class object in the argument
		
		System.out.println(Obj.name);       // now the values are changed and it will call by using ref for the method values which assigned in method
		System.out.println(Obj.Salary);
		
		System.out.println("----------------------");
		// called static method using obj ref
		 
		CallByReference.Static(Obj);        // here we used the static method
		System.out.println(Obj.name);
		System.out.println(Obj.Salary);     
		
	}

}
