package com.fdmgroup.courseowners.pages;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;

public class CourseMaterialPage extends BrowserUtilities {

	@FindBy(xpath = "//button[@class = 'card-footer bg-transparent'][1]")
	private WebElement buttonOOD;

	@FindBy(xpath = "//h2[contains(text(), 'OOD')]")
	private WebElement txtOOD;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-course-catalog/div[5]/div/div[2]/app-course-catalog-card/div/button")
	private WebElement buttonSQL;
	
	@FindBy(xpath = "//h2[contains(text(), 'Advanced SQL')]")
	private WebElement txtAdvancedSQL;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-course-catalog/div[5]/div/div[3]/app-course-catalog-card/div/button")
	private WebElement buttonAngularDevelopmentBeginner;
	
	@FindBy(xpath = "//h2[contains(text(), 'Angular Development Beginner')]")
	private WebElement txtAngularDevelopmentBeginner;
	
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-course-catalog/div[5]/div/div[4]/app-course-catalog-card/div/button")
	private WebElement buttonUnix;
	
	@FindBy(xpath = "//h2[contains(text(), 'Unix')]")
	private WebElement txtUnix;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-course-catalog/div[5]/div/div[5]/app-course-catalog-card/div/button")
	private WebElement buttonSpring;
	
	@FindBy(xpath = "//h2[contains(text(), 'Spring')]")
	private WebElement txtSpring;
	@FindBy(xpath = "/html/body/app-root/div/div/app-course-catalog/div[5]/div/div[6]/app-course-catalog-card/div/button")
	private WebElement buttonWebDevelopment;
	
	@FindBy(xpath = "//h2[contains(text(), 'Web Development')]")
	private WebElement txtWebDevelopment;
	
	@FindBy(xpath = "/html/body/app-root/div/div/app-course-catalog/div[5]/div/div[7]/app-course-catalog-card/div/button")
	private WebElement buttonGit;
	
	@FindBy(xpath = "//h2[contains(text(), 'Git')]")
	private WebElement txtGit;
	@FindBy(xpath = "/html/body/app-root/div/div/app-course-material/div[2]/div[2]/table")
	private WebElement dataTable;
	
	@FindBy(xpath = "//input[@type = 'checkbox']")
	private WebElement checkBox;

	@FindBy(xpath = "//tr")
	private List<WebElement> txtTableRows;

	@FindBy(xpath = "//table[@class='table table-hover custom-table']")
	private WebElement txtTableHover;

	@FindBy(xpath = "//tbody//tr[1]//td[2]//a[@id = 'editFileLink']")
	private WebElement editFileNameIcon;
	
	@FindBy(xpath = "//tbody//tr[1]//td[2]//p")
	private WebElement firstRowFileName;
	
	
	
	
	public CourseMaterialPage() {
		PageFactory.initElements(driver, this);

	}

	public void clickOODMaterialButton() {
		buttonOOD.click();

	}
	
	public void clickSQLMaterialButton() {
		buttonSQL.click();

	}
	public void clickbuttonAngularDevelopmentBeginnerButton() {
		buttonAngularDevelopmentBeginner.click();

	}
	public void clickUnixButton() {
		buttonUnix.click();

	}
	public void clickSpringButton() {
		buttonSpring.click();

	}
	public void clickWebDevelopmentButton() {
		buttonWebDevelopment.click();

	}
	public void clickGitButton() {
		buttonGit.click();

	}

	public String getOODMaterial() {
		return txtOOD.getText();
	}

	
	public String getAdvancedSQLMaterial() {
		return txtAdvancedSQL.getText();
	}
	public String getAngularDevelopmentBeginner() {
		return txtAngularDevelopmentBeginner.getText();
	}
	public String getUnix() {
		return txtUnix.getText();
	}
	
	public String getSpring() {
		return txtSpring.getText();
	}
	public String getWebDevelopment() {
		return txtWebDevelopment.getText();
	}
	
	public String getGit() {
		return txtGit.getText();
	}
	public String getDataTable() {
		return dataTable.getText();
	}
	public void checkRow() {
		checkBox.click();

	}

	public void getBackgroundColour() {
		Actions action = new Actions(driver);
		action.moveToElement(checkBox).perform();
		String backgroundColor = checkBox.getCssValue("background-color");
		String expectedColor = "rgba(0, 0, 0, 0)";
		assertEquals(backgroundColor, expectedColor);
		
	}

	public void getHoverBackgroundColour() {
		Actions action = new Actions(driver);
		action.moveToElement(txtTableHover).perform();
		String bgcolor = txtTableHover.getCssValue("background-color");
		String expectedColor = "rgba(0, 0, 0, 0)";
		assertEquals(bgcolor, expectedColor);

	}

	public void openUrl(String url) {
		driverGet(ConfigurationReader.getProperty("courseowners", "browser"));
	}
	
	public void hoverOverFirstFileName() {
		Actions actions = new Actions(driver);
		actions.moveToElement(firstRowFileName).perform();
		
	}

	
	public boolean renameOptionIsAvailable() {
		
		return editFileNameIcon.isDisplayed();
		
	}
	
	public void clickRenameIcon() {
		
		 editFileNameIcon.click();
		
	}
	public void sendKeysToRenameFile( String string ) {
		
		firstRowFileName.sendKeys(string);
		
	}
	public void clickInEmptySpace() {
		driver.findElement(By.xpath("//html")).click();

	}
	public String getFileName() {
		return firstRowFileName.getText();
	}
	public void setFileName(String string) {
		firstRowFileName.clear();
		firstRowFileName.sendKeys(string);;
	}
	
}

