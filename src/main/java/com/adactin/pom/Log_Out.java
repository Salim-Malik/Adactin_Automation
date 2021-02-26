package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_Out {

	public static WebDriver driver;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement Order_Checkbox;
	
	@FindBy(id = "logout")
	private WebElement Logout;

	public Log_Out(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getOrder_Checkbox() {
		return Order_Checkbox;
	}

	public WebElement getLogout() {
		return Logout;
	}
	
	
}
