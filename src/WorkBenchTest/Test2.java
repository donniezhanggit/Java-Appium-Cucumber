package WorkBenchTest;

import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Test2 extends simDriver {

	static IOSDriver<IOSElement> driver = null;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		driver = iosDriver();
		
		// maplist PASS
		
		driver.findElementByAccessibilityId("Skip").click();
		
		driver.findElementByAccessibilityId("profile icon").click();

		driver.findElementByXPath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/"
				+ "XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
				+ "XCUIElementTypeOther[1]/XCUIElementTypeButton[1]").click();
		
		driver.findElementByXPath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/"
				+ "XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]").sendKeys("Test2");

		driver.findElementByAccessibilityId("CREATE MAP").click();

		driver.findElementByAccessibilityId("back icon").click();

		driver.findElementByAccessibilityId("profile icon").click();
	}

}
