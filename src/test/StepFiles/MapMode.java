package test.StepFiles;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.junit.Assert;


public class MapMode extends simDriver {

	IOSDriver<IOSElement> driver = iosDriver();
	
@Given("^I have the app loaded and I am on the main map launch page$")
public void i_have_the_app_loaded_and_I_am_on_the_main_map_launch_page() throws Throwable {
	driver.findElementByAccessibilityId("Skip").click();
}

@When("^I my app launches on the dark map mode, I can click the setting icon$")
public void i_my_app_launches_on_the_dark_map_mode_I_can_click_the_setting_icon() throws Throwable {
	driver.findElementByAccessibilityId("settings icon darkmap").click();
}

@Then("^I can click on the Light map button to change the mode$")
public void i_can_click_on_the_Light_map_button_to_change_the_mode() throws Throwable {
	driver.findElementByAccessibilityId("Switch to Light Map").click();
}

@Then("^The setting window will close and the map will be in Light map mode$")
public void the_setting_window_will_close_and_the_map_will_be_in_Light_map_mode() throws Throwable {
	Assert.assertTrue(driver.findElementByAccessibilityId("settings icon lightmap").isDisplayed());
}

@Then("^I can click on the setting icon to change the mode back to Dark map$")
public void i_can_click_on_the_setting_icon_to_change_the_mode_back_to_Dark_map() throws Throwable {
	driver.findElementByAccessibilityId("settings icon lightmap").click();
}

@Then("^I just click on the Dark map button to change the mode$")
public void i_just_click_on_the_Dark_map_button_to_change_the_mode() throws Throwable {
	driver.findElementByAccessibilityId("Switch to Dark Map").click();
}

@Then("^The setting window will close and the map will be in Dark map mode$")
public void the_setting_window_will_close_and_the_map_will_be_in_Dark_map_mode() throws Throwable {
	Assert.assertTrue(driver.findElementByAccessibilityId("settings icon darkmap").isDisplayed());
}


}
