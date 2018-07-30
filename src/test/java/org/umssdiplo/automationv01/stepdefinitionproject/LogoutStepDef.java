/**
 * @autor: Raúl Choque
 **/
package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Logout.Logout;

public class LogoutStepDef {
    Logout logout = new Logout();

    @Then("^I go to log out$")
    public void i_go_to_log_out(){
        logout.clouseSesion();

    }

}
