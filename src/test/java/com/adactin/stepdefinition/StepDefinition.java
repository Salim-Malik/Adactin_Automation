package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.Login_Page;
import com.adactin.pom.Search_Hotel;
import com.adactin.runner.Runner;
import com.automation.baseclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass{

	public static WebDriver driver = Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	Login_Page login = new Login_Page(driver);
	Search_Hotel hotelSearch = new Search_Hotel(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		//getUrl("https://adactinhotelapp.com/");
	
		String url = FileReaderManager.getInstance().getInstanceCR().getUrl();
		
		getUrl(url);
	}
	
	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
		
		inputValueElement(pom.get_Login().getUsername(), username);

	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {

		inputValueElement(pom.get_Login().getPassword(), password);
	
	}


//	@When("^user Enter The Username In Username Field$")
//	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		
//		String username = FileReaderManager.getInstance().getInstanceCR().getUsername();
//
//		//inputValueElement(login.getUsername(), username);
	
//		inputValueElement(pom.get_Login(), value);
		
//	}

//	@When("^user Enter The Password In Password Field$")
//	public void user_Enter_The_Password_In_Password_Field() throws Throwable {

//		String password = FileReaderManager.getInstance().getInstanceCR().getPassword();
	
//		inputValueElement(login.getPassword(), password);
		
//	}

	@Then("^user Click On The Login Button And It Navigates To The SearchHotelPage$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_SearchHotelPage() throws Throwable {

	//	clickOnElement(login.getLogin());

		clickOnElement(pom.get_Login().getLogin());
		
	}
	


	@When("^user Select The Location In Location Dropdown$")
	public void user_Select_The_Location_In_Location_Dropdown() throws Throwable {

		drop_Down(pom.get_HotelSearch().getSlct_Location(), "value", "London");
	
	}

	@When("^user Select The Hotel In Hotels Dropdown$")
	public void user_Select_The_Hotel_In_Hotels_Dropdown() throws Throwable {

		drop_Down(pom.get_HotelSearch().getSlct_Hotel(), "value", "Hotel Sunshine");
	
	}

	@When("^user Select The Room Type In Room Type Dropdown$")
	public void user_Select_The_Room_Type_In_Room_Type_Dropdown() throws Throwable {

		drop_Down(pom.get_HotelSearch().getSlct_Room(), "value", "Super Deluxe");
	
	}

	@When("^user Type The Check Out Date$")
	public void user_Type_The_Check_Out_Date() throws Throwable {

		inputValueElement(pom.get_HotelSearch().getChoose_Date(), "26/02/2021");
	
	}

	@Then("^user Click On The Search Button And It Navigates To The Select HotelPage$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_The_Select_HotelPage() throws Throwable {

		clickOnElement(pom.get_HotelSearch().getSearch());
	
	}

	@When("^user Click The Radio Button$")
	public void user_Click_The_Radio_Button() throws Throwable {

	clickOnElement(pom.get_SelectHotel().getCheck_Box());
	}

	@Then("^user Click On The Search Button And It Navigates To The Book HotelPage$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_The_Book_HotelPage() throws Throwable {

		clickOnElement(pom.get_SelectHotel().getContinue());
	
	}

	@When("^user Type The First Name In First Name Field$")
	public void user_Type_The_First_Name_In_First_Name_Field() throws Throwable {

		inputValueElement(pom.get_BookHotel().getFirst_Name(), "Leon");
	}

	@When("^user Type The Second Name In Second Name Field$")
	public void user_Type_The_Second_Name_In_Second_Name_Field() throws Throwable {

		inputValueElement(pom.get_BookHotel().getLast_Name(), "Radon");
	}

	@When("^user Type The Address In Address Field$")
	public void user_Type_The_Address_In_Address_Field() throws Throwable {

		inputValueElement(pom.get_BookHotel().getAddress(), "4/4C");
	
	}

	@When("^user Type The Credit Card Number In Credit Card Number Field$")
	public void user_Type_The_Credit_Card_Number_In_Credit_Card_Number_Field() throws Throwable {

		inputValueElement(pom.get_BookHotel().getCard_Number(), "25418569963258745");
	
	}

	@When("^user Select The Credit Card Type In CRedit Card Type Dropdown$")
	public void user_Select_The_Credit_Card_Type_In_CRedit_Card_Type_Dropdown() throws Throwable {

		drop_Down(pom.get_BookHotel().getCard_Type(), "value", "MAST");
	
	}

	@When("^user Select The Month In Expiry Date Dropdown$")
	public void user_Select_The_Month_In_Expiry_Date_Dropdown() throws Throwable {

	drop_Down(pom.get_BookHotel().getCard_ExpMonth(), "value", "4");
		
	}

	@When("^user Select The Year In Expiry Year Dropdown$")
	public void user_Select_The_Year_In_Expiry_Year_Dropdown() throws Throwable {

		drop_Down(pom.get_BookHotel().getCard_ExpYear(), "value", "2022");
	
	}

	@When("^user Type The Cvv Number In Cvv Number Field$")
	public void user_Type_The_Cvv_Number_In_Cvv_Number_Field() throws Throwable {

		inputValueElement(pom.get_BookHotel().getCVV_Number(), "267");

		
	}

	@Then("^user Click On The Book Now Button And It Navigates To The Book Confirmation Page$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigates_To_The_Book_Confirmation_Page() throws Throwable {

		clickOnElement(pom.get_BookHotel().getBook_Now());

		Thread.sleep(5000);
	}

	@Then("^user Click the My Itinerary And It Navigates To The Booked Itinerary$")
	public void user_Click_the_My_Itinerary_And_It_Navigates_To_The_Booked_Itinerary() throws Throwable {

		clickOnElement(pom.get_BC().getMy_Itinerary());
	
		Thread.sleep(5000);
	}

	@Then("^user Click the Logout Button And It Navigates To The Logged Out Successfully$")
	public void user_Click_the_Logout_Button_And_It_Navigates_To_The_Logged_Out_Successfully() throws Throwable {

		clickOnElement(pom.get_Logout().getLogout());
	}

}
