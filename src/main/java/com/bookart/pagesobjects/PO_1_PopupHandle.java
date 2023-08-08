package com.bookart.pagesobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PO_1_PopupHandle {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor executor;

	public PO_1_PopupHandle(WebDriver driver1) {
		driver = driver1;
		wait = new WebDriverWait(driver, 30);
		executor = (JavascriptExecutor) driver;

		PageFactory.initElements(driver1, this);

	}
	@FindBy(xpath = "(//span[@aria-hidden=\"true\"])[1]")
	WebElement NewsletterPopup;
	public void newsLetterPopup() {
		// NewsLetterPopup handle
		try {
			wait.until(ExpectedConditions.elementToBeClickable(NewsletterPopup));
			executor.executeScript("arguments[0].click();", NewsletterPopup);
			System.out.println("Newsletter Popup Handled");
		} 
		catch (Exception e) {
			System.out.println("Newsletter Popup not Found");
		}
	}
}
