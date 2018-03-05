package test.StepFiles;

import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class LocateMe extends  simDriver {

	IOSDriver<IOSElement> driver = iosDriver();
	
	@When("^I click on the locate me button$")
	public void i_click_on_the_locate_me_button() throws Throwable {
		  driver.findElementsByAccessibilityId("zoom to me darkmap icon");

	}

	@Then("^I click on the locate me button I should receive a permission pop up alert$")
	public void i_click_on_the_locate_me_button_I_should_receive_a_permission_pop_up_alert() throws Throwable {
		System.out.println("This is a sysout statement for an alert check");   
		System.out.println(driver.switchTo().alert().getText());
		    
	}

	@Then("^I can click on allow and the app will find my location on the map$")
	public void i_can_click_on_allow_and_the_app_will_find_my_location_on_the_map() throws Throwable {
		driver.switchTo().alert().accept();
		Assert.assertTrue(driver.findElementByAccessibilityId("You Are Here").isDisplayed());
		driver.switchTo().defaultContent();
	}

	@Then("^I will close the app and then open it back up$")
	public void i_will_close_the_app_and_then_open_it_back_up() throws Throwable {
		   driver.close();
		   driver.launchApp();
		   driver.findElementByAccessibilityId("Skip").click();
		   driver.findElementsByAccessibilityId("zoom to me darkmap icon");
	}

	@Then("^I click on the locate me button I should not receive a permission pop up alert$")
	public void i_click_on_the_locate_me_button_I_should_not_receive_a_permission_pop_up_alert() throws Throwable {
		  driver.findElementsByAccessibilityId("zoom to me darkmap icon");
		  System.out.println("This is a sysout statement for an alert check");
		 System.out.println(driver.switchTo().alert().getText());
	}

	@Then("^I should be sent to my current location on the map$")
	public void i_should_be_sent_to_my_current_location_on_the_map() throws Throwable {
		Assert.assertTrue(((RemoteWebElement) driver.findElementsByAccessibilityId("You Are Here")).isDisplayed());
	}
}
