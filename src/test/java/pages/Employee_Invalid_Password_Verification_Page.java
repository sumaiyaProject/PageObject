package pages;

import org.openqa.selenium.By;

import base.Base;

public class Employee_Invalid_Password_Verification_Page extends Base{
   
	By password = By.name("pwd");
	By loginbtn = By.xpath("//input[@name='login-submit']");
	By invalidpass = By.xpath("//span[text()='Invalid username or password!']");
	
	public void Enter_Pass(String pass) {
		sendKeys(password,pass);
	}
	public void Click_Login() {
		click(loginbtn);
	}
	public String Check_Invalid_Pass() {
		return getText(invalidpass);
	}
}
