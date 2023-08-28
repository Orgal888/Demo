package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber", "json:target/cucumber.json"},
        features="src/test/resources/features",
        glue="StepDefinitions",
        tags="@run",
        dryRun = false
)

public class UITestRunner {


}