package pages;



import org.openqa.selenium.By;


import base.Base;

public class Customer_Order_List_Page extends Base {
	
	
	By orderList = By.xpath("//a[text()=' Order List ']");
	
	By orderListLevel = By.xpath("//h1[text()='Order List']");
	
	By confirmBtn = (By.xpath("//tbody/tr[last()]/td[last()]/a"));
	
	By confirmedBtnLevel = By.xpath("//tbody/tr[last()]/td[text()='Confirmed']");
	
	public void click_orderList() {
		click(orderList);
	}
	
	public String OrderListLevel() { 
		 return getText(orderListLevel);
	 }
	
	public void click_confirmBtn() {
		
		click(confirmBtn);
//		int count= confirmBtn.size();
//		System.out.println(count);
//		confirmBtn.get(count-1).click();
//		
//		for(WebElement e : confirmBtn) {
//			if(e.getText().equals(e));
//		}	
	}
	
	public String ConfirmedBtnLevelCheck() { 
		 return getText(confirmedBtnLevel);
	 }

}
