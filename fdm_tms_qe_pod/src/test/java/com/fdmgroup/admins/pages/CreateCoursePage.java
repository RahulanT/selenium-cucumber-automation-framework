package com.fdmgroup.admins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class CreateCoursePage extends BrowserUtilities {

	public CreateCoursePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2")
	private WebElement txtPageTitle;
	
	@FindBy(xpath = "//input[@formcontrolname='courseName']")
	private WebElement inputFieldCourseName;
	
	@FindBy(xpath = "//select[@formcontrolname='courseOwner']")
	private WebElement dropdownListCourseOwner;
	
	@FindBy(xpath = "//input[@formcontrolname='duration']")
	private WebElement inputFieldDuration;
	
	@FindBy(xpath = "//select[@formcontrolname='assessmentType']")
	private WebElement dropdownListAssessments;
	
	@FindBy(xpath = "//select[@formcontrolname='region']")
	private WebElement dropdownListRegions;
	
	@FindBy(xpath = "//select[@formcontrolname='country']")
	private WebElement dropdownListCountry;
	
	@FindBy(xpath = "//textarea[@formcontrolname='courseDescription']")
	private WebElement inputFieldCourseDescription;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnCreateCourse;
	
	@FindBy(xpath = "//span[text()='Course Name is Required']")
	private WebElement errorTextCourseNameInputField;
	
	@FindBy(xpath = "//span[text()='Course Owner is Required']")
	private WebElement errorTextCourseOwnerDropdownList;
	
	@FindBy(xpath = "//span[text()='Course Duration is Required']")
	private WebElement errorTextDurationInputField;
	
	@FindBy(xpath = "//span[text()='Assessment Type is Required']")
	private WebElement errorTextAssessmentsDropdownList;
	
	@FindBy(xpath = "//span[text()='Region is Required']")
	private WebElement errorTextRegionsDropdownList;
	
	@FindBy(xpath = "//span[text()='Country is Required']")
	private WebElement errorTextCountryDropdownList;
	
	@FindBy(xpath = "//i[@class='bi bi-plus-circle-fill']")
	private WebElement btnAddAssessments;
	
	@FindBy(xpath = "//input[@class='form-control'][@id='Test']")
	private WebElement listAddAssessments;
	
	@FindBy(xpath = "//input[@class='form-control'][@id='Test']/ancestor::div/following-sibling::div/i")
	private WebElement btnRemoveAssessments;
	
	@FindBy(xpath = "//h5[text()='Course Successfully Created']")
	private WebElement popupSuccessText;
	
	@FindBy(xpath = "//strong[text()='Course name:']/ancestor::div/following-sibling::div/p")
	private WebElement popupCourseNameText;
	
	@FindBy(xpath = "//strong[text()='Course Owner:']/ancestor::div/following-sibling::div/p")
	private WebElement popupCourseOwnerText;
	
	@FindBy(xpath = "//strong[text()='Duration:']/ancestor::div/following-sibling::div/p")
	private WebElement popupDurationText;
	
	@FindBy(xpath = "//strong[text()='Assessments:']/ancestor::div/following-sibling::div/p")
	private WebElement popupAssessmentsText;
	
	@FindBy(xpath = "//strong[text()='Region:']/ancestor::div/following-sibling::div/p")
	private WebElement popupRegionText;
	
	@FindBy(xpath = "//strong[text()='Course Description:']/ancestor::div/following-sibling::div/p")
	private WebElement popupCourseDescriptionText;
	
	@FindBy(xpath = "//button[@class='btn-close']")
	private WebElement btnClosePopup;
	
	@FindBy(xpath = "//button[@class='btn btn-primary justify-content-center confirm-btn']")
	private WebElement btnOk;
	
	@FindBy(xpath = "//button[@class='btn btn-dark justify-content-center text-nowrap confirm-btn']")
	private WebElement btnCreateAnotherCourse;
	
	public Boolean isPageTitleDisplayed() {
		return txtPageTitle.isDisplayed();
	}
	
	public String getPageTitle() {
		return txtPageTitle.getText();
	}
	
	public Boolean isCourseNameHintTextDisplayed() {
		return inputFieldCourseName.isDisplayed();
	}
	
	public String getCourseNameHintText() {
		return inputFieldCourseName.getAttribute("placeholder");
	}
	
	public Boolean isCourseOwnerHintTextDisplayed() {
		return dropdownListCourseOwner.isDisplayed();
	}
	
	public String getCourseOwnerHintText() {
		Select getCourseOwnerHintText = new Select(dropdownListCourseOwner);
		return getCourseOwnerHintText.getFirstSelectedOption().getText();
	}
	
	public Boolean isDurationHintTextDisplayed() {
		return inputFieldDuration.isDisplayed();
	}
	
	public String getDurationHintText() {
		return inputFieldDuration.getAttribute("placeholder");
	}
	
	public Boolean isAssessmentsHintTextDisplayed() {
		return dropdownListAssessments.isDisplayed();
	}
	
	public String getAssessmentsHintText() {
		Select getAssessmentHintText = new Select(dropdownListAssessments);
		return getAssessmentHintText.getFirstSelectedOption().getText();
	}
	
	public Boolean isRegionsHintTextDisplayed() {
		return dropdownListRegions.isDisplayed();
	}
	
	public String getRegionsHintText() {
		Select getRegionsHintText = new Select(dropdownListRegions);
		return getRegionsHintText.getFirstSelectedOption().getText();
	}
	
	public Boolean isCountryHintTextDisplayed() {
		return dropdownListCountry.isDisplayed();
	}
	
	public String getCountryHintText() {
		Select getCountryHintText = new Select(dropdownListCountry);
		return getCountryHintText.getFirstSelectedOption().getText();
	}
	
	public Boolean isCourseDescriptionHintTextDisplayed() {
		return inputFieldCourseDescription.isDisplayed();
	}
	
	public String getCourseDescriptionHintText() {
		return inputFieldCourseDescription.getAttribute("placeholder");
	}
	
	public Boolean isCreateCourseButtonEnabled() {
		return btnCreateCourse.isEnabled();
	}
	
	public void clickCourseNameInputField() {
		inputFieldCourseName.click();
	}
	
	public Boolean isCourseNameInputFieldEnable() {
		return inputFieldCourseName.isEnabled();
	}
	
	public void setCourseNameInputField(String name) {
		inputFieldCourseName.clear();
		inputFieldCourseName.sendKeys(name);
	}
	
	public String getCourseNameInputFieldText() {
		return inputFieldCourseName.getAttribute("value");
	}
	
	public void clickCourseOwnerDropdownList() {
		dropdownListCourseOwner.click();
	}
	
	public Boolean isCourseOwnerDropdownListDisplayed() {
		return dropdownListCourseOwner.isDisplayed();
	}
	
	public void selectCourseOwner(String courseOwner) {
		Select selectCourseOwner = new Select(dropdownListCourseOwner);
		selectCourseOwner.selectByVisibleText(courseOwner);
	}
	
	public String getCourseOwner() {
		Select getCourseOwner = new Select(dropdownListCourseOwner);
		return getCourseOwner.getFirstSelectedOption().getText();
	}
	
	public void clickDurationInputField() {
		inputFieldDuration.click();
	}
	
	public Boolean isDurationInputFieldEnable() {
		return inputFieldDuration.isEnabled();
	}
	
	public void setDurationInputField(String duration) {
		inputFieldDuration.clear();
		inputFieldDuration.sendKeys(duration);
	}
	
	public String getDurationInputFieldText() {
		return inputFieldDuration.getAttribute("value");
	}
	
	public void clickAssessmentsDropdownList() {
		dropdownListAssessments.click();
	}
	
	public Boolean isAssessmentsDropdownListDisplayed() {
		return dropdownListAssessments.isDisplayed();
	}
	
	public void selectAssessments(String assessments) {
		Select selectAssessments = new Select(dropdownListAssessments);
		selectAssessments.selectByVisibleText(assessments);
	}
	
	public String getAssessments() {
		Select getAssessments = new Select(dropdownListAssessments);
		return getAssessments.getFirstSelectedOption().getText();
	}
	
	public void clickRegionsDropdownList() {
		dropdownListRegions.click();
	}
	
	public Boolean isRegionsDropdownListDisplayed() {
		return dropdownListRegions.isDisplayed();
	}
	
	public void selectRegions(String regions) {
		Select selectRegions = new Select(dropdownListRegions);
		selectRegions.selectByVisibleText(regions);
	}
	
	public String getRegions() {
		Select getRegions = new Select(dropdownListRegions);
		return getRegions.getFirstSelectedOption().getText();
	}
	
	public void selectCountry(String country) {
		Select selectCountry = new Select(dropdownListCountry);
		selectCountry.selectByVisibleText(country);
	}
	
	public String getCountry() {
		Select getCountry = new Select(dropdownListCountry);
		return getCountry.getFirstSelectedOption().getText();
	}
	
	public void clickCourseDescriptionInputField() {
		inputFieldCourseDescription.click();
	}
	
	public Boolean isCourseDescriptionInputFieldEnable() {
		return inputFieldCourseDescription.isEnabled();
	}
	
	public void setCourseDescriptionInputField(String duration) {
		inputFieldCourseDescription.clear();
		inputFieldCourseDescription.sendKeys(duration);
	}
	
	public String getCourseDescriptionInputFieldText() {
		return inputFieldCourseDescription.getAttribute("value");
	}
	
	public Boolean isCourseNameErrorTextDisplayed() {
		return errorTextCourseNameInputField.isDisplayed();
	}
	
	public String getCourseNameErrorText() {
		return errorTextCourseNameInputField.getText();
	}
	
	public Boolean isCourseOwnerErrorTextDisplayed() {
		return errorTextCourseOwnerDropdownList.isDisplayed();
	}
	
	public String getCourseOwnerErrorText() {
		return errorTextCourseOwnerDropdownList.getText();
	}
	
	public Boolean isDurationErrorTextDisplayed() {
		return errorTextDurationInputField.isDisplayed();
	}
	
	public String getDurationErrorText() {
		return errorTextDurationInputField.getText();
	}
	
	public Boolean isAssessmentsErrorTextDisplayed() {
		return errorTextAssessmentsDropdownList.isDisplayed();
	}
	
	public String getAssessmentsErrorText() {
		return errorTextAssessmentsDropdownList.getText();
	}
	
	public Boolean isRegionsErrorTextDisplayed() {
		return errorTextRegionsDropdownList.isDisplayed();
	}
	
	public String getRegionsErrorText() {
		return errorTextRegionsDropdownList.getText();
	}
	
	public Boolean isCountryErrorTextDisplayed() {
		return errorTextCountryDropdownList.isDisplayed();
	}
	
	public String getCountryErrorText() {
		return errorTextCountryDropdownList.getText();
	}
	
	public void clickCountryDropdownList() {
		dropdownListCountry.click();
	}
	
	public Boolean isAddAssessmentsButtonDisplayed() {
		return btnAddAssessments.isDisplayed();
	}
	
	public void clickAddAssessmentsButton() {
		btnAddAssessments.click();
	}
	
	public String getAssessmentList() {
		return listAddAssessments.getAttribute("id");
	}
	
	public Boolean isRemoveAssessmentsButtonDisplayed() {
		return btnRemoveAssessments.isDisplayed();
	}
	
	public void clickRemoveAssessmentsButton() {
		btnRemoveAssessments.click();
	}
	
	public void clickCreateCourseButton() {
		btnCreateCourse.click();
	}
	
	public String getPopupSuccessText() {
		return popupSuccessText.getText();
	}
	
	public Boolean isPopupCourseNameTextDisplayed() {
		return popupCourseNameText.isDisplayed();
	}
	
	public String getPopupCourseNameText() {
		return popupCourseNameText.getText();
	}
	
	public Boolean isPopupCourseOwnerTextDisplayed() {
		return popupCourseOwnerText.isDisplayed();
	}
	
	public String getPopupCourseOwnerText() {
		return popupCourseOwnerText.getText();
	}
	
	public Boolean isPopupDurationTextDisplayed() {
		return popupDurationText.isDisplayed();
	}
	
	public String getPopupDurationText() {
		return popupDurationText.getText();
	}
	
	public Boolean isPopupAssessmentsTextDisplayed() {
		return popupAssessmentsText.isDisplayed();
	}
	
	public String getPopupAssessmentsText() {
		return popupAssessmentsText.getText();
	}
	
	public Boolean isPopupRegionTextDisplayed() {
		return popupRegionText.isDisplayed();
	}
	
	public String getPopupRegionText() {
		return popupRegionText.getText();
	}
	
	public Boolean isPopupCourseDescriptionTextDisplayed() {
		return popupCourseDescriptionText.isDisplayed();
	}
	
	public String getPopupCourseDescriptionText() {
		return popupCourseDescriptionText.getText();
	}
	
	public void clickClosePopupButton() {
		btnClosePopup.click();
	}
	
	public Boolean isClosePopupButtonDisplayed() {
		return btnClosePopup.isDisplayed();
	}
	
	public Boolean isOkButtonDisplayed() {
		return btnOk.isDisplayed();
	}
	
	public Boolean isOkButtonEnabled() {
		return btnOk.isEnabled();
	}
	
	public void clickCreateAnotherCourseButton() {
		btnCreateAnotherCourse.click();
	}
	
	public Boolean isCreateAnotherCourseButtonDisplayed() {
		return btnCreateAnotherCourse.isDisplayed();
	}
	

}
