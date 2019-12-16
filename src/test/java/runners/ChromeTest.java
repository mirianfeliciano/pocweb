package runners;

import configuration.DriverFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumberHtmlReport"},   dryRun = false,
        features = "src/test/resources/features",
        glue = "steps",
        tags = {"~@ignore"}
)
public class ChromeTest {
    @BeforeClass
    public static void setUp() {
        DriverFactory.createDriverByParameter();
    }

    @AfterClass
    public static void tearDown(){
        DriverFactory.quitDriver();
    }

}
