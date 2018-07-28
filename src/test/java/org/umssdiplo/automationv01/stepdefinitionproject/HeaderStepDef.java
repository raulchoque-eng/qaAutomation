package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Home.Header;

public class HeaderStepDef {
    Header headerUI = new Header();

    @When("^I go to the All Courses Tab$")
    public void goToAllCoursesTab() {
        headerUI.goToAllCoursesTab();
    }

    @When("^I go to the All Person and employees tab$")
    public void i_go_to_the_All_Person_and_employees_tab() {
        headerUI.goToEmployees();
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("^I leave the system$")
    public void i_leave_the_system() {
        headerUI.goTofin();
    }
    @When("^I go to the All Person and Cargo tab$")
    public void i_go_to_the_All_Person_and_Cargo_tab(){
        headerUI.goToEmployeesCargo();
    }
}