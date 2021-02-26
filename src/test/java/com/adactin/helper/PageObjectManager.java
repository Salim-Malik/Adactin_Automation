package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.Book_Hotel;
import com.adactin.pom.Booking_Confirmation;
import com.adactin.pom.Log_Out;
import com.adactin.pom.Login_Page;
import com.adactin.pom.Search_Hotel;
import com.adactin.pom.Select_Hotel;

public class PageObjectManager {

	public static WebDriver driver;
	
	private Login_Page login;
//	private Search_Hotel hotelSearch;
//	private Select_Hotel hotelSelect;
//	private Book_Hotel hotelBook;
//	private Booking_Confirmation hotelBC;
//	private Log_Out logout;
	
	
	public PageObjectManager(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	
	}

	public Login_Page get_Login() {
		
		//login = new Login_Page(driver)
		
			 login = new Login_Page(driver);
			
			return login;
				
	}
	
	public Search_Hotel get_HotelSearch() {

		Search_Hotel hotelSearch = new Search_Hotel(driver);
		
		return hotelSearch;
		
	}
	
	public Select_Hotel get_SelectHotel() {

		Select_Hotel hotelSelect = new Select_Hotel(driver);
		
		return hotelSelect;
		
		
	}
	
	public Book_Hotel get_BookHotel() {

		Book_Hotel hotelBook = new Book_Hotel(driver);
		
		return hotelBook;
		
	}
	
	public Booking_Confirmation get_BC() {

		Booking_Confirmation hotelBC = new Booking_Confirmation(driver);
		
		return hotelBC;
	}
	
	public Log_Out get_Logout() {

		Log_Out logout = new Log_Out(driver);
		
		return logout;
		
	}
	
}
