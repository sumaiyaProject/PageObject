package pages;

import org.openqa.selenium.By;

import base.Base;

public class Employee_product_order_list_verification_Page extends Base {

	By orderList = By.xpath("//a[text()='Order List']");
	By orderId = By.xpath("//th[text()='Order ID']");
	By EmpId = By.xpath("//th[text()='Employee ID']");
	By DeliveryDate = By.xpath("//th[text()='Delivery Date']");
	By ProductId = By.xpath("//th[text()='Product ID']");
	By OrderDate = By.xpath("//th[text()='Order Date']");
	
	public void Click_OrderList() {
		click(orderList);	
	}
	public String Check_orderId() {
		return getText(orderId);
	}
	public String Check_EmpId() {
		return getText(EmpId);
	}
	public String Check_DeliveryDate() {
		return getText(DeliveryDate);
	}
	public String Check_ProductId() {
		return getText(ProductId);
	}
	public String Check_OrderDate() {
		return getText(OrderDate);
	}
	
}
