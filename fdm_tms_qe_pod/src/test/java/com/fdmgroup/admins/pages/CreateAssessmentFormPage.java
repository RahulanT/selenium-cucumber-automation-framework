package com.fdmgroup.admins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class CreateAssessmentFormPage extends BrowserUtilities {

	public CreateAssessmentFormPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "name")
	private WebElement inputFieldAssessmentName;

	@FindBy(id = "status")
	private WebElement elementStatusDropdownList;

	@FindBy(id = "gradeScale")
	private WebElement elementGradeScaleDropdownList;

	@FindBy(xpath = "//textarea[@ng-reflect-name='description']")
	private WebElement inputFieldDescription;

	@FindBy(xpath = "//textarea[@ng-reflect-name='instructions']")
	private WebElement inputFieldInstructions;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnCreate;

	@FindBy(xpath = "//button[@type='reset']")
	private WebElement btnCancel;

	@FindBy(xpath = "//h2[contains(text(),'Create Assessment Form')]")
	private WebElement txtPageHeading;

	@FindBy(xpath = "//div[@class='modal-body']/h5")
	private WebElement txtSuccess;

	@FindBy(xpath = "Assessment already exists. Try different assessment name.")
	private WebElement txtFailure;

	@FindBy(className = "btn-close")
	private WebElement btnClose;

	@FindBy(xpath = "//button[text()=' Customize Form ']")
	private WebElement btnCustomizeForm;

	@FindBy(xpath = "//h2[text()='Customize Form']")
	private WebElement txtCustomizeForm;

	public void clickAssessmentNameInputField() {
		inputFieldAssessmentName.click();
	}

	public Boolean isAssessmentNameInputFieldEnable() {
		return inputFieldAssessmentName.isEnabled();
	}

	public void setAssessmentNameInputField(String name) {
		inputFieldAssessmentName.clear();
		inputFieldAssessmentName.sendKeys(name);
	}

	public String getAssessmentNameInputFieldText() {
		return inputFieldAssessmentName.getAttribute("value");
	}

	public void clickSelectStatusDropdownList() {
		elementStatusDropdownList.click();
	}

	public Boolean isSelectStatusDropdownListVisible() {
		return elementStatusDropdownList.isDisplayed();
	}

	public void selectStatus(String status) {
		Select selectStatus = new Select(elementStatusDropdownList);
		selectStatus.selectByVisibleText(status);
	}

	public String getStatus() {
		Select getStatus = new Select(elementStatusDropdownList);
		return getStatus.getFirstSelectedOption().getText();
	}

	public void clickGradeScaleDropdownList() {
		elementGradeScaleDropdownList.click();
	}

	public Boolean isGradeScaleDropdownListVisible() {
		return elementGradeScaleDropdownList.isDisplayed();
	}

	public void selectGradeScale(String status) {
		Select selectGradeScale = new Select(elementGradeScaleDropdownList);
		selectGradeScale.selectByVisibleText(status);
	}

	public String getGradeScale() {
		Select getGradeScale = new Select(elementGradeScaleDropdownList);
		return getGradeScale.getFirstSelectedOption().getText();
	}

	public void clickDescriptionInputField() {
		inputFieldDescription.click();
	}

	public Boolean isDescriptionInputFieldEnable() {
		return inputFieldDescription.isEnabled();
	}

	public void setDescriptionInputField(String name) {
		inputFieldDescription.clear();
		inputFieldDescription.sendKeys(name);
	}

	public String getDescriptionInputFieldText() {
		return inputFieldDescription.getAttribute("value");
	}

	public void clickInstructionsInputField() {
		inputFieldInstructions.click();
	}

	public Boolean isInstructionsInputFieldEnable() {
		return inputFieldInstructions.isEnabled();
	}

	public void setInstructionsInputField(String name) {
		inputFieldInstructions.clear();
		inputFieldInstructions.sendKeys(name);
	}

	public String getInstructionsInputFieldText() {
		return inputFieldInstructions.getAttribute("value");
	}

	public Boolean isCreateButtonEnabled() {
		return btnCreate.isEnabled();
	}

	public void clickCancelButton() {
		btnCancel.click();
	}

	public String getPageHeading() {
		return txtPageHeading.getText();
	}

	public void clickCreateButton() {
		btnCreate.click();
	}

	public String getPopUpText() {
		return txtSuccess.getText();
	}

	public Boolean isCloseButtonEnabled() {
		return btnClose.isEnabled();
	}

	public void clickCloseButton() {
		btnClose.click();
	}

	public Boolean isCustomizeFormButtonEnabled() {
		return btnCustomizeForm.isEnabled();
	}

	public void clickCustomizeFormButton() {
		btnCustomizeForm.click();
	}

	public Boolean isCustomizeFormTitleTextEnabled() {
		return txtCustomizeForm.isEnabled();
	}

	public Boolean isCreateAssessmentFormTitleTextEnabled() {
		return txtPageHeading.isEnabled();
	}
}
