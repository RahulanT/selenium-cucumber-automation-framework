package com.fdmgroup.admins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class OutOfOfficePage extends BrowserUtilities {
	public OutOfOfficePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[@class='calendar-body-content'])[1]")
	WebElement bar;
	
	@FindBy(xpath = "//*[@class='bi bi-chevron-left']")
	WebElement leftArrow;
	
	public void clickBar() {
		leftArrow.click();
	}

	public String getOutOfOfficeBarColor() {
		return bar.getCssValue("color");
	}

}
