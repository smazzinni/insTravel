package com.travel.frame.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import src.main.java.com.base.Base;

public class CoverSelectionPage extends Base {

	// Page Factory
	@FindBy(xpath = "//span[text()='Proceed']")
	WebElement proceedBtn;

	public CoverSelectionPage() {

		PageFactory.initElements(driver, this);
	}
	
	public void clickOnProceedBtn() {
		proceedBtn.click();		
	}
}
