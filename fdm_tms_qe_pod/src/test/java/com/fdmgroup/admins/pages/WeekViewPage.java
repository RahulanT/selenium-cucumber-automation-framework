package com.fdmgroup.admins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class WeekViewPage extends BrowserUtilities {
	public WeekViewPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[@class='bi pe-1 bi-chevron-down'])[4]")
	WebElement dropDownWeek;
	@FindBy(xpath = "(//label[@data-test-class='item-name'])[3]")
	WebElement threeWeek;

	@FindBy(xpath = "(//label[@data-test-class='item-name'])[4]")
	WebElement fourWeek;
	@FindBy(xpath = "(//div[@data-test-id='dropdown-button-title' and @class='label'])[4]")
	WebElement threeWeekBar;
	
	@FindBy(xpath = "(//div[@data-test-id='dropdown-button-title' and @class='label'])[4]")
	WebElement fourWeekBar;
	
	
	public void clickDropDown() {
		dropDownWeek.click();
	}
	
	public void clickthreeWeek() {
		threeWeek.click();
	}
	
	public void clickfourWeek() {
		fourWeek.click();
	}
	
	public String getThreeWeek() {
		return threeWeekBar.getText();
	}
	
	public String getFourWeek() {
		return fourWeekBar.getText();
	}

}
