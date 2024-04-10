package com.fdmgroup.academyusers.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;


public class AcademyDirectoryPage extends BrowserUtilities{
	
	@FindBy(xpath = "//th[1][contains(@scope, 'col')]")
	static WebElement Name;
	
	@FindBy(xpath = "//th[2][contains(@scope, 'col')]")
	static WebElement Location;
	
	@FindBy(xpath = "//th[3][contains(@scope, 'col')]")
	static WebElement Team;
	
	@FindBy(xpath = "//th[4][contains(@scope, 'col')]")
	static WebElement Course;
	
	@FindBy(xpath="//tr//td[1]")
	static List<WebElement> Names;
	
	@FindBy(xpath = "//th[1]//i[1][contains(@class, 'bi')]")
	static WebElement SortByNameIcon;
	
	@FindBy(xpath = "//th[2]//i[2][contains(@class,'bi')]")
	static WebElement FilterByLocation;
	
	@FindBy(xpath = "//th[3]//i[2][contains(@class,'bi')]")
	static WebElement FilterByTeam;
	
	@FindBy(xpath = "//th[4]//i[2][contains(@class,'bi')]")
	static WebElement FilterByCourse;
	
	@FindBy(xpath = "//select[contains(@ng-reflect-model,'location')]")
	static WebElement FilterByLocationSelect;
	
	@FindBy(xpath = "//select[contains(@ng-reflect-model,'team')]")
	static WebElement FilterByTeamSelect;
	
	@FindBy(xpath = "//select[contains(@ng-reflect-model,'course')]")
	static WebElement FilterByCourseSelect;
	
	@FindBy(xpath = "//input[contains(@class, 'filter')]")
	static WebElement FilterInput;
	
	@FindBy(xpath = "//tr//td[2]")
	static WebElement FirstLocation;
	
	@FindBy(xpath = "//tr//td[3]")
	static WebElement FirstTeam;
	
	@FindBy(xpath = "//tr//td[4]")
	static WebElement FirstCourse;
	
	@FindBy(xpath = "//a[contains(text(), 'Academy-directory')]")
	static WebElement breadcrumbsAcademyDirectory;
	
	public static void clickOnAcademyDirectoryBreadcrumb() {
		breadcrumbsAcademyDirectory.click();
	}
	
	public AcademyDirectoryPage() {
		PageFactory.initElements(driver, this);
	}

	public static String getName() {
		return Name.getText();
	}
	
	public static String getLocation() {
		return Location.getText();
	}
	
	public static String getTeam() {
		return Team.getText();
	}
	
	public static String getCourse() {
		return Course.getText();
	}
	
	
	public ArrayList<String> expectedNames(){
		ArrayList<String> expectedNames = new ArrayList<String>();
		for(WebElement name : Names) {
			expectedNames.add(name.getText());
		}
		Collections.sort(expectedNames,Collections.reverseOrder());
		return expectedNames;
	}
	
	public ArrayList<String> actualNames(){
		ArrayList<String> actualNames = new ArrayList<String>();
		for(WebElement names : Names) {
			actualNames.add(names.getText());
		}
		return actualNames;
	}
	
	public int trainerNum() {
		ArrayList<String> actualNames = new ArrayList<String>();
		for(WebElement names : Names) {
			actualNames.add(names.getText());
		}
		return actualNames.size();
	}
	
	public void clickSortByNameIcon() {
		SortByNameIcon.click();
	}
	
	public void filterByLocationClick() {
		FilterByLocation.click();
	}
	public boolean locationSelectionIsDisplayed() {
		return FilterByLocationSelect.isDisplayed();
	}
	
	public void filterByTeamClick() {
		FilterByTeam.click();
	}
	public boolean TeamSelectionIsDisplayed() {
		return FilterByTeamSelect.isDisplayed();
	}
	
	public void filterByCourseClick() {
		FilterByCourse.click();
	}
	
	public boolean CourseSelectionIsDisplayed() {
		return FilterByCourseSelect.isDisplayed();
	}

	public void setInputMessage(String message) {
		FilterInput.sendKeys(message);
	}
	
	public int checkTableSize() {
		return Names.size();
	}
	
	public String LocationAfterFilter() {
		return FirstLocation.getText();
	}
	
	public String TeamAfterFilter() {
		return FirstTeam.getText();
	}
	
	public String CourseAfterFilter() {
		return FirstCourse.getText();
	}
	
	public void clearInput() {
		FilterInput.clear();
	}
	
	


	
//	public static WebElement sortByName(WebDriver driver) {
//		return driver.findElement(By.xpath("//th[2]//i[1][contains(@class, 'bi')]"));
//	}
////	
//	public static WebElement filterByLocation(WebDriver driver) {
//		return driver.findElement(By.xpath("//th[2]//i[2][contains(@class,'bi')]"));
//	}
//	
//	public static WebElement filterByTeam(WebDriver driver) {
//		return driver.findElement(By.xpath("//th[3]//i[2][contains(@class,'bi')]"));
//	}
//	
//	public static WebElement filterByCourses(WebDriver driver) {
//		return driver.findElement(By.xpath("//th[4]//i[2][contains(@class,'bi')]"));
//	}
//	
//	public static WebElement filterName(WebDriver driver, String filtedBy) {
//		String xpath;
//		xpath = "//select[contains(@ng-reflect-model,'" + filtedBy + "')]";
//		return driver.findElement(By.xpath(xpath));
//	}
	
	
	//click method
}
