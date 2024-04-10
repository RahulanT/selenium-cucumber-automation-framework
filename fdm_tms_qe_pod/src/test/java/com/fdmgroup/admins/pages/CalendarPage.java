package com.fdmgroup.admins.pages;
 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;

public class CalendarPage extends BrowserUtilities {

	@FindBy(xpath = "//td[text()='AM'][1]")
	private WebElement textTableSubHeaderAM;

	@FindBy(xpath = "//td[text()='PM'][1]")
	private WebElement textTableSubHeaderPM;

	@FindBy(xpath = "//td[text()=' Peter Parker ']")
	private WebElement textTrainersName;

//	@FindBy(xpath = "//tr[contains(@class,'table-header')]")
//	private List<WebElement> numberOfDaysDisplayed;

	@FindBy(xpath = "//tr[contains(@class,'table-header')][1]")
	private WebElement numberOfDaysDisplayed;
	
	@FindBy(xpath = "//*[text()='Calendar']")
	private WebElement btnCalendarNavbar;

	@FindBy(xpath = "//*[text()=' Monday ']")
	private WebElement txtCalendarDay;

	@FindBy(xpath = "//button/i[contains(@class,'bi bi-chevron-right')]")
	private WebElement btnRightNavigator;

	@FindBy(xpath = "//*[text()=' Monday ']")
	private WebElement txtCalendarDate;

	@FindBy(xpath = "//button/i[contains(@class,'bi bi-chevron-left')]")
	private WebElement btnLeftNavigator;

//	@FindBy(xpath = "//*[text()='Week']")
//	private WebElement btnWeek;
	
	@FindBy(xpath = "//div[@class ='label' and text()='1 Week']")
	private WebElement btnWeek;

	@FindBy(xpath = "//*[text()='Filter']")
	private WebElement btnFilter;

	@FindBy(xpath = "//div[contains(@class,'col-sm-9 text-center')]")
	private WebElement txtDatewhenLeftNavigatorpressed;

	@FindBy(xpath = "//div[contains(@class,'col-sm-9 text-center')]")
	private WebElement txtDatewhenRightNavigatorpressed;

//	@FindBy(xpath = "//*[@id='search-input']")
//	private WebElement btnSearch;
//
//	@FindBy(xpath = "(//*[@class='dropdown-item'])[3]")
//	private WebElement btnDropDown;

	@FindBy(xpath = "//*[contains(@class,'bi bi-arrow-down-up')]")
	private WebElement sortButton;

	@FindBy(xpath = "//td[contains(text(),'Sarah Kim')] ")
	private WebElement trainerNameByDes;

	@FindBy(xpath = "//td[contains(text(),'Bruce Wayne')] ")
	private WebElement trainerNameByAsc;

	@FindBy(xpath = "//*[contains(@class,'bi bi-chevron-right')]")
	private WebElement btnForward;

	@FindBy(xpath = "//*[contains(@class,'col-8 calendar-date-display')]")
	private WebElement txtDateWhenForwardButtonClick;

	@FindBy(xpath = "//*[contains(@class,'bi bi-chevron-left')]")
	private WebElement btnBackward;

	@FindBy(xpath = "//*[contains(@class,'col-8 calendar-date-display')]")
	private WebElement txtDateWhenBackwardButtonClick;

	@FindBy(xpath = "//*[(text()=\" Monday \")]")
	private WebElement forwardAmPmDateForMonday;

	@FindBy(xpath = "//*[(text()=\" Friday \")]")
	private WebElement forwardAmPmDateForFriday;

	@FindBy(xpath = "//*[(text()=\" Monday \")]")
	private WebElement backwardAmPmDateForMonday;

	@FindBy(xpath = "//*[(text()=\" Friday \")]")
	private WebElement backwardAmPmDateForFriday;

	@FindBy(xpath = "//div[@class='scollable-table']")
	private WebElement scrollBar;

	@FindBy(xpath = "//*[@class='table-header'][1]")
	private WebElement calendarHeader;

	@FindBy(xpath = "//*[contains(@id,'weekDropdown')]")
	private WebElement weekDropDownArrow;

	@FindBy(xpath = "//a[contains(text(),'1 Week')]")
	private WebElement oneWeekText;

