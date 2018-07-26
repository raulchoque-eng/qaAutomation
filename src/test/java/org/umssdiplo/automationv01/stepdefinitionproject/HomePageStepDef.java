package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Home.HomePage;

public class HomePageStepDef {
    HomePage home = new HomePage();
    @When("^I search a course with \"([^\"]*)\"$")
    public void i_search_a_course_with(String course){
        home.searchCourse(course);
    }

    @When("^I see the course \"([^\"]*)\" in home page$")
    public void verifyCourseIsDisplayed(String course){
        home.verifyCouseIsDisplayed(course);
    }
}
