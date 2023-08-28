package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static StepDefinitions.Hooks.driver;

public class FileUploadPage {
    public FileUploadPage() {
        PageFactory.initElements(driver, this); }

    @FindBy(xpath = "//input[@class='upload-file-input']")
    public WebElement selectFilesBtn;

    @FindBy(xpath = "//*[contains(@data-qa-id,'trigger_upload')]")
    public WebElement confirmUpload;

    @FindBy(xpath = "//*[@class='upload-status']/h3")
    public WebElement successMessage;

    public void attachFile (String file) {
        String filePath = System.getProperty("user.dir") + "/src/test/resources/fileUpload/" + file;
        selectFilesBtn.sendKeys(filePath);
        confirmUpload.click();
    }

}
