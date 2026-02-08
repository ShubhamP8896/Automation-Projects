package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks
{
	@Before(order = 1)
	public void OpenUrl()
	{
		System.out.println("OpenUrl");
	}
	
	@Before(order = 2)
	public void timeOuts()
	{
		System.out.println("timeOuts");
	}
	
	@After(order = 2)
	public void CloseFiles()
	{
		System.out.println("CloseFiles");
	}
	
	@After(order = 1)
	public void tearDown()
	{
		System.out.println("tearDown");
	}

}
