package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Login.Login;

public class LoginStepDef {
    Login loginPage = new Login();

    @When("^Me conecto a la aplicación$")
    public void i_log_on_the_application() {
        loginPage.login();
    }


    @And("^Hago click user$")
    public void hagoClickUser() {
        loginPage.cerrarSesion1();
    }

    @And("^Cerrar aplicacion$")
    public void cerrarAplicacion() {
        loginPage.cerrarSesion();
    }

}
