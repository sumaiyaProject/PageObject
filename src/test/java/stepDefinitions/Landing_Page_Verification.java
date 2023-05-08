package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;

public class Landing_Page_Verification extends Base {
	
	LandingPage landingPage = new LandingPage();

	@Given("I am in Chrome Browser")
	public void i_am_in_Chrome_Browser() {
		String className = driver.getClass().toString(); //class org.openqa.selenium.chrome.ChromeDriver
		className = className.substring( className.lastIndexOf(".") +1);
		assertEquals("ChromeDriver", className);

	}

	@When("I navigate landing page url")
	public void i_navigate_landing_page_url() {
		landingPage.navigateURL();
	}

	@Then("The Landing Page appear")
	public void the_Landing_Page_appear() {
		assertEquals("Welcome to MicroTech NA.", landingPage.welcomeText());
	   
	}

}
