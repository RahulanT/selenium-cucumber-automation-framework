package com.fdmgroup.admins.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class EditSkillsPage extends BrowserUtilities {
	@FindBy(xpath = "//*[contains(text(),'Edit')]")
	private WebElement editBtn;
	@FindBy(xpath = "//*[contains(text(),' Skills ' )]")
	private WebElement skillsLink;
	@FindBy(xpath="//*[ contains(text(),'Hyper-V')]//*[contains(@class,'bi bi-x ng-tns-c71-1')]")
	private WebElement hyperCrossBtn;
	@FindBy(xpath="//*[ contains(@id,'skills')]")
	private WebElement skillsDropDownBox;
	@FindBy(xpath="//*[contains(text(),' APM ')]")
	private WebElement apmSkill;
	@FindBy(xpath="//*[contains(text(),'Save')]")
	private WebElement saveBtn;
	@FindBy(xpath="//*[contains(text(),' OK ')]")
	private WebElement okBtn;
	@FindBy (xpath="//*[contains(text(),'Profile Updated Successfully')]")
	private WebElement confirmMsg;

	public EditSkillsPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickEditBtn() {
		editBtn.click();
	}
	public void scrollToSkillsAfterClickEdit() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.trainee-info-container-scroll.ng-tns-c71-1').scrollTop=400");
	}
	public void skillsLinkClick2() {
		skillsLink.click();
	}
	public void hyperCrossBtnClick () {
		hyperCrossBtn.click();
	}
	public void skillsDropDownBoxClick() {
		skillsDropDownBox.click();
	}
	public void scrollToSkills() throws InterruptedException
	{
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.trainee-info-container-scroll.ng-tns-c71-1').scrollTop=600");	
	}
	public void apmClick()
	{
	 apmSkill.click();
	}
	public String getApmText()
	{
		return apmSkill.getText();
	}
	public void saveBtnClick()
	{
		saveBtn.click();
	}
	public void okBtnClick()
	{
		okBtn.click();
	}

	public String getConfirmMsgText()
	{
		return confirmMsg.getText();
	}
}
