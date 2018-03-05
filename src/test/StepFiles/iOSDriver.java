package test.StepFiles;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class iOSDriver {

	protected static IOSDriver<IOSElement> driver;
	
	protected   IOSDriver<IOSElement> iosDriver() {
		
		DesiredCapabilities d = new DesiredCapabilities();
		
		d.setCapability("platformName", "iOS");	
		d.setCapability("platform", "iOS");
		d.setCapability("automationName", "XCUITest");
		d.setCapability("deviceName", "iPhone 8");
		d.setCapability( "app", "/Users/williambigno/Live/Live/Payload/liveXYZ.app");
		d.setCapability("udid", "a46d4e58a830495be071ab9af97effd8df8f4142");
		d.setCapability("xcodeOrgId", "C5Y5V24V2J");
		d.setCapability("xcodeSigningId", "iPhone Developer");
		d.setCapability("clearSystemFiles", "true");
		d.setCapability("bootstrapPath", "/usr/local/lib/node_modules/appium-xcuitest-driver/WebDriverAgent");
		d.setCapability("agentPath", "/usr/local/lib/node_modules/appium-xcuitest-driver/WebDriverAgent/WebDriverAgent.xcodeproj");
		
		URL remoteAddress;
		try {
			remoteAddress = new URL("http://127.0.0.1:8181/wd/hub");
			IOSDriver<IOSElement> driver = new IOSDriver<>(remoteAddress, d);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return driver;
	}
}
