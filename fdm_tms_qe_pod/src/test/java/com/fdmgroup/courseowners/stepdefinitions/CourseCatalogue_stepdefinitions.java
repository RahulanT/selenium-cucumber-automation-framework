package com.fdmgroup.courseowners.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;

import com.fdmgroup.academyusers.pages.HomePage;
import com.fdmgroup.academyusers.pages.LoginPage;
import com.fdmgroup.academyusers.pages.ProfileCardPage;
import com.fdmgroup.courseowners.pages.CourseCataloguePage;
import com.fdmgroup.courseowners.pages.CourseMaterialPage;
import com.fdmgroup.global.stepdefinitions.Hooks;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List; 
public class CourseCatalogue_stepdefinitions {
	
	ProfileCardPage profileCardPage = new ProfileCardPage();
	CourseCataloguePage courseCatalogue = new CourseCataloguePage();
	CourseMaterialPage courseMaterial = new CourseMaterialPage();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	Hooks hooks = new Hooks();

	@Given("User Logged in successfully")
	public void user_logged_in_successfully() {

		courseCatalogue.navigateToUrl(ConfigurationReader.getProperty("courseowners", "landingPageURL"));
	}

	@Given("User navigates to the BAPM Stream using course catalogue button in the navigation bar")
	public void user_navigates_to_the_bapm_stream_using_course_catalogue_button_in_the_navigation_bar() {
		courseCatalogue.getCourseCatalogueTab();
	}

	@Given("{int} Tiles of courses are displayed")
	public void tiles_of_courses_are_displayed(Integer int1) {
		// courseCatalogue.getTiles();
	}

	@And("User verify if all the course names are correct")
	public void user_verify_if_all_the_course_names_are_correct() {
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtOOD")), courseCatalogue.getOOD());
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtAdvancedSQL")),
				courseCatalogue.getAdvancedSQL());
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtAngularDevelopmentBeginner")),
				courseCatalogue.getAngularDevelopmentBeginner());
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtUnix")), courseCatalogue.getUnix());
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtSpring")), courseCatalogue.getSpring());
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtWebDevelopment")),
				courseCatalogue.getWebDevelopment());
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtGit")), courseCatalogue.getGit());
	}

	@Given("Go to Material Button is displayed")
	public void go_to_material_button_is_displayed() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
		}
	}

	@Given("User clicks the button")
	public void user_clicks_the_button() {
		courseMaterial.clickOODMaterialButton();

	}

	@Given("User redirected to course material page")
	public void user_redirected_to_course_material_page() {
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtOOD")), courseMaterial.getOODMaterial());
	}

	@Given("Data Table is displayed")
	public void data_table_is_displayed() {
		courseMaterial.navigateToUrl(ConfigurationReader.getProperty("courseowners", "courseMaterialURLOOD"));

	}

	@Given("User selected a row")
	public void user_selected_a_row() {
		// courseMaterial.testRowSelectionUsingControlKey();
		courseMaterial.checkRow();
	}

	@Given("User see the background colour is changed")
	public void user_see_the_background_colour_is_changed() {
		courseMaterial.getBackgroundColour();
	}

	@Given("User is on Course Material Page")
	public void user_is_on_course_material_page() {
		courseMaterial.navigateToUrl(ConfigurationReader.getProperty("courseowners", "courseMaterialURLOOD"));

	}

	@And("User hovered over a row and background colour is changing")
	public void user_hovered_over_a_row_and_background_colour_is_changing() {
		courseMaterial.getHoverBackgroundColour();

	}

	//////// Sprint3////

	@Given("User navigates to course catalogue button in the navigation bar")
	public void user_navigates_to_course_catalogue_button_in_the_navigation_bar() {
		courseCatalogue.getCourseCatalogueTab();
	}

	@Given("User navigates to the Java Development Stream using course catalogue button in the navigation bar")
	public void user_navigates_to_the_java_development_stream_using_course_catalogue_button_in_the_navigation_bar() {
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtJavaCourse")),
				courseCatalogue.getJavaCourse());
	}

	@Given("user is on course catalogue page")
	public void user_is_on_course_catalogue_page() {
		courseCatalogue.currentUrl();
	}

	@Given("User verify if all the course names are correct in course tiles")
	public void user_verify_if_all_the_course_names_are_correct_in_course_tiles() {
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtOOD")), courseCatalogue.getOOD());
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtAdvancedSQL")),
				courseCatalogue.getAdvancedSQL());
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtAngularDevelopmentBeginner")),
				courseCatalogue.getAngularDevelopmentBeginner());
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtUnix")), courseCatalogue.getUnix());
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtSpring")), courseCatalogue.getSpring());
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtWebDevelopment")),
				courseCatalogue.getWebDevelopment());
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtGit")), courseCatalogue.getGit());
	}

	@Given("see that each course has Go to Material Button")
	public void see_that_each_course_has_go_to_material_button() {

	}

	@Given("User redirected to the course material page and can see datatable on course material page and select the course material")
	public void user_redirected_to_the_course_material_page_and_can_see_datatable_on_course_material_page_and_select_the_course_material() {
		courseCatalogue.getCourseCatalogueTab();
		courseMaterial.clickOODMaterialButton();
		courseMaterial.getDataTable();
		courseMaterial.checkRow();
		courseMaterial.getBackgroundColour();
		courseCatalogue.getCourseCatalogueTab();
		courseMaterial.clickSQLMaterialButton();
		courseMaterial.getDataTable();
		courseMaterial.checkRow();
		courseMaterial.getBackgroundColour();

		courseCatalogue.getCourseCatalogueTab();
		courseMaterial.clickbuttonAngularDevelopmentBeginnerButton();

		courseMaterial.getDataTable();
		courseMaterial.checkRow();

		courseMaterial.getBackgroundColour();

		courseCatalogue.getCourseCatalogueTab();
		courseMaterial.clickUnixButton();
		courseMaterial.getDataTable();
		courseMaterial.checkRow();
		courseMaterial.getBackgroundColour();
		courseCatalogue.getCourseCatalogueTab();

		courseMaterial.clickSpringButton();
		courseMaterial.getDataTable();
		courseMaterial.checkRow();
		courseMaterial.getBackgroundColour();
		courseCatalogue.getCourseCatalogueTab();

		courseMaterial.clickWebDevelopmentButton();
		courseMaterial.getDataTable();
		courseMaterial.checkRow();
		courseMaterial.getBackgroundColour();
		courseCatalogue.getCourseCatalogueTab();

		courseMaterial.clickGitButton();
		courseMaterial.getDataTable();
		courseMaterial.checkRow();
		courseMaterial.getBackgroundColour();
	}
