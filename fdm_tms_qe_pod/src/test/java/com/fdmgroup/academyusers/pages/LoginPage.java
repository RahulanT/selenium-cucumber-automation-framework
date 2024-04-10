package com.fdmgroup.academyusers.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class LoginPage extends BrowserUtilities {
	@FindBy(xpath = "//input[@id = 'theUsername']")
	private WebElement txtUsername;

	@FindBy(xpath = "//input[@id = 'thePassword']")
	private WebElement txtPassword;

	@FindBy(xpath = "//*[@class = 'login-button']")
	private WebElement btnLogin;

	@FindBy(xpath = "//div[@class = 'error-message mt-5' and contains(text() , 'Authentication failed')]")
	private WebElement authenticationFailedMessage;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnLoginButton() throws InterruptedException{
//		Thread.sleep(3000);
		btnLogin.click();
	}

	public void setUsername(String username) {
		txtUsername.sendKeys(username);
	}

	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	public boolean isAuthenticationFailedMessageDisplayed() {
		
		return authenticationFailedMessage.isDisplayed();
	}
}
