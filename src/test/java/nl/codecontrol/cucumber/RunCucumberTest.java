package nl.codecontrol.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumberHtmlReport",
                "pretty:target/cucumber-json-report.json"},
        features = "classpath:features",
        glue = {"nl.codecontrol.cucumber"})
public class RunCucumberTest {
}
