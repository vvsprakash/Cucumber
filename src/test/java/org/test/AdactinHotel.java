package org.test;



import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdactinHotel extends Baseclass {

	@BeforeClass
	public static void beforeClass() {
		getDriver();
		enterUrl("http://adactinhotelapp.com/");
		maximize();
	}

	
//	  @AfterClass 
//	  public static void afterClass() { 
//	   
//	  }
//	 

	@Test
	public void login() throws IOException, InterruptedException {
		// TODO Auto-generated method stub

	

		String username = getData("Sheet2", 1, 0, Path);
		String password = getData("Sheet2", 1, 1, Path);
		String location = getData("Sheet2", 1, 2, Path);
		String hotels = getData("Sheet2", 1, 3, Path);
		String roomtype = getData("Sheet2", 1, 4, Path);
		String roomnos = getData("Sheet2", 1, 5, Path);
		String checkinDate = getData("Sheet2", 1, 6, Path);
		String checkoutDate = getData("Sheet2", 1, 7, Path);
		String adultperRoom = getData("Sheet2", 1, 8, Path);
		String childperChild = getData("Sheet2", 1, 9, Path); 
		String firstname = getData("Sheet2", 1, 10, Path);
		String lastname = getData("Sheet2", 1, 11, Path);
		String address = getData("Sheet2", 1, 12, Path);
		String CreditNumber = getData("Sheet2", 1, 13, Path);
		String creditCardType = getData("Sheet2", 1, 14, Path);
		String ExpierdMonth = getData("Sheet2", 1, 15, Path);
		String expierdYear = getData("Sheet2", 1, 16, Path);
		String CVVNmuber = getData("Sheet2", 1, 17, Path);
		LoginPage loginPage = new LoginPage();
		loginPage.login(username, password);
		
		SearchHotel hotelPage = new SearchHotel();
		hotelPage.searchHotel(location, hotels, roomtype, roomnos, checkinDate, checkoutDate, adultperRoom, childperChild);
		
		
		SelectHotel selectHotelPage = new SelectHotel();
		selectHotelPage.selectHotel();
		
		
		
		
		BookHotel bookHotelPage = new BookHotel();
		bookHotelPage.bookHote(firstname, lastname, address, CreditNumber, creditCardType, ExpierdMonth, expierdYear, CVVNmuber);
	
		
		//Thread.sleep(20000);
	String OrderIdText = getData("Sheet2", 1, 18, Path);

		BookingConfirm confirmPage = new BookingConfirm();
		confirmPage.BookingConfirm();
//		String OrderIdText = getData("Sheet2", 1, 19, Path);
		//confirmPage.getTxtOrderno();
		CancelBooking booking = new CancelBooking();
		booking.getBtnCancel();
		
	
		
		
		
		
		
		
		
		
		

		
		

		

		
	
		
		
		
		
	
	}

}


			
		

	








