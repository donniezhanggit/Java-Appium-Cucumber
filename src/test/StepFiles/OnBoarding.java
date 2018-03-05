package test.StepFiles;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Dimension;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class OnBoarding extends simDriver {

	IOSDriver<IOSElement> driver = iosDriver();


@Given("^The app launches to the first on-baording screen$")
public void the_app_launches_to_the_first_on_baording_screen() throws Throwable {
	driver.launchApp();
}

@When("^The app opens, the on boarding screen will display and I confirm the page has a skip button$")
public void the_app_opens_the_on_boarding_screen_will_display_and_I_confirm_the_page_has_a_skip_button() throws Throwable {
	Assert.assertTrue(driver.findElementByAccessibilityId("Skip").isDisplayed());
}

@Then("^I will swipe to the next page$")
public void i_will_swipe_to_the_next_page() throws Throwable {
	Dimension size = driver.manage().window().getSize();
	int x = size.getWidth();
	int y = (int) (size.getWidth() * 0.90);
	int start = (int) (size.getHeight() / 2);
	int end = (int) (size.getHeight() / 2);
	driver.swipe(y, start, x, end, 10);
}

@Then("^I confirm the second page has a skip button$")
public void i_confirm_the_second_page_has_a_skip_button() throws Throwable {
	Assert.assertTrue(driver.findElementByAccessibilityId("Skip").isDisplayed());
}

@Then("^I confirm the third page has a skip button$")
public void i_confirm_the_third_page_has_a_skip_button() throws Throwable {
	Assert.assertTrue(driver.findElementByAccessibilityId("Skip").isDisplayed());
}

@Then("^I confirm the fourth page has a skip button$")
public void i_confirm_the_fourth_page_has_a_skip_button() throws Throwable {
	Assert.assertTrue(driver.findElementByAccessibilityId("Skip").isDisplayed());
}

@Then("^I confirm the fifth page has a Done button$")
public void i_confirm_the_fourth_page_has_a_Done_button() throws Throwable {
	Assert.assertTrue(driver.findElementByAccessibilityId("Done").isDisplayed());
}

@Then("^I will click on the Done button$")
public void i_will_click_on_the_Done_button() throws Throwable {
	driver.findElementByAccessibilityId("Done").click();
}

@Then("^I will be taken the the main map launch page$")
public void i_will_be_taken_the_the_main_map_launch_page() throws Throwable {
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Assert.assertTrue(driver.findElementByAccessibilityId("Map").isDisplayed());
}


}
