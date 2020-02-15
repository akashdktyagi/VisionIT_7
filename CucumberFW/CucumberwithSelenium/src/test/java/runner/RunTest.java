package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions

(		features="classpath:features",
		glue="",
		tags="",
		plugin= {"pretty",
				"html:target/cucumber-reports",
				"json:target/json/file.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},			
				dryRun=false
)
public class RunTest {
	

}
