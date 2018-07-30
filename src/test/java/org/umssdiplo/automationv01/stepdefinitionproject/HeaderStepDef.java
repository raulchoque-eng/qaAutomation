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

    @When("^I go to the Accident tab$")
    public void igo_to_the_Accident_tab(){
            headerUI.goToAccidentTab();
    }

    @Then("^I go to the Accident Type tab$")
    public void iGoToTheAccidentTypeTab() throws Throwable {
        headerUI.goToAccidentTypeTab();
    }
}
