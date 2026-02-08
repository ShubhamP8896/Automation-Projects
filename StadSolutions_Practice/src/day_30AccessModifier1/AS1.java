package day_30AccessModifier1;

public class AS1
{	
	String defaultS = "Default";            // default AS used in same package in sub and non subclass only Not in different package's classes
	private String prvtStr = "Private";    // it is used in this same class only not anywhere
	protected String protStr = "Protected";  // it is used in same package and diff package's subclass only where we extend this class
	public String PubStr = "Public";     // it is used anywhere in the same project in subclasses as well as no subclasses
	
	void defMethod()
	{
		System.out.println("Default method");
	}
	private void pvtMethod()
	{
		System.out.println("Private method");
	}
	
	protected void proMethod()
	{
		System.out.println("Protected Method");
	}
	
	public void pubMethod()
	{
		System.out.println("Public Method");
	}
	
	public static void main(String[] args) {
		AS1 obj = new AS1();
		
		System.out.println(obj.defaultS);
		System.out.println(obj.prvtStr);
		System.out.println(obj.protStr);
		System.out.println(obj.PubStr);
		
		obj.defMethod();
		obj.pvtMethod();
		obj.proMethod();
		obj.pubMethod();
		
//				All the veriables and methods are accessible in the same class
	}
	
	
	

}
