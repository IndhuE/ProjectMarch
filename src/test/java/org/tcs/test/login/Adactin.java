package org.tcs.test.login;

import org.cts.test.login.BookingPage;
import org.cts.test.login.ContinuePage;
import org.cts.test.login.OrderPage;
import org.openqa.selenium.WebElement;

public class Adactin extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		BaseClass baseClass = new BaseClass();
		baseClass.getDriver();
		baseClass.launchUrl("http://adactinhotelapp.com/index.php");
		//Login Page
		LogInPage logInPage=new LogInPage();
		SearchHotelHome searchHotelHome = new SearchHotelHome();
		WebElement txtUserName = logInPage.getTxtUserName();
		baseClass.enterText(txtUserName,"IndhuElango");
		
		WebElement txtPassword = logInPage.getTxtPassword();
		baseClass.enterText(txtPassword,"Nila@123");
		
		WebElement btnLogin = logInPage.getBtnLogin();
		baseClass.btnClick(btnLogin);
		
		//searchHotel page
		WebElement dropLocation = searchHotelHome.getDropLocation();
		baseClass.dropDown(dropLocation, "London");
		WebElement dropHotel = searchHotelHome.getDropHotel();
		baseClass.dropDownIndex(dropHotel, 1);
		WebElement dropRoomType = searchHotelHome.getDropRoomType();
		baseClass.dropDownValue(dropRoomType, "Super Deluxe");
		WebElement dropNoOfRooms = searchHotelHome.getDropNoOfRooms();
		baseClass.dropDownValue(dropNoOfRooms,"5");
		WebElement txtCheckInDate = searchHotelHome.getTxtCheckInDate();
		baseClass.enterText(txtCheckInDate, "15/3/21");
		WebElement txtCheckOutDate = searchHotelHome.getTxtCheckOutDate();
		baseClass.enterText(txtCheckOutDate, "16/3/21");
		WebElement dropAdults = searchHotelHome.getDropAdults();
		baseClass.dropDown(dropAdults, "3 - Three");
		WebElement dropChildren = searchHotelHome.getDropChildren();
		baseClass.dropDown(dropChildren, "2 - Two");
		WebElement btnContinue = searchHotelHome.getBtnContinue();
		baseClass.btnClick(btnContinue);
		
		//continue page
		ContinuePage continuePage = new ContinuePage();
		WebElement btnContinue2 = continuePage.getBtnContinue();
		baseClass.btnClick(btnContinue2);
		WebElement btnNext = continuePage.getBtnNext();
		baseClass.btnClick(btnNext);
		
		//Booking page
		BookingPage bookingPage=new BookingPage();
		WebElement txtFirstName = bookingPage.getTxtFirstName();
		baseClass.enterText(txtFirstName, "Indhu");
		WebElement txtLastName = bookingPage.getTxtLastName();
		baseClass.enterText(txtLastName, "Elango");
		WebElement txtAddress = bookingPage.getTxtAddress();
		baseClass.enterText(txtAddress, "OMR");
		WebElement creditCardNo = bookingPage.getCreditCardNo();
		baseClass.enterText(creditCardNo, "9780654321123456");
		WebElement cardType = bookingPage.getCardType();
		baseClass.dropDown(cardType,"VISA");
		WebElement expiryCardMonth = bookingPage.getExpiryCardMonth();
		baseClass.dropDown(expiryCardMonth, "August");
		WebElement expiryCardYear = bookingPage.getExpiryCardYear();
		baseClass.dropDown(expiryCardYear, "2022");
		WebElement getcVV = bookingPage.getcVV();
		baseClass.enterText(getcVV, "708");
		WebElement bookNowButton = bookingPage.getBookNowButton();
		baseClass.btnClick(bookNowButton);
		//get order no
		Thread.sleep(4000);
		OrderPage orderpage=new OrderPage();
		WebElement orderNumber = orderpage.getOrderNumber();
		baseClass.getAttribute(orderNumber,"value");
		
	}
}
