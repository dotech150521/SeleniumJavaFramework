package stepDefinations.examPortalSteps;

import cucumber.api.Scenario;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageBucket.PageReferences;
import pages.ExamPortal.Registration;
import stepDefinations.commonSteps.Hooks;
import utils.PropertyFileReader;

import java.util.Properties;

public class RegistrationPageStepDef extends PageReferences {
    private static Properties projectProperties = PropertyFileReader.readPropertyFile();
    private WebDriver driver;
    private Logger logger = Logger.getLogger(HomePageStepDef.class);
    private Scenario scenario;

    public RegistrationPageStepDef() {
        driver = Hooks.getDriver();
        scenario = Hooks.getScenario();
    }

    @Then("User gets redirected to register page")
    public void user_gets_redirected_to_register_page() {
        registration = new Registration(driver);
        String registrationPageUrl = projectProperties.getProperty("registrationPageUrl");
        Assert.assertEquals(registrationPageUrl, registration.verifyRegistrationPage());

    }

    @Then("User fills registration form with details")
    public void user_fills_registration_form_with_details(DataTable dataTable) {
        registration.fillRegistrationForm(dataTable);
    }

    @Then("clicks on Register button")
    public void clicks_on_register_button() throws InterruptedException {
        registration.clickOnRegisterButton();
        Thread.sleep(2000);
    }

    @Then("Registration gets successful and alerts is displayed with user ID")
    public void registration_gets_successful_and_alerts_is_displayed_with_user_id() {

    }

}