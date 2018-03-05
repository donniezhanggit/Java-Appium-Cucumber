package test.StepFiles;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class simDriver {

	protected static IOSDriver<IOSElement> driver;
	
	protected static IOSDriver<IOSElement> iosDriver() {

	DesiredCapabilities d = new DesiredCapabilities();
	
	d.setCapability("platformName", "iOS");	
	d.setCapability("platform", "iOS");
	d.setCapability("automationName", "XCUITest");
	d.setCapability("deviceName", "iPhone-8");
	d.setCapability("platformVersion", "11.2");
	d.setCapability("udid", "2A9E043F-BD0A-4613-96F3-B25F2CA0B4F9");
	d.setCapability("bundleId", "com.calendre.staging.live");
	d.setCapability("xcodeOrgId", "KZ22KFNH7Z");
	
	URL remoteAddress;

		try {
		
				remoteAddress = new URL("http://127.0.0.1:4723/wd/hub");
			
			IOSDriver<IOSElement> sdriver = new IOSDriver<>(remoteAddress, d);
			sdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return sdriver;
		}catch(Exception e) {
			
		}
		return null;
	}
}
