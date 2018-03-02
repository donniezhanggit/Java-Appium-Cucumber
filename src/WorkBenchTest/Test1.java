package WorkBenchTest;

import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Test1 extends simDriver {

	static IOSDriver<IOSElement> driver = null;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		driver = iosDriver();

		// feedback PASS
		
		driver.findElementByAccessibilityId("Skip").click();
		
		driver.findElementByAccessibilityId("settings icon darkmap").click();
		System.out.println("This is a sysout statement for an displayed tag check");
		System.out.println(driver.findElementByAccessibilityId("Leave Feedback").isDisplayed());

		driver.findElementByAccessibilityId("Leave Feedback").click();
		System.out.println("This is a sysout statement for an displayed tag check");
		System.out.println(driver.findElementByAccessibilityId("SEND FEEDBACK").isDisplayed());

		driver.findElementByXPath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/"
				+ "XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
				+ "XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]")
				.sendKeys("Test");
		System.out.println("This is a sysout statement for an displayed tag check");
		System.out.println(driver.findElementByAccessibilityId("Bug").isDisplayed());
		System.out.println("This is a sysout statement for an displayed tag check");
		System.out.println(driver.findElementByAccessibilityId("General").isDisplayed());
		System.out.println("This is a sysout statement for an displayed tag check");
		System.out.println(driver.findElementByAccessibilityId("Content").isDisplayed());
		System.out.println("This is a sysout statement for an displayed tag check");
		System.out.println(driver.findElementByAccessibilityId("Feature Request").isDisplayed());

		driver.findElementByAccessibilityId("SEND FEEDBACK").click();
		System.out.println("This is a sysout statement for an displayed tag check Feedback OK check");
		System.out.println(driver.findElementByXPath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/"
				+ "XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
				+ "XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]").getText());
		driver.switchTo().alert().accept();
	}
}
