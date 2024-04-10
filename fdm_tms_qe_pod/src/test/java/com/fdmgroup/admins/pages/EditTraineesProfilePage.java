package com.fdmgroup.admins.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class EditTraineesProfilePage extends BrowserUtilities {

	@FindBy(xpath = "//*[contains(text(),'Admin')]")
	private WebElement adminTab;
	@FindBy(xpath = "//*[contains(text(),'Import Trainees')]")
	private WebElement importTraineesLink;
	@FindBy(xpath = "//*[contains(text(),' Julia Graves ')]")
	private WebElement juliaTraineeLink;
	@FindBy(xpath = "//*[contains(text(),'Edit')]")
	private WebElement editBtn;
	@FindBy(xpath = "//*[contains(@id,'firstname')]")
	private WebElement firstname;
	@FindBy(xpath = "//*[contains(@id,'lastname')]")
	private WebElement lastname;
	@FindBy(xpath = "//*[contains(@name,'academicStatus')]")
	private WebElement academicStatusDropDown;
	@FindBy(xpath = "//*[contains(text(),' Signed Off (Placed)')]")
	private WebElement selectStatus;
	@FindBy(xpath = "//*[contains(@name,'location')]")
	private WebElement location;
	@FindBy(xpath = "//*[contains(text(),' New York ')]")
	private WebElement selectLocation;
	@FindBy(xpath = "//*[contains(text(),' FDM Journey ')]")
	private WebElement fdmJourneyBtn;
	@FindBy(xpath = "//*[contains(@id,'cohort')]")
	private WebElement cohortDropDown;
	@FindBy(xpath = "//*[contains(text(),' MO-23-JAV-01 ')]")
	private WebElement selectCohort;
	@FindBy(xpath = "//*[contains(text(),'Save')]")
	private WebElement saveBtn;
	@FindBy(xpath = "//*[contains(text(),'Profile Updated Successfully')]")
	private WebElement updateMsg;
	@FindBy(xpath = "//*[contains(text(),'OK')]")
	private WebElement okBtn;

	public EditTraineesProfilePage() {
		PageFactory.initElements(driver, this);
	}

	public void adminTabClick() {
		adminTab.click();
	}

	public void importTraineesClick() {
		importTraineesLink.click();
	}

	public void juliaTraineeLinkClick() {
		juliaTraineeLink.click();
	}

	public void editBtnClick() {
		editBtn.click();
	}

	public void firstnameText() {
		firstname.clear();
		firstname.sendKeys("Kathy");
	}

	public void lastnameText() {
		lastname.clear();
		lastname.sendKeys("Hilton");
	}

	public void academicStatusDropDownClick() {
		academicStatusDropDown.click();
	}

	public void selectStatusClick() {
		selectStatus.click();
	}

	public void locationClick() {
		location.click();
	}

	public void selectLocationClick() {
		selectLocation.click();
	}

	public void scrollToFDMJourney() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.trainee-info-container-scroll.ng-tns-c69-0').scrollTop=400");
	}

	public void fdmJourneyBtnClick() {
		fdmJourneyBtn.click();
	}

	public void cohortDropDownClick() {
		cohortDropDown.click();
	}

	public void selectCohortClick() {
		selectCohort.click();
		System.out.println("value" + selectCohort.getText());

	}

	public void saveBtnClick() {
		saveBtn.click();
	}

	public String updateMsgText() {
		return updateMsg.getText();
	}

	public void okBtnClick() {
		okBtn.click();
	}
}
