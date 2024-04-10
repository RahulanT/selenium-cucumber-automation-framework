package com.fdmgroup.admins.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class AssessmentHomePage extends BrowserUtilities {
			public AssessmentHomePage() {
				PageFactory.initElements(driver, this);
			}
		
		//1st Scenario & 2nd Scenario
		@FindBy(xpath="//li[@class='breadcrumb-item active']")
		private WebElement assessmentHomePageLable;
		
		@FindBy(xpath="//tbody/tr")
		private List<WebElement> assessmentList;
		
		//3rd Scenario
		@FindBy(xpath="//input[@placeholder='Search Name']")
		private WebElement searchTextBox;
		
		@FindBy(xpath="//td[1]")
		private WebElement searchAssessmentName;
		
		//4th Scenario
		@FindBy(xpath="//td[normalize-space()='AWS']")
		private WebElement lastAssessmentName;
		
		//5th Scenario
		@FindBy(xpath="//i[@class='bi-arrow-down-up cursor-pointer bi-caret-up-fill']")
		private WebElement sortButton;
		
		@FindBy(xpath="//tr/td[5]")
		private List<WebElement> createdByNames;
		
		//6th Scenario
		@FindBy(xpath="//i[@class='bi bi-funnel-fill cursor-pointer']")
		private WebElement filterButton;
		
		@FindBy(xpath="(//input[@type='checkbox'])[3]")
		private WebElement cloudCheckbox;
		
		@FindBy(xpath="(//button[@type='button'])[1]")
		private WebElement closedButton;
		
		@FindBy(xpath="//tr//td[4]")
		private List<WebElement> gradeScale;
		
		@FindBy(xpath="//tbody/tr/td[6]/div[1]/a[2]")
		private List<WebElement> deleteButtonList;
		
		@FindBy (xpath="(//a[@class='btn btn-link'][normalize-space()='Delete'])[1]")
		private WebElement deleteButtonFirst;
		
		@FindBy (xpath="//p[normalize-space()='Are you sure you want to delete this template?']")
		private WebElement dialogueBoxMessageofDelete;
		
		@FindBy (xpath="//button[normalize-space()='OK']")
		private WebElement confirmaDeleteButton;
	
		
		
		public String assessmentPageLable() {
			return assessmentHomePageLable.getText();
		}
		
		public Integer totalAssessmentList() {
			return assessmentList.size();
		}
		
		public void printAssessmentList() {
			for(WebElement assessment : assessmentList) {
				System.out.println(assessment.getText());
			}	
		}
		
		public void searchAssessment(String name) {
			searchTextBox.sendKeys(name);
		}
		
		public String getAssessmentName() {
			return searchAssessmentName.getText();
		}
		
		public void scrollDownTable() {
			javascriptExecuteScript("window.scroll(0,200)");
			javascriptExecuteScript("document.querySelector('.table-responsive').scrollTop=500");	
		}
		
		public String lastAssessmentName() {
			return lastAssessmentName.getText();
		}
		
		public void clickSortButton() {
			sortButton.click();
		}
		
		public ArrayList<String> expectedList(){
			ArrayList<String> expectedNames = new ArrayList<String>();
			for(WebElement names : createdByNames) {
				expectedNames.add(names.getText());
			}
			Collections.sort(expectedNames,Collections.reverseOrder());
			return expectedNames;
		}
		
		public ArrayList<String> actualList(){
			ArrayList<String> actualNames = new ArrayList<String>();
			for(WebElement names : createdByNames) {
				actualNames.add(names.getText());
			}
			return actualNames;
		}
		
		public void clickOnFilter() {
			filterButton.click();
		}
		
		public void selectFilter() {
			cloudCheckbox.click();
		}
		
		public void closedButton() {
			closedButton.click();
		}
		
		public String getGradeScale() {
			return gradeScale.get(0).getText();
		}
		
		public boolean isDeleteButtonDisplayed() {
			boolean present = true;
			for(WebElement deleteButton : deleteButtonList) {
				 present = deleteButton.isDisplayed();
			}
			return present;
		}
		
		public void clickOnFirstDeleteButton() {
			 deleteButtonFirst.click();
		}
		
		public String deleteMessageDialogueBox() {
			return dialogueBoxMessageofDelete.getText();
		}
		
		public void clickOnConfirmationButton() {
			confirmaDeleteButton.click();
		}
		
		
		
		
		
		
		
		
}
