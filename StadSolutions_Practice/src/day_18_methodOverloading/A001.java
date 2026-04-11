package day_18_methodOverloading;

public class A001 
{
	public void m(int a)
	{
		System.out.println(a);
	}
	
	public void m(String name)
	{
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		A001 obj = new A001();
		obj.m(5);
		obj.m("Shubham");
	}
}
