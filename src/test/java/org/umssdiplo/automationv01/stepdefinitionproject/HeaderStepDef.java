package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Home.Header;

import java.util.List;

public class HeaderStepDef {
    Header headerUI = new Header();

/*
    @When("^I go to the All Courses Tab$")
    public void goToAllCoursesTab() {
        headerUI.goToAllCoursesTab();
    }
*/

    @When("^Voy a la pestaña OBRA$")
    public void irAObra(){
        headerUI.irAObra();

    }

    @When("^seleccionar obras$")
    public void selecccionarObras(){
        headerUI.seleccionarObras();

    }

    @When("^Hago Click en CREAR OBRA$")
    public void crearObra()
    {
        headerUI.crearObra();
    }

    @When("^seleccionar etapas$")
    public void irEtapas()
    {
        headerUI.irEtapa();
    }




    @When("^Cierro la aplicacion$")
    public void cerrarCesion()
    {
        headerUI.cerrarAplicacion();
    }


}
