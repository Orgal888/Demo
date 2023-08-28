package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver () {
        if (driver == null) {
            //WebDriverManager.chromedriver().setup(); This is the temporary solution since Boni Garcia has issues
            //While finding corresponding Chrome version
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
            driver = new ChromeDriver();
        }

        return driver;
    }

    public static void closeDriver () {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }

}
