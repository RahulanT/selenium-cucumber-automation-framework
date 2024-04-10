package com.fdmgroup.admins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class DateFormatPage extends BrowserUtilities{
	@FindBy(xpath="//*[contains(text(),' 01-Jan-2023 ')]")
	private WebElement date;
	public DateFormatPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String getDateText()
	{
		return date.getText();
	}
	
}
