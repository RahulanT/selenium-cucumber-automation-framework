package com.fdmgroup.admins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;

public class PreviewAssessmentPage extends BrowserUtilities {
	public PreviewAssessmentPage() {
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
	
	@FindBy(xpath = "//a[@ng-reflect-router-link='/assessments']")
	private WebElement viewAssessment;
	
	@FindBy(xpath = "//*[@class='btn btn-dark']")
	private WebElement createAssessment;
	
	@FindBy(xpath = "//*[@class='btn btn-dark']")
	private WebElement previewBtn;
	
	@FindBy(xpath = "//*[@class='btn btn-dark']")
	private WebElement cancelPreviewBtn;
	
	public void clickCancelPreview() {
		cancelPreviewBtn.click();
	}
	
	public void clickPreview() {
		previewBtn.click();
	}
	
	public void clickViewAssessmentLink() {
		viewAssessment.click();
	}
	
	public void clickCreateAssessmentLink() {
		createAssessment.click();
	}

	public void clickOnLoginButton() throws InterruptedException {
//		Thread.sleep(3000);
		btnLogin.click();
	}

	public void sendUsername() {
		txtUsername.sendKeys(ConfigurationReader.getProperty("admins", "adminName"));

	}

	public void sendPassword() {
		txtPassword.sendKeys(ConfigurationReader.getProperty("admins", "adminPassword"));

	}
	public void clickOnAdminButton() throws InterruptedException {
//		Thread.sleep(3000);
		btnAdmin.click();
	}
}
