package com.fdmgroup.trainers.stepdefenitions;

import com.fdmgroup.academyusers.pages.LoginPage;
import com.fdmgroup.courseowners.pages.CourseCataloguePage;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilterCourses_stepdefinitions {
    LoginPage loginPage = new LoginPage();
    CourseCataloguePage courseCatalogue = new CourseCataloguePage();

    @Given("User click on course catalogue tab")
    public void user_click_on_course_catalogue_tab() {
    	loginPage.driver.get("http://localhost:4200/");
        courseCatalogue.getCourseCataloguePageNav();
    }

    @Given("Can see All courses are displayed")
    public void can_see_all_courses_are_displayed() {
        Assert.assertTrue(courseCatalogue.getTiles().isDisplayed());
    }

    @When("User click on region filter drop down list")
    public void user_click_on_region_filter_drop_down_list() {
        courseCatalogue.selectFiltersAndCheckOrder("DefaultRegion", "", "");
    }

    @Then("They can see region drop down list with default region selected")
    public void they_can_see_region_drop_down_list_with_default_region_selected() {
        Assert.assertEquals("DefaultRegion", courseCatalogue.getRegions());
    }

    @When("They select any other region from dropdown list")
    public void they_select_any_other_region_from_dropdown_list() {
        courseCatalogue.selectFiltersAndCheckOrder("OtherRegion", "", "");
    }

//    @Then("All courses from this region are displayed")
//    public void all_courses_from_this_region_are_displayed() {
//    //TO-DO areCoursesFromRegionDisplayed("OtherRegion")
//        Assert.assertTrue(courseCatalogue.areCoursesFromRegionDisplayed("OtherRegion"));
//    }

    @When("User select region without assigned course\\(s) from dropdown list")
    public void user_select_region_without_assigned_course_s_from_dropdown_list() {
        courseCatalogue.selectFiltersAndCheckOrder("EmptyRegion", "", "");
    }

    @Then("No courses Found will be displayed")
    public void no_courses_found_will_be_displayed() {
        Assert.assertEquals(" No Courses Found ", courseCatalogue.errorMsgText2());
    }
}
