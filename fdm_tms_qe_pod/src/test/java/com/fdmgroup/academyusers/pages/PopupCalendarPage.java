package com.fdmgroup.academyusers.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class PopupCalendarPage extends BrowserUtilities {
	public PopupCalendarPage() {
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

	@FindBy(xpath = "//*[@class='bi bi-calendar3']")
	private WebElement popup;

	@FindBy(xpath = "(//*[@class='mat-mdc-focus-indicator'])[2]")
	private WebElement leftIndicator;

	

	public void clickLeftIndicator() {

		leftIndicator.click();
	}

	public void clickPopupLink() {

		popup.click();
	}

	public boolean clickPopupIsEnable() {
		return popup.isDisplayed();
	}

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

}
