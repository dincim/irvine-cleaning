package com.irvinecleaning.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(linkText = "Product Tracker")
		public WebElement productTrackerLink;
	
	@FindBy(linkText = "Product Search")
	public WebElement productSearchLink;
	
	
}
