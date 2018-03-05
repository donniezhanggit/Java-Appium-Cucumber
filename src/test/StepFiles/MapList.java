package test.StepFiles;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class MapList extends simDriver {

	IOSDriver<IOSElement> driver = iosDriver();
	
	@When("^I click on the map icon I will go to the Maplists page$")
	public void i_click_on_the_map_icon_I_will_go_to_the_Maplists_page() throws Throwable {
	    driver.findElementByAccessibilityId("profile icon").click();
	   
	}

	@When("^I can create a new list by clicking the large plus icon$") // need to change to ID once the new build comes out next week
	public void i_can_create_a_new_list_by_clicking_the_large_plus_icon() throws Throwable {
	  driver.findElementByXPath("//*[@name='Live dev'/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/"
	  		+ "XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]").click();
	}

	@Then("^after I enter the name of my new list I can click create map$") // need to add the sendkeys, waiting for the text input to be given an id to grab
	public void after_I_enter_the_name_of_my_new_list_I_can_click_create_map() throws Throwable {
	   driver.findElementByAccessibilityId("CREATE MAP").click();
	}

	@Then("^I shoiuld be taken back to the Maplists page, and I can click the back arrow to return to the main map page$")
	public void i_shoiuld_be_taken_back_to_the_Maplists_page_and_I_can_click_the_back_arrow_to_return_to_the_main_map_page() throws Throwable {
	   driver.findElementByAccessibilityId("back icon").click();
	}

	@Then("^To see my new maplist I can click on the map icon, and my new maplist will be visible$")
	public void to_see_my_new_maplist_I_can_click_on_the_map_icon_and_my_new_maplist_will_be_visible() throws Throwable {
		   driver.findElementByAccessibilityId("profile icon").click();
	}


}
