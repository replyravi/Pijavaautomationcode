package objectModule;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import stepDefinations.Base;

public class Loginfunction extends Base{
	public AndroidDriver <AndroidElement>driver =capabilities();
	public Loginfunction() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void loginfun()
	{
		driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
		
		
    	driver.findElementByAndroidUIAutomator("text(\"EN\")").click();
    	
    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    	
       // Click on Sign up button
    	
    	driver.findElementByAndroidUIAutomator("text(\"Log In\")").click();
		// Enter the username
		driver.findElementByAndroidUIAutomator("text(\"Email Address or Customer Code\")").sendKeys("testpi5@gmail.com");
		driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/et_password\")").click();
		// Enter the password
		driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/et_password\")").sendKeys("Testtest12345@");
		driver.manage().timeouts().implicitlyWait(75, TimeUnit.SECONDS);
		
		// Click on login button
		
		driver.findElementByAndroidUIAutomator("text(\"Log in\")").click();
		
		
		
		 
		
	}
	
	
	
}
