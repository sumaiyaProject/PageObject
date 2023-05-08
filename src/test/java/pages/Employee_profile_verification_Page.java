package pages;

import org.openqa.selenium.By;

import base.Base;

public class Employee_profile_verification_Page extends Base{

	By myProfile = By.xpath("//a[text()='My Profile']");
	By myInfolevel = By.xpath("//h2[text()='My Info']");
	
	public void click_myProfile() {
		click(myProfile);
	}
	
	public String My_Info_LevelCheck() { 
		 return getText(myInfolevel);
	 }
}
