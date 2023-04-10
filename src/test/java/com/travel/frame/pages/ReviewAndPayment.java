package com.travel.frame.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.travel.frame.utility.TestUtil;

import src.main.java.com.base.Base;

public class ReviewAndPayment extends Base {

	// Page Factory
	@FindBy(xpath = "//div[@id='sk-panel-item-TravelQuoteCreatePublicProcessPaymentUI1-NoStyleGroup1-Fields-FieldsetGroup1-CustomerInformation']")
	WebElement customerInformationArrowBtn;

	@FindBy(xpath = "//h3[@id='sk-panel-TravelQuoteCreatePublicProcessPaymentUI1-NoStyleGroup1-Fields-FieldsetGroup1-TripDetails']")
	WebElement tripDetailsArrowBtn;

	@FindBy(xpath = "//h3[@id='sk-panel-TravelQuoteCreatePublicProcessPaymentUI1-NoStyleGroup1-Fields-FieldsetGroup1-Coverage']")
	WebElement coverageArrowBtn;

	@FindBy(xpath = "//*[@id='Travel-TripDetails-Traveler°1-FirstName']")
	WebElement firstName;

	@FindBy(xpath = "//*[@id='Travel-TripDetails-Traveler°1-LastName']")
	WebElement lastName;

	@FindBy(xpath = "//*[@id='Travel-TripDetails-Traveler°1-DateOfBirth']")
	WebElement dob;

	@FindBy(xpath = "//*[@id='Travel-TripDetails-Traveler°1-PassportNo']")
	WebElement passportNumber;

	@FindBy(xpath = "//input[@title='Nationality']")
	WebElement nationality;

	@FindBy(xpath = "//input[@class='sk-multi-resource-input  sk-focusable']")
	WebElement dropFile;

	@FindBy(xpath = "//input[@id='Travel-CustomerDetails-ConfirmationReview-1-hidden']")
	WebElement confirmCheckBox;
	
	@FindBy(xpath = "//button//span[text()='Confirm & Pay']")
	WebElement confirmAndPay;	
	
	@FindBy(xpath = "(//span[contains(text(),'Credit Card')])[1]")
	WebElement creditCardBtn;	
	
	@FindBy(xpath = "//input[@id='creditCardNumber']")
	WebElement creditCardNumber;
	
	@FindBy(xpath = "//*[@id='expiryMonthCreditCard']")
	WebElement expiryMonth;
	
	@FindBy(xpath = "//*[@id='expiryYearCreditCard']")
	WebElement expiryYear;
	
	@FindBy(xpath = "//*[@id='CVVNumberCreditCard']")
	WebElement cvv;
	
	@FindBy(xpath = "(//*[@id='SubmitBillShip']/span)[1]")
	WebElement makePayment;	
	
	@FindBy(xpath = "//td/input[@name='selectSplitAuthResult']")
	WebElement splitpapesChkBox;	

	@FindBy(xpath = "//td/input[@name='customEci']")
	WebElement customECI;
	
	@FindBy(xpath = "//td/input[@name='customCavv']")
	WebElement customCAVV;
	
	@FindBy(xpath = "//td/input[@type='submit']")
	WebElement submitPayment;
	
	
	public ReviewAndPayment() {

		PageFactory.initElements(driver, this);
	}

	public void clickOncustomerInformationArrowBtn() {
		customerInformationArrowBtn.click();
	}

	public void enterFirstName(String name) {
		firstName.click();
		firstName.sendKeys(name);
	}

	public void enterLastName(String name) {
		lastName.click();
		TestUtil.staleElementIssue("//*[@id='Travel-TripDetails-Traveler°1-LastName']", name);
	}

	public void enterDOB(String name) throws InterruptedException {
		TestUtil.waitForTimeInterval(2000);
		dob.click();
		TestUtil.staleElementIssue("//*[@id='Travel-TripDetails-Traveler°1-DateOfBirth']", name);
		// dob.sendKeys(name);
	}

	public void enterNationality(String name) throws InterruptedException {
		nationality.click();
		nationality.sendKeys(name);
		TestUtil.waitForTimeInterval(3000);
		nationality.sendKeys(Keys.ARROW_DOWN);
		nationality.sendKeys(Keys.ARROW_DOWN);
		nationality.sendKeys(Keys.ENTER);
	}

	public void enterPassportNumber(String number) {
		passportNumber.click();
		passportNumber.sendKeys(number);
	}

	public void uploadPassport() throws InterruptedException {
		TestUtil.waitForTimeInterval(2000);
		TestUtil.staleElementIssue("//input[@class='sk-multi-resource-input  sk-focusable']");
		//dropFile.click();
		TestUtil.waitForTimeInterval(2000);
		dropFile.sendKeys(System.getProperty("user.dir") + "/src/main/resources/ImgDoc/passport.jpg");
	}
	
	public void clickOnCheckBox() {
		TestUtil.staleElementIssue("//span[contains(text(),'I confirm that all the details provided by me above are correct and accurate. ')]");
		//TestUtil.staleElementIssue("//label[@for='Travel-CustomerDetails-ConfirmationReview-1']/span");
	}
	

	public void clickOnConfirmBtn() {
		WebElement ele = driver.findElement(By.xpath("//input[@id='Travel-CustomerDetails-ConfirmationReview-1-hidden' and @type='hidden']/following-sibling::input"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
		//confirmCheckBox.click();
		//TestUtil.staleElementIssue("//label[@for='Travel-CustomerDetails-ConfirmationReview-1']/span");
	}
	
	public void confirmAndPay() {
		confirmAndPay.click();
	}
	
	public void clickOnCreditCardTab() {
		creditCardBtn.click();
	}
	
	public void enterCreditCardNumber(String number) throws InterruptedException {
		creditCardNumber.click();
		TestUtil.waitForTimeInterval(2000);
		creditCardNumber.sendKeys(number);
	}
	
	public void selectExpiryMonth(String month) throws InterruptedException {
		expiryMonth.click();
		TestUtil.waitForTimeInterval(2000);
		TestUtil.selectByValue("//*[@id='expiryMonthCreditCard']", month);
	}
	
	public void selectYear(String year) throws InterruptedException {
		expiryYear.click();
		TestUtil.waitForTimeInterval(2000);
		TestUtil.selectByValue("//*[@id='expiryYearCreditCard']", year);
	}
	
	public void enterCVV(String data) throws InterruptedException {
		cvv.click();
		TestUtil.waitForTimeInterval(2000);
		cvv.sendKeys(data);
	}
	
	public void clickOnMakePayment() {
		makePayment.click();
	}
	
	
	public void clickOnSplitChkbox() {
		splitpapesChkBox.click();
	}
	
	public void enterCustomECI(String number) throws InterruptedException {
		customECI.click();
		TestUtil.waitForTimeInterval(2000);
		customECI.sendKeys(number);
	}
	
	public void enterCustomCAVV(String number) throws InterruptedException {
		customCAVV.click();
		TestUtil.waitForTimeInterval(2000);
		customCAVV.sendKeys(number);
	}
	
	public void clickOnSubmitBtn() {
		submitPayment.click();
	}
}
