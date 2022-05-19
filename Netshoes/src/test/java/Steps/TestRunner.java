package Steps;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features", 
		glue = {"Steps"},
		monochrome = true,
		plugin = {"pretty", "html:target/HtmlReports",
				"junit:target/JunitReports/report.xml", 
				"json:target/JSONReports/report.json"},
		tags = {"@regression or @mustRun"})
public class TestRunner {

}
