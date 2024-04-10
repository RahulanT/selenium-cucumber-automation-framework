package com.fdmgroup.admins.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;

public class PathwayHomePage extends BrowserUtilities {

	public PathwayHomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//table[@class='table table-striped custom-table']//tbody")
	private WebElement pathwayTable;

	@FindBy(xpath = "//td[text()='Java Development']//following-sibling::td/div/div")
	private WebElement pathwayColor;

	@FindBy(xpath = "//th[text()='Pathway Owner ']//button")
	private WebElement btnPathwayOwnerSorting;

	@FindBy(xpath = "//th[text()='Pathway Length(w) ']//button")
	private WebElement btnPathwayLengthSorting;
	
	@FindBy(xpath = "//th[text()='Region/Country ']//button[2]")
	private WebElement btnRegionSorting;
	
	@FindBy(xpath = "//th[text()='Region/Country ']//button[1]")
	private WebElement btnRegionFilter;
	
	@FindBy(xpath = "//legend[text()='Select Region']")
	private WebElement popupRegionFilter;
	
	@FindBy(xpath = "//label[text()=' NA ']/input")
	private WebElement popupRegionFilterOption;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement searchBar;
	
	@FindBy(xpath = "//button[text()=' Create Pathway ']")
	private WebElement btnCreatePathway;
	
	@FindBy(xpath = "//h2[text()='Create Pathway']")
	private WebElement pageCreatePathway;
	
	
	

	public Boolean isDataExist(String tableData) {
		List<WebElement> rows = pathwayTable.findElements(By.tagName("tr"));

		for (WebElement row : rows) {

			List<WebElement> data = row.findElements(By.tagName("td"));

			for (WebElement information : data) {

				if (information.getText().contains(tableData)) {
					return true;
				}

			}

		}
		return false;

	}

	public Boolean checkPathwayColorCode() {
		return pathwayColor.getAttribute("style").contains(ConfigurationReader.getProperty("admins", "redColorCode"));
	}

	public Boolean isPathwayOwnerSortingButtonExist() {
		return btnPathwayOwnerSorting.isDisplayed();
	}

	public void clickPathwayOwnerSortingButton() {
		btnPathwayOwnerSorting.click();
	}

	public Boolean sortPathwayOwners() {
		List<WebElement> rows = pathwayTable.findElements(By.tagName("tr"));

		String[] targetNames = { "Bruce Wayne", "Clark Kent", "Peter Parker" };

		for (int rowIndex = 0; rowIndex < targetNames.length; rowIndex++) {
			WebElement row = rows.get(rowIndex);
			List<WebElement> data = row.findElements(By.tagName("td"));

			WebElement information = data.get(2);

			if (!information.getText().contains(targetNames[rowIndex])) {

				return false;
			}

		}
		return true;
	}

	public Boolean isPathwayLengthSortingButtonExist() {
		return btnPathwayLengthSorting.isDisplayed();
	}

	public void clickPathwayLengthSortingButton() {
		btnPathwayLengthSorting.click();
	}

	public Boolean sortPathwayLength() {
		List<WebElement> rows = pathwayTable.findElements(By.tagName("tr"));

		String[] targetWeeks = { "5", "10", "15" };

		for (int rowIndex = 0; rowIndex < targetWeeks.length; rowIndex++) {
			WebElement row = rows.get(rowIndex);
			List<WebElement> data = row.findElements(By.tagName("td"));

			WebElement information = data.get(4);
			if (!information.getText().toString().equals(targetWeeks[rowIndex])) {

				return false;
			}

		}
		return true;
	}
	
	public Boolean isRegionSortingButtonExist() {
		return btnRegionSorting.isDisplayed();
	}

	public void clickRegionSortingButton() {
		btnRegionSorting.click();
	}
	
	public Boolean sortRegions() {
		List<WebElement> rows = pathwayTable.findElements(By.tagName("tr"));

		String[] targetRegions = { "APAC/Australia", "NA/Canada", "NA/United States" };

		for (int rowIndex = 0; rowIndex < targetRegions.length; rowIndex++) {
			WebElement row = rows.get(rowIndex);
			List<WebElement> data = row.findElements(By.tagName("td"));

			WebElement information = data.get(5);
			
			if (!information.getText().contains(targetRegions[rowIndex])) {

				return false;
			}

		}
		return true;
	}
	
	public Boolean isRegionFilterButtonExist() {
		return btnRegionFilter.isDisplayed();
	}

	public void clickRegionFilterButton() {
		btnRegionFilter.click();
	}
	
	public Boolean isRegionFilterPopupExist() {
		return popupRegionFilter.isDisplayed();
	}
	
	public void clickFilterOption() {
		popupRegionFilterOption.click();
	}
	
	public Boolean filterRegions() {
		List<WebElement> rows = pathwayTable.findElements(By.tagName("tr"));

		String[] targetRegions = { "NA/United States", "NA/Canada" };

		for (int rowIndex = 0; rowIndex < targetRegions.length; rowIndex++) {
			WebElement row = rows.get(rowIndex);
			List<WebElement> data = row.findElements(By.tagName("td"));

			WebElement information = data.get(5);
			
			if (!information.getText().contains(targetRegions[rowIndex])) {

				return false;
			}

		}
		return true;
	}
	
	public String getSearchNameHintText() {
		return searchBar.getAttribute("placeholder");
	}
	
	public void setSearchPathwayName(String searchName) {
		searchBar.clear();
		searchBar.sendKeys(searchName);
	}
	
	public Boolean isCreatePathwayButtonExist() {
		return btnCreatePathway.isDisplayed();
	}
	
	public void clickCreatePathwayButton() {
		btnCreatePathway.click();
	}
	
	public Boolean isCreatePathwayPageExist() {
		return pageCreatePathway.isDisplayed();
	}

}
