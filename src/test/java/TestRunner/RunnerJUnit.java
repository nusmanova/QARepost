package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources/Features",
        glue = {"StepDefinitions"},
    	 monochrome=true,
    	 tags= "@smoke or @regression",
    	 dryRun = false,
    	 plugin= {"pretty", "html:target/HtmlReports/report.html"}
		        // {"pretty", "jason:target/HtmlReports/cucumber.json"}
		       //  {"pretty", "junit:target/HtmlReports/cucumber.xml"}
)
public class RunnerJUnit {

}
