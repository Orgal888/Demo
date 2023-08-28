package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static StepDefinitions.Hooks.driver;

public class ProfilePage {
    public ProfilePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='prof-ident-name']/h2")
    public WebElement profileName;
}
