package com.fdmgroup.admins.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class CreateStreamPage extends BrowserUtilities {

	public CreateStreamPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@formcontrolname='streamName']")
	private WebElement inputFieldStreamName;

	@FindBy(xpath = "//input[@formcontrolname='pathwayColor']")
	private WebElement inputColorField;

	@FindBy(xpath = "//h4[text()='Available Course']/following-sibling::div//tbody")
	private WebElement availableCourseListTable;

	@FindBy(xpath = "//tr[@class='text-start table-info']/td")
	private WebElement chooseAvailableCourse;

	@FindBy(xpath = "//h4[text()='Selected Course']/following-sibling::div//tbody")
	private WebElement selectedCourseListTable;

	@FindBy(xpath = "//table[@class='cdk-drop-list table table-striped table-bordered course-list']//td")
	private WebElement chooseSelectedCourse;

	@FindBy(xpath = "//button[text()='Add']")
	private WebElement btnAdd;

	@FindBy(xpath = "//button[text()='Remove']")
	private WebElement btnRemove;

	@FindBy(xpath = "//label[text()='Duration in Days ']//following-sibling::label")
	private WebElement daysInDuration;

	@FindBy(xpath = "//select[@formcontrolname='region']")
	private WebElement dropdownListRegions;

	@FindBy(xpath = "//select[@formcontrolname='country']")
	private WebElement dropdownListCountry;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnCreateStream;

	public Boolean isStreamNameHintTextDisplayed() {
		return inputFieldStreamName.isDisplayed();
	}

	public String getStreamNameHintText() {
		return inputFieldStreamName.getAttribute("placeholder");
	}

	public void clickStreamNameInputField() {
		inputFieldStreamName.click();
	}

	public Boolean isStreamNameInputFieldEnable() {
		return inputFieldStreamName.isEnabled();
	}

	public void setStreamNameInputField(String name) {
		inputFieldStreamName.clear();
		inputFieldStreamName.sendKeys(name);
	}

	public String getStreamNameInputFieldText() {
		return inputFieldStreamName.getAttribute("value");
	}

	public void clickColorInputField() {
		inputColorField.click();
	}

	public Boolean isColorInputFieldEnable() {
		return inputColorField.isEnabled();
	}

	public void setColorInputField(String colorCode) {

		javascriptExecuteScript("arguments[0].value='#ff0000';", inputColorField);

	}

	public String getColorInputField() {
		return inputColorField.getAttribute("value");
	}

	public void clickAvailableCourse(String courseName) {

		List<WebElement> rows = availableCourseListTable.findElements(By.tagName("tr"));

		for (WebElement row : rows) {
			WebElement courseOOD = row.findElement(By.tagName("td"));

			if (courseOOD.getText().contains(courseName)) {
				courseOOD.click();
				break;
			}
		}
	}

	public String getChoosenAvailableCourseName() {
		return chooseAvailableCourse.getText();
	}

	public String getChoosenSelectedCourseName() {
		return chooseSelectedCourse.getText();
	}

	public void clickAddButton() {
		btnAdd.click();
	}

	public void clickRemoveButton() {
		btnRemove.click();
	}

	public Boolean getSelectedCourseList(String courseName) {
		List<WebElement> rows = selectedCourseListTable.findElements(By.tagName("tr"));

		for (WebElement row : rows) {
			WebElement courseOOD = row.findElement(By.tagName("td"));

			if (courseOOD.getText().contains(courseName)) {
				return true;
			}
		}
		return false;

	}

	public String getDaysInDuration() {
		return daysInDuration.getText();
	}

	public String getRegions() {
		Select getRegions = new Select(dropdownListRegions);
		return getRegions.getFirstSelectedOption().getText();
	}

	public String getCountry() {
		Select getCountry = new Select(dropdownListCountry);
		return getCountry.getFirstSelectedOption().getText();
	}

	public Boolean isCreateStreamButtonDisabled() {
		return btnCreateStream.isEnabled();
	}

	public void clickSelectedCourse(String courseName) {

		List<WebElement> rows = selectedCourseListTable.findElements(By.tagName("tr"));

		for (WebElement row : rows) {
			WebElement courseOOD = row.findElement(By.tagName("td"));

			if (courseOOD.getText().contains(courseName)) {
				courseOOD.click();
				break;
			}
		}
	}

	public Boolean getAvailableCourseList(String courseName) {
		List<WebElement> rows = availableCourseListTable.findElements(By.tagName("tr"));

		for (WebElement row : rows) {
			WebElement courseOOD = row.findElement(By.tagName("td"));

			if (courseOOD.getText().contains(courseName)) {
				return true;
			}
		}
		return false;

	}

}
