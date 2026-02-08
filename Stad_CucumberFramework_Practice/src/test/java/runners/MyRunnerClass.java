package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\features"},
		tags = "@Sanity",
		glue = {"stepdefinations"},
		plugin = {"pretty"}
		)
public class MyRunnerClass 
{

}
