package test.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (
		features = {"src/test/FeatureFile/"},
		glue = {"StepFiles"},
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber",
				"json:target/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"
		}
		
		
		)
public class MainRunner {

}
