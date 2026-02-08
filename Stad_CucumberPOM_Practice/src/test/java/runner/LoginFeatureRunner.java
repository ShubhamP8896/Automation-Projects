package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src\\test\\resources\\features\\01_loginFunctionality.feature",
		glue = {"stepDefinations", "appHooks" },
		plugin = {"pretty" , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}		
		)
public class LoginFeatureRunner extends AbstractTestNGCucumberTests
{

}
