package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/html-reports/cucumber.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/failed_scenarios.txt"
        },
        features = "./src/test/resources/features",
        glue = {"stepdefinitions","hooks"},
        monochrome = true,
        publish = true,
        dryRun = false,
        tags = "@eteration"  // api ///  eteration

)
public class Runner{


}
