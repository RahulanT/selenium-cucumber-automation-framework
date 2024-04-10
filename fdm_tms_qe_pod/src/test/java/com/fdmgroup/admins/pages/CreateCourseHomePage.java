package com.fdmgroup.admins.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class CreateCourseHomePage extends BrowserUtilities {

	public CreateCourseHomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()=\"Current Courses\"]")
	private WebElement currentCoursesHeading;

	@FindBy(xpath = "//*[text()=\"Proskills\"]")
	private WebElement firstCourse;

	@FindBy(xpath = "//*[text()=\"Course\"]")
	private WebElement courseHeading;
	
	@FindBy(xpath = "//*[text()=\" Course Owner\"]")
	private WebElement courseOwnerHeading;
	
	@FindBy(xpath = "//*[text()=\" Course Length(d)\"]")
	private WebElement courseLengthHeading;
	
	@FindBy(xpath = "//*[text()=\" Region/Country \"]")
	private WebElement regionHeading;

	@FindBy(xpath = "//*[text()=' Course Owner']//i[contains(@class,'bi bi-arrow-down-up') ]")
	private WebElement courseOwnerSortedButton;
	
	@FindBy(xpath = "//*[text()=\" James Bond \"]")
	private WebElement ownerNameByDes;

	@FindBy(xpath = "//*[text()=\" Bruce Wayne \"]")
	private WebElement ownerNameByAsc;

	@FindBy(xpath = "//*[text()=' Course Length(d)']//i[contains(@class,'bi bi-arrow-down-up') ]")
	private WebElement courseLengthSortButton;

	@FindBy(xpath = "//*[text()='15']")
	private WebElement courseLenByDes;

	@FindBy(xpath = "//*[text()='5']")
	private WebElement courseLenByAsc;
	
	@FindBy(xpath = "//*[text()=' Region/Country ']//i[contains(@class,'bi bi-arrow-down-up') ]")
	private WebElement countrySortButton;

	@FindBy(xpath = "//*[text()=' APAC / Australia ']")
	private WebElement countryByAsc;

	@FindBy(xpath = "//*[text()=' NA / United States ']")
	private WebElement countryByDes;

	@FindBy(xpath = "//*[text()=' Region/Country ']//i[contains(@class,'bi bi-funnel-fill') ]")
	private WebElement funnelButton;

	@FindBy(xpath = "//*[contains(@type,'checkbox')]")
	private List<WebElement> countryCheckBox;
	
	@FindBy(xpath = "//*[contains(@value,'NA') ]")
	private WebElement NAcheckbox;
	
	@FindBy(xpath = "//*[contains(@value,'APAC') ]")
	private WebElement APACcheckbox;
	
	@FindBy(xpath = "//*[contains(@aria-label,\"Filter by Name\")]")
	private WebElement searchByCourseName;

	@FindBy(xpath = "//td[1]")
	private WebElement sqlCourseSearch;
	
	@FindBy(xpath = "//*[contains(@value,'EMEA') ]")
	private WebElement EMEAcheckbox;

	public String currentCoursesHeadingText() {
		return currentCoursesHeading.getText();
	}

	public String firstCourseText() {
		return firstCourse.getText();
	}

	public String courseHeadingText() {
		return courseHeading.getText();
	}

	public String courseOwnerHeadingText() {
		return courseOwnerHeading.getText();
	}

	public String courseLengthHeadingText() {
		return courseLengthHeading.getText();
	}

	public String regionHeadingText() {
		return regionHeading.getText();
	}

	public String FirstRowText() {
		firstCourse.click();
		return firstCourse.getText();

	}
	public void courseOwnerSortedButtonClick() {
		courseOwnerSortedButton.click();

	}

	public String sortByownerNameByDes() {

		return ownerNameByDes.getText();
	}

	public String sortByownerNameByAsc() {
		return ownerNameByAsc.getText();
	}

	public void courseLengthSortedButtonClick() {
		courseLengthSortButton.click();
	}

	public String sortByCourseLenByDes() {

		return courseLenByDes.getText();
	}

	public String sortByCourseLenByAsc() {

		return courseLenByAsc.getText();
	}

	public void countrySortedButtonClick() {
		countrySortButton.click();
	}

	public String sortByCountryByAsc() {
		return countryByAsc.getText();
	}

	public String sortByCountryByDes() {
		return countryByDes.getText();
	}

	public void funnelButtonClick() {
		funnelButton.click();
	}

	public void clearCheckBox() {
		for (int i = 0; i < countryCheckBox.size(); i++) {
			countryCheckBox.get(i).click();
		}

	}
	public void checkBoxNAClick() {
		NAcheckbox.click();
			}

	public Boolean checkBoxNA() {

		boolean isSelected = NAcheckbox.isSelected();
		return isSelected;
	}

	public void checkBoxAPACClick() {
		APACcheckbox.click();
	}

	public Boolean checkBoxAPAC() {
		boolean isSelected = APACcheckbox.isSelected();
		return isSelected;
	}

	public void checkBoxEMEAClick() {
		EMEAcheckbox.click();	
	}

	public Boolean checkBoxEMEA() {
		boolean isSelected = EMEAcheckbox.isSelected();
		return isSelected;
	}

	public void searchCourse(String name) {
		searchByCourseName.sendKeys(name);
	}

	public String getSearchCourse() {
		return sqlCourseSearch.getText();
	}

}
