package pages;

import org.openqa.selenium.By;

import base.Base;

public class Employee_logout_Functionalities_Page extends Base{
	By empLogoutBtn = By.xpath("//a[text()='Log Out']");
	By emploginPage = By.xpath("//h1[text()='Employee Login ']");
	
	
	public void click_Emp_Logout_Btn() {
		click(empLogoutBtn);
	}
	public String Emp_Login_Page() {
		 return getText(emploginPage);
	 }
}
