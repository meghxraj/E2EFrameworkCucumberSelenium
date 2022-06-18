package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "src/test/java/features",
		glue = {"stepDefinations"},
		tags = "@Test",
		monochrome = true, //removes unnecessary chars in console
		plugin = {"pretty","json:target/cucumber-report/cucumber.json"}
)
//for testNG extend AbstractTestNGCucumberTests
public class TestRunner extends AbstractTestNGCucumberTests{
	

}
