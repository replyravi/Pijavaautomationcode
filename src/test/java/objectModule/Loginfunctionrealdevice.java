package objectModule;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import stepDefinations.Base;
import stepDefinations.Realdevicebase;

public class Loginfunctionrealdevice extends Realdevicebase{
	public AndroidDriver <AndroidElement>driver =capabilities();
	public Loginfunctionrealdevice() throws MalformedURLException {
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
		driver.findElementByAndroidUIAutomator("text(\"Email Address or Customer Code\")").sendKeys("test101@test.com");
		driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/et_password\")").click();
		// Enter the password
		driver.findElementByAndroidUIAutomator("resourceId(\"com.cgs.trade:id/et_password\")").sendKeys("Testtest123@");
		driver.manage().timeouts().implicitlyWait(75, TimeUnit.SECONDS);
		
		// Click on login button
		
		driver.findElementByAndroidUIAutomator("text(\"Log in\")").click();
		
		
		
		 
		
	}
	
	
	
}
