package WorkBenchTest;

import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class TestBench extends simDriver {

	static IOSDriver<IOSElement> driver = null;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		driver = iosDriver();

		
	}

}
