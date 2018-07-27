package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Home.HomePage;

import java.util.List;

public class HomePageStepDef {
    HomePage home = new HomePage();
    @When("^I search a course with \"([^\"]*)\"$")
    public void i_search_a_course_with(String course){
        home.searchCourse(course);
    }

    @When("^I go to the All create Employees tab$")
    public void i_go_to_the_All_create_Employees_tab()  {
        // Write code here that turns the phrase above into concrete actions
        home.goToCreateEmployees();
    }
    @When("^I see the course \"([^\"]*)\" in home page$")
    public void verifyCourseIsDisplayed(String course){
        home.verifyCouseIsDisplayed(course);
    }

    @When("^I go to the All Llenar campos employee Tab$")
    public void i_go_to_the_All_Llenar_campos_employee_Tab(DataTable datos) {
        home.registerPerson();
    }

}
