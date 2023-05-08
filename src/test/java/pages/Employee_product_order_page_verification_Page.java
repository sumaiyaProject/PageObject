package pages;

import org.openqa.selenium.By;

import base.Base;

public class Employee_product_order_page_verification_Page extends Base{

	By orderProd = By.xpath("//a[text()='Product Order']");
	By orderProdLevel = By.xpath("//h2[text()='Order Product']");
	By empId = By.xpath("//p[text()='Employee ID']");
	By ChoceProdName = By.xpath("//select/option[text()='Choose Product Name']");
	By date = By.xpath("//input[@name='ordDate']");
	By orderProdBtn = By.xpath("//button[text()='Order Product']");
	
	
	public void Click_OrderProduct() {
		click(orderProd);	
	}
	public String Check_orderProdLevel() {
		return getText(orderProdLevel);
	}
	public String Check_empIdLevel() {
		return getText(empId);
	}
//	public String Check_ChoceProdName(String prodname) {
//		return getAttributeValue(ChoceProdName, prodname);
//	}
	public String Check_date(String datee) {
		return getAttributeValue(date, datee);
	}
	public String Check_orderProdBtn() {
		return getText(orderProdBtn);
	}
}
