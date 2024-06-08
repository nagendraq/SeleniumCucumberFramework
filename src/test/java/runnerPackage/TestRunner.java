package runnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\features", glue = { "demoBlazeStepDefinitions",
		"hooks" }, plugin = "json:target/cucumber-reports/CucumberTestReport.json", tags = "@loginErrorScenario or @userRegistrationError")
public class TestRunner extends AbstractTestNGCucumberTests {

}
