package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = "src\\test\\resources\\features\\P001_Registration_Page.feature",
glue = {"stepDefinations" , "appHooks"},
plugin = {"pretty"}
)

public class P001_Reg_Runner extends AbstractTestNGCucumberTests{

}
