package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Home.HomePage;

import java.util.List;

public class HomePageStepDef {


    HomePage home = new HomePage();


    @When("^I search a course with \"([^\"]*)\"$")
    public void i_search_a_course_with(String course){
        home.searchCourse(course);
    }

    @When("^I see the course \"([^\"]*)\" in home page$")
    public void verifyCourseIsDisplayed(String course){
        home.verifyCouseIsDisplayed(course);
    }

    @When("^llenar formulario registro Obra$")
    public void llenar_formulario_registro_Obra(DataTable datos){

        home.llenarFormularioObra(datos);

    }

    @When("^Hago Click en CREAR ETAPA$")
    public void hacerClickCrearEtapa(){

        home.clickCrearEtapa();

    }


    @When("^llenar formulario registro Etapa$")
    public void llenar_formulario_registro_Etapa(DataTable datos){

        home.llenarFormularioEtapa(datos);

    }




    @When("^Hago click en Asignar Etapas a la obra$")
    public void hacerClickAsignarEtapaObra(){

        home.clickAsignarEtapaObra();

    }



    @When("^llenar formulario asignacion Etapas a Obra$")
    public void llenar_formulario_asignacion_Etapas_a_Obra(DataTable datos){


        home.llenarFormularioAsigEtapa(datos);
    }

}
