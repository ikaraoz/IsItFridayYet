package hellocucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                //"html:result/cucumber",
                "de.monochromata.cucumber.report.PrettyReports:result/cucumber"},
          features={"src/test/resources"},
        glue = {"hellocucumber"},
        monochrome = false,
        tags = "@HappyPath"

        )
public class RunCucumberTest {
}
