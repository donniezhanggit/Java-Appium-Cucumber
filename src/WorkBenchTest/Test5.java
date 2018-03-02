package WorkBenchTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Test5 extends simDriver {

	static IOSDriver<IOSElement> driver = null;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		driver = iosDriver();

		// onbooarding PASS

		driver.launchApp();

		System.out.println("This is a sysout statement for an displayed tag check");
		System.out.println(driver.findElementByAccessibilityId("Skip").isDisplayed());

		Dimension size = driver.manage().window().getSize();
		int x = size.getWidth();
		int y = (int) (size.getWidth() * 0.90);
		int start = (int) (size.getHeight() / 2);
		int end = (int) (size.getHeight() / 2);
		driver.swipe(y, start, x, end, 10);

		System.out.println("This is a sysout statement for an displayed tag check");
		System.out.println(driver.findElementByAccessibilityId("Skip").isDisplayed());

		driver.swipe(y, start, x, end, 10);
		
		System.out.println("This is a sysout statement for an displayed tag check");
		System.out.println(driver.findElementByAccessibilityId("Skip").isDisplayed());

		driver.swipe(y, start, x, end, 10);
		
		System.out.println("This is a sysout statement for an displayed tag check");
		System.out.println(driver.findElementByAccessibilityId("Skip").isDisplayed());

		driver.swipe(y, start, x, end, 10);

		System.out.println("This is a sysout statement for an displayed tag check");
		System.out.println(driver.findElementByAccessibilityId("Done").isDisplayed());

		driver.findElementByAccessibilityId("Done").click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println("This is a sysout statement for an displayed tag check");
		System.out.println(driver.findElementByAccessibilityId("Map").isDisplayed());

	}

}
