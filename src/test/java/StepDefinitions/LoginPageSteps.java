package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Then;

public class LoginPageSteps {
    LoginPage loginPage = new LoginPage();

    @Then("user logs in to HUDL homepage with valid credentials")
    public void user_logs_in_to_HUDL_homepage_with_valid_credentials() {
        loginPage.login();
    }

}
