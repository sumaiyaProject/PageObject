package pages;

import org.openqa.selenium.By;

import base.Base;

public class Check_Customer_Invalied_Passward_Page extends Base{
	
	By emailId=By.name("mailuid");
	By InValiedPassward = By.name("pwd");
	By login=By.xpath("//input[@name='login-submit']");
	By ip= By.xpath("//span[text()='Invalid username or password!']");
	
	public void enteremailId(String id) {
		//enterUserId.sendKeys(id);
		sendKeys(emailId,id);
	}
	
	public void enterUserpass(String pass) {
		sendKeys(InValiedPassward, pass);
	}
	
	public void clickLoginBtn() {
		click(login);
	}
	
	public String InValiedPasswardCheck() {
		return getText(ip);
	}

}
