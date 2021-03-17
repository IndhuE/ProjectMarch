package org.cts.test.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tcs.test.login.BaseClass;

public class OrderPage extends BaseClass{
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement orderNumber;

	public WebElement getOrderNumber() {
		return orderNumber;
	}
	
}
