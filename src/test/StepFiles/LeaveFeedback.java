package test.StepFiles;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.junit.Assert;

public class LeaveFeedback extends simDriver {

	IOSDriver<IOSElement> driver = iosDriver();

	@When("^I click on the gear setting icon, I should see a list of options that include Invite Friends, Leave Feedback, Getting Started$")
	public void i_click_on_the_gear_setting_icon_I_should_see_a_list_of_options_that_include_Invite_Friends_Leave_Feedback_Getting_Started()
			throws Throwable {
		driver.findElementByAccessibilityId("settings icon darkmap").click();
		Assert.assertTrue(driver.findElementByAccessibilityId("Leave Feedback").isDisplayed());
	}

	@When("^I click on the Leave Feedback button, I should see the feedback modal$")
	public void i_click_on_the_Leave_Feedback_button_I_should_see_the_feedback_modal() throws Throwable {
		driver.findElementByAccessibilityId("Leave Feedback").click();
		Assert.assertTrue(driver.findElementByAccessibilityId("SEND FEEDBACK").isDisplayed());
	}

	@When("^I can add feedback in the text box$")
	public void i_can_add_feedback_in_the_text_box() throws Throwable {
		driver.findElementByXPath("//*[@name='Live dev']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/"
				+ "XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]").sendKeys("Test");
	}

	@When("^I should see Four types of feedback, and should select one option$")
	public void i_should_see_Four_types_of_feedback_and_should_select_one_option() throws Throwable {
		Assert.assertTrue(driver.findElementByAccessibilityId("Bug").isDisplayed());
		Assert.assertTrue(driver.findElementByAccessibilityId("General").isDisplayed());
		Assert.assertTrue(driver.findElementByAccessibilityId("Content").isDisplayed());
		Assert.assertTrue(driver.findElementByAccessibilityId("Feature Request").isDisplayed());
	}

	@Then("^I should be able to click on the Send Feedback button to submit it$")
	public void i_should_be_able_to_click_on_the_Send_Feedback_button_to_submit_it() throws Throwable {
		driver.findElementByAccessibilityId("SEND FEEDBACK").click();
		Assert.assertTrue(driver.findElementByXPath("/*[@name='Thank you for your feedback!']").isDisplayed());
		driver.switchTo().alert().accept();
	}

}
