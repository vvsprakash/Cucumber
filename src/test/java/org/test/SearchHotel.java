package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends Baseclass {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement dDnLocation;
	@FindBy(id="hotels")
	private WebElement dDnHotels;
	@FindBy(id="room_type")
	private WebElement dDnRoomtype;
	@FindBy(id="room_nos")
	private WebElement dDnRoomno;
	@FindBy(id="datepick_in")
	private WebElement txtCheckinDate;
	@FindBy(id="datepick_out")
	private WebElement txtCheckoutDate;
	@FindBy(id="adult_room")
	private WebElement dDnAdultperRoom;
	@FindBy(id="child_room")
	private WebElement dDnChildperRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSubmit;
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	public WebElement getdDnLocation() {
		return dDnLocation;
	}
	public WebElement getdDnHotels() {
		return dDnHotels;
	}
	public WebElement getdDnRoomtype() {
		return dDnRoomtype;
	}
	public WebElement getdDnRoomno() {
		return dDnRoomno;
	}
	public WebElement getTxtCheckinDate() {
		return txtCheckinDate;
	}
	public WebElement getTxtCheckoutDate() {
		return txtCheckoutDate;
	}
	public WebElement getdDnAdultperRoom() {
		return dDnAdultperRoom;
	}
	public WebElement getdDnChildperRoom() {
		return dDnChildperRoom;
	}
	
	
	
	
	
	
public void searchHotel(String location, String Hotels, String Roomtype,String Roomnos,String CheckinDate , String CheckoutDate, String AdultperRoom, String ChildperChild) {
selectOptionText(getdDnLocation(), location);
selectOptionText(getdDnHotels(), Hotels);
selectOptionText(getdDnRoomtype(), Roomtype);
selectOptionText(getdDnRoomno(), Roomnos);
type(getTxtCheckinDate(), CheckinDate);
type(getTxtCheckoutDate(), CheckoutDate);
selectOptionText(getdDnAdultperRoom(), AdultperRoom);
selectOptionText(getdDnChildperRoom(), ChildperChild);
click(getBtnSubmit());
}




}
