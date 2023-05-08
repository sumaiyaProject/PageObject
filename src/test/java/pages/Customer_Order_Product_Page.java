package pages;

import org.openqa.selenium.By;

import base.Base;

public class Customer_Order_Product_Page extends Base {
	
	By orderProduct = By.xpath("//a[@href='productOrder.php?id=4']");
	By selectProduct = By.xpath("//select[@name='prodId']");
	By orderDate = By.xpath("//input[@name='ordDate']");
	By orderProdBtn = By.xpath("//button[text()='Order Product']");
	
	public void click_orderProduct() {
		click(orderProduct);
	}
	
	public void select_Product(String prod) throws InterruptedException {
		click(selectProduct);
		Thread.sleep(3000);
		dropDownvalue(selectProduct, prod);
		//sendKeys(selectProduct,prod);
	}
	
	public void order_date(String date) {
		sendKeys(orderDate, date);
	}
	
	public void click_orderProdBtn() {
		click(orderProdBtn);
	}
}
