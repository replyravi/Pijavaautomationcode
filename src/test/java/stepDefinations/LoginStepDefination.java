package stepDefinations;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectModule.Loginfunction;

public class LoginStepDefination extends Loginfunction {

	public LoginStepDefination() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

	// Write automation code with the help of Object Page Module
	
	@Given("^Open Pi Application$")
    public void open_pi_application() throws Throwable {
        System.out.println("Pi Application Lanch");
    }

    @When("^Username and password show in Pi Application$")
    public void username_and_password_show_in_pi_application() throws Throwable {
    	System.out.println("Username and password page open");
    }
    
    @Then("^Enter valid username and password$")
    public void enter_valid_username_and_password() throws Throwable {
    	super.loginfun();
    }
    
    @When("^Pi Application dashboard show$")
    public void pi_application_dashboard_show() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	// Click on Later on Identity Verification page
    	//driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/btnSkip\")").click();
    	driver.findElementByAndroidUIAutomator("text(\"Later\")").click();
    }
    
    @Then("^Navigate to setting and click on logout$")
    public void navigate_to_setting_and_click_on_logout() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
    	
    	//driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/ivMenu\")").click();
    	driver.findElement(By.xpath ("//android.widget.ImageView[@bounds='[970,110][1036,176]']")).click();
    	
    	driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
    	
    	driver.findElementByAndroidUIAutomator("text(\"Logout\")").click();
    	
    	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Confirm\")").click();
    }
	
}
