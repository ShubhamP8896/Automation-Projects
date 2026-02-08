package runner;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src\\test\\resources\\features\\02_createAccount.feature",
		glue = {"stepDefinations", "appHooks" },
		plugin = {"pretty" , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}		
		)
public class CreateAccountRunner extends AbstractTestNGCucumberTests {

}
