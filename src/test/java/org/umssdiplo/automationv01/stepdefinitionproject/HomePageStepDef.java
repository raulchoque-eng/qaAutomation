package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
<<<<<<< HEAD
import cucumber.api.java.en.Then;
=======
>>>>>>> cdbda93bea1c6cfde94659e057ed145e993a8e69
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Home.HomePage;

public class HomePageStepDef {
    HomePage home = new HomePage();

    @When("^I go to see message \"([^\"]*)\"$")
    public void i_go_to_see_message(String message)  {
        home.seeMessage(message);
    }
    @When("^I go to create New Equipo$")
    public void i_go_to_create_New_Equipo() {
        home.goToCreateEquipo();
        }
    @When("^I will go fill the fields$")
    public void i_will_go_fill_the_fields(DataTable datos) {
        home.goToFillTheFields(datos);
    }

    @When("^I select new TipoEquipo$")
    public void i_select_new_TipoEquipo() {
        home.createNewTipoEquipo();
    }

    @When("^I will go fill the fields of tipoEquipo$")
    public void i_will_go_fill_the_fields_of_tipoEquipo(DataTable datos) {
        home.goToFillFieldsTipoEquipo(datos);
    }
}
