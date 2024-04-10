package com.fdmgroup.admins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class ImportAttendedTraineesPage extends BrowserUtilities {
	@FindBy(xpath="//*[contains(@class,'tittle')]")
	private WebElement ImportAttendedTranieesHeading;
	
	@FindBy(xpath="//*[contains(@id,'startDate')]")
	private WebElement startDateDropDown;
	
	@FindBy(xpath="//*[contains(@id,'location')]")
	private WebElement locationDropDown;
	
	@FindBy(xpath="//*[contains(@id,'pathway')]")
	private WebElement pathwayDropDown;
	
	@FindBy(xpath="//tr[2]//td[6][contains(text(),'Amelia.Robinson@fdmgroup.com')]")
	private WebElement ameliaTrainee;
	
	@FindBy(xpath="//*[contains(text(),'Aiden.Wilson@fdmgroup.com')]")
	private WebElement Aiden;
	
	@FindBy(xpath="//*[contains(text(),' Apply ')]")
	private WebElement applyBtn;
	
	@FindBy(xpath="//*[contains(text(),' Import Trainees ')]")
	private WebElement importTraineeBtn;
	
	@FindBy(xpath="//*[contains(text(),'Oops the following trainee(s) already existed in the system.')]")
	private WebElement alreadyExistedInSysValidation;
		
	@FindBy(xpath="//*[contains(@id,'dialogCancel')]")
	private WebElement popupCancelBtn;
	
	@FindBy(xpath="//*[contains(text(),' Trainee(s) Successfully Added ')]")
	private WebElement successfullyAddedMsg;
	
	@FindBy(xpath="//*[contains(text(),' OK')]")
	private WebElement okBtn;
	public ImportAttendedTraineesPage() {
		PageFactory.initElements(driver, this);
	}
	public String pageHeading()
	{
		return ImportAttendedTranieesHeading.getText();
	}
	public void clickLocationDropDown()
	{
		locationDropDown.click();
	}
	public void selectLocationFromDropDown(String Location)
	{
	Select location = new Select(locationDropDown);
	location.selectByVisibleText(Location);
	}
	public void clickPathwayDropDown()
	{
		pathwayDropDown.click();
	}
	public void selectPathwayFromDropDown(String pathway)
	{
	Select pathWay = new Select(pathwayDropDown);
	pathWay.selectByVisibleText(pathway);
	}
	public void clickStartDateDropDown()
	{
		startDateDropDown.click();
	}
	public void selectStartDateFromDropDown(String startDate)
	{
	Select location = new Select(startDateDropDown);
	location.selectByVisibleText(startDate);
	}
	public String aidenGetText()
	{
		return Aiden.getText();
	}
	public void clickApplyBtn() {
		applyBtn.click();
	}
	public void clickImportTraineeBtn() {
		importTraineeBtn.click();
	}
	public String alreadyExistedInSysValidationText()
	{
		return alreadyExistedInSysValidation.getText();
	}
	public void clickPopupCancelBtn() {
		popupCancelBtn.click();
	}
	public String successfullyAddedMsgText()
	{
		return successfullyAddedMsg.getText();
	}
	public void clickokBtn() {
		okBtn.click();
	}
	public void selectLocation()
	{
		Select location=new Select(locationDropDown);
		location.selectByVisibleText("Montreal");
	}
	public void selectPathway()
	{
		Select location=new Select(pathwayDropDown);
		location.selectByVisibleText("BA");
		
	}
	public void selectDate()
	{
		Select location=new Select(startDateDropDown);
		location.selectByVisibleText("22/03/2023");
		
	}
	public void selectLocation1()
	{
		Select location=new Select(locationDropDown);
		location.selectByVisibleText("Montreal");
	}
	public void selectPathway1()
	{
		Select location=new Select(pathwayDropDown);
		location.selectByVisibleText("BA");
		
	}
	public void selectDate1()
	{
		Select location=new Select(startDateDropDown);
		location.selectByVisibleText("30/08/2021");
		
	}
}
