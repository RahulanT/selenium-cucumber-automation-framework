package com.fdmgroup.admins.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class CreateCohortPage extends BrowserUtilities {

	public CreateCohortPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@formcontrolname='city']")
	private WebElement cityDropDownList;

	@FindBy(xpath = "//select[@formcontrolname='pathway']")
	private WebElement pathwayDropDownList;

	@FindBy(xpath = "//input[@formcontrolname='startDate']")
	private WebElement startDateInputField;

	@FindBy(xpath = "//input[@formcontrolname='cohortCode']")
	private WebElement cohortCodeInputField;

	@FindBy(xpath = "//button[text()=' Edit ']")
	private WebElement btnEdit;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnCreateCohort;
	
	@FindBy(xpath = "//h5")
	private WebElement txtPopUpTitle;
	
	@FindBy(xpath = "//strong[text()='Cohort Code:']//following::div/p")
	private WebElement popUpCohortCode;
	
	@FindBy(xpath = "//strong[text()=' Region:']//following::div/p")
	private WebElement popUpRegion;
	
	@FindBy(xpath = "//strong[text()='City:']//following::div/p")
	private WebElement popUpCity;
	
	@FindBy(xpath = "//strong[text()='Pathway:']//following::div/p")
	private WebElement popUpPathway;
	
	@FindBy(xpath = "//strong[text()='Start Date:']//following::div/p")
	private WebElement popUpStartDate;
	
	@FindBy(xpath = "//button[text()=' OK ']")
	private WebElement popUpOkButton;
	
	
	
	

	public Boolean isCityHintTextDisplayed() {
		return cityDropDownList.isDisplayed();
	}

	public String getCityHintText() {
		Select getCityHintText = new Select(cityDropDownList);
		return getCityHintText.getFirstSelectedOption().getText();
	}

	public Boolean isPathwayHintTextDisplayed() {
		return pathwayDropDownList.isDisplayed();
	}

	public String getPathwayHintText() {
		Select getPathwayHintText = new Select(pathwayDropDownList);
		return getPathwayHintText.getFirstSelectedOption().getText();
	}

	public void selectCity(String city) {
		Select selectCity = new Select(cityDropDownList);
		selectCity.selectByVisibleText(city);
	}

	public String getCity() {
		Select getCity = new Select(cityDropDownList);
		 return getCity.getFirstSelectedOption().getText();
		
	}
	
	public String getEmptyCity() {
		Select getCity = new Select(cityDropDownList);
		
		if (getCity.getFirstSelectedOption().getText().isEmpty() || getCity.getFirstSelectedOption().getText().equalsIgnoreCase("Select City")) 
		{	String empty = "";
        	return empty;
        } 
		else 
        {
            return getCity.getFirstSelectedOption().getText();
        }
	}

	public void selectPathway(String pathway) {
		Select selectPathway = new Select(pathwayDropDownList);
		selectPathway.selectByVisibleText(pathway);
	}

	public String getPathway() {
		Select getPathway = new Select(pathwayDropDownList);
		return getPathway.getFirstSelectedOption().getText();
	}
	
	public String getEmptyPathway() {
		Select getPathway = new Select(pathwayDropDownList);
		if (getPathway.getFirstSelectedOption().getText().isEmpty() || getPathway.getFirstSelectedOption().getText().equalsIgnoreCase("Select Pathway")) 
		{	String empty = "";
            return empty;
        } 
		else 
        {
            return getPathway.getFirstSelectedOption().getText();
        }
	}

	public void setDate(String date) {

		String[] dateParts = date.split("-");

		startDateInputField.click();
		startDateInputField.clear();

		startDateInputField.sendKeys(dateParts[0]);
		startDateInputField.sendKeys(Keys.TAB);

		startDateInputField.sendKeys(dateParts[1]);

		startDateInputField.sendKeys(dateParts[2]);
	}

	public String getStartDate() {
		return startDateInputField.getAttribute("value");
	}
	
	public String getEmptyStartDate() {
		String empty = "";
        return empty;
	}

	public String getCohortCode() {
		return cohortCodeInputField.getAttribute("value");
	}

	public void clickEditButton() {
		btnEdit.click();
	}

	public Boolean isCohortCodeInputFieldEnabled() {
		return cohortCodeInputField.isEnabled();
	}

	public void setCohortCode(String newCohortCode) {

		cohortCodeInputField.click();
		cohortCodeInputField.clear();
		cohortCodeInputField.sendKeys(newCohortCode);
	}
	
	public void clickCreateCohortButton() {
		btnCreateCohort.click();
	}
	
	public String getPopUpTitle() {
		return txtPopUpTitle.getText();
	}
	
	public String getPopUpCohortCode() {
		return popUpCohortCode.getText();
	}
	
	public String getPopUpRegion() {
		return popUpRegion.getText();
	}
	
	public String getPopUpCity() {
		return popUpCity.getText();
	}
	
	public String getPopUpPathway() {
		return popUpPathway.getText();
	}
	
	public String getPopUpStartDate() {
		return popUpStartDate.getText();
	}
	
	public Boolean isOkButtonEnabled() {
		return popUpOkButton.isEnabled();
	}

}
