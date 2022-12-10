package runnerPkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	features= "C:\\Users\\User\\eclipse-workspace\\MayBDDPOM\\src\\test\\java\\featurePkg",
					glue="stepDefinitions",
//					publish=true,
					plugin={"pretty","html:target/CucumberReport.html","json:target/JsonReport.json"},
					monochrome=true,
					tags="@Release1.0 or @Release2.0"
					)

public class RunnerClass {

}
