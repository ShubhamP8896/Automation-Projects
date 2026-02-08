package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\features",
		glue = {"stepdefinations" ,  "hooks"},
		tags = "@DataTables" ,
		plugin = {"pretty", "html:target/dataTableReport.html"}	
		)
public class DataTables_AsList_AsLists_Runner03 {

}
