package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks 
{
	@Before
	public void setUp()
	{
		System.out.println("Before Setup Method");
	}

	
	@After
	public void tearDown()
	{
		System.out.println("After Methods TearDown");
	}
}
