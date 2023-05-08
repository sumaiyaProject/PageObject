package pages;

import org.openqa.selenium.By;

import base.Base;

public class Customer_logout_Functionalities_Page extends Base{
	By Logout =By.xpath("//a[text()='Log Out']");
	
	By custHomePageLevel =By.xpath("//h1[text()='Customer Login ']");
	
	public void click_Logout() {
		click(Logout);
	}
	public String CustHomePageLevel() {
		return getText(custHomePageLevel);
	}
	
}
