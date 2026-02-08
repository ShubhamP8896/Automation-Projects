package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = {"src\\test\\resources\\features"},
	    glue = {"stepdefinations" , "hooks"},
	    tags = "@DataDriven",
//	    tags = "@Regestration",
//	    monochrome = true,
	    plugin = {"pretty" , "html:target/cucumber-reports1.html" , "junit:target/cucumber-reports2.xml" , "json:target/cucumber-reports3.json"}
	)
public class DataDrivenRunner_2 
{

}
