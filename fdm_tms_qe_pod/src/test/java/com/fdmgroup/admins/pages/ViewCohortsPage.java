package com.fdmgroup.admins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;

public class ViewCohortsPage extends BrowserUtilities {

	public ViewCohortsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id = 'theUsername']")
	private WebElement txtUsername;

	@FindBy(xpath = "//input[@id = 'thePassword']")
	private WebElement txtPassword;

	@FindBy(xpath = "//*[@class = 'login-button']")
	private WebElement btnLogin;

	@FindBy(xpath = "(//*[@class='nav-link'])[7]")
	private WebElement btnAdmin;

	@FindBy(xpath = "//a[@ng-reflect-router-link='/view-cohorts']")
	private WebElement viewCohortsLink;

	@FindBy(xpath = "(//*[@class='bi bi-arrow-down-up'])[1]")
	private WebElement sortCohortsId;

	@FindBy(xpath = "(//*[@class='bi bi-arrow-down-up'])[2]")
	private WebElement sortStartDate;

	@FindBy(xpath = "(//*[@class='bi bi-arrow-down-up'])[3]")
	private WebElement sortDuration;

	@FindBy(xpath = "(//*[@class='bi bi-funnel-fill'])[1]")
	private WebElement filterDuration;

	@FindBy(xpath = "(//*[@name='duration'])[2]")
	private WebElement filterDayDuration;

	@FindBy(xpath = "(//*[@class='bi bi-arrow-down-up'])[4]")
	private WebElement sortRegion;

	@FindBy(xpath = "(//*[@class='bi bi-funnel-fill'])[2]")
	private WebElement filterRegion;

	@FindBy(xpath = "/html/body/app-root/app-view-cohorts/div/div[2]/table/thead/tr/th[5]/div/div/div/div[2]/input")
	private WebElement filterNARegion;

	@FindBy(xpath = "(//*[@class='bi bi-arrow-down-up'])[5]")
	private WebElement sortCity;

	@FindBy(xpath = "(//*[@class='bi bi-funnel-fill'])[3]")
	private WebElement filterCity;

	@FindBy(xpath = "/html/body/app-root/app-view-cohorts/div/div[2]/table/thead/tr/th[6]/div/div/div/div[2]/input")
	private WebElement filterTorontoCity;

	@FindBy(xpath = "/html/body/app-root/app-view-cohorts/div/div[1]/div[1]/div/div/input")
	private WebElement searchPathwaysBtn;

	public void clickOnLoginButton() throws InterruptedException {

		btnLogin.click();
	}

	public void sendUsername() {
		txtUsername.sendKeys(ConfigurationReader.getProperty("admins", "adminName"));

	}

	public void sendPassword() {
		txtPassword.sendKeys(ConfigurationReader.getProperty("admins", "adminPassword"));

	}

	public void clickOnAdminButton() throws InterruptedException {

		btnAdmin.click();
	}

	public void clickViewCohortsLink() {
		viewCohortsLink.click();
	}

	public void clickSortCohortId() {
		sortCohortsId.click();
	}

	public void clickSortStartDate() {
		sortStartDate.click();
	}

	public void clickSortDuration() {
		sortDuration.click();
	}

	public void clickFilterDuration() {
		filterDuration.click();
	}

	public void clickFilterDayDuration() {
		filterDayDuration.click();
	}

	public void clickSortRegion() {
		sortRegion.click();
	}

	public void clickFilterRegion() {
		filterRegion.click();
	}

	public void clickFilterNARegion() {
		filterNARegion.click();
	}

	public void clickSortCity() {
		sortCity.click();
	}

	public void clickFilterCity() {
		filterCity.click();
	}

	public void clickFilterTorontoCity() {
		filterTorontoCity.click();
	}

	public void searchPathwayss() {
		searchPathwaysBtn.click();
	}

	public void sendPathways() {
		searchPathwaysBtn.sendKeys(ConfigurationReader.getProperty("admins", "searchPathways"));

	}
}
