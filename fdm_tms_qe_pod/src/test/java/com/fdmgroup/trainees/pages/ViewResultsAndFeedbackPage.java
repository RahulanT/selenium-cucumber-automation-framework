package com.fdmgroup.trainees.pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class ViewResultsAndFeedbackPage extends BrowserUtilities{
	public ViewResultsAndFeedbackPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//a[@class='dropdown-item']") 
	public static WebElement viewResultsAndFeedback;
	@FindBy(xpath = "//table[@class='main']")
	public static WebElement table;
	@FindBy(xpath = "(//tr/td[position()=1])[1]")
	public static WebElement proSkills;
	@FindBy(xpath = "(//tr/td[position()=1])[2]")
	public static WebElement ood1;
	@FindBy(xpath = "(//tr/td[position()=1])[3]")
	public static WebElement ood2;
	@FindBy(xpath = "(//tr/td[position()=1])[4]")
	public static WebElement sql;
	@FindBy(xpath = "(//tr/td[position()=1])[5]")
	public static WebElement coreJava;
	@FindBy(xpath = "(//tr/td[position()=1])[6]")
	public static WebElement dataAccess;
	@FindBy(xpath = "(//tr/td[position()=1])[7]")
	public static WebElement webDev;
	@FindBy(xpath = "(//tr/td[position()=1])[8]")
	public static WebElement springBoot;
	@FindBy(xpath = "(//tr/td[position()=1])[9]")
	public static WebElement dos;
	@FindBy(xpath = "//div[@class=\"card\"]")
	public static WebElement profileCard;
	@FindBy(xpath = "(//button[@class=\"btn btn-link\"])[1]")
	public static WebElement courseFilter;
	@FindBy(xpath = "(//button[@class=\\\"btn btn-link\\\"])[2]")
	public static WebElement startDateFilter;
	@FindBy(xpath = "(//button[@class=\\\"btn btn-link\\\"])[3]")
	public static WebElement endDateFilter;
	@FindBy(xpath = "(//tr[@class='tableDataRow'])[1]")
	public static WebElement tableRow;
	
	public ViewResultsAndFeedbackPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToViewResultsAndFeedbackPage() throws InterruptedException {
		driver.get("http://localhost:4200/result");
		Thread.sleep(3000);
	}
	
	public void verifyTableHeaderOrder() throws InterruptedException {
		ViewResultsAndFeedbackPage resultsAndFeedback = new ViewResultsAndFeedbackPage();
		resultsAndFeedback.navigateToViewResultsAndFeedbackPage();
		
		List<WebElement> headerCells = table.findElements(By.xpath(".//th"));		
		List<String> expectedColumnNames = Arrays.asList("Course", "Start Date", "End Date", "Trainer", "Results/Feedback");
		
		for (int i = 0; i < headerCells.size(); i++) {
            String actualColumnName = headerCells.get(i).getText();
            String expectedColumnName = expectedColumnNames.get(i);

           assertEquals(actualColumnName, expectedColumnName);
        }
	}
	
	public void verifyTableContent() throws InterruptedException {
		ViewResultsAndFeedbackPage resultsAndFeedback = new ViewResultsAndFeedbackPage();
		resultsAndFeedback.navigateToViewResultsAndFeedbackPage();
		
		List<WebElement> tableContent = Arrays.asList(proSkills, ood1, ood2, sql, coreJava, dataAccess, webDev, springBoot, dos);		
		List<String> expectedTableContent = Arrays.asList("Pro-Skills", "OOD1", "OOD2", "SQL", "Core Java", "Data Access", "Web Development", "Spring Boot", "DOS");
		
		for (int i = 0; i < tableContent.size(); i++) {
            String actualColumnName = tableContent.get(i).getText();
            String expectedColumnName = expectedTableContent.get(i);

           assertEquals(actualColumnName, expectedColumnName);
        }
	}
	
	public void profileCardIsOnTheRight() {
		Point location = profileCard.getLocation();
		int elementX = location.getX();

		Dimension windowSize = driver.manage().window().getSize();
		int windowWidth = windowSize.getWidth();

		boolean isOnRightSide = elementX > windowWidth / 2;

		assertTrue("Profile card is on the right side of the screen.", isOnRightSide);
	}
	
	public void hoverOverTableRow() throws InterruptedException {
		Actions action = new Actions(driver);
		
        action.moveToElement(tableRow).perform();
        Thread.sleep(3000);
	}
	
	public void verifyLightBlue() throws InterruptedException {
		ViewResultsAndFeedbackPage resultsAndFeedback = new ViewResultsAndFeedbackPage();
		resultsAndFeedback.hoverOverTableRow();
		
		String backgroundColorOnHover = tableRow.getCssValue("background-color");
        String expectedColor = "rgba(25, 111, 248, 0.2)";
                
        assertEquals(expectedColor, backgroundColorOnHover);
	}
	
	public void hoverAwayFromTable() throws InterruptedException {
		ViewResultsAndFeedbackPage resultsAndFeedback = new ViewResultsAndFeedbackPage();
		Actions action = new Actions(driver);
		//resultsAndFeedback.hoverOverTableRow();
        action.moveToElement(profileCard).perform();
        Thread.sleep(3000);
	}
	
	public void verifyWhite() throws InterruptedException {
		ViewResultsAndFeedbackPage resultsAndFeedback = new ViewResultsAndFeedbackPage();
		resultsAndFeedback.hoverOverTableRow();
		resultsAndFeedback.hoverAwayFromTable();
		
		String backgroundColorOnHover = tableRow.getCssValue("background-color");
        String expectedColor = "white";
                
        assertEquals(expectedColor, backgroundColorOnHover);
	}
	
	public void clickTableRow() throws InterruptedException {
		tableRow.click();
		Thread.sleep(3000);
	}
	
	public boolean filtersDisplayed() {
		List<WebElement> filters = Arrays.asList(courseFilter, startDateFilter, endDateFilter);
		for(WebElement eachFilter : filters) {
			return eachFilter.isDisplayed();
		}
		return false;
	}

}
