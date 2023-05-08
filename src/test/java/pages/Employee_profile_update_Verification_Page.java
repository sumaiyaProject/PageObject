package pages;

import org.openqa.selenium.By;

import base.Base;

public class Employee_profile_update_Verification_Page extends Base{
	
	By updateInfoButton = By.xpath("//button[text()='Update Info']");
	By updateInfolevel = By.xpath("//h2[text()='Update Employee Info']");
	By updateContact = By.xpath("//input[@name='contact']");
	By updateAddress = By.xpath("//input[@name='address']");
	By clickSubmit = By.xpath("//button[@name='update']");
	By updatedContact = By.name("contact");
	By updatedAddress = By.name("address");
	
	public void click_UpdateInfoButton() {
		click(updateInfoButton);
	}
	public String UpdateInfolevelCheck() { 
		 return getText(updateInfolevel);
	 }
	public void Update_Contact(String contact) {
		sendKeys(updateContact, contact);
	}
	public void Update_Address(String address) {
		sendKeys(updateAddress, address);
	}
	public void click_SumitButton() {
		click(clickSubmit);
	}
	public void UpdateContact() {
		clear(updateContact);
	 }
	public void UpdateAddress() {
		clear(updateAddress);
	 }
	public String UpdatedContact(String contact) { 
		return getAttributeValue(updateContact,contact);
	 }
	public String UpdatedAddress(String name) { 
		return getAttributeValue(updateAddress,name);
	 }
	
}
