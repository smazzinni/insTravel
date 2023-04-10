package com.travel.frame.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.travel.frame.utility.TestUtil;

import src.main.java.com.base.Base;

public class TripDetailsPage extends Base {

	// Page Factory
	@FindBy(xpath = "//input[@id='Travel-TripDetails-DestinationFlexdata--label']")
	WebElement destinationCountry;

	@FindBy(xpath = "//span[text()='Yes']")
	WebElement residenceOfUAE;

	@FindBy(xpath = "//*[@id='sk-Travel-TripDetails-CoverType']/span[2]/div/span[1]/label/span")
	WebElement coverType;

	@FindBy(xpath = "//*[@id='sk-Travel-TripDetails-CoverageOption']/span[2]/div/span[1]/label/span")
	WebElement coverageOption;

	@FindBy(xpath = "//span[@id='Travel-TripDetails-Adults-button']/span[2]")
	WebElement adults;

	@FindBy(xpath = "//div[text()='1']")
	WebElement selectAdults;

	@FindBy(xpath = "//input[@id='Travel-TripDetails-StartDate']")
	WebElement departureDate;

	@FindBy(xpath = "//input[@id='Travel-TripDetails-EndDate']")
	WebElement returnDate;

	@FindBy(xpath = "//button//span[text()='Next']")
	WebElement nextBtn;

	public TripDetailsPage() {

		PageFactory.initElements(driver, this);
	}

	public void selectDestinationCountry(String name) throws InterruptedException {

		destinationCountry.click();
		destinationCountry.sendKeys(name);
		TestUtil.waitForTimeInterval(3000);
		destinationCountry.sendKeys(Keys.ARROW_DOWN);
		destinationCountry.sendKeys(Keys.ENTER);

	}
	
	public void selectResidenceOfUAE() {
		residenceOfUAE.click();		
	}
	
	public void selectCoverType() {
		coverType.click();
	}
	
	public void selectCoverageOption() {
		coverageOption.click();
	}
	
	public void clickAndSelNoOfAdult() throws InterruptedException {
		adults.click();
		TestUtil.waitForTimeInterval(2000);
		selectAdults.click();		
	}
	
	public void selectDepartureDate() throws InterruptedException {
		departureDate.clear();
		TestUtil.waitForTimeInterval(2000);
		departureDate.click();
		departureDate.sendKeys("10/04/2023");
	}
	
	public void selectReturnDate() throws InterruptedException {
		TestUtil.waitForTimeInterval(2000);
		returnDate.click();
		TestUtil.staleElementIssue("//input[@id='Travel-TripDetails-EndDate']", "19/04/2023");
		//returnDate.sendKeys("19/04/2023");
		
	}
	
	public void clickOnNextBtn() {
		nextBtn.click();
	}

}
