package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirm extends Baseclass  {
	public BookingConfirm() {
		PageFactory.initElements(driver, this);
	}
//	@FindBy(id="order_no")
//	private WebElement txtOrderno;
	@FindBy(id="my_itinerary")
	private WebElement btnMyItinerary;
	
//	public WebElement getTxtOrderno() {
//		return txtOrderno;
//	}

	public WebElement getTxtMyItinerary() {
		return btnMyItinerary;
	}

	public void BookingConfirm() {
//		type(getTxtOrderno(), Orderno);
//		System.out.println(Orderno);
	
		click(getTxtMyItinerary());
		
	

	}
	

}



