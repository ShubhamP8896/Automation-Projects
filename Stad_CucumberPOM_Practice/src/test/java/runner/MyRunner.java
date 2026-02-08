package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@SuppressWarnings("deprecation")
//@RunWith(Cucumber.class)
//@CucumberOptions

//we need to import cucumber options from the testNG
@CucumberOptions(
		features = "src\\test\\resources\\features",
		glue = {"stepDefinations" , "appHooks"},
		plugin = {"pretty" , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}		
		)

public class MyRunner extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel = true)	
	public Object [] [] scenarios() {
		return super.scenarios();
	}
}
