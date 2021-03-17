package org.tcs.test.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelHome extends BaseClass{
	
	public SearchHotelHome() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDropLocation() {
		return dropLocation;
	}

	public WebElement getDropHotel() {
		return dropHotel;
	}

	public WebElement getDropRoomType() {
		return dropRoomType;
	}

	public WebElement getDropNoOfRooms() {
		return dropNoOfRooms;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getDropAdults() {
		return dropAdults;
	}

	public WebElement getDropChildren() {
		return dropChildren;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	@FindBy(xpath="//select[@id='location']")
	private WebElement dropLocation;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement dropHotel;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement dropRoomType;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement dropNoOfRooms;
	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement txtCheckOutDate;
	
	@FindBy(id="adult_room")
	private WebElement dropAdults;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement dropChildren;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement btnContinue;
	

}
