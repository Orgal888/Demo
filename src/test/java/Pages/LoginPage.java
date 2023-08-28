package Pages;

import Utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static StepDefinitions.Hooks.driver;

public class LoginPage {
    WebDriverWait wait = new WebDriverWait(driver, 20);
    String username = ConfigurationReader.getProperty("ui-config.properties", "username");
    String password = ConfigurationReader.getProperty("ui-config.properties", "password");

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(id = "password")
    public WebElement passwordTextBox;

    @FindBy(id = "logIn")
    public WebElement continueButton;

    public void login () {
        wait.until(ExpectedConditions.elementToBeClickable(emailTextBox)).sendKeys(username);
        wait.until(ExpectedConditions.elementToBeClickable(passwordTextBox)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
    }
}
