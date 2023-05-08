package pages;

import org.openqa.selenium.By;

import base.Base;

public class Employee_Apply_leave_Verification_Page extends Base{
	
	By applyLeave = By.xpath("//a[text()='Apply Leave']");
	By applyLeavelevel = By.xpath("//h2[text()='Apply Leave Form']");
	By applyLeaveReasonbtn = By.xpath("//input[@name='reason']");
	By startDate = By.xpath("//p[text()='Start Date']");
	By endDate = By.xpath("//p[text()='End Date']");
	By enterstartDate = By.xpath("//input[@name='start']");
	By enterendDate = By.xpath("//input[@name='end']");
	By submitBtn = By.xpath("//button[text()='Submit']");
	
	
	public void click_applyLeaveButton() {
		click(applyLeave);
	}
	
	public String ApplyLeavelevelCheck() { 
		 return getText(applyLeavelevel);
	 }
	public String applyLeaveReasonBtn(String reason) { 
		 return getAttributeValue(applyLeaveReasonbtn, reason);
	 }
	public void applyLeaveReason(String reason) { 
		sendKeys(applyLeaveReasonbtn, reason);
	 }
	public String StartDateCheck() { 
		 return getText(startDate);
	 }
	public void StartDate(String date) { 
		sendKeys(enterstartDate, date);
	 }
	public String EndDateCheck() { 
		 return getText(endDate);
	 }
	public void EndDate(String date) { 
		sendKeys(enterendDate, date);
	 }
	public String SubmitButtonCheck() { 
		 return getText(submitBtn);
	 }
	public void click_Submit_Button() {
		click(submitBtn);
	}
	
	
	
}
