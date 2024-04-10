package com.fdmgroup.admins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;

public class CalendarCohortPage extends BrowserUtilities {
	public CalendarCohortPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[@class='bi bi-chevron-down'])[5]")
	WebElement dropDownButton;

	@FindBy(xpath = "//*[@id=\"trainer-header-cell\"]/div[1]/app-dropdown-menu/div/div/div/div[2]/label")
	WebElement cohortButton;

	@FindBy(xpath = "(//*[@class='trainer-name'])[1]")
	WebElement codeButton;
	
	@FindBy(xpath = "(//*[@class='button btn'])[5]")
	WebElement cohortTxt;

	public void clickDropDownMenu() {
		dropDownButton.click();
	}

	public void clickCohort() {
		cohortButton.click();
	}

	public boolean clickCohortIsSelected() {
		return cohortButton.isEnabled();
	}

	public String getCodeText() {
		return codeButton.getText();
	}
	
	public String getCohortText() {
		return cohortTxt.getText();
	}
	
	public String getTrainerText() {
		return cohortTxt.getText();
	}
}
