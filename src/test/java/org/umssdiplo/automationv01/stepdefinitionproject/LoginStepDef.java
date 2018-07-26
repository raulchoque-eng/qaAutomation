package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Login.Login;

public class LoginStepDef {
    Login loginPage = new Login();

    @When("^I log on the application$")
    public void i_log_on_the_application() {
        loginPage.login();
    }
}
