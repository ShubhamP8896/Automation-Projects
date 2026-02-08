package day_25AbstractClass;



public abstract class AbstractPage 
{

	
//	Constructor >> we are able to create but this is called with the Child class object as well as with top casting as well
	
	AbstractPage()
	{
		System.out.println("Parent Abstract Page Constructor - Default");
	}
	
	AbstractPage(int a)
	{
		System.out.println("Abstract Page Constructor - overloaded " + a);
	}
	
	
//	We are not able to create the object of abstract class
	
	public abstract void title();
	public abstract void url();
	
	public void timeOut()
	{
		System.out.println("time Out - 20 Second");
	}
	
	public final void displayLogo()
	{
		System.out.println("India - Logo");       // we are used final keyword so no one can override this becasue logo is same
	}
	
	public static void pageStyle()
	{
		System.out.println("Page Style");
		getTheme();
	}
	
	private static void getTheme()
	{
		System.out.println("Page Theme");    // we are able to use private AM here but we need call the in this class only in above method we called.
	}
}
