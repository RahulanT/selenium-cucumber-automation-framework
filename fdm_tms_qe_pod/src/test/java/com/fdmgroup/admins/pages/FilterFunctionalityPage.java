package com.fdmgroup.admins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class FilterFunctionalityPage extends BrowserUtilities {
	public FilterFunctionalityPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[@class='bi bi-chevron-down'])[9]")
	WebElement dropDownRegion;
	
	@FindBy(xpath = "(//*[@class='button btn'])[2]")
	WebElement dropDownPathway;
	
	@FindBy(xpath = "(//*[@class='button btn'])[3]")
	WebElement dropDownCourse;
	
	@FindBy(xpath = "(//*[@class='input-checkbox'])")
	WebElement rFirstOpt;
	
	@FindBy(xpath = "(//*[@class='input-checkbox'])[2]")
	WebElement rSecOpt;
	
	@FindBy(xpath = "(//*[@class='input-checkbox'])[3]")
	WebElement rThirdOpt;
	
	@FindBy(xpath = "(//*[@class='input-checkbox'])[4]")
	WebElement pFirstOpt;
	
	@FindBy(xpath = "(//*[@class='input-checkbox'])[5]")
	WebElement pSecOpt;
	
	@FindBy(xpath = "(//*[@class='input-checkbox'])[6]") 
	WebElement pThirdOpt;
	
	@FindBy(xpath = "(//*[@class='input-checkbox'])[7]")
	WebElement cFirstOpt;
	
	public void clickRegion() {
		dropDownRegion.click();
	}
	
	public void clickPathway() {
		dropDownPathway.click();
	}
	
	public void clickCourse() {
		dropDownCourse.click();
	}
	
	public void clickAllFilter() {
		dropDownRegion.click();
		dropDownPathway.click();
		//dropDownCourse.click();
	}
	
	public boolean clickRegionIsEnable() {
		return dropDownRegion.isEnabled();
	}
	
	public void clickRegionFirstOpt() {
		rFirstOpt.click();
	}
	
	public void clickRegionSecOpt() {
		rSecOpt.click();
	}
	
	public void clickRegionThirdOpt() {
		rThirdOpt.click();
	}
	
	public void clickRegionDropdown() {
		rFirstOpt.click();
		rSecOpt.click();
		rThirdOpt.click();
	}
	
	public boolean clickFirstRegionIsEnable() {
		return rFirstOpt.isSelected();
	}
	
	public boolean clickThirdRegionIsEnable() {
		return rThirdOpt.isSelected();
	}
	
	public boolean clickPathwayIsEnable() {
		return dropDownPathway.isEnabled();
	}
	
	public void clickPathwayFirstOpt() {
		pFirstOpt.click();
	}
	
	public void clickPathwaySecOpt() {
		pSecOpt.click();
	}
	
	public void clickPathwayThirdOpt() {
		pThirdOpt.click();
	}
	
	public void clickPathwayDropdown() {
		pFirstOpt.click();
		pSecOpt.click();
		pThirdOpt.click();
	}
	
	public boolean clickFirstPathwayIsEnable() {
		return pFirstOpt.isSelected();
	}

	public boolean clickThirdPathwayIsSelected() {
		return pThirdOpt.isSelected();
	}
	
	public void clickCourseFirstOpt() {
		cFirstOpt.click();
	}
	
	public boolean clickFirstCourseIsSelected() {
		return cFirstOpt.isSelected();
	}
}

