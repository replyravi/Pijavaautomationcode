package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/ForgotPassword.feature",
		glue="stepDefinations", tags= "@forgotpassword",
        plugin= {"pretty", "html:target/ForgotPassword.html", "json:target/ForgotPassword.json", "junit:target/ForgotPassword.xml"})
public class ForgotPasswordTestRunner {

}
