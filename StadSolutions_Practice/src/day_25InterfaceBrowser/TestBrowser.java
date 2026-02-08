package day_25InterfaceBrowser;

public class TestBrowser 
{
	public static void main(String[] args) 
	{
		//ChromeBrowser c = new ChromeBrowser();          // for single broser we need to create the object
		//FireFoxBroser c = new FireFoxBroser();		// so it is deplicated to create objcet for all the diff classes
		//EdgeBrowser c = new EdgeBrowser();
		WebDriver c = null;							// SO here we declared the object ref as null so we initialized here
													// if not initialized then showing run time error for local variable is not initialized
		//Top Casting
		String browser= " CHROME  ";         
		//WebDriver c = new ChromeBrowser();       // top casting >> we are using three diff objects so because we used this
		
		// we declared webdriver c = null and initialized that for all the browsers in if else
		
		System.out.println(browser.toLowerCase());
		System.out.println(browser.trim());
		
		if(browser.trim().toLowerCase().equals("chrome"))
		{
			 c = new ChromeBrowser();				// this is the object 
		}
		else if(browser.equals("firefox"))
		{
			 c = new FireFoxBroser();
		}
		else if(browser.equals("edge"))
		{
			 c = new EdgeBrowser();
		}
		else
		{
			System.out.println("Browser Not found");
		}
			
		
	c.findElement();
	c.findElements();
	c.get("www.url.com");
	c.Click("Login Buotton");
	c.SendKeys("Shubham 8896");
	c.quite();
	
	c.isDisplay();
	c.getText("Login Page");
	

	}


}
