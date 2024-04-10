package com.fdmgroup.admins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class CreateGradeScalePage extends BrowserUtilities {

	public CreateGradeScalePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div/label")
	private WebElement GradeScaleNameLabel;
	
	@FindBy(xpath = "//input[@formcontrolname='gradeScaleName']" )
	private WebElement GradeScaleNameInput;

	@FindBy(xpath = "//input[@formcontrolname='maxPoints']" )
	private WebElement MaxPointsInput;
	
	@FindBy(xpath = "//input[@formcontrolname='distinction']" )
	private WebElement DistintionValueInput;
	
	@FindBy(xpath = "//input[@formcontrolname='distinctionPercentage']" )
	private WebElement DistintionPercentageInput;
	
	@FindBy(xpath = "//input[@formcontrolname='merit']" )
	//@FindBy(xpath = "//div[@class='col-md-5']")
	private WebElement MeritValueInput;
	
	@FindBy(xpath = "//input[@formcontrolname='meritPercentage']" )
	private WebElement MeritPercentageInput;
	
	@FindBy(xpath = "//input[@formcontrolname='pass']" )
	private WebElement PassValueInput;
	
	@FindBy(xpath = "//input[@formcontrolname='passPercentage']" )
	private WebElement PassPercentageInput;
	
//	@FindBy(xpath = "//input[@formcontrolname='region']" )
	@FindBy(xpath = "//select[@id='region']" )
	private WebElement dropdownListRegion;
	
//	@FindBy(xpath = "//input[@formcontrolname='status']" )
	@FindBy(xpath = "//select[@id='status']" )
	private WebElement dropdownListStatus;
	
	@FindBy(xpath = "//button[@id='createButton']" )
	private WebElement createButton;
	
	@FindBy(xpath = "//div[@class='modal-content']")
	private WebElement gradeScaleCreationPopup;
	
	
	public String getPercentageField (String fieldName) {
		
		String fieldValue = "" ;
		
		switch (fieldName) {
		  case "Merit":
			  fieldValue = MeritPercentageInput.getAttribute("value");
		    break;
		  case "Pass":
			  fieldValue = PassPercentageInput.getAttribute("value");
			break;
		  case "Distinction":
			  fieldValue = DistintionPercentageInput.getAttribute("value");
			break;
		}
		
		return fieldValue;
		
	}
	
	public String getGradeValueField (String fieldName) {
		
		String fieldValue = "" ;
		
		switch (fieldName) {
		  case "Merit":
			  fieldValue = MeritValueInput.getAttribute("value");
		    break;
		  case "Pass":
			  fieldValue = PassValueInput.getAttribute("value");
			break;
		  case "Distinction":
			  fieldValue = DistintionValueInput.getAttribute("value");
			break;
		}
		
		return fieldValue;
		
	}
	
	
	public void changeNumericalGradeValue (String fieldName , String fieldValue) {
		
		switch (fieldName) {
		  case "Merit":
			  MeritValueInput.clear();
			  MeritValueInput.sendKeys(fieldValue);
		    break;
		  case "Pass":
			  PassValueInput.clear();
			  PassValueInput.sendKeys(fieldValue);
			break;
		  case "Distinction":
			  DistintionValueInput.clear();
			  DistintionValueInput.sendKeys(fieldValue);
			break;
		}
		
	}
	
	public void changePercentageGradeValue (String fieldName , String fieldValue) {
		
		switch (fieldName) {
		  case "Merit":
			  MeritPercentageInput.clear();
			  MeritPercentageInput.sendKeys(fieldValue);
		    break;
		  case "Pass":
			  PassPercentageInput.clear();
			  PassPercentageInput.sendKeys(fieldValue);
			break;
		  case "Distinction":
			  DistintionPercentageInput.clear();
			  DistintionPercentageInput.sendKeys(fieldValue);
			break;
		}
		
	}
	
	public boolean percentageFieldIsPopulated() {
		
		System.out.println(PassPercentageInput.getAttribute("value"));
		
		return PassPercentageInput.getAttribute("value").isBlank()== false
				&& MeritPercentageInput.getAttribute("value").isBlank() == false
				&& DistintionPercentageInput.getAttribute("value").isBlank() == false; 
	}
	
	
	public boolean meritFieldIsFilled() {
		setExplicitWait(4);
		waitForVisibilityOf(MeritValueInput);
		System.out.println("value is :" + MeritValueInput.getAttribute("value"));
		return MeritValueInput.getAttribute("value").isBlank();
	}
	
	
	public boolean distinctionFieldIsFilled() {
		return DistintionValueInput.getText().isBlank();
	}
	
	public boolean isDisplayedGradeScaleCreationPopup() {
		return gradeScaleCreationPopup.isDisplayed();
	}
	
	public void clickGradeScaleSubmit() {
		createButton.click();
	}
	
	
	public boolean isEnabledGradeScaleSubmit() {
//		setExplicitWait(4);
//		waitForVisibilityOf(createButton);
		try {
			Thread.sleep(2);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return createButton.isEnabled();
	}
	
	public void setPassMarkValue( String string ) {
		PassValueInput.clear();
		PassValueInput.sendKeys(string);
		
	}
	
	public void setMaxPointsValue( String string ) {
		
		MaxPointsInput.sendKeys(string);
		
	}
	
	public void setGradeScaleName( String name ) {
		
		GradeScaleNameInput.sendKeys(name);
		
	}
	
	public void selectRegionDropdown(String regionName) {
		Select selectPathwayOwner = new Select(dropdownListRegion);
		selectPathwayOwner.selectByVisibleText(regionName);
	}
	
	public void selectStatusDropdown(String statusName) {
		Select selectPathwayOwner = new Select(dropdownListStatus);
		selectPathwayOwner.selectByVisibleText(statusName);
	}
}
