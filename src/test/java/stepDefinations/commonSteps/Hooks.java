package stepDefinations.commonSteps;

import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import org.apache.log4j.Logger;
import cucumber.api.Scenario;
import cucumber.api.java.*;
import utils.TestUtils;

public class Hooks {

	private static WebDriver driver;
	private static Scenario report;
	private Logger logger = Logger.getLogger(Hooks.class);

	public static WebDriver getDriver() {
		return driver;
	}

	public static Scenario getScenario() {
		return report;
	}

	@Before
	public void setUpDriver(Scenario scenario) {

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		LoggingPreferences logPreferences = new LoggingPreferences();
		logPreferences.enable(LogType.PERFORMANCE, Level.ALL);
		options.setCapability("goog:loggingPrefs", logPreferences);

		System.setProperty(TestUtils.WEBDRIVER_CHROME_BROWSER, System.getProperty("user.dir") + "/src/test/resources/drivers/win/chromedriver.exe");
		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.addArguments("--start-maximized");
		options.setCapability(ChromeOptions.CAPABILITY, options);
		
		driver = new ChromeDriver(options);
		logger.info("Chrome browser launched");
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtils.WAIT_FOR_ELEMENT_LOAD, TimeUnit.SECONDS);
		report = scenario;
	}

	
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			try {
				scenario.write("Current Page is "+ driver.getCurrentUrl());
				byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			}
			catch (WebDriverException somePlatformsDoesnotSupportScreenshot) {
				System.err.println(somePlatformsDoesnotSupportScreenshot.getMessage());
			}
		}
		if(driver !=null) {
			driver.quit();
		}
	}
}