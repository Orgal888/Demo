package Pages;

import Utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static StepDefinitions.Hooks.driver;

public class HomePage {
    String expectedUsernameHeader = ConfigurationReader.getProperty("ui-config.properties", "usernameHeader");

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='hui-globaluseritem']//span")
    public WebElement usernameHeader;

    @FindBy(xpath = "//*[contains(@class,'hui-primarynav__item')]/span")
    public List<WebElement> allMainTabs;

    @FindBy(xpath = "//*[@class='explore-tab-text']/span")
    public List<WebElement> allSubTabs;

    @FindBy(xpath = "//*[@class='search-row__fields']/h4")
    public List<WebElement> searchBarResults;

    @FindBy(xpath = "//*[@class='uni-form__input search-bar__input']")
    public WebElement searchBar;

    @FindBy(xpath = "//div[@class='hui-globalnav__group']/a/span")
    public List<WebElement> globalNavBar;

    @FindBy(xpath = "//*[@class='search-results']")
    public WebElement searchResult;

    @FindBy(xpath = "//div[@class='hui-globalnav__notifications-container']/../a[1]")
    public WebElement uploadBtn;

    public void validateUsernameHeader () {
        String actualUsernameHeader = usernameHeader.getText();
        Assert.assertEquals("Welcome username validation failed!!!" , expectedUsernameHeader, actualUsernameHeader);
    }

    public void search (String key) {
       searchBar.sendKeys(key);
    }
}
