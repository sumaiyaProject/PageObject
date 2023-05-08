package pages;

import org.openqa.selenium.By;

import base.Base;

public class LandingPage extends Base {
	
	
	
	By WelcomeText = By.xpath("//h1[text()='Welcome to MicroTech NA.']");
	
	public void navigateURL() {
		driver.get("https://sit.skyschooling.com/microtech");		
	}
	
	public String welcomeText() {
		return getText(WelcomeText);
	}
}
