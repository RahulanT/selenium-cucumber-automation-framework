package com.fdmgroup.academyusers.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class LogOutFormPage extends BrowserUtilities {
	public LogOutFormPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id = 'theUsername']")
	private WebElement txtUsername;

	@FindBy(xpath = "//input[@id = 'thePassword']")
	private WebElement txtPassword;

	@FindBy(xpath = "//*[@class = 'login-button']")
	private WebElement btnLogin;

	@FindBy(xpath = "//*[@class='profile-icon']")
	private WebElement profileIcon;

	@FindBy(xpath = "//*[@class='dropdown-item']")
	private WebElement logOutBtn;

	public void clickOnLoginButton() throws InterruptedException {
//		Thread.sleep(3000);
		btnLogin.click();
	}

	public void setUsername(String username) {
		txtUsername.sendKeys(username);
	}

	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void clickOnProfile() {

		profileIcon.click();
	}

	public void clickLogOut() {

		logOutBtn.click();
	}
}
