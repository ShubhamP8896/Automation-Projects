package day_25AbstractClass;

public class AbstractLoginPage extends AbstractPage
{

	AbstractLoginPage()
	{
//		super(5); -------> if we used super here then this call the parent class only overloaded constructor not default but child default is called
		System.out.println("Child class default const");
	}
	AbstractLoginPage(int a)
	{
		super(5);    // used super keyword for explicitly calling parent class constructor : here called both default and overloaded const
																					// but need to create object with parameter here
		System.out.println("Child class Overloaded const");
	}
	
	@Override
	public void title() 
	{
		System.out.println("Login Page - Title");
	}

	@Override
	public void url() 
	{
		System.out.println("Login page URL");	
	}
	
	public void doLogin()
	{
		System.out.println("Logged in Successfully");
	}
	
	public static void main(String[] args) 
	{
		AbstractLoginPage lp = new AbstractLoginPage();
		
		lp.title();
		lp.url();
		lp.displayLogo();
		AbstractPage.pageStyle();      // this is static method so we called that using class name	
		lp.timeOut();
		
		AbstractLoginPage p = new AbstractLoginPage(8);      // calling the overloaded constructor from parent and child
		
		
//		Top casting
		AbstractPage AP = new AbstractLoginPage();   // this call default const of parent and then child
		AbstractPage AP1 = new AbstractLoginPage(5); // this call overloaded const of parent and child
		
		
	}

}
