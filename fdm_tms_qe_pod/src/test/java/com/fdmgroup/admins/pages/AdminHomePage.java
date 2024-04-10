package com.fdmgroup.admins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class AdminHomePage extends BrowserUtilities {

	public  AdminHomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='View Cohorts']")
	private WebElement viewCohorts;

	@FindBy(xpath = "//*[text()='Create Grade Scale']")
	private WebElement createGradeScale;
	
	
	public void clickViewCohorts() {
		viewCohorts.click();
	}
	
	public void clickCreateGradeScale() {
		setExplicitWait(4);
		waitForVisibilityOf(createGradeScale);
		createGradeScale.click();
	}
}
