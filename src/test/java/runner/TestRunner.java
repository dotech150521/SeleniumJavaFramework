package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:Feature",
		glue = {"stepDefinations"},
		tags = "@ExamPortalRegistration",
		plugin = {"pretty", "html:target/cucumber-reports",
				"junit:target/cucumber-reports/test-report.xml",
				"json:target/cucumber-reports/test-report.json"},
		monochrome =true,
		strict =true,
		dryRun = false
		)
public class TestRunner {

	@AfterClass
	
	public static void generateReport() {
		
	}
}
