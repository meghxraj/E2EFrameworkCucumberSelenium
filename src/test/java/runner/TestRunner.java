package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "src/test/java/features",
		glue = {"stepDefinations"},
		tags = "@Test",
		//"@Test and @test2 and not @test3 pr @apTest",
		monochrome = true, //removes unnecessary chars in console
		plugin = {"pretty","json:target/cucumber-report/cucumber.json",
				//plugin to execute failed scenarios
				"rerun:target/failedScenarios.txt"}
)

//to rerun a failed scenarios create another runner with features fromthe target failed text file


//tags --> or is used to run test which has either of the name (@Somke or @Regression
//tags --> and is used to run test which has both tags for that scenario (@Smoke and @Regression)
//tags --> not is used to exclude the tags


//for testNG extend AbstractTestNGCucumberTests
public class TestRunner extends AbstractTestNGCucumberTests{
	
	//to run scenarios in parallel
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	

}
