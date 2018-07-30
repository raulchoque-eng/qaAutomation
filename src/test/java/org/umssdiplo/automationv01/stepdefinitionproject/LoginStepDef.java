package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Login.Login;

public class LoginStepDef {
    Login loginPage = new Login();

    @When("^Inicio cesion en la aplicacion$")
    public void Inicio_cesion_en_la_aplicacion() {
        loginPage.login();
    }
}
