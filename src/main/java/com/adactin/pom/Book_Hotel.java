package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public static WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement First_Name;
	
	@FindBy(id = "last_name")
	private WebElement Last_Name;
	
	@FindBy(id = "address")
	private WebElement Address;
	
	@FindBy(id = "cc_num")
	private WebElement Card_Number;
	
	@FindBy(id = "cc_type")
	private WebElement Card_Type;
	
	@FindBy(id = "cc_exp_month")
	private WebElement Card_ExpMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement Card_ExpYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement CVV_Number;
	
	@FindBy(id = "book_now")
	private WebElement Book_Now;

	public Book_Hotel(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getFirst_Name() {
		return First_Name;
	}

	public WebElement getLast_Name() {
		return Last_Name;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCard_Number() {
		return Card_Number;
	}

	public WebElement getCard_Type() {
		return Card_Type;
	}

	public WebElement getCard_ExpMonth() {
		return Card_ExpMonth;
	}

	public WebElement getCard_ExpYear() {
		return Card_ExpYear;
	}

	public WebElement getCVV_Number() {
		return CVV_Number;
	}

	public WebElement getBook_Now() {
		return Book_Now;
	}
	
}
