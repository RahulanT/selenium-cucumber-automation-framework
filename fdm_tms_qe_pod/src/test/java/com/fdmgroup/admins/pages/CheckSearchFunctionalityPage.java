package com.fdmgroup.admins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;

public class CheckSearchFunctionalityPage extends BrowserUtilities {
	public CheckSearchFunctionalityPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='search-input']")
	WebElement btnSearch;

	@FindBy(xpath = "//*[@class='dropdown-item-text search-result-info']")
	WebElement resultBar;
	
	@FindBy(xpath = "//div[contains(@class,'dropdown-menu')]//div[@class='dropdown-item']")
	WebElement btnDropDown;
	
	@FindBy(xpath = "//a[contains(text(),'Calendar')]")
	WebElement btnCalendar;

	public void clickCalendarButton() {
		btnCalendar.click();
	}
	
	public void clickSearchButton() {
		btnSearch.click();
	}

	public boolean clickSearchButtonIsEnable() {
		return btnSearch.isEnabled();
	}

	public boolean sendSearchField() {
		btnSearch.sendKeys(ConfigurationReader.getProperty("admins", "searchField"));
		return true;
	}

	public boolean sendSearchTrainer() {
		btnSearch.sendKeys(ConfigurationReader.getProperty("admins", "searchTrainer"));
		return true;
	}

	public String getResult() {
		return resultBar.getText();
	}
	
	public boolean sendSearchRandomChar() {
		btnSearch.sendKeys(ConfigurationReader.getProperty("admins", "searchField1"));
		return true;
	}
	
	public String getResults() {
		return resultBar.getText();
	}
	
	public void clickDropDownButton() {
		btnDropDown.click();
	}
	
	public boolean sendFirstLetter() {
		btnSearch.sendKeys(ConfigurationReader.getProperty("admins", "firstLetterOfTrainer"));
		return true;
	}
	
	public String getTrainer() {
		return btnDropDown.getText();
	}
}
