package com.fdmgroup.academyusers.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;

public class HomePage extends BrowserUtilities {

	@FindBy(xpath = "//h1[contains(text(), 'logged in')]")
	private WebElement txtSuccessfulLogin;
	

	@FindBy(xpath = "//*[text()='Home']")
	private WebElement breadcrumbsHome;
	
	@FindBy(xpath = "//*[text()='Profile-card']")
	private WebElement breadcrumbsProfilecard;
	
	@FindBy(xpath = "//a[contains(text(), 'Academy-directory')]")
	private static WebElement breadcrumbsAcademyDirectory;
	
//	@FindBy(xpath = "//a[contains(text(), 'Academy-directory')]")
//	private static WebElement breadcrumbsProfileCard;
	
	@FindBy(xpath = "//*[contains(@routerlink,'profile-card')]")
	private WebElement navigationBarProfile;
	
	
	@FindBy(xpath = "//a[contains(text(), 'Academy Directory')]")
	private static WebElement academyDirectoryButton;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String getTextSuccessLogin() {
		return txtSuccessfulLogin.getText();
	}

	public void openUrl(String url) {
		driverGet(ConfigurationReader.getProperty("config", "indexPageURL"));
	}
	
	public void openURLAgain() {
		driver.get(ConfigurationReader.getProperty("config", "indexPageURL"));
	}
	
	
	public static void clickOnAcademyDirectoryButton() {
		academyDirectoryButton.click();
	}
	
	public boolean getProfileDisplayedOnNavigationBar() {
		return navigationBarProfile.isDisplayed();
	}
	

	
	public boolean getBreadCrumbsHome() {
		return breadcrumbsHome.isDisplayed();
		
	}
	
	public void breadCrumbsHomeClick() {
		 breadcrumbsHome.click();
		
	}
	
	
	public void academyDirectoryClick() {
		academyDirectoryButton.click();
		
	}
	
	public boolean getBreadCrumbsProfilecard() {
		return breadcrumbsProfilecard.isDisplayed();
		
	}
	
	public void breadcrumbsProfilecardClick() {
		breadcrumbsProfilecard.click();
		
	}
	
	public void navbarProfilecardClick() {
		navigationBarProfile.click();
		
	}
	
}
