package WebTask.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-html-reports"
        },
        glue = "WebTask/stepDefinitions",
        features = "src/test/resources/features",
        tags = "",
        dryRun = false
)
public class Runner {
}