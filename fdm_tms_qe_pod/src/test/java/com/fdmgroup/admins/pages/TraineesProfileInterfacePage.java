package com.fdmgroup.admins.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class TraineesProfileInterfacePage extends BrowserUtilities {
	@FindBy(xpath = "//*[contains(text(),'First Name:')]")
	private WebElement firstName;
	@FindBy(xpath = "//*[contains(text(),'Last Name:')]")
	private WebElement lastName;
	@FindBy(xpath = "//*[contains(text(),'Username:')]")
	private WebElement userName;
	@FindBy(xpath = "//*[contains(text(),'Status:')]")
	private WebElement status;
	@FindBy(xpath = "//*[contains(text(),'Location:')]")
	private WebElement location;
	@FindBy(xpath = "//*[contains(text(),'Start Date:')]")
	private WebElement startDate;

	@FindBy(xpath = "//*[contains(text(),' FDM Journey ')]")
	private WebElement fdmJourneyBtn;

	@FindBy(xpath = "//*[contains(text(),'Pathway:')]")
	private WebElement pathway;
	@FindBy(xpath = "//*[contains(text(),'Cohort:')]")
	private WebElement cohort;
	@FindBy(xpath = " //*[contains(text(),'Skills')] ")
	private WebElement skillsBtn;
	@FindBy(xpath = "//*[contains(text(),'Skills:')]")
	private WebElement skills;
	@FindBy(xpath = "//*[contains(text(),'Certifications:')]")
	private WebElement certifications;

	public TraineesProfileInterfacePage() {
		PageFactory.initElements(driver, this);
	}

	public String getTextFirstName() {
		return firstName.getText();
	}

	public String getTextLastName() {
		return lastName.getText();
	}

	public void scrollToFDMJourney() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.trainee-info-container-scroll.ng-tns-c69-0').scrollTop=400");
	}

	public void fdmJourneyBtnClick() {
		fdmJourneyBtn.click();
	}

	public String getTextPathway() {
		return pathway.getText();
	}

	public String getTextCohort() {
		return cohort.getText();
	}

	public void scrollToSkills() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.trainee-info-container-scroll.ng-tns-c69-0').scrollTop=800");
	}

	public void skillsBtnClick() {
		skillsBtn.click();
	}

	public String getTextSkills() {
		return skills.getText();
	}

	public String getTextCertifications() {
		return certifications.getText();
	}

	public String getTextUserName() {
		return userName.getText();
	}

	public String getTextStatus() {
		return status.getText();
	}

	public String getTextLocation() {
		return location.getText();
	}

	public String getTextStartDate() {
		return startDate.getText();
	}

}
