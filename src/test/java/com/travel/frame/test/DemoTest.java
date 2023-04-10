package com.travel.frame.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.travel.frame.pages.CoverSelectionPage;
import com.travel.frame.pages.ReviewAndPayment;
import com.travel.frame.pages.TripDetailsPage;
import com.travel.frame.pages.YourInformationPage;
import com.travel.frame.utility.TestUtil;

import src.main.java.com.base.Base;

public class DemoTest extends Base {

	YourInformationPage yourInfoPage;
	TripDetailsPage tripDetailsPage;
	CoverSelectionPage coverSelectionPage;
	ReviewAndPayment reviewAndPayment;
	
	

	public DemoTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		init();
		yourInfoPage = new YourInformationPage();
		tripDetailsPage = new TripDetailsPage();
		coverSelectionPage = new CoverSelectionPage();
		reviewAndPayment = new ReviewAndPayment();
	}

	@Test
	public void SukoonInsuranceTest() throws InterruptedException {

		yourInfoPage.clickOnTitle();
		TestUtil.waitForTimeInterval(2000);
		yourInfoPage.selectTitleFromDropDwn();
		TestUtil.waitForTimeInterval(2000);
		yourInfoPage.typeFirstName("Mohd");
		TestUtil.waitForTimeInterval(2000);
		yourInfoPage.typeLastName("Shoeb");
		TestUtil.waitForTimeInterval(2000);
		yourInfoPage.typeEmail("mazzinni1@gmail.com");
		TestUtil.waitForTimeInterval(2000);
		yourInfoPage.clickOnPhonePrefixAndSelectPrefix();
		TestUtil.waitForTimeInterval(2000);
		yourInfoPage.typePhoneNumber("1234567");
		TestUtil.waitForTimeInterval(2000);
		yourInfoPage.clickOnNext();
		
		TestUtil.waitForTimeInterval(3000);
		tripDetailsPage.selectDestinationCountry("q");
		TestUtil.waitForTimeInterval(3000);
		tripDetailsPage.selectResidenceOfUAE();
		TestUtil.waitForTimeInterval(2000);
		tripDetailsPage.selectCoverType();
		TestUtil.waitForTimeInterval(2000);
		tripDetailsPage.selectCoverageOption();
		TestUtil.waitForTimeInterval(2000);
		tripDetailsPage.clickAndSelNoOfAdult();
		TestUtil.waitForTimeInterval(2000);
		tripDetailsPage.selectDepartureDate();
		TestUtil.waitForTimeInterval(3000);
		tripDetailsPage.selectReturnDate();
		TestUtil.waitForTimeInterval(3000);
		tripDetailsPage.clickOnNextBtn();
		TestUtil.waitForTimeInterval(3000);
		coverSelectionPage.clickOnProceedBtn();
		
		TestUtil.waitForTimeInterval(3000);
		reviewAndPayment.clickOncustomerInformationArrowBtn();
		TestUtil.waitForTimeInterval(2000);
		reviewAndPayment.enterFirstName("Mohd");
		TestUtil.waitForTimeInterval(2000);
		reviewAndPayment.enterLastName("Shoeb");
		TestUtil.waitForTimeInterval(2000);
		reviewAndPayment.enterDOB("19/04/2000");
		TestUtil.waitForTimeInterval(2000);
		reviewAndPayment.enterNationality("India");
		TestUtil.waitForTimeInterval(2000);
		reviewAndPayment.enterPassportNumber("P3140167");
		TestUtil.waitForTimeInterval(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@class='sk-multi-resource-input  sk-focusable']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		TestUtil.waitForTimeInterval(2000);
		reviewAndPayment.uploadPassport();
		TestUtil.waitForTimeInterval(2000);
		reviewAndPayment.clickOnCheckBox();
//		WebElement ele1 = driver.findElement(By.xpath("//span[contains(text(),'I confirm that all the details provided by me above are correct and accurate. ')]"));
//		action.moveToElement(ele1).build().perform();
		TestUtil.waitForTimeInterval(2000);
		reviewAndPayment.clickOnConfirmBtn();
		TestUtil.waitForTimeInterval(2000);
		reviewAndPayment.confirmAndPay();
		TestUtil.waitForTimeInterval(2000);
		TestUtil.handleFrame("paymentIFrame");
		TestUtil.waitForTimeInterval(2000);
		reviewAndPayment.clickOnCreditCardTab();
		TestUtil.waitForTimeInterval(2000);
		reviewAndPayment.enterCreditCardNumber("4434260000000008");
		TestUtil.waitForTimeInterval(2000);
		reviewAndPayment.selectExpiryMonth("02");
		TestUtil.waitForTimeInterval(2000);
		reviewAndPayment.selectYear("2026");
		TestUtil.waitForTimeInterval(2000);
		reviewAndPayment.enterCVV("123");
		TestUtil.waitForTimeInterval(2000);
		reviewAndPayment.clickOnMakePayment();
		
		TestUtil.waitForTimeInterval(15000);
		reviewAndPayment.clickOnSplitChkbox();
		TestUtil.waitForTimeInterval(2000);
		reviewAndPayment.enterCustomECI("ECI123");
		TestUtil.waitForTimeInterval(2000);
		reviewAndPayment.enterCustomCAVV("CAVV123");
		TestUtil.waitForTimeInterval(2000);
		reviewAndPayment.clickOnSubmitBtn();
		
	}

}
