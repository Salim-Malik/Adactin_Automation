package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {

	public static WebDriver driver;
	
	@FindBy(id = "my_itinerary")
	private WebElement My_Itinerary;

	public Booking_Confirmation(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getMy_Itinerary() {
		return My_Itinerary;
	}
	
}
