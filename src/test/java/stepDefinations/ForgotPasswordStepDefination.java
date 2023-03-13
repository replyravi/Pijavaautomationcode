package stepDefinations;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectModule.Loginfunction;

public class ForgotPasswordStepDefination extends Loginfunction  {

	public ForgotPasswordStepDefination() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

	

    @Given("^Click on forgot password$")
    public void click_on_forgot_password() throws Throwable {
driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
		
		
    	driver.findElementByAndroidUIAutomator("text(\"EN\")").click();
    	
    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Log In\")").click();
    	// Click on forget password 
    	driver.findElementByAndroidUIAutomator("text(\"Forgot Password?\")").click();
    }

    @When("^Navigate to Forgot password page$")
    public void navigate_to_forgot_password_page() throws Throwable {
    	String forgotpasswordpage =driver.findElementByAndroidUIAutomator("text(\"Forgot Password\")").getTagName();
    	System.out.println(forgotpasswordpage);
    }
    @Then("^Enter email address$")
    public void enter_email_address() throws Throwable {
    // Enter the mail id in the text box 	
    	driver.findElementByAndroidUIAutomator("text(\"mail@mail.com\")").click();
    	driver.findElementByAndroidUIAutomator("text(\"mail@mail.com\")").sendKeys("test101@test.com");
       
    }

    @Then("^Enter phone number$")
    public void enter_phone_number() throws Throwable {
    	// Enter phone number in the text box
    	driver.findElementByAndroidUIAutomator("text(\"811111111\")").click();
    	driver.findElementByAndroidUIAutomator("text(\"811111111\")").sendKeys("846162635");
    	driver.findElementByAndroidUIAutomator("text(\"Forgot Password\")").click();
    }
	
    @Then("^Click on continue button$")
    public void click_on_continue_button() throws Throwable {
        // Click continue button
    	driver.findElementByAndroidUIAutomator("text(\"Continue\")").click();
    	
    }
	
    @When("^Navigate to Rest password page$")
    public void navigate_to_rest_password_page() throws Throwable {
        // Wait for rest page open 
    	driver.manage().timeouts().implicitlyWait(350, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Reset via email\")").click();
    }
	
    @Then("^Click on reset via email$")
    public void click_on_reset_via_email() throws Throwable {
    	System.out.println("Click via reset page open");
    }
    @Then("^Click on continue button via email$")
    public void click_on_continue_via_email() throws Throwable {
    	// Click on continue button
    	driver.findElementByAndroidUIAutomator("text(\"Continue\")").click();
    }
    @When("^Navigate to Rest password page otp$")
    public void navigate_to_rest_password_page_otp() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(350, TimeUnit.SECONDS);
    	String forgotpasswordpag =driver.findElementByAndroidUIAutomator("text(\"Reset Password\")").getTagName();
    	System.out.println(forgotpasswordpag);
    	
    }

    @Then("^Enter otp and click continue$")
    public void enter_otp_and_click_continue() throws Throwable {
    	  // Enter the verification code
    	driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/otp_number_1\")").sendKeys("1");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/otp_number_2\")").sendKeys("2");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/otp_number_3\")").sendKeys("3");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/otp_number_4\")").sendKeys("4");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/otp_number_5\")").sendKeys("5");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/otp_number_6\")").sendKeys("6");
    }

    @Then("^Enter password and confirm password$")
    public void enter_password_and_confirm_password() throws Throwable {
        // Enter password and conform password 
    	driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/et_password\")").click();
    	
    	//driver.findElement(By.xpath ("//android.widget.ImageView[@bounds='[44,341][1036,493]']")).click();
    	driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/et_password\")").sendKeys("Testtest123@");
    	
    driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/et_confirm_password\")").click();
    	//driver.findElement(By.xpath ("//android.widget.ImageView[@bounds='[44,614][1036,766]']")).click();
    	driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/et_confirm_password\")").sendKeys("Testtest123@");
    }

    @Then("^Click finish$")
    public void click_finish() throws Throwable {
    	//Navigate cursor out of box and click finish
    	String forgotpasswordpa =driver.findElementByAndroidUIAutomator("text(\"Password must contain the following:\")").getTagName();
    	System.out.println(forgotpasswordpa);
    	driver.findElementByAndroidUIAutomator("text(\"Password must contain the following:\")").click();
    	driver.findElementByAndroidUIAutomator("text(\"Finish\")").click();
        
    }

    @Then("^Click back to log inFeature$")
    public void click_back_to_log_infeature() throws Throwable {
    	
    	driver.manage().timeouts().implicitlyWait(350, TimeUnit.SECONDS);
    	driver.findElementByAndroidUIAutomator("text(\"Back to Log in\")").click();
    	super.loginfun();
    	
       
    }


}
