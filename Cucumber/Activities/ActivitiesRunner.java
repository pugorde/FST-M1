package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class ActivitiesRunner {
    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/test/resources/Features",
            glue = {"stepDefinitions"},
            tags = "@Activity6",
            publish = true,
            plugin = {"pretty"},
            monochrome = true)
//        plugin = {"html:src/reports/HTML_Report.xml",
//                "json:src/reports/JSON_Report.xml",
//                "junit:src/reports/XML_Report.xml"
//        }

    public class testRunner {
        //empty
    }
}
