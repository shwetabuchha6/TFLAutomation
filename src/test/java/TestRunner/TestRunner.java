package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Featurefiles",
        glue="StepDef",
       // plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
        plugin = { "pretty", "html:target/cucumber-reports/report.html" }

)
public class TestRunner {
}
