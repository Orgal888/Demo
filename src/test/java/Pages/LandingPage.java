package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static StepDefinitions.Hooks.driver;

public class LandingPage {
    public LandingPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@data-qa-id='login-select']")
    public WebElement loginDropdown;

    @FindBy(xpath = "//*[@data-qa-id='login']")
    public WebElement alternateLoginButton;

    @FindBy(xpath = "//a[@data-qa-id='login-hudl']")
    public WebElement hudlDropdownOption;

}
