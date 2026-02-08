package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\features"},
		glue = {"stepdefinations" , "hooks"},
//		tags = "@SingleUserAsList" ,
//		tags = "@MultipleUserAsLists",
//		tags = "@TwoColumnsAsMap",
				tags = "@MultipleColumnsAsMaps",
		plugin = {"pretty" , "html:target/AslistReport.html"}		
		)
public class RunnerFor_dataTables 
{

}
