package StepDefinitions;

import Pages.HomePage;
import Utilities.DataTableUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static StepDefinitions.Hooks.driver;

public class HomePageSteps {
    WebDriverWait wait = new WebDriverWait(driver, 20);
    HomePage homePage = new HomePage();

    @Then("user should be able to verify account name on HUDL Homepage")
    public void user_should_be_able_to_verify_account_name_on_HUDL_Homepage() {
        homePage.validateUsernameHeader();
    }

    @Then("user should be able to verify all main tabs on HUDL Homepage")
    public void user_should_be_able_to_verify_all_main_tabs_on_HUDL_Homepage(DataTable dataTable) {
        DataTableUtil.validateDataTable(dataTable, homePage.allMainTabs);
    }

    @Then("user should be able to verify all sub-tabs on HUDL Homepage")
    public void user_should_be_able_to_verify_all_sub_tabs_on_HUDL_Homepage(DataTable dataTable) {
        DataTableUtil.validateDataTable(dataTable, homePage.allSubTabs);
    }

    @And("user should be able to verify all global nav bars on HUDL Homepage")
    public void user_should_be_able_to_verify_all_global_nav_bars_on_HUDL_Homepage(DataTable dataTable) {
        DataTableUtil.validateDataTable(dataTable, homePage.globalNavBar);
    }

    @Then("user makes a search for {string} on HUDL Homepage")
    public void userMakesASearchForOnHUDLHomepage(String user) {
        homePage.search(user);
        wait.until(ExpectedConditions.visibilityOf(homePage.searchResult));

        for (WebElement searchResult:homePage.searchBarResults) {
            if(searchResult.getText().equals(user)) {
                searchResult.click();
                break;
            }
        }
    }
}
