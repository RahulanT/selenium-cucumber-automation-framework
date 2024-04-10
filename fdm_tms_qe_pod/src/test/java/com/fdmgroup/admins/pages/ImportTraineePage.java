package com.fdmgroup.admins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class ImportTraineePage extends BrowserUtilities {
	@FindBy (xpath="//*[contains(@type,'submit')]")
	private WebElement loginBtn;
	
	@FindBy(xpath="//*[contains(@class,'btn btn-secondary')]")
	private WebElement enabledButton;
	
	@FindBy(xpath="//*[contains(text(),' Upload Trainees Information ')]")
	private WebElement uploadFileHeading;
	
	@FindBy(xpath="//*[starts-with(@id,'file')]")
	private WebElement filetextbox;
	
	@FindBy(xpath="//*[starts-with(@id,'file')]")
	private WebElement browseBtn;
	
	@FindBy(xpath="//*[contains(@class,'btn view-trainees-btn')]")
	private WebElement backBtn;
	
	@FindBy(xpath="//*[contains(@class,'btn changeSelBtn')]")
	private WebElement okBtn;
	
	@FindBy(xpath="//*[contains(text(),'Ok')]")
	private WebElement okText;
	
	@FindBy(xpath="//*[contains(@class,'btn view-trainees-btn')]")
	private WebElement cancelBtn;
	
	@FindBy(xpath=" //*[contains(text(),'The file you uploaded is not in the right format. Please check and re-upload')]")
	private WebElement fileUploadValidation;
	
	@FindBy(xpath="//*[contains(@class,'profile-icon')]")
	private WebElement profileIcon;
	
	@FindBy(xpath="//*[contains(@class,'dropdown-item')]")
	private WebElement logoutBtn;
	
	
	public ImportTraineePage() {
		PageFactory.initElements(driver, this);
	}
	public void loginClick()
	{
		loginBtn.click();
	}
	
	public void importNewTraineesButton()
	{
		enabledButton.click();
	}
	public String uploadFileHeadingText()
	{
		return uploadFileHeading.getText();
	}
	public Boolean isTextboxDisplayed()
	{
		return filetextbox.isEnabled();
	}
	public Boolean isBrowseBtnDisplayed()
	{
		return browseBtn.isDisplayed();
	}
	public Boolean isBackBtnDisplayed()
	{
		return backBtn.isDisplayed();
	}
	public Boolean isOkBtnDisplayed()
	{
		return okBtn.isDisplayed();
	}
	public void browseBtnClick1() throws InterruptedException
	{
		browseBtn.sendKeys("C:\\Users\\SOFIA\\Downloads\\test.txt");
		Thread.sleep(1000);
		//return cancelBtn.isDisplayed();
	}
	
	public void browseBtnClick() 
	{
		System.out.println("browse buttn");
		//browseBtn.click();
		browseBtn.sendKeys("C:\\Users\\SOFIA\\Downloads\\Team9Profiles.xlsx");
		//Thread.sleep(1000);
		//return cancelBtn.isDisplayed();
	}
	public void okBtnTextClick()
	{
		okText.click();
	}
	public boolean backButtonDisplayed()
	{
		browseBtn.sendKeys("");
		 return backBtn.isDisplayed();
	}
	public String getFileUploadValidationText()
	{
		return fileUploadValidation.getText();
	}
	public void cancelBtnClick()
	{
		cancelBtn.click();
	}
	public void profileIconClick()
	{
		profileIcon.click();
	}
	public void logoutClick()
	{
		logoutBtn.click();
	}

}
