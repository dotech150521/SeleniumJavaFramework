package stepDefinations.commonSteps;

import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageBucket.PageReferences;
import utils.PropertyFileReader;

import java.util.Properties;
import org.apache.log4j.Logger;

public class CommonSteps extends PageReferences {

	private static Properties projectProperties = PropertyFileReader.readPropertyFile();
	private WebDriver driver;
	private Logger logger = Logger.getLogger(CommonSteps.class);
	private Scenario scenario;

	public CommonSteps() {driver = Hooks.getDriver();}

	@Given("User launches exam portal URL")
	public void userLaunchesExamPortalURL() throws InterruptedException {
		String examPortalURL="";
		examPortalURL =projectProperties.getProperty("examPortal");
		driver.get(examPortalURL);
		logger.info("Exam Portal URL launched");
		Thread.sleep(5000);
	}
}