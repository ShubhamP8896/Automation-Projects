package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
(
		features = "src\\test\\resources\\featureFiles",
		glue = {"stepDefinations", "hooks" },
//		tags = "@dataTable",
		plugin = {"pretty"}
		
)
public class Runner_01 extends AbstractTestNGCucumberTests
{

}
