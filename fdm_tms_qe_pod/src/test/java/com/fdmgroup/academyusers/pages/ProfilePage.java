package com.fdmgroup.academyusers.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;

public class ProfilePage extends BrowserUtilities {

	@FindBy(xpath = "//app-navbar//a[contains(text(),'Profile')]")
	private WebElement profileNavBar;

	@FindBy(xpath = "//div[@class='card']")
	private WebElement profileCard;

	@FindBy(xpath = "//img[contains(@class, 'card-img-top')]")
	private WebElement profileImage;

	@FindBy(xpath = "//div[@class='card']//h5[contains(@class,'card-title')]")
	private WebElement cardTitle;

	@FindBy(xpath = "//div[@class='card']//div[text()='Role:']")
	private WebElement roleField;

	@FindBy(xpath = "//div[@class='card']//div[text()='Username:']")
	private WebElement username;

	@FindBy(xpath = "//div[@class='card']//div[text()='Bio:']")
	private WebElement bio;

	@FindBy(xpath = "//div[@class='card']//div[text()='Email:']")
	private WebElement email;

	@FindBy(xpath = "//div[@class='card']//div[text()='Location:']")
	private WebElement location;

	@FindBy(xpath = "//div[@class='card']//div[text()='Area of Responsibility:']")
	private WebElement areaOfResponsibility;

	@FindBy(xpath = "//div[@class='card']//div[text()='Team:']")
	private WebElement team;

	@FindBy(xpath = "//div[@class='card']//div[text()='Teaching courses:']")
	private WebElement teachingCourses;

	@FindBy(xpath = "//div[@class='card']//div[text()='Other Skills:']")
	private WebElement otherSkills;

	@FindBy(xpath = "//div[@class='card']//div[text()='Certifications:']")
	private WebElement certifications;

	@FindBy(xpath = "//div[@class='card']//div[text()='Stream:']")
	private WebElement stream;

	@FindBy(xpath = "//div[@class='card']//div[text()='Ex-Military:']")
	private WebElement exMilitary;

	@FindBy(xpath = "//div[@class='card']//div[text()='Academy Status:']")
	private WebElement academyStatus;

	@FindBy(xpath = "//div[@class='card']//div[text()='Placement Status:']")
	private WebElement placementStatus;

	@FindBy(xpath = "//div[@class='card']//div[text()='FDM Start Date:']")
	private WebElement startDate;

	@FindBy(xpath = "//div[@class='card']//div[text()='FDM Signed Off:']")
	private WebElement signedOff;

	@FindBy(xpath = "//div[@class='card']//div[text()='Client Start Date:']")
	private WebElement clientStartDate;

	@FindBy(xpath = "//div[@class='card']//div[@class='card-body']")
	private WebElement infoSection;

	public ProfilePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean isProfileNavBarDisplayed() {
		return profileNavBar.isDisplayed();
	}

	public boolean isProfileCard() {
		return profileCard.isDisplayed();
	}

	public boolean isProfileImageDisplayed() {
		return profileImage.isDisplayed();
	}

	public boolean isCardTitleDisplayed() {
		return cardTitle.isDisplayed();
	}

	public boolean isRoleFieldDisplayed() {
		return roleField.isDisplayed();
	}

	public boolean isUsernameDisplayed() {
		return username.isDisplayed();
	}

	public boolean isBioDisplayed() {
		return bio.isDisplayed();
	}

	public boolean isEmailDisplayed() {
		return email.isDisplayed();
	}

	public boolean isLocationDisplayed() {
		return location.isDisplayed();
	}

	public boolean isAreaOfResponsibilityDisplayed() {
		return areaOfResponsibility.isDisplayed();
	}

	public boolean isTeamDisplayed() {
		return team.isDisplayed();
	}

	public boolean isTeachingCoursesDisplayed() {
		return teachingCourses.isDisplayed();
	}

	public boolean isOtherSkillsDisplayed() {
		return otherSkills.isDisplayed();
	}

	public boolean isCertificationsDisplayed() {
		return certifications.isDisplayed();
	}

	public boolean isStreamDisplayed() {
		return stream.isDisplayed();
	}

	public boolean isExMilitaryDisplayed() {
		return exMilitary.isDisplayed();
	}

	public boolean isAcademyStatusDisplayed() {
		return academyStatus.isDisplayed();
	}

	public boolean isPlacementStatusDisplayed() {
		return placementStatus.isDisplayed();
	}

	public boolean isStartDateDisplayed() {
		return startDate.isDisplayed();
	}

	public boolean isSignedOffDateDisplayed() {
		return signedOff.isDisplayed();
	}

	public boolean isClientStartDateDisplayed() {
		return clientStartDate.isDisplayed();
	}

	public void select() {
		infoSection.click();

	}

	public void openUrl(String url) {
		driverGet(ConfigurationReader.getProperty("config", "indexPageURL"));
	}

}
