package WorkBenchTest;

import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Test3 extends simDriver {

	static IOSDriver<IOSElement> driver = null;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		driver = iosDriver();	

		// map mode

		driver.findElementByAccessibilityId("Skip").click();

		driver.findElementByAccessibilityId("settings icon lightmap").click();

		driver.findElementByAccessibilityId("Switch to Dark Map").click();
		
		System.out.println("This is a sysout statement for an displayed tag check");
		System.out.println(driver.findElementByAccessibilityId("settings icon darkmap").isDisplayed());

		driver.findElementByAccessibilityId("settings icon darkmap").click();

		driver.findElementByAccessibilityId("Switch to Light Map").click();

		System.out.println("This is a sysout statement for an displayed tag check");
		System.out.println(driver.findElementByAccessibilityId("settings icon lightmap").isDisplayed());
	}

}
