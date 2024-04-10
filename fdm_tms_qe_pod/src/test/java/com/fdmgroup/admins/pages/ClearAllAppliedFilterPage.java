package com.fdmgroup.admins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class ClearAllAppliedFilterPage extends BrowserUtilities {
	public ClearAllAppliedFilterPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id = 'theUsername']")
	private WebElement txtUsername;

	@FindBy(xpath = "//input[@id = 'thePassword']")
	private WebElement txtPassword;

	@FindBy(xpath = "//*[@class = 'login-button']")
	private WebElement btnLogin;

	@FindBy(xpath = "(//*[@class='label'])[4]")
	private WebElement clearBtnLogin;

	@FindBy(xpath = "//*[@class='nav-link']")
	private WebElement calLink;

	public void clickCalLink() {

		calLink.click();
	}

	public void clickOnLoginButton() throws InterruptedException {

		btnLogin.click();
	}

	public void setUsername(String username) {
		txtUsername.sendKeys(username);
	}

	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void clickOnClearButton() {

		clearBtnLogin.click();
	}

	public boolean clickRegionIsEnable() {
		return clearBtnLogin.isDisplayed();
	}
}
