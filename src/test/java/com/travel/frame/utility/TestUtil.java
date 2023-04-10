package com.travel.frame.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import src.main.java.com.base.Base;

public class TestUtil extends Base {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;

	public static void staleElementIssue(String eleLoc, String value) {

		for (int i = 0; i <= 1; i++) {
			try {
				Thread.sleep(3000);
				WebElement k = driver.findElement(By.xpath(eleLoc));
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("arguments[0].value='" + value + "';", k);

				break;
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
		}
	}

	public static void staleElementIssue(String eleLoc) {

		try {
			Thread.sleep(3000);
			WebElement m = driver.findElement(By.xpath(eleLoc));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", m);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

	}
	
	public static void waitForTimeInterval(long wait) throws InterruptedException {
		Thread.sleep(wait);
	}
	
	public static void moveToElement(WebElement locator) {
		Actions action = new Actions(driver);
		action.moveToElement(locator).build().perform();		
	}
	
	public static void selectByValue(String eleLoc,String val) {
		Select sel = new Select(driver.findElement(By.xpath(eleLoc)));
		sel.selectByValue(val);
	}

	public static void handleFrame(String frameName) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frameName);
	}
}
