package day_17_Constructors;

public class A001 
{
	int id;
	String Name;
	boolean isPer;
	
	A001()
	{
		id = 007;
		Name =  "Shubham Pawar";
		isPer = true;
	}
	
	void m1()
	{
		System.out.println("Emp Info: ID= " + id + "; Name= " + Name + "; is Permanant= " + isPer + ";" );
	}
	
	public static void main(String[] args) {
		
		A001 obj = new A001();
		obj.m1();
	}
	
	
}
