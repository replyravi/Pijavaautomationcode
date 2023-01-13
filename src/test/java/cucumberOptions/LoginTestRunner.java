package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/Login.feature",
		glue="stepDefinations", tags= "@SignIn",
        plugin= {"pretty", "html:target/SignIn.html", "json:target/SignIn.json", "junit:target/SignIn.xml"})
public class LoginTestRunner {

}
