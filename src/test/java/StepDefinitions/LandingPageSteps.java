package StepDefinitions;

import Pages.LandingPage;
import Utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static StepDefinitions.Hooks.driver;

public class LandingPageSteps {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    LandingPage landingPage = new LandingPage();

    @Given("user navigates to HUDL Landing Page")
    public void user_navigates_to_HUDL_Landing_Page() {
        String url = ConfigurationReader.getProperty("ui-config.properties", "url");
        driver.get(url);
    }

    /**
     * This try catch block will decide on black or orange landing page login button
     */
    @Given("user navigates to HUDL Login Page")
    public void user_navigates_to_HUDL_Login_Page() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(landingPage.alternateLoginButton)).click();
        } catch (Exception e) {
            wait.until(ExpectedConditions.elementToBeClickable(landingPage.loginDropdown)).click();
            wait.until(ExpectedConditions.elementToBeClickable(landingPage.hudlDropdownOption)).click();
        }
    }
}
