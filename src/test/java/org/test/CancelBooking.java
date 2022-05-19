package org.test;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBooking extends Baseclass {
	public CancelBooking() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_id_text")
	private WebElement txtOrderIdText;
	
	@FindBy(id="search_hotel_id")
	private WebElement btnSearch;
	
	@FindBy(name="name=ids[]")
	private WebElement btnCancel;
	
	
	
	@FindBy(name="cancelall")
	private WebElement btnCancelAll;
	
   


	public WebElement getTxtOrderIdText() {
		return txtOrderIdText;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getBtnCancelAll() {
		return btnCancelAll;
	}
	public CancelBooking(String OrderIdText ) {
		type(getTxtOrderIdText(), OrderIdText);
		click(getBtnSearch());
		click(getBtnCancel());
		click(getBtnCancelAll());
	
		alertAccept();
		
		
	}
	
	
}

