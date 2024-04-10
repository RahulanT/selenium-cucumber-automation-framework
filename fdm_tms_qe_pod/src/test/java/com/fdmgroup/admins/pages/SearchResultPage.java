package com.fdmgroup.admins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class SearchResultPage extends BrowserUtilities {
	@FindBy (xpath="//*[contains(@type,'submit')]")
	private WebElement loginBtn;
	@FindBy(xpath="//*[contains(text(),'Admin')]")
	private WebElement adminTab;
	@FindBy(xpath="//*[contains(text(),'Import Trainees')]")
	private WebElement importTraineesLink;
	@FindBy(xpath="//*[contains(@id,'searchtext')]")
	private WebElement searchTextBox;
	@FindBy(xpath="//*[contains(text(),' 0 result')]")
	private WebElement zeroResultText;
	@FindBy(xpath="//*[contains(text(),' 8 results')]")
	private WebElement zeroResultText1;
	@FindBy(xpath="//*[contains(text(),' 9 results')]")
	private WebElement zeroResultText2;
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	public void loginClick()
	{
		loginBtn.click();
	}
	public void adminTabClick()
	{
		adminTab.click();
	}
	public void importTraineesClick()
	{
		importTraineesLink.click();
	}
	public void sendTextToSearchBox()
	{
		searchTextBox.sendKeys("avv");
	}
	public String zeroResultTextGet()
	{
		return zeroResultText.getText();
	}
	public void sendTextToSearchBox1()
	{
		searchTextBox.clear();
		searchTextBox.sendKeys("ha");
	}
	public String zeroResultTextGet1()
	{
		return zeroResultText1.getText();
	}
	public void sendTextToSearchBox2()
	{
		searchTextBox.clear();
		searchTextBox.sendKeys("jo");
	}
	public String zeroResultTextGet2()
	{
		return zeroResultText2.getText();
	}
}
