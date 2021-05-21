package pages.ExamPortal;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TestBase;

import org.apache.log4j.Logger;

public class HomePage extends TestBase {

    private Logger logger = Logger.getLogger(HomePage.class);
    private WebDriverWait wait = new WebDriverWait(driver, 15);

    @FindBy(linkText = "Register")
    WebElement registerButton;
    @FindBy(linkText = "Login")
    WebElement loginButton;


    public HomePage(WebDriver driver) {
      super(driver);

    }

    public String verifyPageTitle() {
       return driver.getTitle();
    }


    public void clickOnRegister() throws InterruptedException {
      registerButton.click();
        Thread.sleep(2000);
    }


}