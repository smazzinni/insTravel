package com.travel.frame.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.travel.frame.utility.TestUtil;

import src.main.java.com.base.Base;

public class YourInformationPage extends Base {

	// Page Factory
	@FindBy(xpath = "//span[@id='Travel-CustomerDetails-Title-button']/i")
	WebElement clickOnTilteDropDwn;

	@FindBy(xpath = "//div[@id='ui-id-2']")
	WebElement selectTitle;

	@FindBy(xpath = "//input[@id='Travel-CustomerDetails-FirstName']")
	WebElement firstName;

	@FindBy(xpath = "//input[@id='Travel-CustomerDetails-LastName']")
	WebElement lastName;

	@FindBy(xpath = "//input[@id='Travel-CustomerDetails-Email']")
	WebElement email;

	@FindBy(xpath = "//span[@id='Travel-CustomerDetails-PhonePrefix-button']/i")
	WebElement phonePrefix;
	
	@FindBy(xpath = "//div[contains(text(),'052')]")
	WebElement selectPrefix;

	@FindBy(xpath = "//input[@id='Travel-CustomerDetails-PhoneNumber']")
	WebElement phoneNumber;

	@FindBy(xpath = "//button//span[text()='Next']")
	WebElement nextBtn;

	public YourInformationPage() {

		PageFactory.initElements(driver, this);
	}

	public void clickOnTitle() {
		clickOnTilteDropDwn.click();
	}

	public void selectTitleFromDropDwn() {
		selectTitle.click();
	}

	public void typeFirstName(String first_Name) {
		firstName.click();
		firstName.sendKeys(first_Name);
	}

	public void typeLastName(String last_Name) {
		lastName.click();
		TestUtil.staleElementIssue("//input[@id='Travel-CustomerDetails-LastName']", last_Name);
		//lastName.sendKeys(last_Name);
	}

	public void typeEmail(String enter_email) {
		email.click();
		email.sendKeys(enter_email);
	}

	public void clickOnPhonePrefixAndSelectPrefix() {
		phonePrefix.click();
		selectPrefix.click();
		//TestUtil.staleElementIssue("//div[text()='057']");
	}
	
	public void typePhoneNumber(String phone_Number) {
		phoneNumber.click();
		phoneNumber.sendKeys(phone_Number);
	}
	
	public void clickOnNext() {
		nextBtn.click();
	}

}
