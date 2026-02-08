package day_28throwOwnExp;

public class Browser_throw 
{
	String browser = "Chromeb";
	
	public void m1()
	{
		if(browser.equals("Chrome"))
		{
			System.out.println("Chrome Browser is found");
		}
		else if(browser.equals("Firefox"))
		{
			System.out.println("Firefox Browser is found");
		}
		else if(browser.equals("Edge"))
		{
			System.out.println("Edge Browser is Found");
		}
		else
		{
			throw new MyException("Browser is not Found"); // this will throw new exception when browser is not found.  
//			If the browser did'nt found then program is not run, so we used this .	
		}
		
		System.out.println("Hello");
	}
	
	public static void main(String[] args)
	{
		Browser_throw obj = new Browser_throw();
		
//		obj = null;	
		
		if (obj == null)
		{
			throw new MyException("Showing Null pointer Exception becasue obj = null ");  // this is showing when the obj = null>> this is our defined exception
		}

		obj.m1();
		
		
		System.out.println("End of program");    // if any exception is occurred then this code is not executes
		
	}
	

	

}
 