package VelocityPack7;

public class ClassAConstructor                              // Session 19
{
	public ClassAConstructor()
	{
		System.out.println("Hii");
	}

	public ClassAConstructor(int a)
	{
		System.out.println("Hello");
	}
	
	public ClassAConstructor(int a, int b)
	{
		System.out.println("How are you");
	}
	
	public static void main(String[] args) 
	{
//		For calling COnstructors we need create Objects.
//		First.
		ClassAConstructor x = new ClassAConstructor();
//		Second.
		ClassAConstructor x1 = new ClassAConstructor(5);
//		Third.
		ClassAConstructor x2 = new ClassAConstructor(5,6);
	}
	
	
	
}
