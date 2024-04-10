package com.fdmgroup.academyusers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class ProfileCardPage extends BrowserUtilities{

	Actions actions = new Actions(driver);
	@FindBy(xpath = "//h5[contains(@class, 'card-title')]")
	public static WebElement Name;
	
	@FindBy(xpath = "//img[contains(@class, 'card-img-top')]")
	public static WebElement Picture;
	

	@FindBy(xpath = "//*[text()='Profile-card']")
	private WebElement breadcrumbsProfilecard;
	
	@FindBy(xpath = "//*[text()='Profile']")
	public static WebElement NavBarProfile;
	
	@FindBy(xpath = "//*[text()='Calendar']")
	public static WebElement NavBarCalendar;
	
	@FindBy(xpath = "//*[text()='Academy Directory']")
	public static WebElement NavBarAcademyDirectory;
	
	@FindBy(xpath = "//*[text()='Academy Documents']")
	public static WebElement NavBarAcademyDocument;
	
	@FindBy(xpath = "//*[text()='Trainees']")
	public static WebElement NavBarTrainees;
	
	@FindBy(xpath = "//*[text()='Classes']")
	public static WebElement NavBarClasses;
	
	@FindBy(xpath = "//*[text()='Admin']")
	public static WebElement NavBarAdmin;
	
	@FindBy(xpath = "//ul[contains(@class, 'dropdown-menu')]")
	public static WebElement dropDownMenuForNavBar;
	
	@FindBy(xpath = "//a[text()='Admin']")
	public static WebElement ClickNavBarAdmin;
	
	@FindBy(xpath = "//a[text()='Course Catalogue']")
	public static WebElement CourseCatalogue;
	
	@FindBy(xpath = "//a[text()='All Courses']")
	public static WebElement AllCourses;
	
	public boolean getBreadCrumbsProfilecard() {
		return breadcrumbsProfilecard.isDisplayed();
	}
	
	public void breadcrumbsProfilecardClick() {
		breadcrumbsProfilecard.click();
	}	
	
//	@FindBy(xpath = "//app-profile-card//img[@class ='card-img-top mb-2 card-title']")
//	public static WebElement Picture;
	
	public ProfileCardPage() {
        PageFactory.initElements(driver, this);
    }
	
	public static WebElement xpathToSearchElement;
	
	public static WebElement elementToSearch(WebDriver driver, String elementToSearch) {
		String xpathToSearch = "//div[1][contains(text(),'" + elementToSearch + "')]";
		xpathToSearchElement = driver.findElement(By.xpath(xpathToSearch));
		return xpathToSearchElement;
	}
	
	
	public static boolean cardContent(WebDriver driver, String elementToSearch) {
		if(elementToSearch.equals("Name")) {
			return Name.isDisplayed();
		}
		else if (elementToSearch.equals("Picture")) {
			return Picture.isDisplayed();
//			return true;
		}
		else {
//			String xpathToSearch = "//div[1][contains(text(),'" + elementToSearch + "')]";
//			return driver.findElement(By.xpath(xpathToSearch)).isDisplayed();
			return elementToSearch(driver, elementToSearch).isDisplayed();
		}
	}
	
	public void hoverOverProfileOnNavBar() {
		actions.moveToElement(NavBarProfile).perform();
	}
	
	public void hoverOverCalendarOnNavBar() {
		actions.moveToElement(NavBarCalendar).perform();
	}
	
	public void hoverOverAcademyDirectoryOnNavBar() {
		actions.moveToElement(NavBarAcademyDirectory).perform();
	}
	
	public void hoverOverAcademyDocumentsOnNavBar() {
		actions.moveToElement(NavBarAcademyDocument).perform();
	}
	
	public void hoverOverTraineesOnNavBar() {
		actions.moveToElement(NavBarTrainees).perform();
	}
	
	public void hoverOverClassesOnNavBar() {
		actions.moveToElement(NavBarClasses).perform();
	}
	
	public void hoverOverAdminOnNavBar() {
		actions.moveToElement(NavBarAdmin).perform();
	}
	public void hoverOverCourseCatalogueOnNavBar() {
		actions.moveToElement(CourseCatalogue).perform();
	}
	public void clickAllCoursesUnderCourseCatalogue() {
		AllCourses.click();
	}
	public void dropDownMenuDisplayedForNavBar() {
		dropDownMenuForNavBar.isDisplayed();
	}
	public void clickOnAdminOnNavBar() {
		setExplicitWait(4);
		waitForVisibilityOf(ClickNavBarAdmin);
		ClickNavBarAdmin.click();
	}
	public void closePage() {
		driver.close();
	}
}
