package com.fdmgroup.admins.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class CreatePathwayPage extends BrowserUtilities {

	public CreatePathwayPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@formcontrolname='pathwayName']")
	private WebElement inputFieldPathwayeName;

	@FindBy(xpath = "//select[@formcontrolname='pathwayOwner']")
	private WebElement dropdownListPathwayOwner;

	@FindBy(xpath = "//label[text()='Duration in Weeks ']//following-sibling::label")
	private WebElement weeksInDuration;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnCreatePathway;

	@FindBy(xpath = "//table[@class='cdk-drop-list table table-striped table-bordered course-list']")
	private WebElement chooseSelectedCourse;

	@FindBy(xpath = "//td[contains(text(),'1')]")
	private WebElement targetLocation;

	@FindBy(xpath = "//td[contains(text(),'3')]")
	private WebElement sourceLocation;

	@FindBy(xpath = "//select[@formcontrolname='pathwayFocus']")
	private WebElement dropdownListFocus;

	@FindBy(xpath = "//mat-select[@formcontrolname='pathwayColor']")
	private WebElement dropdownListColor;

	@FindBy(xpath = "//mat-optgroup[@ng-reflect-label='BLUE']/MAT-OPTION[1]")
	private WebElement dropdownListColorBlue;

	@FindBy(xpath = "//mat-optgroup[@ng-reflect-label='YELLOW']/MAT-OPTION[1]")
	private WebElement dropdownListColorYellow;

	public Boolean isPathwayNameHintTextDisplayed() {
		return inputFieldPathwayeName.isDisplayed();
	}

	public String getPathwayNameHintText() {
		return inputFieldPathwayeName.getAttribute("placeholder");
	}

	public void clickPathwayNameInputField() {
		inputFieldPathwayeName.click();
	}

	public Boolean isPathwayNameInputFieldEnable() {
		return inputFieldPathwayeName.isEnabled();
	}

	public void setPathwayNameInputField(String pathwayName) {
		inputFieldPathwayeName.clear();
		inputFieldPathwayeName.sendKeys(pathwayName);
	}

	public String getPathwayNameInputFieldText() {
		return inputFieldPathwayeName.getAttribute("value");
	}

	public void selectPathwayOwner(String pathwayOwnerName) {
		Select selectPathwayOwner = new Select(dropdownListPathwayOwner);
		selectPathwayOwner.selectByVisibleText(pathwayOwnerName);
	}

	public String getPathwayOwner() {
		Select getPathwayOwner = new Select(dropdownListPathwayOwner);
		return getPathwayOwner.getFirstSelectedOption().getText();
	}

	public String getWeeksInDuration() {
		return weeksInDuration.getText();
	}

	public Boolean isCreatePathwayButtonEnabled() {
		return btnCreatePathway.isEnabled();
	}

	public void clickCreatePathwayButton() {
		btnCreatePathway.click();
	}

	public String getSelectedCourseIndex(String courseName) {
		List<WebElement> rows = chooseSelectedCourse.findElements(By.tagName("tr"));

		for (WebElement row : rows) {
			WebElement courses = row.findElement(By.tagName("td"));

			String index = String.valueOf(courses.getText().charAt(0));

			if (courses.getText().contains(courseName)) {
				return index;
			}
		}
		return null;

	}

	public Boolean checkSelectedCourseName(String courseName) {
		List<WebElement> rows = chooseSelectedCourse.findElements(By.tagName("tr"));

		for (WebElement row : rows) {
			WebElement courses = row.findElement(By.tagName("td"));

			if (courses.getText().contains(courseName)) {
				return true;
			}
		}
		return false;

	}

	public void dragAndDropCourses() {
		Actions builder = new Actions(driver);

		Action dragAndDrop = builder.clickAndHold(sourceLocation).moveToElement(targetLocation).release(targetLocation)
				.build();

		dragAndDrop.perform();

	}

	public void selectPathwayFocus(String pathwayFocus) {
		Select selectPathwayFocus = new Select(dropdownListFocus);
		selectPathwayFocus.selectByVisibleText(pathwayFocus);
	}

	public String getPathwayFocus() {
		Select getPathwayFocus = new Select(dropdownListFocus);
		return getPathwayFocus.getFirstSelectedOption().getText();
	}

	public void selectPathwayColor(String pathwayColor) {

		dropdownListColor.click();

		if (pathwayColor.equalsIgnoreCase("#0000FF")) {
			dropdownListColorBlue.click();
		} else {
			dropdownListColorYellow.click();
		}

	}

	public String getPathwayColor(String color) {

		if (color.equalsIgnoreCase("#0000FF")) {
			return dropdownListColorBlue.getAttribute("ng-reflect-value");
		} else {
			return dropdownListColorYellow.getAttribute("ng-reflect-value");
		}

	}

}
