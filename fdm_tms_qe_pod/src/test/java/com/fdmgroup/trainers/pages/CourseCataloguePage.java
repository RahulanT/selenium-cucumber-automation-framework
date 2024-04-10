package com.fdmgroup.trainers.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;

public class CourseCataloguePage extends BrowserUtilities {

	@FindBy(xpath = "(//a[contains(@class, 'nav-link') and contains(@class, 'dropdown-toggle')]") // wrapping
	private WebElement courseCatalogueTab;
//Java Development Course
	@FindBy(xpath = "//*[contains(text(),'Java Development')]")
	private WebElement JavaCourse;
	@FindBy(xpath = "//h5[contains(text(),'OOD')]")
	private WebElement OODStream;
	@FindBy(xpath = "//h5[contains(text(),'Advanced SQL')]")
	private WebElement AdvancedSQLStream;
	@FindBy(xpath = "//h5[contains(text(),'Angular Development Beginner')]")
	private WebElement AngularDevelopmentBeginnerStream;
	@FindBy(xpath = "//h5[contains(text(),'Unix')]")
	private WebElement UnixStream;
	@FindBy(xpath = "//h5[contains(text(),'Spring')]")
	private WebElement SpringStream;
	@FindBy(xpath = "//h5[contains(text(),'Web Development')]")
	private WebElement WebDevelopmentStream;

	@FindBy(xpath = "//h5[contains(text(),'Git')]")
	private WebElement GitStream;

	@FindBy(xpath = "//div[@class='row row-cols-1 row-cols-md-4 gy-4']")
	private WebElement courseCatalogueTilesJava;

	// Search bar

	@FindBy(xpath = "//*[text()='Course Catalogue']")
	private WebElement courseCatalogueLink;

	@FindBy(xpath = "//*[contains(@placeholder,'Search')]")
	private WebElement SearchBar;

	@FindBy(xpath = "//*[contains(text(),'AEM')]")
	private WebElement AEMText;

	@FindBy(xpath = "//*[text()='API Testing']")
	private WebElement APIText;

	@FindBy(xpath = "//*[text()=' Enter a minimum of 3 characters for your search query. ']")
	private WebElement errorMessage;

	@FindBy(xpath = "//*[text()=' No Courses Found ']")
	private WebElement errorMessage2;

	@FindBy(xpath = "//option[text()='Select Region']")
	private WebElement selectRegion;

	@FindBy(xpath = "//option[text()='Select Country']")
	private WebElement selectCountry;

	@FindBy(xpath = "//option[text()='Select Pathway']")
	private WebElement selectPathway;

	@FindBy(xpath = "//div[contains(@class, 'row-cols-1') and contains(@class, 'row-cols-md-4') and contains(@class, 'row-margin')]")
	private WebElement coursesLists;
	
	@FindBy(xpath = "//a[text()='Course Catalogue']")
	private WebElement courseCatalogueNav;

	@FindBy(xpath = "//div[@class='col-md-2 ml-2']//div[contains(@class,'input-group-prepend')]")
	private WebElement searchBar;

	@FindBy(xpath = "//div[@class='row gray-background-row']")
	private WebElement filterBar;

	public void getCourseCataloguePageNav() {
		courseCatalogueNav.click();
	}

	public boolean isSelectRegionFilterDisplayed() {
		return selectRegion.isDisplayed();
	}

	public boolean isSelectCountryFilterDisplayed() {
		return selectCountry.isDisplayed();
	}

	public boolean isSelectPathwayFilterDisplayed() {
		return selectPathway.isDisplayed();
	}

	public boolean isFilterBarAboveCourseTiles() {
		return filterBar.isDisplayed();
	}

	public boolean isFilterBarBackgroundColorGray() {
		String backgroundColor = filterBar.getCssValue("lightgray");
		return backgroundColor.equals(backgroundColor);
	}

	public boolean isSearchBarDisplayedInFilterBar() {
		return searchBar.isDisplayed();
	}

	public boolean isSearchBarRightAlignedAfterFilters() {
		int searchBarX = searchBar.getLocation().getX();
		int selectPathwayX = selectPathway.getLocation().getX();
		return searchBarX > selectPathwayX;
	}

	public String getRegions() {
		return selectRegion.getText();
	}

	public void selectFiltersAndCheckOrder(String regionOption, String countryOption, String pathwayOption) {
		// Select filter options
		Select regionSelect = new Select(selectRegion);
		regionSelect.selectByVisibleText(regionOption);

		Select countrySelect = new Select(selectCountry);
		countrySelect.selectByVisibleText(countryOption);

		Select pathwaySelect = new Select(selectPathway);
		pathwaySelect.selectByVisibleText(pathwayOption);
	}

	public List<WebElement> getCourseElements() {
		return coursesLists.findElements(By.tagName("li"));
	}

	public CourseCataloguePage() {
		PageFactory.initElements(driver, this);
	}

	public void getCourseCatalogueTab() {
		courseCatalogueTab.click();

	}

	public String getJavaCourse() {
		return JavaCourse.getText();
	}

	public String getOOD() {
		return OODStream.getText();
	}

	public String getAdvancedSQL() {
		return AdvancedSQLStream.getText();
	}

	public String getAngularDevelopmentBeginner() {
		return AngularDevelopmentBeginnerStream.getText();
	}

	public String getUnix() {
		return UnixStream.getText();
	}

	public String getSpring() {
		return SpringStream.getText();
	}

	public String getWebDevelopment() {
		return WebDevelopmentStream.getText();
	}

	public String getGit() {
		return GitStream.getText();
	}

	public WebElement getTiles() {
		return courseCatalogueTilesJava;
	}

	public void openUrl(String url) {
		driverGet(ConfigurationReader.getProperty("courseCatalogueURL", "browser"));
	}

	// Search bar
	public void clickCatelogLink() {
		courseCatalogueLink.click();
	}

	public void searchBarText() {
		SearchBar.sendKeys("AEM");

	}

	public void searchBarEnter() {
		SearchBar.sendKeys(Keys.ENTER);

	}

	public String getAEMText() {
		return AEMText.getText();
	}

	public void partialSearchBarText() {
		SearchBar.clear();
		SearchBar.sendKeys("API");

	}

	public String getAPIText() {
		return APIText.getText();
	}

	public void SearchBarTwoWordsText() {
		SearchBar.clear();
		SearchBar.sendKeys("Bu");
	}

	public String errorMsgText() {
		return errorMessage.getText();
	}

	public void searchBarClick() {
		SearchBar.clear();
		SearchBar.click();
	}

	public void SearchBarAnyText() {
		SearchBar.clear();
		SearchBar.sendKeys("Java");
	}

	public String errorMsgText2() {
		return errorMessage2.getText();
	}

	
}
