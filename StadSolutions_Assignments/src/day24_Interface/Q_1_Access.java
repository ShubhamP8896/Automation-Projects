package day24_Interface;

public class Q_1_Access implements Q_1_interface

{

	@Override
	public void withdral(int a) 
	{
		System.out.println(a + " rs. amount withdral successfully");
		
	}
	
	public static void main(String[] args) 
	{
		Q_1_Access obj = new Q_1_Access();
		obj.withdral(5000);		
	}

}
