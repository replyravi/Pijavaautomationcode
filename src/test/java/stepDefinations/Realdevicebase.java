package stepDefinations;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Realdevicebase {

	
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy Note9");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		cap.setCapability(MobileCapabilityType.UDID, "26c3d745ca217ece");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
		//cap.setCapability(MobileCapabilityType.APP, "/Users/ravi/Documents/AutomationUATBuild/pi-uat-release-automation-10-02-2023.apk");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.cgs.trade");
    	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.cgs.trade.MainSplashActivity");
    	
		/*
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel_4");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		//cap.setCapability(MobileCapabilityType.APP, "/Users/ravi/Documents/AutomationUATBuild/pi-uat-release-automation-10-02-2023.apk");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.cgs.trade");
    	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.cgs.trade.MainSplashActivity");
    	
    	*/
		
		
    	/* Real device capability 
    	
    	 //Setting mobile capabilities
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "Galaxy Note9");
        desiredCapabilities.setCapability("udid","0986fbcd0805");
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","10");
        desiredCapabilities.setCapability("appPackage","com.miui.calculator");
        desiredCapabilities.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");

    	
    	
    	 */
	
		
		AndroidDriver <AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		return driver;
		
		}
}
