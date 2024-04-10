package com.fdmgroup.admins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class ClearEachFilterPage extends BrowserUtilities {
	public ClearEachFilterPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='label']")
	WebElement dropDownRegion;

	@FindBy(xpath = "(//*[@class='label'])[2]")
	WebElement dropDownPathway;

	@FindBy(xpath = "(//*[@class='label'])[3]")
	WebElement dropDownCourse;
	
	@FindBy(xpath = "//*[@class='bi bi-eraser']")
	WebElement clearEraser;
	
	@FindBy(xpath = "//*[@class='bi bi-eraser-fill']")
	WebElement clearEraserPathway;
	
	@FindBy(xpath = "(//*[@class='bi bi-eraser-fill'])[2]")
	WebElement clearEraserCourse;
	
	@FindBy(xpath = "(//*[@class='input-checkbox'])[4]")
	WebElement bapmField;
	
	@FindBy(xpath = "(//*[@class='input-checkbox'])[7]")
	WebElement aemField;

	public void clickRegion() {
		dropDownRegion.click();
	}

	public void clickPathway() {
		dropDownPathway.click();
	}

	public void clickCourse() {
		dropDownCourse.click();
	}
	
	public void clickEraser() {
		clearEraser.click();
	}
	
	public void clickEraserPathway() {
		dropDownPathway.click();
	}
	
	public void clickEraserCourse() {
		aemField.click();
	}
	
	public boolean clickRegionIsEnable() {
		return dropDownRegion.isEnabled();
	}
	
	public void clickBAPM() {
		bapmField.click();
	}
	
	public void clickAEM() {
		aemField.click();
	}
}
