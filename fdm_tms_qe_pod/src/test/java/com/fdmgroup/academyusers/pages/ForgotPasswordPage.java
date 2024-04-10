package com.fdmgroup.academyusers.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;

public class ForgotPasswordPage extends BrowserUtilities {
	@FindBy(xpath = "//*[@class='text-body']")
	WebElement lnkForgotPassword;

	@FindBy(xpath = "//p[contains(text(),'Training Management System')]")
	WebElement titleHomePage;  //homepagetitle

	@FindBy(xpath = "//*[@class='lead mb-0 me-3 login-title']")
	WebElement forgotPasswordHomePage;

	@FindBy(xpath = "//*[@name='primaryEmail']")
	WebElement fieldEmailAddress;

	@FindBy(xpath = "//*[@name='theVerifyEmail']")
	WebElement fieldConfirmEmailAddress;

	@FindBy(xpath = "//*[@class='login-button']")
	WebElement btnReqNewPassword;

	@FindBy(xpath = "//*[@class='text-body']")
	WebElement btnBackToLogin;

	@FindBy(xpath = "(//*[@class='error-message'])[2]")
	WebElement errorMessage;

	public ForgotPasswordPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickLinkForgotPasswordPage() {
		lnkForgotPassword.click();
	}

	public String getTxtTitleHomePage() {
		return titleHomePage.getText();
	}

	public String getTxtForgotPasswordHomePage() {
		return forgotPasswordHomePage.getText();
	}

	public boolean clickFieldEmailAddress() {
		fieldEmailAddress.click();
		return true;
	}

	public boolean clickFieldEmailAddressIsEnable() {
		return fieldEmailAddress.isEnabled();
	}

	public boolean sendFieldEmailAddress() {
		fieldEmailAddress.sendKeys(ConfigurationReader.getProperty("config", "testEmailInput"));
		return true;
	}

	public boolean sendValidFieldEmailAddress() {
		fieldEmailAddress.sendKeys(ConfigurationReader.getProperty("config", "testValidEmailInput"));
		return true;
	}

	public boolean clickFieldConfirmEmailAddress() {
		fieldConfirmEmailAddress.click();
		return true;
	}
	
	public boolean sendValidConfirmEmailAddress() {
		//setExplicitWait(Integer.parseInt(ConfigurationReader.getProperty("Duration")));
		//waitForVisibilityOf(fieldEmailAddress);
		fieldConfirmEmailAddress.sendKeys(ConfigurationReader.getProperty("config", "testValidEmailInput"));
		return true;
	}

	public String getFieldEmailInput() {
		return fieldEmailAddress.getText();
	}

	public String getConfirmFieldEmailInput() {
		return fieldConfirmEmailAddress.getText();
	}

	public boolean isClickableBtnReqNewPassword() {
		btnReqNewPassword.click();
		return true;
	}

	public boolean clickBtnReqNewPassword() {
		btnReqNewPassword.click();
		return true;
	}

	public boolean clickBtnReqNewPasswordIsEnable() {
		return btnReqNewPassword.isEnabled();
	}

	public boolean clickBtnBackToLogin() {
		btnBackToLogin.click();
		return true;
	}

	public String getTxtErrorMessage() {
		return errorMessage.getText();
	}
}