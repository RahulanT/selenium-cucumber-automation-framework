package com.fdmgroup.academyusers.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;

import com.fdmgroup.academyusers.pages.HomePage;
import com.fdmgroup.academyusers.pages.LoginPage;
import com.fdmgroup.global.stepdefinitions.Hooks;
import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login_stepdefinitions extends BrowserUtilities {
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	Hooks hooks = new Hooks();

	@Given("User launches the TMS portal page")
	public void user_launches_the_tms_portal_page() {

		driver.manage().window().maximize();
		loginPage.navigateToUrl(ConfigurationReader.getProperty("config", "indexPageURL"));
		//((IJavaScriptExecutor)driver).executeScript("document.body.style.transform='scale(0.8)';");
		//((JavascriptExecutor)driver).executeScript("document.body.style.zoom='80%';");
		
	}

	@When("Enters valid id and password")
	public void enters_valid_id_and_password() {
		loginPage.setUsername(ConfigurationReader.getProperty("config", "courseOwnerUserName"));
		loginPage.setPassword(ConfigurationReader.getProperty("config", "courseOwnerPassword"));
	}
	
	
	
	@When("user clicks the login button")
	public void user_clicks_the_login_button() throws InterruptedException {
		Thread.sleep(4000);
		loginPage.clickOnLoginButton();
	}

	@Given("User logged in as SysAdmin")
	public void user_logged_in_as_sys_admin() {
		assertEquals((ConfigurationReader.getProperty("config", "loggedinSuccessMessage")),
				homePage.getTextSuccessLogin());
	}
}
