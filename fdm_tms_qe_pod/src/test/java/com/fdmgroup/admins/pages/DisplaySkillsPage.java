package com.fdmgroup.admins.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class DisplaySkillsPage extends BrowserUtilities {
	@FindBy(xpath = "//*[contains(@type,'submit')]")
	private WebElement loginBtn;
	@FindBy(xpath = "//*[contains(@routerlink,'admin')]")
	private WebElement adminLink;
	@FindBy(xpath = "//*[contains(text(),'Import Trainees')]")
	private WebElement importTranieesLink;
	@FindBy(xpath = "//*[contains(text(),' Johnny Doe ')]")
	private WebElement jhonnyText;
	@FindBy(xpath = "//*[contains(@class,\"trainee-info-title-container ng-tns-c69-0\" )]//*[contains(text(),' Skills ' )]")
	private WebElement skillsLink;
	@FindBy(xpath = "//*[contains(text(),'Agile' )]")
	private WebElement agileSkill;

	public DisplaySkillsPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickLogin() throws InterruptedException {
		Thread.sleep(1000);
		WebElement element = driver
				.findElement(By.xpath("//*[contains(@class,'login-button')]//*[contains(@type,'submit')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.sendKeys(Keys.ENTER);
	}

	public void clickAdminLink() {
		adminLink.sendKeys(Keys.ENTER);
	}

	public void clickImportTraineesLink() {
		importTranieesLink.sendKeys(Keys.ENTER);
	}

	public void clickJJhonnyTrainee() {
		jhonnyText.sendKeys(Keys.ENTER);
	}

	public void scrollToSkills() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.trainee-info-container-scroll.ng-tns-c69-0').scrollTop=450");
	}

	public void skillsLinkClick() {
		skillsLink.click();
	}

	public String agileSkillText() {
		return agileSkill.getText();
	}
}
