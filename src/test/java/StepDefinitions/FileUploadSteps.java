package StepDefinitions;

import Pages.HomePage;
import Pages.FileUploadPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static StepDefinitions.Hooks.driver;

public class FileUploadSteps {
    WebDriverWait wait = new WebDriverWait(driver, 20);
    HomePage homePage = new HomePage();
    FileUploadPage fileUploadPage = new FileUploadPage();

    @When("user clicks on the upload button")
    public void userClicksOnTheUploadButton() {
        wait.until(ExpectedConditions.visibilityOf(homePage.uploadBtn)).click();
    }

    @And("user uploads {string} file")
    public void userUploadsFile(String fileName) {
        fileUploadPage.attachFile(fileName);
    }

    @Then("user should see a success message")
    public void userShouldSeeASuccessMessage() {
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(fileUploadPage.successMessage)).isDisplayed());
    }
}
