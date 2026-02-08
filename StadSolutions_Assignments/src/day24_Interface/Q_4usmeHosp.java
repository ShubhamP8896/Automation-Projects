package day24_Interface;

public interface Q_4usmeHosp extends Q_3WHO
{
	String name = "Usme Hospital";   // this is default static and final
	
	public void cardioServices();
	public void neuroservices();
	
	public static void hospital()
	{
		System.out.println("USME - Static Method");
	}

}
