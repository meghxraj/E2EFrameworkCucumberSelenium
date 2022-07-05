package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "@target/failedScenarios.txt",
		glue = {"stepDefinations"},
		tags = "@Test",
		//"@Test and @test2 and not @test3 pr @apTest",
		monochrome = true, //removes unnecessary chars in console
		plugin = {"pretty","json:target/cucumber-report/cucumber.json",
				//plugin to execute failed scenarios
				"rerun:target/failedScenarios.txt"}
)


public class FailedRunner  extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
