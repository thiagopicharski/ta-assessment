package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.DriverManager;

import static utils.DriverManager.driver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "steps",
        tags = "@Reset_Known_Password"
)

public class resetKnownPassword {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        DriverManager.launchBrowser();
        driver().get("https://pt-br.facebook.com/");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        DriverManager.quit();
    }

}
