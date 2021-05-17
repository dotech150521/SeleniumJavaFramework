package pages.ExamPortal;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TestBase;
import utils.RandomUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Registration extends TestBase {

    private Logger logger = Logger.getLogger(HomePage.class);
    private WebDriverWait wait = new WebDriverWait(driver, 15);
    private Map<String, String> dataTableMap = new HashMap<>();

    @FindBy(name = "userName")
    WebElement userNameField;
    @FindBy(name = "password")
    WebElement passwordField;
    @FindBy(name = "firstName")
    WebElement firstNameField;
    @FindBy(name = "lastName")
    WebElement lastNameField;
    @FindBy(name = "email")
    WebElement emailField;
    @FindBy(name = "phone")
    WebElement phoneField;
    @FindBy(id = "Register")
    WebElement registerButton;

RandomUtil randomUtil = new RandomUtil();
    public Registration(WebDriver driver) {
        super(driver);

    }

    public String verifyRegistrationPage() {
        return driver.getCurrentUrl();
    }

    public void fillRegistrationForm(DataTable dataTable) {
        List<Map<String, String>> row = dataTable.asMaps(String.class, String.class);
        dataTableMap.putAll(row.get(0));
        userNameField.clear();
        userNameField.sendKeys(dataTableMap.get("Username") + randomUtil.randomNumber(3));
        passwordField.clear();
        passwordField.sendKeys(dataTableMap.get("Password"));
        firstNameField.clear();
        firstNameField.sendKeys(dataTableMap.get("Firstname"));
        lastNameField.clear();
        lastNameField.sendKeys(dataTableMap.get("Lastname"));
        emailField.clear();
        emailField.sendKeys(dataTableMap.get("Email"));
        phoneField.clear();
        phoneField.sendKeys(dataTableMap.get("Phone"));

    }

    public void clickOnRegisterButton() {
        registerButton.click();

    }
}