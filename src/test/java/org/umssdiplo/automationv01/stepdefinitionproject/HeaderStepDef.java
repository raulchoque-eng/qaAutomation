package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Home.Header;

public class HeaderStepDef {
    Header headerUI = new Header();
    @When("^I go to the All Courses Tab$")
    public void goToAllCoursesTab() {
        headerUI.goToAllCoursesTab();
    }
}
