package skeleton;

import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","json:src/cucumber-reports/report1.json"},monochrome=true,
features= {"src/test/resources/skeleton/login.feature"})
public class CucumberRunner {

}
