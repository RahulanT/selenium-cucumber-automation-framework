package com.fdmgroup.trainees.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class ProfilePage extends BrowserUtilities{
	public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//a[@id='navbarDropdown']")
	public static WebElement profileTab;
	
	@FindBy(xpath = "//a[@class='dropdown-item']") // after
	public static WebElement viewResultsAndFeedbackThree;
	
	@FindBy(xpath = "//nav[@class='navbar navbar-expand-lg']")
	public static WebElement navigationBar;
	
	public ProfilePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isProfileTabDisplayed() {
		return profileTab.isDisplayed();
	}
	
	public boolean isNavbarDisplayed() {
		return navigationBar.isDisplayed();
	}
	
	public boolean isViewResultsAndFeedbackDisplayed() {
		return viewResultsAndFeedbackThree.isDisplayed();
	}
	
	public void clickDropdownArrow() throws InterruptedException {
		ProfilePage profilePage = new ProfilePage();
		profileTab.click();
		Thread.sleep(3000);
		
		profilePage.isViewResultsAndFeedbackDisplayed();
	}
	
	public void verifyFirstOption() {
		ProfilePage profilePage = new ProfilePage();
		profilePage.isViewResultsAndFeedbackDisplayed();
		
		String expectedOptionText = "View Results and Feedback";
	    String actualOptionText = viewResultsAndFeedbackThree.getText();
	    assertEquals(expectedOptionText, actualOptionText);
	}
	
	public void hoverOverViewResultsAndFeedback() throws InterruptedException {
		Actions action = new Actions(driver);
		
        action.moveToElement(viewResultsAndFeedbackThree).perform();
        Thread.sleep(3000);
	}
	
	public void verifyHighlightColor() throws InterruptedException {
		ProfilePage profilePage = new ProfilePage();
		profilePage.hoverOverViewResultsAndFeedback();
		
		String backgroundColorOnHover = viewResultsAndFeedbackThree.getCssValue("background-color");
        String expectedColor = "rgba(25, 111, 248, 0.2)";
                
        assertEquals(expectedColor, backgroundColorOnHover);
	}
	
	public void clickViewResultsAndFeedback() throws InterruptedException {
		viewResultsAndFeedbackThree.click();
		Thread.sleep(3000);
	}
	
	public void verifyBoldAndBlueHighlightText() throws InterruptedException {
		ProfilePage profilePage = new ProfilePage();
		
		profilePage.clickDropdownArrow();
		profilePage.clickViewResultsAndFeedback();
		profilePage.verifyFirstOption();
		
		String backgroundColorOnClick = viewResultsAndFeedbackThree.getCssValue("background-color");
        String expectedColorOnClick = "rgba(25, 111, 248, 0.2)";
		String fontWeight = viewResultsAndFeedbackThree.getCssValue("font-weight");
		String expectedFontWeight = "bold";
		
		assertEquals(expectedFontWeight, fontWeight);
		assertEquals(expectedColorOnClick, backgroundColorOnClick);
	}

}
