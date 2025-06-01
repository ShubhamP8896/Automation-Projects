package VelocityPackage8;                         // Session--23

public class SecondCollegeClass extends FirstHomeCLass

{
	
	String ChildName = "Rahul";                          //veriable---
	
	public void PrintName()                                // Method
	{
		System.out.println(ChildName);
		System.out.println(super.ChildName);
		
	}
	
	
	public static void main(String[] args)              // Main Method
	{
		SecondCollegeClass x = new SecondCollegeClass();    // Object
		x.PrintName(); 
		
	}
}
