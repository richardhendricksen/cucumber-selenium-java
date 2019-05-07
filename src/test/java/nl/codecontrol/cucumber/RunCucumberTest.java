package nl.codecontrol.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-report/cucumber.json"},
        features = "classpath:features",
        glue = {"nl.codecontrol.cucumber"})
public class RunCucumberTest {
}
