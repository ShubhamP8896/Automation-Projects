package SeleniumGridStandAlone;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.factory.DriverFactory;
import com.qa.util.BrowserUtility;
import com.qa.util.ConfigReader;

public class BaseTestClass 
{	
	BrowserUtility bu = new BrowserUtility();
	String browserName = ConfigReader.getProperty("browser");
	@BeforeMethod
	public void setUp()
	{
		DriverFactory.launchBrowser_initDriver(browserName);
		bu.MaximizeWindow();
	}
	
	@AfterMethod
	public void tearDown()
	{
		DriverFactory.quitDriver();
	}

}
