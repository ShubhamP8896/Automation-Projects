package appHooks;



import com.qa.factory.DriverFactory;
import com.qa.util.BrowserUtility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks
{
	BrowserUtility bu = new BrowserUtility();
	@Before
	public void SetUp()
	{
		DriverFactory.launchBrowser_initDriver("chrome");
		bu.MaximizeWindow();
	}
	
	@After
	public void tearDown()
	{
		DriverFactory.quitDriver();
	}
	
	
	

}
