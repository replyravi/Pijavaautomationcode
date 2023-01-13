package stepDefinations;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;

public class Stepdefination extends Base {
public AndroidDriver <AndroidElement>driver =capabilities();
	
	public Stepdefination() throws MalformedURLException {}


	  @Given("^Launch Pi application$")
	    public void launch_pi_application() throws Throwable {
		  System.out.println("Application Launched");
	        
		  // Waiting for launch application main page
		  driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
	    }

	    @Given("^Change language and click on Sign Up$")
	    public void change_language_and_click_on_sign_up() throws Throwable {
	    	
	    	// Click on language change 
	    	
	    	driver.findElementByAndroidUIAutomator("text(\"EN\")").click();
	    	
	    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	    	
	       // Click on Sign up button
	    	
	    	driver.findElementByAndroidUIAutomator("text(\"Sign Up\")").click(); 
	    	
	    	
	    	
	    }
	    @Then("^Click on checkbox term and condition$")
	    public void click_on_checkbox_term_and_condition() throws Throwable {
	    	
	    	// Wait for term and condition page load
	    	 driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	    	 
	    	 // click all the check box
	    	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    	 driver.findElement(By.xpath ("//android.widget.CheckBox[@bounds='[99,544][165,610]']")).click();
	    	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    	 driver.findElement(By.xpath ("//android.widget.CheckBox[@bounds='[99,868][165,934]']")).click();
	    	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
	    	 driver.findElement(By.xpath ("//android.widget.CheckBox[@bounds='[99,1122][165,1188]']")).click();
	    	 
	    	 
	    }
	    
	    @Then("^Click on continue$")
	    public void click_on_continue() throws Throwable {
	    	
	    	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    	
	    	// Click on continue button
	    	
	    	driver.findElementByAndroidUIAutomator("text(\"Continue\")").click();
	       
	    }

	    @Then("^Enter email id and phone number$")
	    public void enter_email_id_and_phone_number() throws Throwable {
	        
	    	// Enter the unique mail id and phone number in the text box
	    	
	    	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    	Random randomEmail = new Random();
	   	 int randomInt = randomEmail.nextInt(10000);
	   	 
	   	//driver.findElementByAndroidUIAutomator("text(\"mail@mail.com\")").click();
	    	driver.findElementByAndroidUIAutomator("text(\"mail@mail.com\")").sendKeys("Test+pi"+randomInt+"@gmail.com");
	    	
	    	// Enter phone number
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	Random randomnumber = new Random();
		   	 int randomIntp = randomnumber.nextInt(10000000);
		   	driver.findElementByAndroidUIAutomator("text(\"811111111\")").click();
		   	
		   	driver.findElementByAndroidUIAutomator("text(\"811111111\")").sendKeys("6"+randomIntp+"01");
	    }

	    @Then("^Click on continue tap$")
	    public void click_on_continue_tap() throws Throwable {
	        // Click on continue
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"We will use this email address as our primary way to reach you, including sending important documents.\")").click();
	    	
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("text(\"Continue\")").click();
	    }
	    @When("^Verify email page open$")
	    public void verify_email_page_open() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
	    	String verifymail=driver.findElementByAndroidUIAutomator("text(\"Verify Email Address\")").getText();
	    	System.out.print(verifymail);
	    	
	    	
	    }
	    @Then("^Click on send verification code$")
	    public void click_on_send_verification_code() throws Throwable {
	      // Click on verify button link
	    	driver.findElementByAndroidUIAutomator("text(\"Send Verification Code\")").click();
	    }

	    @Then("^Enter verification code$")
	    public void enter_verification_code() throws Throwable {
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
	    @When("^Verify mobile phone page open$")
	    public void verify_mobile_phone_page_open() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
	    	String verifynumber=driver.findElementByAndroidUIAutomator("text(\"Verify Mobile Phone\")").getText();
	    	System.out.print(verifynumber);
	    }
	    @Then("^Click on send verification code for mobile$")
	    public void click_on_send_verification_code_for_mobile() throws Throwable {
	    	// Click on verify button link
	    	driver.findElementByAndroidUIAutomator("text(\"Send Verification Code\")").click();
	    }

	    @Then("^Enter verification code for mobile$")
	    public void enter_verification_code_for_mobile() throws Throwable {
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

	    @Then("^Enter password and confirm password and click finish$")
	    public void enter_password_and_confirm_password_and_click_finish() throws Throwable {
	    	// Enter the password and conform password in the text field area
	    	driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
	    	driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/et_password\")").sendKeys("Testtest1234!");
	    	
	    	driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/et_confirm_password\")").click();
	    	driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/et_confirm_password\")").sendKeys("Testtest1234!");
	    	
	    	driver.findElementByAndroidUIAutomator("text(\"Password must contain the following:\")").click();
	    	
	    	
	    	driver.findElementByAndroidUIAutomator("text(\"Finish\")").click();
	    	
	       
	    }

	
}
