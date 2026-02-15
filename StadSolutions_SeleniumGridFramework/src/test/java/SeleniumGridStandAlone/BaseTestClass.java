package SeleniumGridStandAlone;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.factory.DriverFactory;
import com.qa.util.BrowserUtility;

public class BaseTestClass 
{	
	BrowserUtility bu = new BrowserUtility();
	@BeforeMethod
	public void setUp()
	{
		DriverFactory.launchBrowser_initDriver("chrome");
		bu.MaximizeWindow();
	}
	
	@AfterMethod
	public void tearDown()
	{
//		DriverFactory.quitDriver();
	}

}
