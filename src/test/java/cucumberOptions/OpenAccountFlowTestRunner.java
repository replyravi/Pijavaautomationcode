package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/OpenAccount.feature",
		glue="stepDefinations", tags= "@Openaccountflow ",
        plugin= {"pretty", "html:target/Openaccountflow.html", "json:target/Openaccountflow.json", "junit:target/Openaccountflow.xml"})
public class OpenAccountFlowTestRunner {

}
