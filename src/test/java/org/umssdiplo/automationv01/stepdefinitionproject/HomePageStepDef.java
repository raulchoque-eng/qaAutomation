package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Home.HomePage;

public class HomePageStepDef {
    HomePage home = new HomePage();

    @When("^I go to see message \"([^\"]*)\"$")
    public void i_go_to_see_message(String message)  {
        home.seeMessage(message);
    }
}
