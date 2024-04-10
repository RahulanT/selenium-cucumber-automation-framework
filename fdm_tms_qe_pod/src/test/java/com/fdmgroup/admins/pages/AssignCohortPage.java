package com.fdmgroup.admins.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class AssignCohortPage extends BrowserUtilities {

	@FindBy(xpath = "//*[contains(@class,'login-button')]")
	private WebElement loginBtn;

	@FindBy(xpath = "//*[contains(@class,'row selectBtnRow')]")
	private WebElement greyBar;

	@FindBy(xpath = "//*[contains(@name,'cohort')]")
	private WebElement cohortDropDown;

	@FindBy(xpath = "//*[contains(text(),' N-22-JAV-09.2')]")
	private WebElement cohortDropDownItem1;

	@FindBy(xpath = "//*[contains(text(),' TO-23-CLO-1')]")
	private WebElement cohortDropDownItem2;

	@FindBy(xpath = "//*[contains(@type,'checkbox')]")
	private WebElement selectAllChKBox;

	@FindBy(xpath = "//*[contains(@class,'btn btn-secondary cancelBtn')]")
	private WebElement cancelBtn;

	@FindBy(xpath = "//*[contains(@class,'btn btn-secondary disabledBtn')]")
	private WebElement disabledAssignCohortBtn;

	@FindBy(xpath = "//*[contains(@class,'btn btn-secondary impBtn')]")
	private WebElement enabledAssignCohortBtn;

	@FindBy(xpath = "//*[contains(text(),' Confirm Cohort Assignment ')]")
	private WebElement confirmBoxMsg;

	@FindBy(xpath = "//*[contains(text(),' Back ')]")
	private WebElement backBtn;

	@FindBy(xpath = "//*[contains(@id,'confirm-btn')]")
	private WebElement confirmBtn;

	@FindBy(xpath = "//*[contains(text(),'Cohort Assigned to Trainees Successfully')]")
	private WebElement confirmBoxMsg1;

	@FindBy(xpath = "//*[contains(text(),' OK ')]")
	private WebElement okBtn;

//	@FindBy(xpath = "//*[contains(@class,'dropdown-menu show')]")
//	private WebElement scrollBar;

	public AssignCohortPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}

	public void getBackgroundColour() {

		String backgroundColor = greyBar.getCssValue("background-color");
		String expectedColor = "rgba(96, 96, 96, 0.2)";
		assertEquals(backgroundColor, expectedColor);
	}

	public void clickCohortDropDwn() {
		cohortDropDown.click();

	}

	public void selectCohortFromDropDown() throws InterruptedException {
		cohortDropDownItem1.click();
		Thread.sleep(1000);
	}

	public void selectCohortFromDropDown1() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.dropdown-menu.show').scrollTop=300");
		Thread.sleep(1000);
		cohortDropDownItem2.click();

	}

	public void clickChkBox() {
		selectAllChKBox.click();
	}

	public void cancelBtn() {
		cancelBtn.click();
	}

	public void getDisabledBtnBackgroundColour() {

		String backgroundColor = disabledAssignCohortBtn.getCssValue("background-color");
		String expectedColor = "rgba(150, 150, 150, 1)";
		assertEquals(backgroundColor, expectedColor);
	}

	public void getEnabledBtnBackgroundColour() {

		String backgroundColor = enabledAssignCohortBtn.getCssValue("background-color");
		String expectedColor = "rgba(138, 138, 138, 1)";
		assertEquals(backgroundColor, expectedColor);
	}

	public void assignCohortBtn() {
		enabledAssignCohortBtn.click();
	}

	public String getConfirmDailogBoxText() {
		return confirmBoxMsg.getText();
	}

	public void clickBackBtn() {
		backBtn.click();
	}

	public void clickConfirmBtn() {
		confirmBtn.click();
	}

	public String getConfirmDailogBoxText1() {
		return confirmBoxMsg1.getText();
	}

	public void clickOkBtn() {
		okBtn.click();
	}
}
