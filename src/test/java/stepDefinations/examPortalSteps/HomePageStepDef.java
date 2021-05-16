package stepDefinations.examPortalSteps;


import cucumber.api.Scenario;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageBucket.PageReferences;
import pages.ExamPortal.HomePage;
import stepDefinations.commonSteps.Hooks;
import utils.PropertyFileReader;

import java.util.Properties;

public class HomePageStepDef extends PageReferences {
	private  static Properties properties = PropertyFileReader.readPropertyFile();
	private WebDriver driver;
	private Logger logger = Logger.getLogger(HomePageStepDef.class);
	private Scenario scenario;

	public HomePageStepDef() {
		driver = Hooks.getDriver();
		scenario = Hooks.getScenario();
	}

	@When("User lands on home page")
	public void user_lands_on_home_page() {
		homepage = new HomePage(driver);
		Assert.assertEquals("ExamFront",homepage.verifyPageTitle());
		logger.info("Page Title verified");
	}

	@Then("User click on register button")
	public void user_click_on_register_button() throws InterruptedException {
		homepage.clickOnRegister();
	}

}