package WorkBenchTest;

import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Test4 extends simDriver {

	static IOSDriver<IOSElement> driver = null;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		driver = iosDriver();


		// locate me PASS
		
		driver.findElementByAccessibilityId("Skip").click();

		driver.findElementByAccessibilityId("zoom to me darkmap icon").click();

		System.out.println("This is a sysout statement for an alert check");
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();
		System.out.println("This is a sysout statement for an displayed tag check");
		System.out.println(driver.findElementByAccessibilityId("You Are Here").isDisplayed());
		
		driver.launchApp();
		driver.findElementByAccessibilityId("Skip").click();
		driver.findElementByAccessibilityId("zoom to me darkmap icon").click();
		
		System.out.println("This is a sysout statement for an alert check");
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();
		
		System.out.println("This is a sysout statement for an displayed tag check");
		System.out.println(driver.findElementByAccessibilityId("You Are Here").isDisplayed());
	
	}

}
