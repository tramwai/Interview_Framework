package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "step_definitions",
        tags = "",
        dryRun = true,
        monochrome = false
//        plugin = {"html:target/cucumber-reports",
//                "json:target/cucumber-reports/Cucumber.json",
//                "pretty"
//        }
                )
public class Runner {
}