///Sprint6/////////////

	@Given("User is logged in as a Trainer")
	public void user_is_logged_in_as_a_trainer()  {
			//courseCatalogue.navigateToUrl(ConfigurationReader.getProperty("courseowners", "profileCardURL"));
		}

	@Given("User is able to navigate on course catalogue page")
	public void user_is_able_to_navigate_on_course_catalogue_page() {
		        //courseCatalogue.getCourseCataloguePageNav();
		courseCatalogue.navigateToUrl(ConfigurationReader.getProperty("courseowners", "courseCatalogueURL"));

	}


	@Then("Select region should be displayed in filter bar")
	public void select_region_should_be_displayed_in_filter_bar() {
		courseCatalogue.getRegions();
	}

	@Then("All the courses in the course tiles should be in ascending order")
	public void all_the_courses_in_the_course_tiles_should_be_in_ascending_order() {
		List<WebElement> courseElements = courseCatalogue.getCourseElements();
		boolean isAscending = true;
		for (int i = 0; i < courseElements.size() - 1; i++) {
			String course1 = courseElements.get(i).getText();
			String course2 = courseElements.get(i + 1).getText();
			if (course1.compareTo(course2) > 0) {
				isAscending = false;
				break;
			}
		}

		if (isAscending) {
			System.out.println("Courses are in ascending order.");
		} else {
			System.out.println("Courses are not in ascending order.");
		}
	}

	@Then("There should be course filters available in the filter bar")
	public void there_should_be_course_filters_available_in_the_filter_bar(String region, String country,
			String pathway) {
		courseCatalogue.selectFiltersAndCheckOrder(region, country, pathway);
	}

	   @Then("Select region should be displayed in left of filter bar")
	    public void select_region_should_be_displayed_in_left_of_filter_bar() {
	        assertTrue("Select Region filter is displayed", courseCatalogue.isSelectRegionFilterDisplayed());
	    }

	    @Then("Select Country should be right after Region Filter")
	    public void select_country_should_be_right_after_region_filter() {
	        assertTrue("Select Country filter is displayed", courseCatalogue.isSelectCountryFilterDisplayed());
	    }

	    @Then("Select Pathways should be right after Country Filter")
	    public void select_pathways_should_be_right_after_country_filter() {
	        assertTrue("Select Pathway filter is displayed", courseCatalogue.isSelectPathwayFilterDisplayed());
	    }

	    @Then("There should be filter bar above course tiles")
	    public void there_should_be_filter_bar_above_course_tiles() {
	        assertTrue("Filter bar is above course tiles", courseCatalogue.isFilterBarAboveCourseTiles());
	    }

	    @Then("Background colour of filter bar should be gray")
	    public void background_colour_of_filter_bar_should_be_gray() {
	        assertTrue("Filter bar background color is gray", courseCatalogue.isFilterBarBackgroundColorGray());
	    }

	    @Then("Search bar is displayed in the filter bar")
	    public void search_bar_is_displayed_in_the_filter_bar() {
	        assertTrue("Search bar is displayed in filter bar", courseCatalogue.isSearchBarDisplayedInFilterBar());
	    }

	    @Then("Search bar is right aligned after all the filters")
	    public void search_bar_is_right_aligned_after_all_the_filters() {
	        assertTrue("Search bar is right aligned after filters", courseCatalogue.isSearchBarRightAlignedAfterFilters());
	    }
	    

		@When("Course Owner navigates to all courses")
		public void course_owner_navigates_to_all_courses() {
			profileCardPage.hoverOverCourseCatalogueOnNavBar();
			profileCardPage.clickAllCoursesUnderCourseCatalogue();
		}
		
		@When("Course Owner selects course {string}")
		public void course_owner_selects_course(String string) {
			courseCatalogue.clickCourse( string );
		}
	    
}