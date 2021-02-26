package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public static WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement Slct_Location;
	
	@FindBy(id = "hotels")
	private WebElement Slct_Hotel;
	
	@FindBy(id = "room_type")
	private WebElement Slct_Room;
	
	@FindBy(id = "datepick_out")
	private WebElement Choose_Date;
	
	@FindBy(id = "Submit")
	private WebElement Search;

	public Search_Hotel(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getSlct_Location() {
		return Slct_Location;
	}

	public WebElement getSlct_Hotel() {
		return Slct_Hotel;
	}

	public WebElement getSlct_Room() {
		return Slct_Room;
	}

	public WebElement getChoose_Date() {
		return Choose_Date;
	}

	public WebElement getSearch() {
		return Search;
	}
	
	
	
	
	
}
