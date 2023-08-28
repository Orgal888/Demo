package StepDefinitions;

import Pages.HomePage;
import Pages.ProfilePage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import static StepDefinitions.Hooks.driver;

public class ProfilePageSteps {
    WebDriverWait wait = new WebDriverWait(driver, 20);
    HomePage homePage = new HomePage();
    ProfilePage profilePage = new ProfilePage();

    @And("user validates {string} profile on HUDL Profile Page")
    public void userValidatesProfileOnHUDLProfilePage(String user) {
        String actualProfileName = profilePage.profileName.getText();
        Assert.assertEquals("Profile name verification failed!", user, actualProfileName);
    }
}
