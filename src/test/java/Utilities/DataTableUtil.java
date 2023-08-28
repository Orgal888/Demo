package Utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

import static StepDefinitions.Hooks.driver;

public class DataTableUtil {
    WebDriverWait wait = new WebDriverWait(driver, 20);

    public static void validateDataTable (DataTable dataTable, List<WebElement> tabElements) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        int i = 0;

        for (Map<String, String> map : maps) {
            String expectedTab = map.get("options");
            String actualTab = tabElements.get(i).getText();
            Assert.assertEquals("Tab verification failed!", expectedTab, actualTab);
            i++;
        }
    }
}
