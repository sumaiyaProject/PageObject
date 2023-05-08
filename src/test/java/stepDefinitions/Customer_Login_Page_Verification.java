package stepDefinitions;

import static org.junit.Assert.assertEquals;



import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Customer_Login_And_Customer_HomePage;
import pages.LandingPage;


public class Customer_Login_Page_Verification extends Base{
	/* pageFactoryPage
	WebDriver driver;
	Customer_Login_And_Customer_HomePage customerLoginPage = new Customer_Login_And_Customer_HomePage(driver);
	*/
	Customer_Login_And_Customer_HomePage customerLoginPage = new Customer_Login_And_Customer_HomePage();
	LandingPage landingPage = new LandingPage();
	
	@Given("I am in Landing Page")
	public void i_am_in_Landing_Page() {
		landingPage.navigateURL();
	}

	@When("I Click on Login")
	public void i_Click_on_Login() {
		customerLoginPage.click_Login();
	}

	@When("Click Customer Login")
	public void click_Customer_Login() {
		customerLoginPage.click_Customer_Login();
	}

	@Then("I enter User Id {string}")
	public void i_enter_User_Id(String string) {
		customerLoginPage.enterUserId("david@gmail.com");
	}

	@Then("I enter Password {string}")
	public void i_enter_Password(String string) {
		customerLoginPage.enterUserPassword("1234");
	}

	@When("I click Login button")
	public void i_click_Login_button() {
		customerLoginPage.clickLoginBtn();
	}

	@Then("I will see {string}")
	public void i_will_see(String string) {
		assertEquals("Welcome David", customerLoginPage.getWelcomeText()); 
	}


}