	@FindBy(xpath = "//a[contains(text(),'2 Weeks')]")
	private WebElement twoWeeksText;

	@FindBy(xpath = "//*[contains(text(),' Monday')]")
	private WebElement mondayText;

	@FindBy(xpath = "//td[7][contains(text(),' Monday')]")
	private WebElement mondayText1;
	
	@FindBy(xpath = "//*[@id='search-input']")
	WebElement btnSearch;

	@FindBy(xpath = "//*[@class='dropdown-item-text search-result-info']")
	WebElement resultBar;
	
	@FindBy(xpath = "//div[contains(@class,'dropdown-menu')]//div[@class='dropdown-item'][1]")
	WebElement btnDropDown;
	
	@FindBy(xpath = "//a[contains(text(),'Calendar')]")
	WebElement btnCalendar;
	
	public CalendarPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickCalendarButton() {
		btnCalendar.click();
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
	
	public String calendarbutton() {
		btnCalendarNavbar.click();
		return txtCalendarDay.getText();
	}

	public void clickFilterButton() {
		btnFilter.click();
	}

	public void clickWeekButton() {
		btnWeek.click();
	}

	public String clickLeftNavigator() {
		btnLeftNavigator.click();
		return txtDatewhenLeftNavigatorpressed.getText();
	}

	public String clickRightNavigator() {
		btnRightNavigator.click();
		return txtDatewhenRightNavigatorpressed.getText();
	}

	public String calendarVerification() {
		return txtCalendarDate.getText();
	}

	public String AMColumnVerification() {
		return textTableSubHeaderAM.getText();
	}

	public String PMColumnVerification() {
		return textTableSubHeaderPM.getText();
	}

	public String trainersListVerification() {
		return textTrainersName.getText();
	}

	public Integer numbersOfDaysDisplayed() {
		List <WebElement> numberOfDays = numberOfDaysDisplayed.findElements(By.tagName("td"));
		return numberOfDays.size();
	}

	public void clickSearchButton() {
		btnSearch.click();
	}

	public boolean sendFirstLetter() {
		btnSearch.sendKeys(ConfigurationReader.getProperty("admins", "firstLetterOfTrainer"));
		return true;
	}

	public String getTrainer() {
		return btnDropDown.getText();
	}

	public void sortButtonClick() {
		sortButton.click();
	}

	public Boolean sortButtonDisplay() {
		return sortButton.isDisplayed();
	}

	public String trainerNameByDesGetText() {
		return trainerNameByDes.getText();
	}

	public String trainerNameByAscGetText() {
		return trainerNameByAsc.getText();
	}

	public void calendarButtonClick() {
		btnCalendarNavbar.click();
	}

	public String calendarDay() {
		return txtCalendarDay.getText();
	}

	public void btnForwardClick() {
		btnForward.click();
	}

	public String dateForwardButtonClickGetText() {
		return txtDateWhenForwardButtonClick.getText();
	}

	public void btnBackwardClick() {
		btnBackward.click();
	}

	public String dateBackwardButtonClickGetText() {
		return txtDateWhenBackwardButtonClick.getText();
	}

	public String txtforwardAmPmDateForMonday() {
		return forwardAmPmDateForMonday.getText();
	}

	public String txtforwardAmPmDateForFriday() {
		return forwardAmPmDateForFriday.getText();
	}

	public String txtbackwardAmPmDateForMonday() {
		return backwardAmPmDateForMonday.getText();
	}

	public String txtbackwardAmPmDateForFriday() {
		return backwardAmPmDateForFriday.getText();
	}

	public void scrollScrollBar(int x) {
		try {
			String script = "arguments[0].scrollTop = arguments[1];";
			((JavascriptExecutor) driver).executeScript(script, scrollBar, x);
			System.out.println("Scrolling successful.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickWeekDropDownArrow() {
		weekDropDownArrow.click();
	}

	public String getOneWeekText() {
		return oneWeekText.getText();
	}

	public String getTwoWeeksText() {
		return twoWeeksText.getText();
	}

	public void clickOneWeekText() {
		oneWeekText.click();
	}

	public String getMondayText() {
		return mondayText.getText();
	}

	public void clickTwoWeeksText() {
		twoWeeksText.click();
	}

	public String getMonday1Text() {
		return mondayText1.getText();
	}
}
