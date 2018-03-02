package WorkBenchTest;

import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class TestBench extends simDriver {

	static IOSDriver<IOSElement> driver = null;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		driver = iosDriver();

		// feedback PASS
		
//		driver.findElementByAccessibilityId("Skip").click();
//		
//		driver.findElementByAccessibilityId("settings icon darkmap").click();
//		System.out.println("This is a sysout statement for an displayed tag check");
//		System.out.println(driver.findElementByAccessibilityId("Leave Feedback").isDisplayed());
//
//		driver.findElementByAccessibilityId("Leave Feedback").click();
//		System.out.println("This is a sysout statement for an displayed tag check");
//		System.out.println(driver.findElementByAccessibilityId("SEND FEEDBACK").isDisplayed());
//
//		driver.findElementByXPath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/"
//				+ "XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
//				+ "XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]")
//				.sendKeys("Test");
//		System.out.println("This is a sysout statement for an displayed tag check");
//		System.out.println(driver.findElementByAccessibilityId("Bug").isDisplayed());
//		System.out.println("This is a sysout statement for an displayed tag check");
//		System.out.println(driver.findElementByAccessibilityId("General").isDisplayed());
//		System.out.println("This is a sysout statement for an displayed tag check");
//		System.out.println(driver.findElementByAccessibilityId("Content").isDisplayed());
//		System.out.println("This is a sysout statement for an displayed tag check");
//		System.out.println(driver.findElementByAccessibilityId("Feature Request").isDisplayed());
//
//		driver.findElementByAccessibilityId("SEND FEEDBACK").click();
//		System.out.println("This is a sysout statement for an displayed tag check Feedback OK check");
//		System.out.println(driver.findElementByXPath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/"
//				+ "XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
//				+ "XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]").getText());
//		driver.switchTo().alert().accept();
		
		// maplist PASS
		
//		driver.findElementByAccessibilityId("Skip").click();
//		
//		driver.findElementByAccessibilityId("profile icon").click();
//
//		driver.findElementByXPath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/"
//				+ "XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
//				+ "XCUIElementTypeOther[1]/XCUIElementTypeButton[1]").click();
//		
//		driver.findElementByXPath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/"
//				+ "XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]").sendKeys("Test2");
//
//		driver.findElementByAccessibilityId("CREATE MAP").click();
//
//		driver.findElementByAccessibilityId("back icon").click();
//
//		driver.findElementByAccessibilityId("profile icon").click();

		// map mode

//		driver.findElementByAccessibilityId("Skip").click();
//
		driver.findElementByAccessibilityId("settings icon lightmap").click();

		driver.findElementByAccessibilityId("Switch to Dark Map").click();
		
		System.out.println("This is a sysout statement for an displayed tag check");
		System.out.println(driver.findElementByAccessibilityId("settings icon darkmap").isDisplayed());

		driver.findElementByAccessibilityId("settings icon darkmap").click();

		driver.findElementByAccessibilityId("Switch to Light Map").click();

		System.out.println("This is a sysout statement for an displayed tag check");
		System.out.println(driver.findElementByAccessibilityId("settings icon lightmap").isDisplayed());

		// locate me PASS
		
//		driver.findElementByAccessibilityId("Skip").click();
//
//		driver.findElementByAccessibilityId("zoom to me darkmap icon").click();
//
//		System.out.println("This is a sysout statement for an alert check");
//		System.out.println(driver.switchTo().alert().getText());
//
//		driver.switchTo().alert().accept();
//		System.out.println("This is a sysout statement for an displayed tag check");
//		System.out.println(driver.findElementByAccessibilityId("You Are Here").isDisplayed());
//		
//		driver.launchApp();
//		driver.findElementByAccessibilityId("Skip").click();
//		driver.findElementByAccessibilityId("zoom to me darkmap icon").click();
//		
//		System.out.println("This is a sysout statement for an alert check");
//		System.out.println(driver.switchTo().alert().getText());
//
//		driver.switchTo().alert().accept();
//		
//		System.out.println("This is a sysout statement for an displayed tag check");
//		System.out.println(driver.findElementByAccessibilityId("You Are Here").isDisplayed());

		// onbooarding PASS

//		driver.launchApp();
//
//		System.out.println("This is a sysout statement for an displayed tag check");
//		System.out.println(driver.findElementByAccessibilityId("Skip").isDisplayed());
//
//		Dimension size = driver.manage().window().getSize();
//		int x = size.getWidth();
//		int y = (int) (size.getWidth() * 0.90);
//		int start = (int) (size.getHeight() / 2);
//		int end = (int) (size.getHeight() / 2);
//		driver.swipe(y, start, x, end, 10);
//
//		System.out.println("This is a sysout statement for an displayed tag check");
//		System.out.println(driver.findElementByAccessibilityId("Skip").isDisplayed());
//
//		driver.swipe(y, start, x, end, 10);
//		
//		System.out.println("This is a sysout statement for an displayed tag check");
//		System.out.println(driver.findElementByAccessibilityId("Skip").isDisplayed());
//
//		driver.swipe(y, start, x, end, 10);
//		
//		System.out.println("This is a sysout statement for an displayed tag check");
//		System.out.println(driver.findElementByAccessibilityId("Skip").isDisplayed());
//
//		driver.swipe(y, start, x, end, 10);
//
//		System.out.println("This is a sysout statement for an displayed tag check");
//		System.out.println(driver.findElementByAccessibilityId("Done").isDisplayed());
//
//		driver.findElementByAccessibilityId("Done").click();
//
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//		System.out.println("This is a sysout statement for an displayed tag check");
//		System.out.println(driver.findElementByAccessibilityId("Map").isDisplayed());

	}

}
