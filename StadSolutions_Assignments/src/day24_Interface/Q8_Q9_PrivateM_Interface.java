package day24_Interface;

public interface Q8_Q9_PrivateM_Interface 
{
	private void m1();
	
	private final void m2();
	
	public final void m3();
	
	
	public final static void m4()
	{
		System.out.println();
	}
	
	private static void m5()
	{
		System.out.println("Private static method");
	}
	
	public final default void m6()
	{
		// Not Possible
	}
	
	private default void m7()
	{
		// Not Possible
	}
	
//	This above all not possible in the interface showing an error

}
