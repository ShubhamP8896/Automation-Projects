package day24_Interface;

public interface Q_4ukmeHosp extends Q_3WHO
{
	String name = "UK Hospital";    // this is default static and final
//	int a;   this is not possible
	
	public void PhysioServerces();
	public void pediaServices();
	
//	default method
	
	public default void dm()
	{
		System.out.println("UK Hospital default method");
	}

}
