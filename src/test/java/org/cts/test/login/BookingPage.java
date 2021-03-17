package org.cts.test.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tcs.test.login.BaseClass;

public class BookingPage extends BaseClass{
	public BookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement txtLastName;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement txtAddress;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement creditCardNo;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement cardType;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement expiryCardMonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement expiryCardYear;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cVV;
	
	@FindBy(id="book_now")
	private WebElement bookNowButton;
	
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryCardMonth() {
		return expiryCardMonth;
	}

	public WebElement getExpiryCardYear() {
		return expiryCardYear;
	}

	public WebElement getcVV() {
		return cVV;
	}

	public WebElement getBookNowButton() {
		return bookNowButton;
	}

	
}
